/**
 * 
 */
package com.qfedu.Day17.TreeSet.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Description： 测试自定义比较器<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:TreeSetDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		//第一种方式
		//这才是使用自定义比较器(Comparator)的方式
		  TreeSet set = new TreeSet(new GZ());
		  set.add(new Person(18));
		  set.add(new Person(11));
		  set.add(new Person(14));
		  set.add(new Person(20));
		  set.add(new Person(16));
		  set.add(new Person(19));
		  System.out.println(set);
		  
		  
		  //第二种方式 匿名内部类
		  TreeSet set1 = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person pthis = (Person)o1;
				Person pother = (Person)o2;
				
				return pthis.getAge() - pother.getAge();
			}
			  
			  
		  });
		  
		  set1.add(new Person(18));
		  set1.add(new Person(11));
		  set1.add(new Person(14));
		  set1.add(new Person(20));
		  set1.add(new Person(16));
		  set1.add(new Person(19));
		  System.out.println(set1);
		  
		  
		  //ps:
		  Integer[] array = new Integer[10];
		  for(int i = 0;i<array.length;i++) {
			  array[i] = (int)(Math.random()*100);
		  }
		  //给当前数组排序 升序
		  Arrays.sort(array);
		  System.out.println(Arrays.toString(array));
		  //需要降序 --> lambda表达式
		  Arrays.sort(array, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Integer ithis = (Integer)o1;
				Integer iother = (Integer)o2;
				return iother.compareTo(ithis);
			}
		});
		  System.out.println(Arrays.toString(array));
		
		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  

	}

}
