/**
 * 
 */
package com.qfedu.Day15.Exception.change;

/**
 * Description：测试<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Demo {
	public static void main(String[] args) {
		show();

	}
	
	public static void display() {
		throw new  AException("出现A异常");
	}
	public static void show() {
		try {
		 display();
		}catch(AException e) {
			throw new  BException("出现B异常");
		}
	}

}
