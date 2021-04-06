package com.xin.data.client.abstracts;

import com.alibaba.fastjson.JSON;
import com.alibaba.otter.canal.client.CanalConnector;
import com.alibaba.otter.canal.client.CanalConnectors;
import com.alibaba.otter.canal.protocol.exception.CanalClientException;
import com.xin.data.client.interfaces.CanalClient;
import com.xin.data.client.interfaces.TransponderFactory;
import com.xin.data.client.transfer.DefaultMessageTransponder;
import com.xin.data.config.CanalConfig;
import com.xin.data.config.CanalConfig.Instance;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Canal 客户端抽象类
 *
 */
public abstract class AbstractCanalClient implements CanalClient {
	
	/**
	 * 运行状态
	 */
	private volatile boolean running;
	
	/**
	 * canal 配置
	 */
	private CanalConfig canalConfig;
	
	
	/**
	 * 转换工厂类
	 */
	protected final TransponderFactory factory;
	
	/**
	 * 构造方法，初始化 canal 的配置以及转换信息的工厂实例
	 *
	 */
	protected AbstractCanalClient(CanalConfig canalConfig) {
		//参数校验
		Objects.requireNonNull(canalConfig, "canalConfig 不能为空!");
		Objects.requireNonNull(canalConfig, "transponderFactory 不能为空!");
		//初始化配置
		this.canalConfig = canalConfig;
		this.factory = (connector, config,listeners, annoListeners) -> new DefaultMessageTransponder(connector, config, listeners, annoListeners);
	}
	
	/**
	 * 开启 canal 客户端
	 *
	 */
	@Override
	public void start() {
		//可能有多个客户端
		Map<String, CanalConfig.Instance> instanceMap = getConfig();
		//遍历开启进程
		for (Map.Entry<String, CanalConfig.Instance> instanceEntry : instanceMap.entrySet()) {
			process(processInstanceEntry(instanceEntry), instanceEntry);
		}
		
	}
	
	/**
	 * 初始化 canal 连接
	 *
	 */
	protected abstract void process(CanalConnector connector, Map.Entry<String, CanalConfig.Instance> config);
	
	/**
	 * 处理 canal 连接实例
	 *
	 */
	private CanalConnector processInstanceEntry(Map.Entry<String, CanalConfig.Instance> instanceEntry) {
		//获取配置
		CanalConfig.Instance instance = instanceEntry.getValue();
		//声明连接
		CanalConnector connector;
		//若不是集群的话，使用 newSingleConnector 初始化
        connector = CanalConnectors.newSingleConnector(new InetSocketAddress(instance.getHost(), 
                instance.getPort()), instance.getDestination(), instance.getUserName(), instance.getPassword());
		//canal 连接
		connector.connect();
		//canal 连接订阅，包含过滤规则
        connector.subscribe(instance.getFilter());
		//canal 连接反转
		connector.rollback();
		//返回 canal 连接
		return connector;
	}
	
	
	/**
	 * 获取 canal 配置
	 *
	 */
	protected Map<String, CanalConfig.Instance> getConfig() {
		//canal 配置
		CanalConfig config = canalConfig;
		Map<String, CanalConfig.Instance> instanceMap ;
		if(config.getInstances().isEmpty()) {
		    //配置为空，赋默认值
            /*canal.client.instances.host=127.0.0.1
            canal.client.instances.port=11111
            canal.client.instances.batchSize=1000
            canal.client.instances.acquireInterval=1000
            canal.client.instances.retryCount=20*/
		    Map<String, Instance> instance = new  HashMap<>(5);
		    instance.put("example", new Instance());
		    config.setInstances(instance);
		}
		if (config != null && (instanceMap = config.getInstances()) != null && !instanceMap.isEmpty()) {
			//返回配置实例
			return config.getInstances();
		} else {
			throw new CanalClientException("无法解析 canal 的连接信息，请联系开发人员!");
		}
	}
	
	/**
	 * 停止 canal 客户端
	 *
	 */
	@Override
	public void stop() {
		setRunning(false);
	}
	
	/**
	 * 返回 canal 客户端的状态
	 *
	 */
	@Override
	public boolean isRunning() {
		return running;
	}
	
	/**
	 * 设置 canal 客户端状态
	 *
	 */
	private void setRunning(boolean running) {
		this.running = running;
	}
}