/**
 * 
 */
package com.qfedu.Day22.Thread;

/**
 * Description�� ������һ���߳�<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ThreadDemo  extends Thread{

	/* ������дrun ����
	 */
	@Override
	public void run() {
		for(int i = 0;i<50;i++) {
			System.out.println("��������:"+i);
		}
		
		
	}

	 //mainҲ��һ���߳� --> ���߳�  main���߳����ȼ���Զ�������������߳�
	public static void main(String[] args) {
		// �����߳���ģ�����Ϸ
		for(int i = 0; i<50;i++) {
			System.out.println("����Ϸ"+i);
			if(i == 10) {
				//�����߳�
				//�����̶߳���
				ThreadDemo td = new ThreadDemo();
				//��ο����߳� 
				//���Բ��������run����
				//ͨ��run����ִ��,�൱��ִ����run����,�����ǿ����߳�
			    //td.run();
				//start����Ĳ��ǲ�ִ�е�ǰ�߳�,����CPU��ǰ�߳������ڵȴ�״̬
				//CPU��ʱ��Ƭ
				td.start();
			}
			
			
		}
	

	}

}
