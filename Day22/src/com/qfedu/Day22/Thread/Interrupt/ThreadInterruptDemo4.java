/**
 * 
 */
package com.qfedu.Day22.Thread.Interrupt;

/**
 * Description�� �жϱ�Ǻ��жϱ�Ǽ��ʹ˯������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadInterruptDemo2.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ThreadInterruptDemo4 extends Thread {

	@Override
	public void run() {
		System.out.println("�����߳�״̬......");
		try {
			Thread.sleep(10000);
			System.out.println("�߳���˯����ɺ�����!!");
		} catch (InterruptedException e) {
			System.out.println("�߳���ֹ��˯��");
			return;
		}
		
		
	}

	public static void main(String[] args) {
		   Thread td  = new ThreadInterruptDemo4();
		   td.start();
		   
		   //�ӳٲ���
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   td.interrupt();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   

	}

}
