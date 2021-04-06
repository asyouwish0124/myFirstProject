package com.xin.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xin.data.entity.Column;
import com.xin.data.entity.Table;

public interface DataDictionaryMapper{
    
    List<Table> getTables(@Param("table_name")String tableName,@Param("table_comment")String tableComment,@Param("table_schema")String tableSchema);
    
    List<Column> getColumns(@Param("table_name")String tableName,@Param("table_schema")String tableSchema,@Param("column_comment") String columnComment);

}
