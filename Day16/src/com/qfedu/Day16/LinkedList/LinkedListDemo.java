/**
 * 
 */
package com.qfedu.Day16.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Description�� ��ʾLinkedList����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:LinkedListDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class LinkedListDemo {

	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		//����LinkedList���϶���
		LinkedList list = new LinkedList();
		//�������е�Ԫ�ش浽��ǰ������
		//�������м��϶����Ԫ�ش浽�µļ�����
		LinkedList list1 = new LinkedList(list);
		
		//���÷���:
		//�򼯺��д洢Ԫ��-->(�����κ���������)
		list.add("��һ��Ԫ��");
		LinkedList list2 = new LinkedList();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		//������Ӷ����ǽ�������ӵ��˵�ǰ���϶�����
		//list.add(list2);
		//������Ӷ����ǽ���ǰ���������е�Ԫ�ش浽�˼��϶���
		list.addAll(list2);
		/*
		 * add(int index, E element) 
                      �ڴ��б���ָ����λ�ò���ָ����Ԫ�ء�
          addAll(int index, Collection<? extends E> c) 
                     ��ָ�� collection �е�����Ԫ�ش�ָ��λ�ÿ�ʼ������б�
                     ֧���±� -->0��ʼ size()-1
		 */
		System.out.println(list);
		
		//��Ԫ����ӵ����ϵĿ�ͷ
		list.addFirst("��0��Ԫ��");
		System.out.println(list);
		//��Ԫ����ӵ����ϵ�ĩβ
		list.addLast("���һ��Ԫ��");
		System.out.println(list);
		//clear() ��ռ����е�Ԫ�� --> �������ɴ���
		//�жϼ������Ƿ����ָ��Ԫ�� ���ڼ�true  ��false
		list.add("1");
		System.out.println(list);
		boolean result = list.contains("1");
		System.out.println(result);
		
		//��ȡ�����еĵ�һ��Ԫ�ص��ǲ�ɾ����Ԫ��
		Object obj = list.element();
		System.out.println(obj);
		System.out.println(list);
		//get(int index) ���ش��б���ָ��λ�ô���Ԫ�� �±�
		
		//��ȡ��һ�������һ��Ԫ��
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		/*
 int indexOf(Object o) 
          ���ش��б����״γ��ֵ�ָ��Ԫ�ص�������������б��в�������Ԫ�أ��򷵻� -1�� 
 int lastIndexOf(Object o) 
          ���ش��б��������ֵ�ָ��Ԫ�ص�������������б��в�������Ԫ�أ��򷵻� -1�� 
      ����ֵ���ǵ�һ�γ��ֵ��±�,�Ҳ�������-1
		 */
		//��ָ��Ԫ����ӵ�ĩβ
		boolean res = list.offer("ppp");//��ӳɹ�����true
		System.out.println(list);
		System.out.println(res);
		/*
		 * boolean offerFirst(E e) 
          		�ڴ��б�Ŀ�ͷ����ָ����Ԫ�ء� 
 			boolean offerLast(E e) 
          		�ڴ��б�ĩβ����ָ����Ԫ�ء� 
          	��ӳɹ��ǲ�����true	

		 */
		//��ȡ�����еĵ�һ��Ԫ�ص��ǲ�ɾ��
		Object obj2 = list.peek();
		System.out.println(obj2);
		System.out.println(list);
		/*
		 *  E peekFirst() 
          ��ȡ�����Ƴ����б�ĵ�һ��Ԫ�أ�������б�Ϊ��(������û��Ԫ��)���򷵻� null�� 
 			E peekLast() 
          ��ȡ�����Ƴ����б�����һ��Ԫ�أ�������б�Ϊ��(������û��Ԫ��)���򷵻� null�� 

		 */
		
		//��ȡ�����е�һ��Ԫ�ز�ɾ��
		Object obj3 = list.poll();
		System.out.println(obj3);
		System.out.println(list);
		/*
			E pollFirst() 
          ��ȡ���Ƴ����б�ĵ�һ��Ԫ�أ�������б�Ϊ��(������û��Ԫ��)���򷵻� null�� 
 			E pollLast() 
          ��ȡ���Ƴ����б�����һ��Ԫ�أ�������б�Ϊ��(������û��Ԫ��)���򷵻� null�� 

		 */
		 //��ȡ�����е�һ��Ԫ�ز�ɾ��
		Object obj4 = list.pop();
		System.out.println(obj4);
		System.out.println(list);
		//�򼯺����Ԫ��
		list.push("0"); //--> addfist
		System.out.println(list);
		
		//������ɾ��Ԫ��
		//1.ɾ�������еĵ�һ��Ԫ�ز���ȡ
		Object obj5 = list.remove();
		System.out.println(obj5);
		System.out.println(list);
		//2.�����±�ɾ��ָ��Ԫ�ز���ȡ
		Object obj6 = list.remove(2);
		System.out.println(obj6);
		System.out.println(list);
		//3.ɾ�������е�ָ��Ԫ��
		//��ɾ���ɹ����� true ʧ�� ����false
		boolean res1 = list.remove("1");
		System.out.println(list);
		 System.out.println(res1);
		 /*
		  * E removeFirst() 
          	�Ƴ������ش��б�ĵ�һ��Ԫ�ء� 
           E removeLast() 
          	�Ƴ������ش��б�����һ��Ԫ�ء� 
          	��õ�ɾ����Ԫ��
		  * 
		  */
		//�����±��滻ָ��Ԫ��,����ȡԭ��ֵ
		 Object obj7 = list.set(0, "yui");
		 System.out.println(obj7);
		 System.out.println(list);
		//��LinkedList���ϼ��϶���ת��Ϊ����
		 Object[] objs = list.toArray();
		 System.out.println(Arrays.toString(objs));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
