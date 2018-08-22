/**
 * 
 */
package com.qfedu.Day18.HomeWork;

/**
 * Description： 动物<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Animal.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 * 抽象类 --> 为了防止外部可以直接创建父类对象
 */
public abstract class Animal {
      private int tui;

	public int getTui() {
		return tui;
	}

	public void setTui(int tui) {
		this.tui = tui;
	}

	public Animal(int tui) {
		super();
		this.tui = tui;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
      
}
