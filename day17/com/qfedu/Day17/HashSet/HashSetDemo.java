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
 * Description�� HashSet��ʹ��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HashSetDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class HashSetDemo {

	public static void main(String[] args) {
		//1.HashSet��Set�ӿڵ�ʵ����
		//set�ǲ�����洢�ظ�ֵ,���� (�ų��ظ�)
		Set set = new  HashSet();
		// HashSet set = new Hash();
		//1.�򼯺������Ԫ��
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
		set.addAll(list);//�洢�Ĳ��Ǽ��� �Ǽ�����Ԫ��
		System.out.println(set);
		
		//��ռ���  ������� ���ϴ���
		set.clear();
		//�жϼ����Ƿ�Ϊ�� -->��û��Ԫ�� true  ��֮false
		System.out.println(set.isEmpty());
		/*
		 *  boolean contains(Object o) 
         		�жϼ������Ƿ����ָ��Ԫ�� ����true ��֮false
 			boolean containsAll(Collection<?> c) 
          	�ж��������Ƿ����ָ�������е�Ԫ�� ����true ��֮false 

		 */
		
		//setͬ��֧��Iterator������
		//����:��ֻ֧�ֱ�׼�ĵ����� ��֧��listIterator
		//ǧ��Ҫ�ڵ�������ʹ�ü�����������Ӻ�ɾ������
		//��Ȼ�ͻ�����쳣
		
		//1.��ȡ����������
		Iterator it =  set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//set��ɾ��ֻ��һ��ֱ��ɾ����ʽ
		//����������һ������
		//����������з���ֵ��  true֤��ɾ���ɹ�
		//                   false֤��ɾ��ʧ��-->������û���������
		set.remove("2");
		
		/*
		 * �ο�List
		 * boolean removeAll(Collection<?> c) 
                           ɾ���������������Ԫ�� ,����ʣ��Ԫ��
 		  boolean retainAll(Collection<?> c) 
                      ����������������е�Ԫ��,ɾ��ʣ��Ԫ�� 

		 */
		//�ṩһ���������Ի�ü���������Ԫ�صĸ���
		int size = set.size();
		//set���ϳ���Iterator��������ʽ���Ա���
		//ͬ��֧��forѭ������ -->ֻ֧����ǿforѭ��
		for(Object obj :set) {
			System.out.println(obj);
		}
		//ps:set����֧��ʹ��ѭ���ķ�ʽ��ֵ
		//set���Ͽ���ת��Ϊ����
      	Object[] obj = set.toArray();
		//����:����set�����д洢���ַ���1-9
      	//    ������ת��Ϊ����
      	//    ��ӡ������ֵ
        //    �������е�ֵ�浽һ���µ�set������
		
		
		
		
		
		
		
		
		
		
		

	}

}
