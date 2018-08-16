package com.qianfeng.test;

public class Demo7 {
	//描述:一个人有一个孩子
	public static void main(String[] args) {
		Persons persons = new Persons();
		persons.name = "ren";
		
		Persons haizi = new Persons();
		persons.baby = haizi;
		
	}
}
//一个类型一旦创造出来,他就是一个独立的数据类型.在他可见的范围内都是可以使用的,包括自己的内部.
class Persons{
	String name;
	int age;
	Persons baby;
}

//作业:求两点之间的距离
//1.要使用两种方法实现求解 :静态方法和非静态方法
//2.平面的图形     Math.sqrt(a)

