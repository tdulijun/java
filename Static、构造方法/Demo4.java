package com.qianfeng.test;

public class Demo4 {
	public static void main(String[] args) {
		//static功能:创建工具类
		int[] arr = new int[]{3,5,8};
		//不使用非静态的方法-原因:在工具类中没有使用非静态的成员变量.
//		ArrayTool arrayTool = new ArrayTool();
//		arrayTool.ErFenSearch(arr, 5);
		//直接通过类名调用-用static修饰的方法作为工具类的方法
		ArrayTool.ErFenSearch(arr, 4);
		
		//验证static修饰的成员变量被所有对象共享
		//一个类可以创建多个对象,对象之间没有关系,互不影响.
		Test.age = 4;
		Test test = new Test();
		System.out.println(test.age);//4
		Test test1 = new Test();
		System.out.println(test1.age);//4
	}
	/*
	 * static的作用总结:可以修饰成员变量和成员方法
	 * 作用:保值-延长成员的存活时间,使其与程序保持一致
	 * 
	 * 被static修饰的成员变量的特点:
	 * 1.被当前类的所有对象共享.
	 * 2.由随着对象的加载而加载变成随着类的加载而加载,变量被放在了静态方法区,执行顺序优先于非静态的成员变量.
	 * 3.可以使用类名或引用调用
	 * 
	 * 比较静态的成员变量和非静态的成员变量?
	 * 1.存储数据的使用:非静态的只能供当前的对象使用,静态的被所有对象共享
	 * 2.生命周期:非静态的跟对象一致,静态的与程序一致
	 * 3.存储的位置:非静态的在对象中,静态的在静态方法区
	 * 4.访问的方式:非静态的只能使用引用.静态的可以使用引用或类名.
	 * 
	 * 被static 修饰的成员方法的特点:
	 * 1.静态的成员方法内部只能使用静态的成员
	 * 2.非静态的成员方法内部既可以使用静态的又可以使用非静态的.
	 */
	
}

class Test{
	static int age;
}
