package com.xin.data.client.abstracts.option;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * 删除数据
 *
 */

public abstract class DeleteOption extends AbstractDBOption {
	
	/**
	 * 设置删除操作
	 *
	 */
	@Override
	protected void setEventType() {
		this.eventType = CanalEntry.EventType.DELETE;
	}
	
}
