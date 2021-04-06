package com.xin.data.listen;

import java.util.List;

import org.springframework.util.CollectionUtils;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.xin.data.annotation.CanalEventListener;
import com.xin.data.annotation.content.DeleteListenPoint;
import com.xin.data.annotation.content.InsertListenPoint;
import com.xin.data.annotation.content.UpdateListenPoint;
import com.xin.data.client.core.CanalMsg;

@CanalEventListener
public class AnnoEventListener {
    
    @InsertListenPoint
    public void onEventInsertData(CanalMsg canalMsg, CanalEntry.RowChange rowChange) {
        System.out.println("======================注解方式（新增数据操作）==========================");
        List<CanalEntry.RowData> rowDatasList = rowChange.getRowDatasList();
        for (CanalEntry.RowData rowData : rowDatasList) {
            String sql = "use " + canalMsg.getSchemaName() + ";\n";
            StringBuffer colums = new StringBuffer();
            StringBuffer values = new StringBuffer();
            rowData.getAfterColumnsList().forEach((c) -> {
                colums.append(c.getName() + ",");
                values.append("'" + c.getValue() + "',");
            });
            
            
            sql += "INSERT INTO " + canalMsg.getTableName() + "(" + colums.substring(0, colums.length() - 1) + ") VALUES(" + values.substring(0, values.length() - 1) + ");";
            System.out.println(sql);
        }
        System.out.println("\n======================================================");
    }
    
    @UpdateListenPoint
    public void onEventUpdateData(CanalMsg canalMsg, CanalEntry.RowChange rowChange) {
        System.out.println("======================注解方式（更新数据操作）==========================");
        List<CanalEntry.RowData> rowDatasList = rowChange.getRowDatasList();
        for (CanalEntry.RowData rowData : rowDatasList) {
            
            String sql = "use " + canalMsg.getSchemaName() + ";\n";
            StringBuffer updates = new StringBuffer();
            StringBuffer conditions = new StringBuffer();
            rowData.getAfterColumnsList().forEach((c) -> {
                if (c.getIsKey()) {
                    conditions.append(c.getName() + "='" + c.getValue() + "'");
                } else {
                    updates.append(c.getName() + "='" + c.getValue() + "',");
                }
            });
            sql += "UPDATE " + canalMsg.getTableName() + " SET " + updates.substring(0, updates.length() - 1) + " WHERE " + conditions;
            System.out.println(sql);
        }
        System.out.println("\n======================================================");
    }
    
    @DeleteListenPoint
    public void onEventDeleteData(CanalEntry.RowChange rowChange, CanalMsg canalMsg) {
        
        System.out.println("======================注解方式（删除数据操作）==========================");
        List<CanalEntry.RowData> rowDatasList = rowChange.getRowDatasList();
        for (CanalEntry.RowData rowData : rowDatasList) {
            
            if (!CollectionUtils.isEmpty(rowData.getBeforeColumnsList())) {
                String sql = "use " + canalMsg.getSchemaName() + ";\n";
                
                sql += "DELETE FROM " + canalMsg.getTableName() + " WHERE ";
                StringBuffer idKey = new StringBuffer();
                StringBuffer idValue = new StringBuffer();
                for (CanalEntry.Column c : rowData.getBeforeColumnsList()) {
                    if (c.getIsKey()) {
                        idKey.append(c.getName());
                        idValue.append(c.getValue());
                        break;
                    }
                }
                sql += idKey + " =" + idValue + ";";
                System.out.println(sql);
            }
            System.out.println("\n======================================================");
        }
    }
}
