/**
 * 
 */
package com.qfedu.Day22.Runnable;

/**
 * Description�� Runnable�ӿڴ����߳�<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:RunnableDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class RunnableDemo implements Runnable {


	/* 
	 * 
	 * ������дrun���� --> д�̵߳��߼�
	 */
	@Override
	public void run() {
	   for(int i = 0;i<50;i++) {
		   System.out.println("����Ϸ:"+i);
	   }
		
	}
	public static void main(String[] args) {
		 for(int i = 0;i<50;i++) {
			   System.out.println("������:"+i);
			   if(i == 10) {
				   //Runnable�ӿڴ�������
				   Thread td = new Thread(new RunnableDemo());
				   
				   //�����߳�
				   td.start();
				   
			   }
		   }

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
