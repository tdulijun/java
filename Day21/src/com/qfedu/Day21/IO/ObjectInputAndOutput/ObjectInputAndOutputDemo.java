/**
 * 
 */
package com.qfedu.Day21.IO.ObjectInputAndOutput;

import java.io.*;

/**
 * Description�� ��������л��ͷ����л�<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ObjectInputAndOutputDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ObjectInputAndOutputDemo {
	public static void main(String[] args) throws Exception {
		//ObjectOutputStreamSerializable();
	 
		//����������ݷ�ʽ alt+shift+m --> һ��������,һ�������η�
		ObjectInputStreamSerializable();
		
		
		
		
	}

	/**
	 * ����ķ����л�����
	 * @throws Exception���л��쳣,�ļ��Ҳ����쳣,IO�쳣
	 * 
	 */
	public static void ObjectInputStreamSerializable()throws Exception {
		//�����л� -->���ļ��д洢�����ȡ����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dir/���л��ļ�.txt"));
		//��ν��������л����� -->����ǰ������ļ��ж�ȡ����
		//����ֵ��һ��Object
	    Object obj = ois.readObject();
	    System.out.println(obj);
	}

	/**
	 * ʵ���˶�������л�
	 * @throws Exception ���л��쳣,�ļ��Ҳ����쳣,IO�쳣
	 * 
	 */
	public static void ObjectOutputStreamSerializable() throws Exception {
		//�Զ������������л�����
		Student stu= new Student("����", 61, "��");
		//1.����ǰ����������л�����
		//���л��������ǽ���ǰ����̻����ļ�
		//����Ҫ����ǰ����д���뵽�ļ���
		//���л��ļ�����һ���ɶ��ļ�(��������ɶ�),�������л��ļ�һ���ǲ����ú�׺��
		//ֻ��ͨ�������л��ķ�ʽ���ܶ�ȡ�ļ��е�����
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dir/���л��ļ�.txt"));
	   //2. ����ǰ����������л�(����ǰ����д�뵽�ļ���)
		//ֻҪ�Զ���������л������л�����,��ô��ǰ���������ʵ��Serializable�ӿ�
		//��û��ʵ�ֻ��׳��쳣
		oos.writeObject(stu);
		oos.flush();
		System.out.println("д����");
	    oos.close();
	}

}
