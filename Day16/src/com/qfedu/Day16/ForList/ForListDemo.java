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
		System.out.println("��ͨforѭ��������ӡ�Ľ��:");
		//1.��ͨforѭ��
		for(int  i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("��ǿforѭ��������ӡ�Ľ��:");
		//2.��ǿforѭ��
		//ps:���ڼ�����˵����һ��������
		/*
		 * ͨ��������.class�ļ��ĵ��Ľ��
		 * Object obj;
		 * for (Iterator iterator = list.iterator(); iterator.hasNext();){
						obj = iterator.next();
			 			System.out.println(obj)
			 }
		 */
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("������������ӡ�Ľ��:");
		//3.������ 
		//3.1��Ҫ�Ȼ�ȡ����������
		Iterator it = list.iterator();
		//3.2ͨ�������������hasNext������ȡ�Ƿ�����һ��Ԫ��
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("forѭ���������汾");
		//forѭ���汾:
		for(Iterator itr = list.iterator();itr.hasNext();) {
			System.out.println(itr.next());
			
		}
		//ps:�������ֵ�Ч������һ��,��ʵ�ʵ������ǲ�ͬ
		
		//4.ö�ٵ�����:
		//���ֻ���������������ס,������ʹ�����ַ�ʽ
		Vector v = new Vector();
		v.addAll(list);
		//4.1��ȡö�ٵ������Ķ���
		 Enumeration en =  v.elements();
		 //�ж�ö�ٵ��������Ƿ������һ��Ԫ��
		 while(en.hasMoreElements()) {
			 //��ȡ�������еĶ���
			 System.out.println(en.nextElement());
		 }
		 System.out.println("-----------------------------������listIterator�Ľ��---------------------------");
		//�����listIterator�Ķ���
	    ListIterator lit =   list.listIterator();
	    while(lit.hasNext()) {
	    	System.out.println(lit.next());
	    }
	    while(lit.hasPrevious()) {//��һ��Ԫ�� ָ������ں���
	    	System.out.println(lit.previous());
	    }

	}

}
