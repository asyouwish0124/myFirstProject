package com.xin.data.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xin.data.entity.Column;
import com.xin.data.entity.Purchase;
import com.xin.data.entity.Table;
import com.xin.data.entity.WareHouse;
import com.xin.data.feign.TestFeign;
import com.xin.data.mapper.WareHouseMapper;
import com.xin.data.service.DataDictionaryService;
import com.xin.foundation.model.RestResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "数据字典")
@RequestMapping("/api")
public class DataDictionaryController {
    
    public static HashMap<String, String> map = new HashMap<String, String>();
    public volatile int count = 0;
    
    @Autowired 
    private DataDictionaryService dataDictionaryService;
    @Autowired
    private WareHouseMapper wareHouseMapper;
    @Autowired
    private TestFeign testFeign;

    @ApiOperation(value = "获取数据表列表", notes = "")
    @ApiImplicitParams({
        @ApiImplicitParam(name="table_name",value="表名",paramType = "query",dataType = "String"),
        @ApiImplicitParam(name="table_comment",value="注释信息",paramType = "query",dataType = "String"),
        @ApiImplicitParam(name="table_schema",value="数据库名",paramType = "query",defaultValue = "ros_dev0911",dataType = "String"),
    })
    @GetMapping(value = "/getTbales")
    public JSONObject getTables(String table_name,String table_comment,String table_schema,HttpServletRequest request) {
        //RestResponse<List<String>> re = new RestResponse<List<String>>();
        //re = testFeign.getPurchaseReturnOrderById("765632197968400384", 173L, "",request);
        List<Table> tables = dataDictionaryService.getTablesByCondition(table_name,table_comment,table_schema);
        JSONObject data = new JSONObject();
        data.put("count", tables.size());
        data.put("data", JSON.toJSON(tables));
        return data;
    }
    
    @ApiOperation(value = "获取数据表详细信息", notes = "")
    @ApiImplicitParams({
        @ApiImplicitParam(name="table_name",value="表名",paramType = "query",dataType = "String"),
        @ApiImplicitParam(name="column_comment",value="列注释信息",paramType = "query",dataType = "String"),
        @ApiImplicitParam(name="table_schema",value="数据库名",paramType = "query",defaultValue = "ros_dev0911",dataType = "String"),
    })
    @GetMapping(value = "/getColumns")
    public JSONObject getColumns(String table_name,String column_comment,String table_schema) {
        List<Column> columns = dataDictionaryService.getColumnsByCondition(table_name,table_schema,column_comment);
        JSONObject data = new JSONObject();
        data.put("count", columns.size());
        data.put("data", JSON.toJSON(columns));
        //data.put("data", wareHouseMapper.selectByPrimaryKey(32782));
        return data;
    }
    
    @ApiOperation(value = "执行各种测试方法", notes = "")
    @ApiImplicitParams({
        @ApiImplicitParam(name="page",value="页码",paramType = "query",dataType = "Integer",defaultValue = "1"),
        @ApiImplicitParam(name="pageSize",value="每页数量",paramType = "query",dataType = "Integer",defaultValue = "25")
    })
    @GetMapping(value = "/getSomeThing")
    public JSONObject getSomeThing(int page,int pageSize) {
        JSONObject data = dataDictionaryService.getAnything(page,pageSize);
        return data;
    }
    
    @GetMapping(value = "/setMapValue")
    public String setMapValue(String param) {
        map.put(param, "123654");
        return "设置成功";
    }
    
    @GetMapping(value = "/getMapValue")
    public String getMapValue(String param) {
        count++;
        return map.get(param);
    }
    
    @GetMapping(value = "/clearMapValue")
    public String clearMapValue() {
        map.clear();
        return "清除成功";
    }
    
    @GetMapping(value = "/getMapValueCount")
    public int getMapValueCount() {
        return count;
    }
}
