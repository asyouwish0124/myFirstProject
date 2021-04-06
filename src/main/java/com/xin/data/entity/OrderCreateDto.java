package com.xin.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderCreateDto {
    private String name;
    private Long company_id;
    private int product_version;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date purchase_date;
    private int purchase_month_count;
    private int deploy_day;
    private String order_no;
    private int user_quota;
    private int quantity;
    private Long user_id;
    private String user_name;
    private BigDecimal amount;
    private BigDecimal price;
    private int source_type;
    private Long id;
    private String sign;
    private Integer login_user_quota;
}
