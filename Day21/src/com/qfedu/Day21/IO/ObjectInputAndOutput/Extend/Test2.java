/**
 * 
 */
package com.qfedu.Day21.IO.ObjectInputAndOutput.Extend;

import java.io.*;
import java.util.*;

/**
 * Description��ϵͳ�������л��ͷ����л�<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Test2 {

	public static void main(String[] args)throws Exception {
		//����һ�����ϴ洢������� 
		//ArrayList��һ��ϵͳ�ಢ��ʵ����Serializable�ӿ�
		ArrayList<Student> list = new ArrayList<>();
		//��ǰ�����д洢�������
		Collections.addAll(list
				, new Student("����",18,"��")
				, new Student("����",12,"��")
				, new Student("����",15,"Ů")
				, new Student("����",20,"��"));
		//���л�
		ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("dirs/ϵͳ�������л�"));
		//����ɶ���������л�
		oos.writeObject(list);
		oos.flush();
		System.out.println("д����!");
		
		//�����л�
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dirs/ϵͳ�������л�"));
		Object obj = ois.readObject(); //Object����
		//ArrayList<Student> list1 = (ArrayList<Student>)obj;
		System.out.println(obj);
	
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
