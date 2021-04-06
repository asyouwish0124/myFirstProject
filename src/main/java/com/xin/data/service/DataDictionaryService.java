package com.xin.data.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.xin.common.utils.DateUtils;
import com.xin.data.entity.Column;
import com.xin.data.entity.PmsPurchaseOrderExample;
import com.xin.data.entity.Purchase;
import com.xin.data.entity.Table;
import com.xin.data.mapper.DataDictionaryMapper;
import com.xin.data.mapper.PurchaseMapper;

import tk.mybatis.mapper.entity.Example;

@Service
public class DataDictionaryService {
    
    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;
    @Autowired
    private PurchaseMapper purchaseMapper;
    
    public List<Table> getTablesByCondition (String tableName,String tableComment,String tableSchema) {
        return dataDictionaryMapper.getTables(tableName,tableComment,tableSchema);
    }
    
    public List<Column> getColumnsByCondition(String tableName,String tableSchema,String columnComment){
        return dataDictionaryMapper.getColumns(tableName,tableSchema,columnComment);
    }
    
    public JSONObject getAnything(int page,int pageSize) {
        //2.通用mapper
        PmsPurchaseOrderExample example = new PmsPurchaseOrderExample();
        //cri.andIdLessThan(160255L);
        List<String> takerList = new ArrayList<>();
        takerList.add("陈春一");
        takerList.add("2106 高勇");
        takerList.add("2311 胡艳");
        example.createCriteria().andTakerIn(takerList).andVersionEqualTo(2L).andCreatoridEqualTo(49152L);
        RowBounds rowBounds = new RowBounds((page-1)*pageSize,pageSize);
        example.setOrderByClause("id desc");
        example.setDistinct(true);
        List<Purchase> purchaseList = purchaseMapper.selectByExampleAndRowBounds(example, rowBounds);
        JSONObject param = new JSONObject();
        param.put("total", purchaseMapper.selectCountByExample(example));
        param.put("size", purchaseList.size());
        param.put("data", purchaseList);
        param.put("currentDate", DateUtils.dateTimeNow(DateUtils.YYYY_MM_DD));
        return param;
    }
    
    
    
}
