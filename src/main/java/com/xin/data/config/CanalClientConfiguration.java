package com.xin.data.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.xin.data.client.core.SimpleCanalClient;
import com.xin.data.client.interfaces.CanalClient;
import com.xin.data.unit.MyBeanUtil;

public class CanalClientConfiguration {

    /**
     * 记录日志
     */
    private final static Logger logger = LoggerFactory.getLogger(CanalClientConfiguration.class);

    /**
     * canal 配置
     */
    @Autowired
    private CanalConfig canalConfig;
    
    /**
     * 返回 bean 工具类
     *
     */
    @Bean
    public MyBeanUtil beanUtil() {
        return new MyBeanUtil();
    }
    
    /**
     * 返回 canal 的客户端
     *
     */
    @Bean
    private CanalClient canalClient() {
        return null;
        /*logger.info("正在尝试连接 canal 客户端...");
        //连接 canal 客户端
        CanalClient canalClient = (CanalClient) new SimpleCanalClient(canalConfig);
        logger.info("正在尝试开启 canal 客户端...");
        //开启 canal 客户端
        canalClient.start();
        logger.info("启动 canal 客户端成功...");
        //返回结果
        return canalClient;*/
    }
}
