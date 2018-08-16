package com.qianfeng.test;
/*
 * 继承:有两个类A类与B类,当让他们之间产生父子的关系,就叫继承
 * 
 * B继承自A     B extends A
 * 
 * 重写:当子类有与父类同名(方法名,参数,返回值等都要相同)的方法.
 * 注意点:相当于子类的同名方法将父类的覆盖了,不会再去调用父类方法.
 * 
 * 作用:在不改变父类名字的前提下,在父类原有功能的基础之上,实现一些属于自己的功能.实现对原有功能的扩充.
 * 
 * this:是一种引用数据类型,保存的是当前对象的地址,代表当前的对象
 * super:是一个关键字,但是不是引用数据类型.可以通过super调用父类的成员
 * 
 * 注意事项:
 * 1.私有方法不能被重写
 * 2.子类的同名方法的权限要大于等于父类的同名方法
 * 3.静态的方法只能覆盖静态的方法
 */
public class Demo3 {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.color = "绿色";//调用父类的属性
		iphone.fangShui();//调用自己的方法
		//子类调用父类的方法原理:首先由引用找到当前的子类对象,在当前的对象里面找这个方法,找到了,直接调用.找不到,再去父类中找
		//依次执行,直到找到Object,如果还是没有,说明确定没有这个方法,报错.
		iphone.callPhone();//调用父类的方法
	}
}
//注意:如果什么都不写,默认父类是Object
class Phone{
	String color;
	int model;
	
	public void callPhone(){
		System.out.println("打电话");
	}
	
	public static void play(){
		
	}
}

//描述的是 Iphone 继承自 Phone
class Iphone extends Phone{
//	String color;
//	int model;
	String gui;
	
	public void callPhone(){
		//this.callPhone();//调用的本对象的callPhone方法--死循环
		super.callPhone();//直接调用的父类的方法
		
		System.out.println("执行自己的功能");
	}
	
	public void fangShui(){
		
		System.out.println("防水");
	}
	
	//静态的方法只能覆盖静态的
	public static void play() {

	}
}

class HuaWei extends Phone{
//	String color;
//	int model;
	
//	public void callPhone(){
//		System.out.println("打电话");
//	}
//	
	public void Niu(){
		System.out.println("牛");
	}
}
