/**
 * 
 */
package com.qfedu.Day22.Thread.sleep;

/**
 * Description�� �߳�˯��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadSleepDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 * 
 * ���Ǹ��߳�˯��,sleep�����͵������Ǹ��߳��м���
 */
public class ThreadSleepDemo extends Thread{
            
	    /* 
	     * ������дrun ����
	     */
	    @Override
	    public void run() {
	        for(int i = 0;i<100;i++) {
	        	System.out.println("��ǰ�߳�����:"+this.getName()+"~~~~~ֵ��:"+i);
	        }
	    	
	    }
	
	
	   public static void main(String[] args) {
		     for(int i = 0 ;i<100;i++) {
		    	 if(i == 10) {
		    		 //��̬����
		    		 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    		Thread td = new ThreadSleepDemo();
		    		td.setName("���߳�");
		    		td.start();
		    	 }
		    	 //�����߳��л�ȡ���̵߳�����
		    	 System.out.println("�߳�������:"+Thread.currentThread().getName()+"~~ֵ��:"+i);
		     }
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
