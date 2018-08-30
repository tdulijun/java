/**
 * 
 */
package com.qfedu.Day23.Thread.Single;

import java.util.*;

/**
 * Description： 测试类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */  
public class Test {
	  //在测试类中创建一个集合对象存储单利
	  private Set<SingleDemo> sets = new HashSet<>();
	
	   //创建一个成员内部类
	  class MyThread extends Thread{
		 
		@Override
		public void run() {
			for(int i = 1;i<=20;i++) {
				//向当前集合中添加20次对象
				sets.add(SingleDemo.getInstance());
			}
			System.out.println("打印集合中给的对象:");
			for(SingleDemo sd : sets) {
				System.out.println(sd);
			}
			
			
		}
	  }
	
	    public static void main(String[] args) {
		    Test outter = new Test();
		    outter.new MyThread().start();
		    outter.new MyThread().start();
		}
	
	
	
	
	
	

}
