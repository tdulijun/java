/**
 * 
 */
package com.qfedu.Day17.HashSet.SelfClass;

import java.util.HashSet;
import java.util.Set;

/**
 * Description： equals和hashcode在set集合中的效果<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HashSetDemo2.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//认定两个对象是同一个对象
	//只要属性完全相同即可
	/* 
	 */
	@Override
	public boolean equals(Object obj) {
		Person other = (Person)obj;
		return this.name.equals(other.name) && this.age == other.age;
	}
}

class A{
	
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
}
class B{
	
	@Override
	public int hashCode() {
	
		return 1;
	}
}
class C{
	
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	@Override
	public int hashCode() {
	
		return 2;
	}
}





public class HashSetDemo2 {
	public static void main(String[] args) {
	    Person p1 = new Person("小明", 18);
	    Person p2 = new Person("小明", 18);
	    System.out.println("若输出true证明当前对象和传入对象是同一个对象:"+p1.equals(p2));
		
		//创建一个Set集合
	    Set set = new HashSet();
	    set.add(new A());
	    set.add(new A());
	    set.add(new B());
	    set.add(new B());
	    set.add(new C());
	    set.add(new C());
	    set.add(p1);
	    set.add(p2);
	    //Set集合是自动排重 --> 排除重复
	    System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
