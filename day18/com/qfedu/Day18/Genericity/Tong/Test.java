/**
 * 
 */
package com.qfedu.Day18.Genericity.Tong;

import java.util.ArrayList;
import java.util.List;

/**
 * Description�� ��ʾͨ���<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Test {
	public static void main(String[] args) {
		//ǧ��������ʹ��  ? ��ͨ��� ����
//		List<?> list = new ArrayList<>(); 
//		list.add("1");
		//��ס������ ȥ���Ⱥ��ұ� ,ʣ�µľ�����������
		List<Integer> list1 = new ArrayList<>();
		doWork(list1);
		List<String> list2 =new ArrayList<>();
		doWork(list2);
		
		
		
	}
	//������ʹ���˷���,��ʱ�ڷ�������Ϊ������,ҲҪָ��������ʲô
	
//	public static void doWork(List<Integer> array) {
//		
//	}
	//1.ͨ����ĵ�һ�����þ�����Ϊ�����Ĳ������������Ͷ�����
	//��ʱ,�˷������Խ����κη��͵ļ���,���뵽������
	public static void doWork(List<?> list) {
		//list.add(1);
		System.out.println(list);
	}
	
	

}
