package com.xin.data.client.abstracts.option;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * 新增数据
 *
 */

public abstract class InsertOption extends AbstractDBOption {
	
	/**
	 * 设置新增操作
	 *
	 */
	@Override
	protected void setEventType() {
		this.eventType = CanalEntry.EventType.INSERT;
	}
}