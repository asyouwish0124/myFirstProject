package com.xin.data.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//根据order的设置的顺序去执行，否则顺序乱掉
@Order(value =1)
public class MyStartupRunner1 implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行 1111 <<<<<<<<<<<<<");
    }

}
