/**
 * 
 */
package com.qfedu.Day22.Thread.sleep;

/**
 * Description�� �߳�˯��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadSleepDemo2.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ThreadSleepDemo2 extends Thread{
	   //�����������ʱָ���̵߳�����
	  public ThreadSleepDemo2(String name) {
		    super(name);
		    
	  }
	@Override
	public void run() {
	      for(int i = 1; i<=100;i++) {
	    	  if(i%5==0) {
	    		  System.out.println("��ǰ�̵߳�������["+this.getName()+"]"+"------ֵ��:"+i);
	    		  //�õ�ǰ���߳̽���˯��״̬
	    		  try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	  }
	      }
	}
	  

	public static void main(String[] args) {
		//�����̶߳���
		Thread td = new  ThreadSleepDemo2("���߳�");
		//���߳̽������״̬
		td.start();
		for(int i = 1;i<=100;i++) {
			if(i%5==0) {
				System.out.println("��ǰ�̵߳�����["+Thread.currentThread().getName()+"]"+"~~~~~ֵ��:"+i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
