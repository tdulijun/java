/**
 * 
 */
package com.qfedu.Day17.TreeSet.Comparable;

import java.util.TreeSet;

/**
 * Description�� �����˵�������д�С��������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:PersonTest.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class PersonTest {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Person(10,180));
		set.add(new Person(17,190));
		set.add(new Person(12,150));
		set.add(new Person(12,170));
		set.add(new Person(9,165));
		set.add(new Person(20,155));
		System.out.println(set);

	}

}
