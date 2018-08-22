/**
 * 
 */
package com.qfedu.Day18.HomeWork;

/**
 * Description： 鱼<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Fish.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Fish extends Animal{
    //子类是无法继承父类的构造方法的
	//子类必须提供自己的构造方法
	public Fish() {
		//调用父类的无参构造方法
		super();
	}
	public Fish(int tui) {
	   super(tui); // 调用类父类的有参构造方法
	}
}
