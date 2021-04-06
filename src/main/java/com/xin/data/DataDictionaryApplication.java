package com.xin.data;

import tk.mybatis.spring.annotation.MapperScan;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.util.DigestUtils;

import com.xin.common.utils.DateUtils;
import com.xin.common.utils.MailUtil;
import com.xin.common.utils.ValidateUtil;
import com.xin.config.EnableDynamicDataSource;
import com.xin.config.EnableFeignHeaderConfiguration;
import com.xin.config.EnableLongConfig;
import com.xin.config.EnableRequestFilter;
import com.xin.data.annotation.EnableCanalClient;
import com.xin.data.entity.OrderCreateDto;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan({"com.xin.data.mapper"})
@ComponentScan(basePackages={"com.xin.foundation", "com.xin.data"})
@EnableFeignClients({"com.xin.foundation", "com.xin.data"})
@EnableFeignHeaderConfiguration
@EnableRequestFilter
@EnableLongConfig
@EnableDiscoveryClient
@EnableDynamicDataSource
@EnableCanalClient
public class DataDictionaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataDictionaryApplication.class, args);
		System.out.println("@@@@@@@@@@@");
	}

	public static String nvl(String str,String defaultValue) {
        if(StringUtils.isEmpty(str)) {
            return defaultValue;
        }
        return str;
    }
}
