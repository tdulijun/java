/**
 * 
 */
package com.qfedu.Day18.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
 * Description： Collections工具类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:CollectionsDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		
		List<Integer> list  = new ArrayList<>();
		//向集中一次性添加多个元素
		/*
		 * 第一个参数需要是一个Collection这边的集合
		 * 第二个参数是一个可变参数(可以什么都没有,也可以有一堆)
		 */
		Collections.addAll(list, 1,2,3,4,5,56,6,4,3,5,2);
		System.out.println(list);

		//不是只有TreeSet才可以进行排序操作
		//List这边的集合以可以
		//Collections.sort(list);//升序
		//System.out.println(list);
		//重载方法
//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return o2-o1;
//			}
//		});//降序
		
		//降序快捷方式,这个方式不适合自定义类的排序
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		//static void shuffle(List<?> list) 
        // 使用默认随机源对指定列表进行置换 
		//3个51 - 17 1次一个呢只能有1张
		Collections.shuffle(list);
		System.out.println(list);
		
		//集合中查找某个元素--> 二分查找
		/*
		 * 第一个参数是要查找的集合
		 * 第二个参数要查找的值
		 *找到就是下标    找不到-1的值
		 *一定要先排序
		 */
		Collections.binarySearch(list, 1);
		
//		static void reverse(List<?> list) 
//        反转指定列表中元素的顺序。 
		//若需要线程安全时,只需要通过Collections中的方法即可 完成转换
		/*
		 * static <T> Collection<T> 
 		synchronizedCollection(Collection<T> c) 
          		返回指定 collection 支持的同步（线程安全的）collection。 
		static <T> List<T> 
 			synchronizedList(List<T> list) 
          	返回指定列表支持的同步（线程安全的）列表。 
			static <K,V> Map<K,V> 
 			synchronizedMap(Map<K,V> m) 
          			返回由指定映射支持的同步（线程安全的）映射。 
			static <T> Set<T> 
 			synchronizedSet(Set<T> s) 
          	返回指定 set 支持的同步（线程安全的）set。 

		 * 
		 * 
		 */
		
		List<Integer> safeList = Collections.synchronizedList(list);
		System.out.println("当前线程安全的集合是:"+(safeList instanceof Vector));
		
		
		
		
		
		
		
		
		
		
		
	}

}
