/**
 * 
 */
package com.qfedu.Day22.Thread.Interrupt;

/**
 * Description�� �жϱ�Ǻ��жϱ�Ǽ��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadInterruptDemo2.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ThreadInterruptDemo3 extends Thread {

	@Override
	public void run() {
		for(int i = 1;i<=100;i++) {
			System.out.println("���߳���Ϣ:"+i);
			if(i == 20) {
				//�жϵ�ǰ��ǵ�ֵ   ���жϱ�� ����true  û�о���false
				if(Thread.interrupted()) {
					System.out.println("�߳��Ѿ��ж�");
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		 Thread td = new ThreadInterruptDemo3();
		 td.start();
		 td.interrupt();//����жϱ��

	}

}
