package com.qfedu.Day11.polymorphic3;
//先  静态 --> 初始 --> 构造
class  SuperClass{
	
	static {
		System.out.println("父类的静态代码块");
	}
	
	{
		System.out.println("父类的初始化代码块");
	}
	
	public SuperClass() {
		System.out.println("父类的无参构造方法");
	}
	
}

class SubClass extends SuperClass{
	static {
		System.out.println("子类的静态代码块");
	}
	
	{
		System.out.println("字类的初始化代码块");
	}
	
	public SubClass() {
		System.out.println("子类的无参构造方法");
	}
}


public class Test3 {
 
	
	 public static void main(String[] args) {
		  new SubClass();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
