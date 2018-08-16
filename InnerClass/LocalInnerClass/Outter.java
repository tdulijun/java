package com.qfedu.Day11.InnerClass.LocalInnerClass;
//局部内部类
public class Outter {
  String name = "小白";
  public void show() {
	  /*
	   *若局部内部类访问了方法中的局部变量,name这个变量会被默认添加final修饰(java7之后自动添加)
	   *若是在java7之前,就需要手动添加final
	   *若方法中有局部变量需要提供给局部内类使用,那么这个局部变量就请使用final 
	   */
	final int age = 30;
	 
	  //局部内部类
	  class Inner{
		  String info = "信息";
		  public void display() {
			  System.out.println(name);
			  System.out.println(info);
			  System.out.println(age);
		  }
	  }
	  //局部类类的对象只能在方法体中创建
	  new Inner().display();
	  
  }
}
