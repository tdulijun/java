/**
 * 
 */
package com.qfedu.Day18.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
 * Description�� Collections������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:CollectionsDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		
		List<Integer> list  = new ArrayList<>();
		//����һ������Ӷ��Ԫ��
		/*
		 * ��һ��������Ҫ��һ��Collection��ߵļ���
		 * �ڶ���������һ���ɱ����(����ʲô��û��,Ҳ������һ��)
		 */
		Collections.addAll(list, 1,2,3,4,5,56,6,4,3,5,2);
		System.out.println(list);

		//����ֻ��TreeSet�ſ��Խ����������
		//List��ߵļ����Կ���
		//Collections.sort(list);//����
		//System.out.println(list);
		//���ط���
//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return o2-o1;
//			}
//		});//����
		
		//�����ݷ�ʽ,�����ʽ���ʺ��Զ����������
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		//static void shuffle(List<?> list) 
        // ʹ��Ĭ�����Դ��ָ���б�����û� 
		//3��51 - 17 1��һ����ֻ����1��
		Collections.shuffle(list);
		System.out.println(list);
		
		//�����в���ĳ��Ԫ��--> ���ֲ���
		/*
		 * ��һ��������Ҫ���ҵļ���
		 * �ڶ�������Ҫ���ҵ�ֵ
		 *�ҵ������±�    �Ҳ���-1��ֵ
		 *һ��Ҫ������
		 */
		Collections.binarySearch(list, 1);
		
//		static void reverse(List<?> list) 
//        ��תָ���б���Ԫ�ص�˳�� 
		//����Ҫ�̰߳�ȫʱ,ֻ��Ҫͨ��Collections�еķ������� ���ת��
		/*
		 * static <T> Collection<T> 
 		synchronizedCollection(Collection<T> c) 
          		����ָ�� collection ֧�ֵ�ͬ�����̰߳�ȫ�ģ�collection�� 
		static <T> List<T> 
 			synchronizedList(List<T> list) 
          	����ָ���б�֧�ֵ�ͬ�����̰߳�ȫ�ģ��б� 
			static <K,V> Map<K,V> 
 			synchronizedMap(Map<K,V> m) 
          			������ָ��ӳ��֧�ֵ�ͬ�����̰߳�ȫ�ģ�ӳ�䡣 
			static <T> Set<T> 
 			synchronizedSet(Set<T> s) 
          	����ָ�� set ֧�ֵ�ͬ�����̰߳�ȫ�ģ�set�� 

		 * 
		 * 
		 */
		
		List<Integer> safeList = Collections.synchronizedList(list);
		System.out.println("��ǰ�̰߳�ȫ�ļ�����:"+(safeList instanceof Vector));
		
		
		
		
		
		
		
		
		
		
		
	}

}
