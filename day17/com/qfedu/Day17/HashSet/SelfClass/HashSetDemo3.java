/**
 * 
 */
package com.qfedu.Day17.HashSet.SelfClass;

import java.util.HashSet;
import java.util.Set;

/**
 * Description： 自定义类的排重(Set)<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HashSetDemo3.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class HashSetDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Student("张三",18));
		set.add(new Student("李四",20));
		set.add(new Student("王五",22));
		set.add(new Student("张三",18));
		set.add(new Student("李四",20));
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
