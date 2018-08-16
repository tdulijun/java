/**
 * 
 */
package com.qfedu.Day13.System;

/**
 * Description： System简单演示<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SystemDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class SystemDemo {
	//不重写的,并且这个方法我们是不需要调用,因为他是系统自动调用
	//GC回收完空间后会自动调用
	@Override
	protected void finalize() throws Throwable {
		System.out.println("对象被回收了......");
	}
	public static void main(String[] args) {
//		System.out.println("循环开始");
//		int i = 0;
//		while(true) {
//			if(i != 100000) {
//				System.out.println(i);
//			}else {
//				/**
//				 * 两种停止一种是正常停止   大于等于0的数
//				 *        一种是异常停止   负数
//				 * ps:两种停止的效果是一样       
//				 * 给JVM发去指令让其停止 取决于当前传入的是正数还是负数
//				 * 程序要尽量不要使用这个方法,
//				 */
//				System.exit(-1);
//			}
//			i++;
//			
//		}
//        //System.out.println("循环结束");
		
		
		new SystemDemo();
		new SystemDemo();
		new SystemDemo();
		
		//立即回收,只能是给垃圾回收机制一个暗示,加快回收
		System.gc();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
