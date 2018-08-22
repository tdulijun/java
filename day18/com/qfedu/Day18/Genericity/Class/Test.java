/**
 * 
 */
package com.qfedu.Day18.Genericity.Class;

/**
 * Description： 测试泛型类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test {
	//如何使用泛型类
	 public static void main(String[] args) {
		 //不推荐
//		 Point p1 = new Point();
//		 //默认是泛型类,在创建对象时不指定泛型类型也可以使用但是,不指定就是Object
//		 p1.show(10);
		 //如何创建对象
		 Point<String> p1 = new Point<>();
		 p1.setX("1");
		 
		 //T 相当于 Object
		 Point<Integer> p2 = new  Point<>();
		 p2.setX(1);
		 
		 Point<Boolean> p3 = new Point<>();
		 p3.setX(true);
	}

}
