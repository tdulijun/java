/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer2;

/**
 * Description： 消费者<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Consumer.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Consumer implements Runnable {
	//共享资源对象
	private ShareResource resource;
	public Consumer(ShareResource resource) {
		this.resource = resource;
	}

	/* 
	 * 消费资源中生产好的数据
	 */
	@Override
	public void run() {
		for(int i = 0;i<50;i++) {
			resource.pop();
		}
		
	}

}
