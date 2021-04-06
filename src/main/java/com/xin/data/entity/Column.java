package com.xin.data.entity;

import lombok.Data;

@Data
public class Column {

    /**  
     * @Fields name : 表名
     */  
    private String name;
    
    /**  
     * @Fields comment : 注释
     */  
    private String comment;
    
    /**  
     * @Fields tableName : 表名
     */  
    private String tableName;
}
