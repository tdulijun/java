/**
 * 
 */
package com.qfedu.Day18.Genericity.Tong;

import java.util.ArrayList;
import java.util.List;

/**
 * Description�� �ֶ���������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Demo {
      public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(123);
		//list.add("123");
		//�ֶ����� -->�Ͻ�ʹ�� 
		List list1 = list;
		list1.add("1111");
		System.out.println(list);
	}

}
