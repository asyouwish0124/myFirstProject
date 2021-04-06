package com.xin.data.canal;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.stream.Collectors;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.common.utils.AddressUtils;
import com.alibaba.otter.canal.protocol.CanalEntry;
import com.alibaba.otter.canal.protocol.Message;
import com.xin.data.model.Customer;
import com.xin.data.model.Employee;

public class CanalTest {
public static void main(String[] args) {
    // 创建链接  //AddressUtils.getHostIp()
    CanalConnector connector = CanalConnectors.newSingleConnector(new InetSocketAddress(AddressUtils.getHostIp(),
            11111), "example", "", "");
    int batchSize = 1000;
    int emptyCount = 0;
    try {
        connector.connect();
        //connector.subscribe(".*\\..*");
        //connector.subscribe("ros_test0911.crm_customer,ros_dev0911.oa_employee");
        connector.subscribe("ros_test0911.*");
        connector.rollback();
        int totalEmptyCount = 1200;
        while (emptyCount < totalEmptyCount) {
            Message message = connector.getWithoutAck(batchSize); // 获取指定数量的数据
            long batchId = message.getId();
            int size = message.getEntries().size();
            if (batchId == -1 || size == 0) {
                emptyCount++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            } else {
                emptyCount = 0;
                // System.out.printf("message[batchId=%s,size=%s] \n", batchId, size);
                printEntry(message.getEntries());
            }

            connector.ack(batchId); // 提交确认
            // connector.rollback(batchId); // 处理失败, 回滚数据
        }
        System.out.println("empty too many times, exit");
    } finally {
        connector.disconnect();
    }
    }

    private static void printEntry(List<CanalEntry.Entry> entrys) {
    for (CanalEntry.Entry entry : entrys) {
        if (entry.getEntryType() == CanalEntry.EntryType.TRANSACTIONBEGIN ||
                entry.getEntryType() == CanalEntry.EntryType.TRANSACTIONEND) {
            continue;
        }

        CanalEntry.RowChange rowChage = null;
        try {
            rowChage = CanalEntry.RowChange.parseFrom(entry.getStoreValue());
        } catch (Exception e) {
            throw new RuntimeException("ERROR ## parser of eromanga-event has an error , data:" + entry.toString(),
                    e);
        }
        CanalEntry.EventType eventType = rowChage.getEventType();
        System.err.println(String.format("================> binlog[%s:%s] , name[%s,%s] , eventType : %s",
                entry.getHeader().getLogfileName(), entry.getHeader().getLogfileOffset(),
                entry.getHeader().getSchemaName(), entry.getHeader().getTableName(),
                eventType));

        for (CanalEntry.RowData rowData : rowChage.getRowDatasList()) {
            if (eventType == CanalEntry.EventType.DELETE) {
                //printColumn(rowData.getBeforeColumnsList());
                onEventDeleteData(rowData.getBeforeColumnsList(),entry);
            } else if (eventType == CanalEntry.EventType.INSERT) {
                //printChangedColumn(rowData.getAfterColumnsList());
                onEventInsertData(rowData.getAfterColumnsList(),entry);
            } else {
                //printCompareColumn(rowData.getBeforeColumnsList(),rowData.getAfterColumnsList(),entry);
                onEventUpdateData(rowData.getAfterColumnsList(),entry);
            }
        }
    }
    }
    
    private static void printColumn(List<CanalEntry.Column> columns) {
        for (CanalEntry.Column column : columns) {
            System.out.println(column.getName() + " : " + column.getValue() + "  isUpdate=" + column.getUpdated());
        }
    }
    
    //查看修改的数据
    private static void printChangedColumn(List<CanalEntry.Column> afterColumns) {
        String id = "";
        JSONObject obj = new JSONObject ();
        for (CanalEntry.Column column : afterColumns) {
            if(column.getIsKey()) {
                id = column.getValue();
                obj.put("id", id);
            }
            if(column.getUpdated()) {
                obj.put(column.getName(), column.getValue());
            }
        }
        System.out.println(JSON.toJSON(obj));
    }
    
