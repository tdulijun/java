/**
 * 
 */
package com.qfedu.Day17.HashSet.SelfClass;

/**
 * Description： 学生类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Student.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Student {
	private String name;
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 //这种写法必须会写,并且是手写 --> 中国程序猿写法
//	@Override
//	public boolean equals(Object obj) {
//		Student other = (Student)obj;
//		return this.name.equals(other.name) && this.age == other.getAge();
//	}
//
//	@Override
//	public int hashCode() {
//		return name.hashCode() + age;
//	}
	
	
	//以下才是真正的重写 --> 系统提供
	@Override
	public int hashCode() {
		//常量值 31 --> 质数(素数)
		//31不大不小 很好得到  1向左位移5次 -1 2的5次方-1
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	//阿三(英语) equals判断
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 当前对象的地址 等于 传入对象地址
			return true;
		if (obj == null) //传入对象是null 没有地址
			return false;
		if (getClass() != obj.getClass()) //反射 获取当前类的字节码文件 不等于 传入对象的字节码文件
			return false;
		Student other = (Student) obj;//向下转型 拿到当前类的对象
		if (age != other.age) //当前对象的年龄 不等于 传入对象的年龄
			return false;
		if (name == null) { //当前对象没有名字
			if (other.name != null) //传入对象的名字存在
				return false;
		} else if (!name.equals(other.name))//两个名字不相等
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		
		return name + age ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
