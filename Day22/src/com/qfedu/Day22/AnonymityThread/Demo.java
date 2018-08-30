/**
 * 
 */
package com.qfedu.Day22.AnonymityThread;

/**
 * Description： 匿名内部类实现线程<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Demo {
	public static void main(String[] args) {
		
//		//Thread类为例
//		for(int i = 0;i<50;i++) {
//			System.out.println("打游戏:"+i);
//			if(i == 10) {
//				//开启线程
//				//匿名内部类继承于当前类
//				new Thread() {
//					   /* 
//					    * 重写run方法,实现的是线程的逻辑
//					   */
//					@Override
//					public void run() {
//						for(int i = 0;i<50;i++) {
//							System.out.println("听音乐:"+i);
//						}
//					}
//				}.start();
//			}
//			
//		}
		
		//Runnable接口为例
		
		for(int i = 0;i<50;i++) {
		System.out.println("打游戏:"+i);
		if(i == 10) {
			//开启线程
			//匿名内部类继承于当前类
			new Thread(new Runnable() {
				
				@Override
				public void run() {
				 for(int i = 0;i<50;i++) {
					 System.out.println("听音乐:"+i);
				 }
					
				}
			}).start();
		}
		
	}
		
		
	
		
		

	}

}
