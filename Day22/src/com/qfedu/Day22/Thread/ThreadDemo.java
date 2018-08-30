/**
 * 
 */
package com.qfedu.Day22.Thread;

/**
 * Description： 创建第一个线程<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ThreadDemo  extends Thread{

	/* 必须重写run 方法
	 */
	@Override
	public void run() {
		for(int i = 0;i<50;i++) {
			System.out.println("播放音乐:"+i);
		}
		
		
	}

	 //main也是一个线程 --> 主线程  main的线程优先级永远高于所有其他线程
	public static void main(String[] args) {
		// 在主线程中模拟打游戏
		for(int i = 0; i<50;i++) {
			System.out.println("打游戏"+i);
			if(i == 10) {
				//开启线程
				//创建线程对象
				ThreadDemo td = new ThreadDemo();
				//如何开启线程 
				//绝对不允许调用run方法
				//通过run方法执行,相当于执行了run方法,并不是开启线程
			    //td.run();
				//start代表的并是不执行当前线程,告诉CPU当前线程正处于等待状态
				//CPU的时间片
				td.start();
			}
			
			
		}
	

	}

}
