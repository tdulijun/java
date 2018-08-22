/**
 * 
 */
package com.qfedu.Day17.Genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * Description： xxxx<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:GenericityDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class GenericityDemo {
	public static void main(String[] args) {
	    //集合是可以存储任何数据类型
		//List<Integer> list  = new ArrayList<Integer>();
		//1.7之后退出了泛型自动推断
		List<Integer> list  = new ArrayList<>();
		//ps:
		list.add(1);
		list.add(1);
		list.add(1);
		//求和list集合中所有元素的和
		int sum = 0;
		for(int i = 0;i<list.size();i++) {
			sum+= list.get(i);
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
