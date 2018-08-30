/**
 * 
 */
package com.qfedu.Day22.Thread.sleep;

/**
 * Description： 线程睡眠<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadSleepDemo2.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ThreadSleepDemo2 extends Thread{
	   //构建子类对象时指定线程的名字
	  public ThreadSleepDemo2(String name) {
		    super(name);
		    
	  }
	@Override
	public void run() {
	      for(int i = 1; i<=100;i++) {
	    	  if(i%5==0) {
	    		  System.out.println("当前线程的名称是["+this.getName()+"]"+"------值是:"+i);
	    		  //让当前子线程进入睡眠状态
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
		//创建线程对象
		Thread td = new  ThreadSleepDemo2("子线程");
		//让线程进入就绪状态
		td.start();
		for(int i = 1;i<=100;i++) {
			if(i%5==0) {
				System.out.println("当前线程的名称["+Thread.currentThread().getName()+"]"+"~~~~~值是:"+i);
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
