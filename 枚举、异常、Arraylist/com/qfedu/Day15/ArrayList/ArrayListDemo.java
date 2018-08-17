/**
 * 
 */
package com.qfedu.Day15.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description�� ArrayList������ʾ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ArrayListDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ArrayListDemo {
        @SuppressWarnings("rawtypes") //ע��
		public static void main(String[] args) {
			//1.�޲�
        	ArrayList al = new ArrayList();
        	//2.�в� --> ָ����ʼ������С
        	ArrayList al2 = new ArrayList(20);
        	//3.ͨ�����췽����ArrayList���ϵ��д�����һ�����ϵ�Ԫ��
        	ArrayList al3 = new ArrayList(al2);
        	//���÷���:
        	//�򼯺������Ԫ��
        	al.add(1);
        	al.add(2.1243);
        	al.add("3");
        	al.add('c');
        	al.add("�ҿ��Դ洢�κ���������");
        	//��ΪArrayList�ײ�ʵ��������,���Դ����±�ĸ���
        	//��һ��Ԫ�ص�λ����0,���һ��Ԫ�ص�λ����size-1
        	//���Ͽ���ֱ�Ӵ�ӡ����-->��д��toString
        	System.out.println(al);
        	//�򼯺������ָ��Ԫ��
        	al.add(1, "���ǲ���ֵ");
        	System.out.println(al);
        	
        	//�򼯺��в�������һ������
        	al2.add("2018");
        	al2.add(8);
        	al2.add(17);
        	//�򼯺������ԭ�м��ϵ�ֵ
        	al.addAll(al2);
        	System.out.println(al);
        	//��ָ��λ����Ӽ���
        	//addAll(int index, Collection<? extends E> c) 
        	
        	//��ռ���-->û������,���ϻ�����
        	al2.clear();
        	System.out.println(al2);
        	
        	//�жϼ������Ƿ����ָ��Ԫ��
        	//true ���Ǵ��� false�ǲ�����
        	System.out.println(al.contains("2018"));

        	//ͨ���±��ȡ�����е�Ԫ��
        	System.out.println(al.get(1));
        	
        	//�жϼ������״γ���ָ��Ԫ�ص�λ��
        	//����ҵ��ͷ������±�(��һ��)
        	//û���ҵ� -1
        	System.out.println(al.indexOf("��Ϧ"));
        	
        	//�жϼ������Ƿ����Ԫ��(�жϼ����ǲ��ǿյ�)
        	//true ��   false ��Ԫ��
        	System.out.println(al.isEmpty());
        	
        	//���ؼ��������һ�γ���Ԫ�ص�λ��
        	//����ҵ��˷���ֵ�±�(���һ��)
        	//����-1
        	System.out.println(al.lastIndexOf(17));
        	
        	//ɾ�������е�Ԫ��
        	//�����±�ɾ��ָ��λ�õ�Ԫ��
        	al.remove(1);
        	System.out.println(al);
        	
        	//���ݴ����ָ��Ԫ��ɾ��
        	//�������д�����������ͬ��Ԫ��
        	//ɾ����һ�γ��ֵ�,��������û��Ҫɾ����Ԫ��
        	//�õ�һ������ֵfalse --> ɾ��ʧ��û�����Ԫ��
        	al.remove("2018");
        	System.out.println(al);
        	
        	//����ָ��λ���滻ָ����ֵ
        	al.set(0, "�����滻ֵ");
        	System.out.println(al);
        	
        	
        	//��ArrayLis����ת��Ϊ����,���������Object
        	Object[] array = al.toArray();
        	System.out.println(Arrays.toString(array));
        	//������ת��ΪList����
        	List al4 = Arrays.asList(array);
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
		}
}
