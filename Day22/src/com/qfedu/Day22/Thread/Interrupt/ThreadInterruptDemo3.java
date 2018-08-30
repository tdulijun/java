/**
 * 
 */
package com.qfedu.Day22.Thread.Interrupt;

/**
 * Description： 中断标记和中断标记检测<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadInterruptDemo2.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ThreadInterruptDemo3 extends Thread {

	@Override
	public void run() {
		for(int i = 1;i<=100;i++) {
			System.out.println("子线程信息:"+i);
			if(i == 20) {
				//判断当前标记的值   有中断标记 返回true  没有就是false
				if(Thread.interrupted()) {
					System.out.println("线程已经中断");
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		 Thread td = new ThreadInterruptDemo3();
		 td.start();
		 td.interrupt();//添加中断标记

	}

}
