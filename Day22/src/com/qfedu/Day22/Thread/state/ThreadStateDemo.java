/**
 * 
 */
package com.qfedu.Day22.Thread.state;

/**
 * Description�� �̵߳�״̬<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadStateDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ThreadStateDemo extends Thread{
	/* 
                ������дrun����
	 */
	@Override
	public void run() {
		//��ȡ��ǰ�̵߳����� this�Ǵ���ǰ����,�̶߳�����.getName() 
		System.out.println("run �������̵߳�����:"+this.getName()
						+"��ǰ���̵߳�״̬:"+this.getState());//getState��ȡ�߳�״̬
		//��Ͳ���
		int sum = 0;
		for(int i = 1; i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("run �������̵߳�����:"+this.getName()
		                    +"��ǰ���̵߳�״̬run����ִ�����:"+this.getState());//getState��ȡ�߳�״̬
	}
	public static void main(String[] args) {
		
		//�������̶߳���
		//ThreadStateDemo td = new ThreadStateDemo();
		//��̬ --> ���������ת��
		Thread td = new ThreadStateDemo();
		//�޸��̵߳�����
		td.setName("���߳�");
		System.out.println("��ִ��start����֮ǰ,��ǰ�߳���:"+td.getName()
							+"��ǰ�߳�״̬:"+td.getState());
		td.start();
		System.out.println("��ִ��start����֮��,��ǰ�߳���:"+td.getName()
		+"��ǰ�߳�״̬:"+td.getState());
		
	}

}
