/**
 * 
 */
package com.qfedu.Day18.HomeWork;

import java.util.TreeSet;

/**
 * Description£∫ xxxx<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author «ß∑Ê÷«∏Á
 * @version : 1.0
 */
public class Test {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Worker(18, 2, 3000));
		set.add(new Worker(18, 5, 3100));
		set.add(new Worker(18, 2, 3700));
		set.add(new Worker(19, 2, 3200));
		set.add(new Worker(30, 10,1500));
		System.out.println(set);
	}

}
