/**
 * 
 */
package com.qfedu.Day15.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description： ArrayList方法演示<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ArrayListDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ArrayListDemo {
        @SuppressWarnings("rawtypes") //注解
		public static void main(String[] args) {
			//1.无参
        	ArrayList al = new ArrayList();
        	//2.有参 --> 指定初始容量大小
        	ArrayList al2 = new ArrayList(20);
        	//3.通过构造方法在ArrayList集合当中存另外一个集合的元素
        	ArrayList al3 = new ArrayList(al2);
        	//常用方法:
        	//向集合中添加元素
        	al.add(1);
        	al.add(2.1243);
        	al.add("3");
        	al.add('c');
        	al.add("我可以存储任何数据类型");
        	//因为ArrayList底层实现是数组,所以存在下标的概念
        	//第一个元素的位置是0,最后一个元素的位置是size-1
        	//集合可以直接打印对象-->重写了toString
        	System.out.println(al);
        	//向集合中添加指定元素
        	al.add(1, "我是插入值");
        	System.out.println(al);
        	
        	//向集合中插入另外一个集合
        	al2.add("2018");
        	al2.add(8);
        	al2.add(17);
        	//向集合中添加原有集合的值
        	al.addAll(al2);
        	System.out.println(al);
        	//向指定位置添加集合
        	//addAll(int index, Collection<? extends E> c) 
        	
        	//清空集合-->没有数据,集合还存在
        	al2.clear();
        	System.out.println(al2);
        	
        	//判断集合中是否存在指定元素
        	//true 就是存在 false是不存在
        	System.out.println(al.contains("2018"));

        	//通过下标获取集合中的元素
        	System.out.println(al.get(1));
        	
        	//判断集合中首次出现指定元素的位置
        	//如果找到就返回其下标(第一次)
        	//没有找到 -1
        	System.out.println(al.indexOf("七夕"));
        	
        	//判断集合中是否存在元素(判断集合是不是空的)
        	//true 空   false 有元素
        	System.out.println(al.isEmpty());
        	
        	//返回集合中最后一次出现元素的位置
        	//如果找到了返回值下标(最后一次)
        	//返回-1
        	System.out.println(al.lastIndexOf(17));
        	
        	//删除集合中的元素
        	//根据下标删除指定位置的元素
        	al.remove(1);
        	System.out.println(al);
        	
        	//根据传入的指定元素删除
        	//若集合中存在着两个相同的元素
        	//删除第一次出现的,若集合中没有要删除的元素
        	//得到一个返回值false --> 删除失败没有这个元素
        	al.remove("2018");
        	System.out.println(al);
        	
        	//传入指定位置替换指定的值
        	al.set(0, "我是替换值");
        	System.out.println(al);
        	
        	
        	//将ArrayLis集合转换为数组,数组必须是Object
        	Object[] array = al.toArray();
        	System.out.println(Arrays.toString(array));
        	//将数组转换为List集合
        	List al4 = Arrays.asList(array);
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
		}
}
