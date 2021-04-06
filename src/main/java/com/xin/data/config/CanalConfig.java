package com.xin.data.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import com.alibaba.otter.canal.common.utils.AddressUtils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 从配置文件获取 canal 配置，前缀是 canal.client
 *
 */
@ConfigurationProperties(prefix = "canal.client")
public class CanalConfig {

    /**
     * 配置信息
     */
    private Map<String, Instance> instances = new LinkedHashMap<>();

    /**
     * 返回实例
     *
     */
    public Map<String, Instance> getInstances() {
        return instances;
    }
    
    /**
     * 设置实例
     *
     */
    public void setInstances(Map<String, Instance> instances) {
        this.instances = instances;
    }

    /**
     * canal 配置类
     */
    public static class Instance {

        /**
         * canal 服务器地址，默认是本地的环回地址
         */
        private String host = AddressUtils.getHostIp();

        /**
         * canal 服务设置的端口，默认 11111
         */
        private int port = 11111;
        
        private String destination = "example";

        /**
         * 设置的用户名
         */
        private String userName = "";

        /**
         * 设置的密码
         */
        private String password = "";

        /**
         * 批量从 canal 服务器获取数据的最多数目
         */
        private int batchSize = 1000;

        /**
         * 是否有过滤规则
         */
        private String filter = "ros_test0911.crm_customer,ros_dev0911.oa_employee";

        /**
         * 当错误发生时，重试次数
         */
        private int retryCount = 5;

        /**
         * 信息捕获心跳时间
         */
        private long acquireInterval = 1000;

        public Instance() {}

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }
        
        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getBatchSize() {
            return batchSize;
        }

        public void setBatchSize(int batchSize) {
            this.batchSize = batchSize;
        }

        public String getFilter() {
            return filter;
        }

        public void setFilter(String filter) {
            this.filter = filter;
        }

        public int getRetryCount() {
            return retryCount;
        }

        public void setRetryCount(int retryCount) {
            this.retryCount = retryCount;
        }

        public long getAcquireInterval() {
            return acquireInterval;
        }

        public void setAcquireInterval(long acquireInterval) {
            this.acquireInterval = acquireInterval;
        }
    }
}
