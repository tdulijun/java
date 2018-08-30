/**
 * 
 */
package com.qfedu.Day22.Thread.sleep;

/**
 * Description： 线程睡眠<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadSleepDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 * 
 * 让那个线程睡眠,sleep方法就调用在那个线程中即可
 */
public class ThreadSleepDemo extends Thread{
            
	    /* 
	     * 必须重写run 方法
	     */
	    @Override
	    public void run() {
	        for(int i = 0;i<100;i++) {
	        	System.out.println("当前线程名是:"+this.getName()+"~~~~~值是:"+i);
	        }
	    	
	    }
	
	
	   public static void main(String[] args) {
		     for(int i = 0 ;i<100;i++) {
		    	 if(i == 10) {
		    		 //静态方法
		    		 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    		Thread td = new ThreadSleepDemo();
		    		td.setName("子线程");
		    		td.start();
		    	 }
		    	 //在主线程中获取主线程的名字
		    	 System.out.println("线程名称是:"+Thread.currentThread().getName()+"~~值是:"+i);
		     }
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
