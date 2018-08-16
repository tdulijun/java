package com.qianfeng.test;
/*
 * 静态代码块儿:随着类的加载而加载,在整个程序中只执行一次.执行顺序优先于main()
 * 构成: static+{代码}
 * 作用:适合用于类的初始化
 * 构造代码块儿:随着对象的加载而加载,每次创建对象都会执行一次.执行顺序优先于构造方法
 * 构成:{代码}
 * 作用:适合用于对象的初始化
 * 
 * 总体的顺序:静态代码块儿>构造代码块儿>构造方法
 */
public class Demo8 {
	static{//静态代码块儿
		System.out.print("a");
	}
	public static void main(String[] args) {
          Pig pig = new Pig();
          Pig pig1 = new Pig();
          pig.play();
	}
	static{//静态代码块儿
		System.out.print("d");
	}
}
class Pig{
	static{//静态代码块儿
		System.out.print("f");
	}
	public Pig() {
		System.out.print("b");
	}
	{//构造代码块儿
		System.out.print("c");
	}
	public  void  play() {
		System.out.print("e");
	}
}
