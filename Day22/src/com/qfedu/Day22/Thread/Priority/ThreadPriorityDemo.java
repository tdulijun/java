/**
 * 
 */
package com.qfedu.Day22.Thread.Priority;

/**
 * Description： 设置优先级<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadPriorityDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ThreadPriorityDemo implements Runnable{

	/* 必须重写run方法
	 */
	@Override
	public void run() {
		for(int i = 1; i<=100;i++) {
			//不是继承Thread这个类的情况下可以使用下面的方法来获取当前线程对象
			System.out.println(Thread.currentThread().getName()+"~~~~~~~~>"+ i);
		}
		
	}
	public static void main(String[] args) {
	    //构建线程对象
		//如何修改线程的名字--> 线程对象.setName()
		//通过Runnable接口的实现类,创建Thread对象时指定线程名字
		Thread aThread = new Thread(new ThreadPriorityDemo(),"线程1");
		Thread bThread = new Thread(new ThreadPriorityDemo(),"线程2");
		//没有改变优先级之前两个线程默认是 5 和 5
		//修改当前线程优先级
//		aThread.setPriority(Thread.MAX_PRIORITY);
//		bThread.setPriority(Thread.MIN_PRIORITY);
		aThread.setPriority(7); 
		bThread.setPriority(3);
		
		aThread.start();
		bThread.start();

	}

	

}
