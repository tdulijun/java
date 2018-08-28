/**
 * 
 */
package com.qfedu.Day21.IO.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:PropertiesUtil.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class PropertiesUtil {
	 //���������ṩ�Ķ��Ǿ�̬����
	 //���������ⲿ�Ե�ǰ�ഴ������
	private PropertiesUtil() {
		
	}
	
	//����һ����̬������ȡ��Դ�ļ�����
	private static Properties p ; 
	
	//���ڴ�����ͬʱ,����Properties��ȡ����
	//����һ�ַ�ʽ
	static {
		//��̬���Խ��г�ʼ��
		p = new  Properties();
		
		//�����ļ��ļ���
		//������һ���ֽ�������
		try {
			//������쳣��Ҫ�׳�,����ǰ�쳣����ץȡ
			p.load(new FileInputStream("dir/config.properties"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//�ڶ��־���ʹ����ļ����� ClassLoader --> ����ʹ�÷��� ����
	
	
	//�ṩһ����̬����,ͨ����Ӧ��key�õ���Ӧ��value
	public static String getValue(String key) {
		//properties�������ȥ����Ӧ��valueֵ
		return p.getProperty(key);
				
	}
 	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
