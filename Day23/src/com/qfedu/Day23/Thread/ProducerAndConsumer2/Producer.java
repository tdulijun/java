/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer2;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Producer.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Producer implements Runnable{
	//����һ��������ʹ������һ��������Ժͷ���
	//��һ����Ϊ��ǰ������Զ����� -->�������ؿ͹���ʵ�߼�
	//�ڶ�����Ϊ��ǰ�������ṩ�ķ����Ĳ�������
	private ShareResource resource;
	public Producer(ShareResource resource) {
		this.resource = resource;
	}
	/* 
	 * �����������
	 */
	@Override
	public void run() {
		  for(int  i = 0;i<50;i++) {
			  if(i%2==0) {
				  resource.push("����", "��");
			  }else {
				  resource.push("���","Ů");
			  }
			  
		  }
		
	}
	

}
