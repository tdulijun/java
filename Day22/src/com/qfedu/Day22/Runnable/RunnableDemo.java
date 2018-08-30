/**
 * 
 */
package com.qfedu.Day22.Runnable;

/**
 * Description： Runnable接口创建线程<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:RunnableDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class RunnableDemo implements Runnable {


	/* 
	 * 
	 * 必须重写run方法 --> 写线程的逻辑
	 */
	@Override
	public void run() {
	   for(int i = 0;i<50;i++) {
		   System.out.println("玩游戏:"+i);
	   }
		
	}
	public static void main(String[] args) {
		 for(int i = 0;i<50;i++) {
			   System.out.println("听音乐:"+i);
			   if(i == 10) {
				   //Runnable接口创建对象
				   Thread td = new Thread(new RunnableDemo());
				   
				   //开启线程
				   td.start();
				   
			   }
		   }

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
