package com.qfedu.Day11.polymorphic3;
class  A{
	public static void show() {
		System.out.println("父类的静态方法");
	}
	
}
class B extends A{
	/*
	 * 静态方法是不能重写的,隐藏
	 * 当子类提供同名静态方法时,隐藏父类的同名方法,使用子类的同名方法
	 */
	public static void show() {
		System.out.println("子类的静态方法");
	}
	
	
}


public class Test2 {
	
    public static void main(String[] args) {
		B b = new B();
		b.show();
	}
}
