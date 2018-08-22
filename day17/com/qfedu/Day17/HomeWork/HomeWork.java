/**
 * 
 */
package com.qfedu.Day17.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Description： 作业<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HomeWork.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class HomeWork {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
      /*已知有一个工人Worker类 属性：姓名 年龄 工资， 行为 void work()
	a.在集合中添加三个工人对象，信息如下：
		zhang3  18   3000
		li4      25  3500
		wang5    22  3200
	b. 在li4之前插入一个工人 信息为： zhao6  24  3300
	c. 删除wang5的信息
	d. 利用for循环遍历，打印几个中所有工人的信息
	e. 利用迭代器遍历，对集合中的所有工人调用work方法
      */
		
		List list = new ArrayList();
		//a. list中的元素存储的是地址
		// 集合中只能存储对象-->引用的地址
		list.add(new Worker("zhang3",18,3000));
		list.add(new Worker("li4",25,3500));
		list.add(new Worker("wang5",22,3200));
		System.out.println(list);
		
		//b. 之所以集合可以存储任何数据类型--> 因为是父类Object
		//   向上转型 子类的引用赋值给了父类的对象  --> 只能调用父类的属性和方法,不能调用子类特有和方法
		for(int  i = 0; i<list.size();i++) {
			if(((Worker)(list.get(i))).getName().equals("li4")) {
				list.add(i, new Worker("zhao6",24,3000));
				break;
				
			}
		}
	
		System.out.println(list);
		//c.
		for(int i = 0;i<list.size();i++) {
			if(((Worker)(list.get(i))).getName().equals("wang5")) {
				list.remove(i);
				break;
				
			}
		}
		/*
		 * ps不使用下标的形式: 传入一个王五的对象
		 * 重写equals 和  hashcode
		 * list.remove(new Worker("wang5",22,3200));
		 */
		
		//d.
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		//e.
		//1.获取迭代器对象
		Iterator it =  list.iterator();
		//遍历集合
		//2.判断迭代器中是否存在下一个元素 hasNext
		 // 获取当前迭代器中对象next-->集合中的对象
		while(it.hasNext()) {
//			it.next();
//			it.next();
//			//一次循环移动两次  --> 一共就三个元素
			((Worker)(it.next())).work();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
