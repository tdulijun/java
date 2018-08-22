/**
 * 
 */
package com.qfedu.Day18.Genericity.Inteface;

/**
 * Description： 测试泛型接口<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test {

	
	public static void main(String[] args) {
		//3.以匿名内部类的形式来完成泛型接口的创建,同时指定泛型类型
		new InterFaceDemo<String>() {

			@Override
			public void show(String t) {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
