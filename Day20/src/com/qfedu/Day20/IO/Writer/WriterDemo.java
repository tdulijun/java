/**
 * 
 */
package com.qfedu.Day20.IO.Writer;

import java.io.*;

/**
 * Description���ַ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:WriterDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class WriterDemo {

	public static void main(String[] args) {
		//1.���������� --> д��ȥ(�����)
		String str1 = "����!";
		String str2 = "�����緹�ͳ���һ��������\n";
		String str3 = "������1����Сʱ ����...��Ķ�\n";
		String str4 = "�Է�ȥ��!!!!";
		Writer writer = null;
		try {
			//FileWriter��FileInputStrea����
			//���ṩ��һ�����췽�� ��������������ļ���ĩβ׷���µ�����
			//������boolean Ĭ��ֵ��false����׷�� ,����Ҫ׷����ʹ��true
			writer = new FileWriter("dir/����ô.txt");
			//�ṩһ�����з��� �������ַ��� ���ַ���д��ȥ
			writer.write(str1);
			writer.write(str2);
			writer.write(str3);
			writer.write(str4);
			//append ����ʹ�õ�Ч����wirter��һ����
		    //����ʹ���� ����׷�� ��Ȼ,һ��������ǲ����ʹ���������
			writer.append("�ݰ�!!!");
			//��������Щ��������õľ���write(cbuf, off, len);
			writer.flush();
			System.out.println("д����");
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
