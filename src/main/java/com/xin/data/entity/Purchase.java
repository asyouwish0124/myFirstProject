package com.xin.data.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import com.xin.common.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "pms_purchase_order")
public class Purchase extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**  
     * @Fields id :主键
     */  
    @Id
    private Long id;
    /**  
     * @Fields code : 采购单号
     */  
    @Column(name="no")
    private String no;

}
