/**
 * 
 */
package com.qfedu.Day22.AnonymityThread;

/**
 * Description�� �����ڲ���ʵ���߳�<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Demo {
	public static void main(String[] args) {
		
//		//Thread��Ϊ��
//		for(int i = 0;i<50;i++) {
//			System.out.println("����Ϸ:"+i);
//			if(i == 10) {
//				//�����߳�
//				//�����ڲ���̳��ڵ�ǰ��
//				new Thread() {
//					   /* 
//					    * ��дrun����,ʵ�ֵ����̵߳��߼�
//					   */
//					@Override
//					public void run() {
//						for(int i = 0;i<50;i++) {
//							System.out.println("������:"+i);
//						}
//					}
//				}.start();
//			}
//			
//		}
		
		//Runnable�ӿ�Ϊ��
		
		for(int i = 0;i<50;i++) {
		System.out.println("����Ϸ:"+i);
		if(i == 10) {
			//�����߳�
			//�����ڲ���̳��ڵ�ǰ��
			new Thread(new Runnable() {
				
				@Override
				public void run() {
				 for(int i = 0;i<50;i++) {
					 System.out.println("������:"+i);
				 }
					
				}
			}).start();
		}
		
	}
		
		
	
		
		

	}

}
