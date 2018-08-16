package com.qianfeng.test;

public class Demo6 {
	/*
	 * 匿名对象:没有名字的对象
	 * 作用:简化代码
	 */
	public static void main(String[] args) {
		 new Dog();//匿名对象
		 
		 //调用方法
		 //使用场景:作为参数传递
		 //Dog dog = new Dog();
		 feedDog(new Dog());
		 
		 new Dog().age = 4;
		 new Dog().name = "bingbing";
		 System.out.println(new Dog().age+"   "+new Dog().name);
	}
	
	public static void feedDog(Dog dog){//dog = new Dog()
		dog.age = 3;
	}
}

class Dog{
	String name;
	int age;
}
