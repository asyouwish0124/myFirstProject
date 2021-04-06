package com.xin.data.entity;

import lombok.Data;

@Data
public class Table {
    
    /**  
     * @Fields name : 表名
     */  
    private String name;
    
    /**  
     * @Fields comment : 注释信息
     */  
    private String comment;
    
    /**  
     * @Fields schema : 数据库名
     */  
    private String schema;
}
