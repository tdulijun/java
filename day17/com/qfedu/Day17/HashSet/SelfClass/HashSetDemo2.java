/**
 * 
 */
package com.qfedu.Day17.HashSet.SelfClass;

import java.util.HashSet;
import java.util.Set;

/**
 * Description�� equals��hashcode��set�����е�Ч��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HashSetDemo2.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//�϶�����������ͬһ������
	//ֻҪ������ȫ��ͬ����
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
	    Person p1 = new Person("С��", 18);
	    Person p2 = new Person("С��", 18);
	    System.out.println("�����true֤����ǰ����ʹ��������ͬһ������:"+p1.equals(p2));
		
		//����һ��Set����
	    Set set = new HashSet();
	    set.add(new A());
	    set.add(new A());
	    set.add(new B());
	    set.add(new B());
	    set.add(new C());
	    set.add(new C());
	    set.add(p1);
	    set.add(p2);
	    //Set�������Զ����� --> �ų��ظ�
	    System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
