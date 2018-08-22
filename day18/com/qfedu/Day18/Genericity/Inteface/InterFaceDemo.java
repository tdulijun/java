/**
 * 
 */
package com.qfedu.Day18.Genericity.Inteface;

/**
 * Description： 定义泛型接口<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:InterFaceDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
//和类是类似的使用方式
public interface InterFaceDemo<T> {
	//1.8之前
	String NAME = "1";  //public static final 
	//抽象方法 全局静态常量
	void show(T t); // public abstract
	//1.8之后
	//定义实现方法
	//default 修饰   static 修饰 --> 都是公有public
	//default可以重写 static 不行 
	//default可以通过接口对象调用 static接口名调用

}
