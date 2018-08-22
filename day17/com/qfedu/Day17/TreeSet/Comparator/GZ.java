/**
 * 
 */
package com.qfedu.Day17.TreeSet.Comparator;

import java.util.Comparator;

/**
 * Description： 定义自己比较方式<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:GZ.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class GZ implements Comparator{

	/* 
	 * 制定规则
	 * 第一个参数是当前对象 --> this
	 * 第二个参数是传入对象 --> other
	 */
	@Override
	public int compare(Object o1, Object o2) {
		Person pthis = (Person)o1;
		Person pother = (Person)o2;
		
		return pthis.getAge() - pother.getAge();
	}

}
