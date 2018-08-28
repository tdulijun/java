/**
 * 
 */
package com.qfedu.Day21.IO.ObjectInputAndOutput;

import java.io.Serializable;

/**
 * Description： 学生类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Student.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
//只要类实现了Serializable接口就一定能进行序列化和反序列
public class Student implements Serializable{

	/**
	 *就是为了区分JDK版本号 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String gender;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//重写toString

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
