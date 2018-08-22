/**
 * 
 */
package com.qfedu.Day17.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Description： HashSet的使用<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HashSetDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class HashSetDemo {

	public static void main(String[] args) {
		//1.HashSet是Set接口的实现类
		//set是不允许存储重复值,排重 (排除重复)
		Set set = new  HashSet();
		// HashSet set = new Hash();
		//1.向集合中添加元素
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		System.out.println(set);
		List list = new ArrayList();
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		System.out.println(list);
		set.addAll(list);//存储的不是集合 是集合中元素
		System.out.println(set);
		
		//清空集合  内容清空 集合存在
		set.clear();
		//判断集合是否为空 -->空没有元素 true  反之false
		System.out.println(set.isEmpty());
		/*
		 *  boolean contains(Object o) 
         		判断集合中是否存在指定元素 存在true 反之false
 			boolean containsAll(Collection<?> c) 
          	判读集合中是否存在指定集合中的元素 存在true 反之false 

		 */
		
		//set同样支持Iterator迭代器
		//但是:它只支持标准的迭代器 不支持listIterator
		//千万不要在迭代器中使用集合自身的增加和删除方法
		//不然就会出现异常
		
		//1.获取迭代器对象
		Iterator it =  set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//set中删除只有一种直接删除方式
		//参数必须是一个对象
		//这个方法是有返回值的  true证明删除成功
		//                   false证明删除失败-->集合中没有这个对象
		set.remove("2");
		
		/*
		 * 参考List
		 * boolean removeAll(Collection<?> c) 
                           删除传入参数集合中元素 ,保留剩余元素
 		  boolean retainAll(Collection<?> c) 
                      保留传入参数集合中的元素,删除剩余元素 

		 */
		//提供一个方法可以获得集合中所有元素的个数
		int size = set.size();
		//set集合除了Iterator迭代器方式可以遍历
		//同样支持for循环遍历 -->只支持增强for循环
		for(Object obj :set) {
			System.out.println(obj);
		}
		//ps:set并不支持使用循环的方式赋值
		//set集合可以转变为数组
      	Object[] obj = set.toArray();
		//需求:如下set集合中存储了字符串1-9
      	//    将集合转换为数组
      	//    打印数组中值
        //    将数组中的值存到一个新的set集合中
		
		
		
		
		
		
		
		
		
		
		

	}

}
