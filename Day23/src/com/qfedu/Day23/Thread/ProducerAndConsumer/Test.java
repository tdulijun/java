/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer;

/**
 * Description������������������ģʽ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Test {


	public static void main(String[] args) {
		// ��һ�汾����
		//1.���������ߺ���������Ҫ�Ĺ�����Դ����
		ShareResource resource = new ShareResource();
		//2.�����߳̽�������������
		new Thread(new Producer(resource)).start();
		new Thread(new Consumer(resource)).start();

	}

}
