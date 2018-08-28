/**
 * 
 */
package com.qfedu.Day21.IO.ObjectInputAndOutput.Extend;

import java.io.*;
import java.util.*;

/**
 * Description���������л��ͷ����л�<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Test {

	public static void main(String[] args)throws Exception {
		//����һ�����ϴ洢�������
		List<Student> list = new ArrayList<>();
		//��ǰ�����д洢�������
		Collections.addAll(list, new Student("����",18,"��")
				, new Student("����",12,"��")
				, new Student("����",15,"Ů")
				, new Student("����",20,"��"),null);
		//�������л�����
		//ObjectInputStreamSerializable(list);
		//�����л�
		List<Student> list1 = ObjectOutputStreamSerializable();
		
		Iterator it = list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
	/**
	 * �������ķ����л�
	 * @throws Exception �쳣
	 */
	public static List<Student> ObjectOutputStreamSerializable()throws Exception{
		//����ǰ���������з����л� ��ȡ����  -->�������,�ɶ���Ҫʹ��ѭ��,ѭ��ֹͣ��������ʲô,��ο���ÿһ�������е�ֵ
		//ֻ�������ѭ����ȡ,�����쳣�Ȳ���--> EOF
		ObjectInputStream ois = new  ObjectInputStream(new FileInputStream("dirs/�����������л�"));
		//�����л����ǽ��ļ��еĶ����ȡ����
		//�ж�һ�������Ƿ���� --> �жϵ�ǰ�����ַ�ǹ�Ϊnull
		Object obj = null;
		/*
		 * readObject��ȡ�ļ��еĶ���,���ﵽ����ĩβ(�ļ�ĩβ) �᷵��EOFException
		 * �����ж��ļ���ĩβ��ʵ���Ƕ�ȡ�����һ�������ǵ�ַ��null֤����û��������
		 * ��ʱ�����Դﵽ����EOFException,Ҳ���Դﵽ��ȡ�ļ���������һ��
		 * ����,����Ҫ�Զ������������л�ʱ,ϰ�߽����һλ��Ϊnull��ʾ�ļ���ĩβ
		 */
		List<Student> list = new  ArrayList<>();
		while((obj = ois.readObject()) != null) {
			//System.out.println(obj);
			//readObject�ķ���ֵ������Object,��ʱ��Ҫ����ǿ�����Ͳ���
			//list.add(obj);
			Student stu = (Student)obj; 
			list.add(stu);
				
		}
		return  list;
	}
	/**
	 * ����������л�����
	 * @param list  �����д洢�������
	 * @throws Exception  �쳣
	 */
	public static void ObjectInputStreamSerializable(List<Student> list)throws Exception {
		//����������������л�����ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dirs/�����������л�"));
		//�����������еĶ���������в���
		//�������еĶ���ȡ����
		for(Student stu : list) {
			oos.writeObject(stu);
		}
		System.out.println("����������л����!!!!");
		oos.flush();
		oos.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
