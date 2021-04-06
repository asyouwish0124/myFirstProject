package com.xin.data.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "wms_warehouse")
public class WareHouse extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**  
     * @Fields id :主键
     */  
    @Id
    private Long id;
    /**  
     * @Fields code : 仓库编号
     */  
    @Column(name="code")
    private String code;
   
    /**  
     * @Fields name : 仓库名称
     */  
    @Column(name="name")
    private String name;
}
