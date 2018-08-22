/**
 * 
 */
package com.qfedu.Day17.HomeWork;

/**
 * Description： 工人类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Work.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Worker {
	//对当前类进行描述  --> 对象的描述
	//类的作用 --> 用来存储描述对象的信息
	//姓名 年龄 工资， 行为 void work()
	//属性的:定义成员变量
	private String name;
	private int age;
	private int money;

	//构造方法时可以私有化 --> 单利 
	//                  --> 简单工厂  工具类
	
	//构造方法 --> 无参   -->有参 
	//提供了成员变量快捷的赋值方式
	public Worker() { //没有参数
		//super(); 调用父类的构造方法(无参)
		//这里还可以使用一些调用语句(方法的) 不这样做
		//初始化数组 ,集合初始化
		//给成员变量一些初始值(固定的)
		
	}
	public Worker(String name,int age,int money) {
		this.name = name;
		this.age = age;
		this.money = money;
		
	}
	
	
	
	//getter和setter方法 --> 对外提供访问和修改操作
	public String getName() { //获取当前成员变量
		return name;
	}
	public void setName(String name) {//修改当前成员变量
		this.name = name;      
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	//描述行为 --> 方法
	public void work() {
		System.out.println(name+"工人在工作拿到薪水:"+money);
	}
	
	
	/* 
	 * 打印自定义对象的信息
	 */
	@Override
	public String toString() {
		
		return name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
