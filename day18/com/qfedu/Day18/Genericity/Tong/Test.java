/**
 * 
 */
package com.qfedu.Day18.Genericity.Tong;

import java.util.ArrayList;
import java.util.List;

/**
 * Description： 演示通配符<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test {
	public static void main(String[] args) {
		//千万不能这样使用  ? 是通配符 错误
//		List<?> list = new ArrayList<>(); 
//		list.add("1");
		//盖住变量名 去除等号右边 ,剩下的就是数据类型
		List<Integer> list1 = new ArrayList<>();
		doWork(list1);
		List<String> list2 =new ArrayList<>();
		doWork(list2);
		
		
		
	}
	//若集合使用了泛型,此时在方法中作为参数是,也要指定泛型是什么
	
//	public static void doWork(List<Integer> array) {
//		
//	}
	//1.通配符的第一个作用就是作为方法的参数的数据类型而存在
	//此时,此方法可以接受任何泛型的集合,传入到方法中
	public static void doWork(List<?> list) {
		//list.add(1);
		System.out.println(list);
	}
	
	

}