    //比较修改的数据
    private static void printCompareColumn(List<CanalEntry.Column> beforeColumns,List<CanalEntry.Column> afterColumns,
            CanalEntry.Entry entry) {
        String id = "";
        JSONObject obj = new JSONObject ();
        JSONObject obj1 = new JSONObject ();
        for (CanalEntry.Column column : afterColumns) {
            if(column.getIsKey()) {
                id = column.getValue();
                obj.put("id", id);
                obj1.put("id", id);
            }
            if(column.getUpdated()) {
                obj.put(column.getName(), column.getValue());
                for(CanalEntry.Column column1 : beforeColumns) {
                    if(column.getName().equals(column1.getName())) {
                        obj1.put(column.getName(), column1.getValue());
                    }
                }
            }
        }
        Object entityBefore = null;
        Object entityAfter = null;
        String tableName = entry.getHeader().getTableName();
        switch(tableName) {
        case "oa_employee":
            entityAfter = JSON.toJavaObject((JSON) obj,Employee.class);
            entityBefore = JSON.toJavaObject((JSON) obj1,Employee.class);
            break;
        case "crm_customer":
            entityAfter = JSON.toJavaObject((JSON) obj,Customer.class);
            entityBefore = JSON.toJavaObject((JSON) obj1,Customer.class);
            break;
        default:
            break;
        }
        if(entityBefore != null) {
            System.out.println("表"+entry.getHeader().getTableName()+"修改前:   "+JSON.toJSON(entityBefore));            
        }
        if(entityAfter != null) {
            System.out.println("表"+entry.getHeader().getTableName()+"修改后:   "+JSON.toJSON(entityAfter));            
        }
        if(entityBefore == null  && entityAfter == null) {            
            System.out.println("表"+entry.getHeader().getTableName()+"修改前:   "+obj1);
            System.out.println("表"+entry.getHeader().getTableName()+"修改后:   "+obj);
        }
    }
    
    //打印修改的数据
    public static JSONObject parse(CanalEntry.RowData rowData,boolean after){
        List<CanalEntry.Column> columnsList ;
        String id = "";
        if (after){
            //修改后的列, 如修改,新增
            columnsList = rowData.getAfterColumnsList();
        }else{
            //false为修改前的列, 如删除
            columnsList = rowData.getBeforeColumnsList();
        }
        JSONObject dataJson = new JSONObject(columnsList.size());
        for (CanalEntry.Column column : columnsList) {
            if(column.getIsKey()) {
                id = column.getValue();
                dataJson.put("id", id);
            }
            dataJson.put(column.getName(),column.getValue());
        }
        return dataJson;
    }

    //拼接INSERT语句
    public static void onEventInsertData(List<CanalEntry.Column> afterColumns,CanalEntry.Entry entry) {
        String sql = "use " + entry.getHeader().getSchemaName() + "\n";
        StringBuffer colums = new StringBuffer();
        StringBuffer values = new StringBuffer();
        afterColumns.forEach((c) -> {
            colums.append(c.getName() + ",");
            values.append("'" + c.getValue() + "',");
        });
        sql += "INSERT INTO " + entry.getHeader().getTableName() + "(" + colums.substring(0, colums.length() - 1) + ") VALUES(" + values.substring(0, values.length() - 1) + ");";
        System.out.println(sql);
    }
    //拼接UPDATE语句
    public static void onEventUpdateData(List<CanalEntry.Column> afterColumns,CanalEntry.Entry entry) {
        String sql = "use " + entry.getHeader().getSchemaName() + "\n";
        StringBuffer updates = new StringBuffer();
        StringBuffer conditions = new StringBuffer();
        afterColumns = afterColumns.stream().filter(c -> c.getUpdated() || c.getIsKey()).collect(Collectors.toList());
        afterColumns.forEach((c) -> {
            if (c.getIsKey()) {
                conditions.append(c.getName() + "='" + c.getValue() + "'");
            } else {
                updates.append(c.getName() + "='" + c.getValue() + "',");
            }
        });
        sql += "UPDATE " + entry.getHeader().getTableName() + " SET " + updates.substring(0, updates.length() - 1) + " WHERE " + conditions;
        System.out.println(sql);
    }
    //拼接DELETE语句
    public static void onEventDeleteData(List<CanalEntry.Column> beforeColumns,CanalEntry.Entry entry) {
        String sql = "use " + entry.getHeader().getSchemaName() + "\n";
        sql += "DELETE FROM " + entry.getHeader().getTableName() + " WHERE ";
        StringBuffer idKey = new StringBuffer();
        StringBuffer idValue = new StringBuffer();
        for (CanalEntry.Column c : beforeColumns) {
            if (c.getIsKey()) {
                idKey.append(c.getName());
                idValue.append(c.getValue());
                break;
            }
        }
        sql += idKey + " =" + idValue + ";";
        System.out.println(sql);
    }
}