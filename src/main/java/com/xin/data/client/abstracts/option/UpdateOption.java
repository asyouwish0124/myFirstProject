package com.xin.data.client.abstracts.option;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * 更新数据
 *
 */
public abstract class UpdateOption extends AbstractDBOption {
	
	/**
	 * 设置更新属性
	 *
	 */
	@Override
	protected void setEventType() {
		this.eventType = CanalEntry.EventType.UPDATE;
	}
	
}
