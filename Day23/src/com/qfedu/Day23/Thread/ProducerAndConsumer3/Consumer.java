/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer3;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Consumer.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 3.0
 */
public class Consumer implements Runnable {
	//������Դ����
	private ShareResource resource;
	public Consumer(ShareResource resource) {
		this.resource = resource;
	}

	/* 
	 * ������Դ�������õ�����
	 */
	@Override
	public void run() {
		for(int i = 0;i<50;i++) {
			resource.pop();
		}
		
	}

}
