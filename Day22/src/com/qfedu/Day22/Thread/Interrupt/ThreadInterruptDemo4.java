/**
 * 
 */
package com.qfedu.Day22.Thread.Interrupt;

/**
 * Description： 中断标记和中断标记检测使睡眠苏醒<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadInterruptDemo2.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ThreadInterruptDemo4 extends Thread {

	@Override
	public void run() {
		System.out.println("进入线程状态......");
		try {
			Thread.sleep(10000);
			System.out.println("线程是睡眠完成后苏醒!!");
		} catch (InterruptedException e) {
			System.out.println("线程终止了睡眠");
			return;
		}
		
		
	}

	public static void main(String[] args) {
		   Thread td  = new ThreadInterruptDemo4();
		   td.start();
		   
		   //延迟操作
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   td.interrupt();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   

	}

}
