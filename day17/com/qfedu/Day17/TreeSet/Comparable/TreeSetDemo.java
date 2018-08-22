/**
 * 
 */
package com.qfedu.Day17.TreeSet.Comparable;

import java.util.TreeSet;

/**
 * Description： TreeSet简单使用<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:TreeSetDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		//1.默认排序的 升序(从小到大)
		//2.排重 --> 排除重复
		//3.无序
		//4.TreeSet的底层实现是一个红黑二叉树(中序遍历 左 根 右)
		//ps:数据若需要排序就一定要具备可比性整数和整数   小数和小数   
		// 整数和字符串,自定义类的对象进行比较 不具备就会出现异常
		// 使用TreeSet就参考set集合的使用方式
		TreeSet set  =  new TreeSet();
		set.add(1);
		set.add(20);
		set.add(8);
		set.add(9);
		set.add("100");
		set.add(11);
		set.add(55);
		set.add(32);
		set.add(44);
		System.out.println(set);

	}

}
