/**
 * 
 */
package com.qfedu.Day16.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Description： 演示LinkedList方法<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:LinkedListDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class LinkedListDemo {

	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		//创建LinkedList集合对象
		LinkedList list = new LinkedList();
		//将集合中的元素存到当前集合中
		//将参数中集合对象的元素存到新的集合中
		LinkedList list1 = new LinkedList(list);
		
		//常用方法:
		//向集合中存储元素-->(包括任何数据类型)
		list.add("第一个元素");
		LinkedList list2 = new LinkedList();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		//这样添加对象是将集合添加到了当前集合对象中
		//list.add(list2);
		//这样添加对象是将当前参数集合中的元素存到了集合对象
		list.addAll(list2);
		/*
		 * add(int index, E element) 
                      在此列表中指定的位置插入指定的元素。
          addAll(int index, Collection<? extends E> c) 
                     将指定 collection 中的所有元素从指定位置开始插入此列表。
                     支持下标 -->0开始 size()-1
		 */
		System.out.println(list);
		
		//将元素添加到集合的开头
		list.addFirst("第0个元素");
		System.out.println(list);
		//将元素添加到集合的末尾
		list.addLast("最后一个元素");
		System.out.println(list);
		//clear() 清空集合中的元素 --> 集合依旧存在
		//判断集合中是否存在指定元素 存在即true  即false
		list.add("1");
		System.out.println(list);
		boolean result = list.contains("1");
		System.out.println(result);
		
		//获取集合中的第一个元素但是不删除该元素
		Object obj = list.element();
		System.out.println(obj);
		System.out.println(list);
		//get(int index) 返回此列表中指定位置处的元素 下标
		
		//获取第一个或最后一个元素
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		/*
 int indexOf(Object o) 
          返回此列表中首次出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1。 
 int lastIndexOf(Object o) 
          返回此列表中最后出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1。 
      返回值的是第一次出现的下标,找不到返回-1
		 */
		//将指定元素添加到末尾
		boolean res = list.offer("ppp");//添加成功返回true
		System.out.println(list);
		System.out.println(res);
		/*
		 * boolean offerFirst(E e) 
          		在此列表的开头插入指定的元素。 
 			boolean offerLast(E e) 
          		在此列表末尾插入指定的元素。 
          	添加成功是不返回true	

		 */
		//获取集合中的第一个元素但是不删除
		Object obj2 = list.peek();
		System.out.println(obj2);
		System.out.println(list);
		/*
		 *  E peekFirst() 
          获取但不移除此列表的第一个元素；如果此列表为空(集合中没有元素)，则返回 null。 
 			E peekLast() 
          获取但不移除此列表的最后一个元素；如果此列表为空(集合中没有元素)，则返回 null。 

		 */
		
		//获取集合中第一个元素并删除
		Object obj3 = list.poll();
		System.out.println(obj3);
		System.out.println(list);
		/*
			E pollFirst() 
          获取并移除此列表的第一个元素；如果此列表为空(集合中没有元素)，则返回 null。 
 			E pollLast() 
          获取并移除此列表的最后一个元素；如果此列表为空(集合中没有元素)，则返回 null。 

		 */
		 //获取集合中第一个元素并删除
		Object obj4 = list.pop();
		System.out.println(obj4);
		System.out.println(list);
		//向集合添加元素
		list.push("0"); //--> addfist
		System.out.println(list);
		
		//集合中删除元素
		//1.删除集合中的第一个元素并获取
		Object obj5 = list.remove();
		System.out.println(obj5);
		System.out.println(list);
		//2.根据下标删除指定元素并获取
		Object obj6 = list.remove(2);
		System.out.println(obj6);
		System.out.println(list);
		//3.删除集合中的指定元素
		//若删除成功返回 true 失败 返回false
		boolean res1 = list.remove("1");
		System.out.println(list);
		 System.out.println(res1);
		 /*
		  * E removeFirst() 
          	移除并返回此列表的第一个元素。 
           E removeLast() 
          	移除并返回此列表的最后一个元素。 
          	会得到删除的元素
		  * 
		  */
		//传入下标替换指定元素,并获取原有值
		 Object obj7 = list.set(0, "yui");
		 System.out.println(obj7);
		 System.out.println(list);
		//将LinkedList集合集合对象转换为数组
		 Object[] objs = list.toArray();
		 System.out.println(Arrays.toString(objs));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
