/**
 * 
 */
package com.qfedu.Day16.ForList;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ForListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println("普通for循环遍历打印的结果:");
		//1.普通for循环
		for(int  i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("增强for循环遍历打印的结果:");
		//2.增强for循环
		//ps:对于集合来说就是一个迭代器
		/*
		 * 通过反编译.class文件的到的结果
		 * Object obj;
		 * for (Iterator iterator = list.iterator(); iterator.hasNext();){
						obj = iterator.next();
			 			System.out.println(obj)
			 }
		 */
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("迭代器遍历打印的结果:");
		//3.迭代器 
		//3.1需要先获取迭代器对象
		Iterator it = list.iterator();
		//3.2通过迭代器对象的hasNext方法获取是否还有下一个元素
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("for循环迭代器版本");
		//for循环版本:
		for(Iterator itr = list.iterator();itr.hasNext();) {
			System.out.println(itr.next());
			
		}
		//ps:以上三种的效果都是一样,但实际迭代器是不同
		
		//4.枚举迭代器:
		//这个只是用来掩饰无需记住,不会再使用这种方式
		Vector v = new Vector();
		v.addAll(list);
		//4.1获取枚举迭代器的对象
		 Enumeration en =  v.elements();
		 //判断枚举迭代器中是否存在下一个元素
		 while(en.hasMoreElements()) {
			 //获取迭代器中的对象
			 System.out.println(en.nextElement());
		 }
		 System.out.println("-----------------------------以下是listIterator的结果---------------------------");
		//这个是listIterator的对象
	    ListIterator lit =   list.listIterator();
	    while(lit.hasNext()) {
	    	System.out.println(lit.next());
	    }
	    while(lit.hasPrevious()) {//上一个元素 指针必须在后面
	    	System.out.println(lit.previous());
	    }

	}

}
