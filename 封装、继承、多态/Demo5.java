package com.qianfeng.test;
/*
 * 设计模式:前人总结出来的经验后人直接拿来使用.
 * 设计模式种类:23种       常用的:单例,模板,工厂,装饰,适配器,代理
 * 单例设计模式:一个类只允许有一个对象,建立一个全局的访问点,提供出去供大家使用
 * 分析:
 * 要设计单例类:
 * 1.用户只能有一个对象
 * 2.建立全局的访问点?  得到的对象就是全局的访问点.    怎么做到全局? static
 * 3.提供出去?
 * 4.供大家使用?--单例的功能.
 * 
* 单例类的作用:1.可以实现两个对象之间的传值
  * 2.可以在全局范围内调用很多的功能.
 * 好处:可以让两个对象在完全没有关系的前提下,实现值的传递,降低了耦合性,提高了内聚性
 * 
 * 耦合性,内聚性在微观上说:描述的是类与类之间的关系
 * 好处:我们应该尽量提高内聚性,减少耦合性,可以提高程序的健壮性,增加代码的可移植性,方便实现模块儿化编程
 * 
 * 如何做到低耦合高内聚?
 * 在处理类与类关系的时候,让类之间的关系越紧密耦合性越高,内聚性越低.反之,关系越松散耦合性越低,内聚性越高.
 */

//创建单例类
//饿汉式:在定义变量的同时完成初始化
class SingleInstance{
	//2.在类的内部创建一个私有的对象
	//将singleInstance变成静态的--相当于提供全局的访问点
	private static SingleInstance singleInstance = new SingleInstance();
	//1.将构造方法私有化
	private SingleInstance() {
	}
	
	//3.通过一个公共的方法将变量提供出去,供大家访问
	//将公共方法变成静态的
	public static SingleInstance getInstance(){
		return singleInstance;
	}
	
	//功能区--非静态的成员
	int num;
}

//懒汉式:什么时候使用什么时候赋值
class SingleInstance1{
	//在类的内部创建一个私有的对象
	//将singleInstance变成静态的--相当于提供全局的访问点
	private static SingleInstance1 singleInstance = null;
	//将构造方法私有化
	private SingleInstance1() {
	}
	
	//通过一个公共的方法将变量提供出去,供大家访问
	//将公共方法变成静态的
	public static SingleInstance1 getInstance(){
		if (singleInstance == null) {
			singleInstance = new SingleInstance1();
		}
		return singleInstance;
	}
	
	//功能区--非静态的成员
}


public class Demo5 {
	public static void main(String[] args) {
		//SingleInstance已经被私有化,不能再直接调用
//		SingleInstance singleInstance1 = new SingleInstance();
//		SingleInstance singleInstance2 = new SingleInstance();
//		System.out.println(singleInstance1 == singleInstance2);//false
		
		//让用户获取单例对象
//		SingleInstance singleInstance1 = SingleInstance.getInstance();
//		SingleInstance singleInstance2 = SingleInstance.getInstance();
//		System.out.println(singleInstance1 == singleInstance2);//true
		
		//实现功能:将A类的对象中的num1的值传给B类的对象的属性num2
		
		//第一种方式:直接赋值,但是一般类的成员变量都是私有的,所以不推荐
		A a = new A();
		a.num1 = 4;
		
		B b = new B();
		b.num2 = a.num1;
		
		//第二种:通过传参
		b.test(a);
		
		//第三种方式:通过单例
		a.ceshiDanli1();
		b.ceshiDanli2();
	}
}
class A{
	int num1;
	
	//通过单例传值
	public void ceshiDanli1(){
		SingleInstance singleInstance = SingleInstance.getInstance();
		singleInstance.num = num1;
	}
}

class B{
	int num2;
	
	//通过传参
	public void test(A a){
		num2 = a.num1;
	}
	
	//通过单例传值
	public void ceshiDanli2(){
		SingleInstance singleInstance = SingleInstance.getInstance();
		num2 = singleInstance.num;
	}
}





