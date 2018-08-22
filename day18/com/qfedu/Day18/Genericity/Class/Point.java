/**
 * 
 */
package com.qfedu.Day18.Genericity.Class;

/**
 * Description： 泛型类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Point.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 * Point类可以接受String,double,float,int,long 作为参数的数据类型
 */
public class Point<T> {//泛型类 -->类中定义的泛型可以在类体中使用 -->通用性
	//在没有给ArrayList指定泛型时,可以接受任何数据类型
	//此时定义在ArrayList上的<E> 相当于什么 --> Object
	//可以作为属性的数据类型而存在 ,当前数据类型是不能确定了 只是使用了一个字母T作为占位使用
	private T x;
	private T y;
	public Point() {
		
	}
	public Point(T x, T y) {//类中方法可以作为数据类型
		this.x = x;
		this.y = y;
		
	}
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	public void show(T z) {
		System.out.println(z);
	}
	

}
