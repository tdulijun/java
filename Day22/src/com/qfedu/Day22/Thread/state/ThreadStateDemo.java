/**
 * 
 */
package com.qfedu.Day22.Thread.state;

/**
 * Description： 线程的状态<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadStateDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ThreadStateDemo extends Thread{
	/* 
                必须重写run方法
	 */
	@Override
	public void run() {
		//获取当前线程的名字 this是代表当前对象,线程对象名.getName() 
		System.out.println("run 方法中线程的名字:"+this.getName()
						+"当前先线程的状态:"+this.getState());//getState获取线程状态
		//求和操作
		int sum = 0;
		for(int i = 1; i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("run 方法中线程的名字:"+this.getName()
		                    +"当前先线程的状态run方法执行完毕:"+this.getState());//getState获取线程状态
	}
	public static void main(String[] args) {
		
		//创建先线程对象
		//ThreadStateDemo td = new ThreadStateDemo();
		//多态 --> 对象的向上转型
		Thread td = new ThreadStateDemo();
		//修改线程的名字
		td.setName("子线程");
		System.out.println("在执行start方法之前,当前线程名:"+td.getName()
							+"当前线程状态:"+td.getState());
		td.start();
		System.out.println("在执行start方法之后,当前线程名:"+td.getName()
		+"当前线程状态:"+td.getState());
		
	}

}
