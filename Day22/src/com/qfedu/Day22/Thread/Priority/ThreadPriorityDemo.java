/**
 * 
 */
package com.qfedu.Day22.Thread.Priority;

/**
 * Description�� �������ȼ�<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadPriorityDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ThreadPriorityDemo implements Runnable{

	/* ������дrun����
	 */
	@Override
	public void run() {
		for(int i = 1; i<=100;i++) {
			//���Ǽ̳�Thread����������¿���ʹ������ķ�������ȡ��ǰ�̶߳���
			System.out.println(Thread.currentThread().getName()+"~~~~~~~~>"+ i);
		}
		
	}
	public static void main(String[] args) {
	    //�����̶߳���
		//����޸��̵߳�����--> �̶߳���.setName()
		//ͨ��Runnable�ӿڵ�ʵ����,����Thread����ʱָ���߳�����
		Thread aThread = new Thread(new ThreadPriorityDemo(),"�߳�1");
		Thread bThread = new Thread(new ThreadPriorityDemo(),"�߳�2");
		//û�иı����ȼ�֮ǰ�����߳�Ĭ���� 5 �� 5
		//�޸ĵ�ǰ�߳����ȼ�
//		aThread.setPriority(Thread.MAX_PRIORITY);
//		bThread.setPriority(Thread.MIN_PRIORITY);
		aThread.setPriority(7); 
		bThread.setPriority(3);
		
		aThread.start();
		bThread.start();

	}

	

}
