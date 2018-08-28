/**
 * 
 */
package com.qfedu.Day21.IO.Properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties; 

/**
 * Description�� Properties�ļ���д��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:PropertiesDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class PropertiesDemo {
	public static void main(String[] args)throws Exception {
		//�ڶ���д�� ʹ���ַ���������ȡ����̨����
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		//��ʱд�������������������ļ������׺����properties,�������ܴ���һ��Properties�ļ�
		BufferedWriter bw = 
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("dir/config.properties")));
		//1.��Ҫ����Properties����-->util���µ�
		Properties p = new Properties();
		//��һ��ѭ����ȡ������д���ļ�����
		while(true) {
			System.out.println("������key:");
			String key = br.readLine();
			
			//����ǰ��ȡkeyֵΪOverʱ,������������
			if("over".equals(key)) {
				break;
			}
			
			System.out.println("������value:");
			String value = br.readLine();
			
			//�Լ�ֵ�Ե���ʽ�洢���ݵ�Properties�ļ���
			//��ʱֻ�ǽ�����д�뵽��Properties�������Ķ�����
			p.setProperty(key, value);
			
		}
		
		
		//��Properties����д���ļ�
		/*
		 * ����Properties����д�ļ���Ҫʹ������ķ���
		 * ��һ������ ��һ���ֽ������
		 * �ڶ������� ��ǰ�ļ���ע��
		 * ��properties�ļ�����#��ͷ�ľ���ע��
		 */
		p.store(bw, "����ע��");
		
		

	}

}
