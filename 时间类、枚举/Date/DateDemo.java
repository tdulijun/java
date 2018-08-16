/**
 * 
 */
package com.qfedu.Day14.Date;

import java.util.Date;

/**
 * Description： Date类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:DateDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建Date对象
		Date date = new  Date();
		//ps:可以在创建对象的时候指定当前类是哪个包下
		//java.util.Date date1 = new java.util.Date();
		//可以获得当前系统时间Thu Aug 16 11:27:41 CST 2018
		System.out.println(date);
		
		//有参的构造方法-->long -->毫秒值
		//将毫秒值转换为时间
		long time = System.currentTimeMillis();
	    Date date2 = new Date(time);
	    System.out.println(date2);
	    //返回值从1970年1月1日00:00:00到此date对象所表示的毫秒数
	    System.out.println(date.getTime());
	    System.out.println("中国人的时间风格:"+date.toLocaleString());
		
	    
	    
	

	}
	
	
	//过时方法写法  注解
	//@Override --> 帮助编译器检查当前方法是否是重写方法
	@Deprecated
	public void show() {
		System.out.println("这是一个方法过时");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
