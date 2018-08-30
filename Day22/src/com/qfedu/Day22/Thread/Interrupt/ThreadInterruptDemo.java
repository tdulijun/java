/**
 * 
 */
package com.qfedu.Day22.Thread.Interrupt;

/**
 * Description： 演示中断线程<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadInterruptDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ThreadInterruptDemo extends Thread {
	@Override
	public void run() {
		for(int i = 1; i<100;i++) {
			System.out.println("线程中的i值是:"+i);
		}
	}
	public static void main(String[] args) {
		Thread td = new ThreadInterruptDemo();
		td.start();
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//中断线程
	   td.interrupt();
	
		

	}

}
