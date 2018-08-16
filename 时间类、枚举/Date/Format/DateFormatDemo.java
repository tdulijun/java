/**
 * 
 */
package com.qfedu.Day14.Date.Format;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Description�� ʱ���ʽ��DateFormat��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:DateFormatDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
	//��ʽ��    Date���Ͷ��� ----> String����    format
	//����       String����ʱ���ַ��� ----> Date���Ͷ���  parse	
     
		//�Ȼ�ȡʱ�����
		//ctrl+shift+o --> ��ݵ����
		Date date = new Date();
		System.out.println(date);
		//ͨ����������Ϳ��Ի�ȡһ��ʱ����--> short
		DateFormat df = DateFormat.getInstance();
		//��ʽ��ʱ��
		String time = df.format(date);
		System.out.println(time);
		//ͨ������������Ի�ȡһ��ʱ����--> long
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		System.out.println(df.format(date));
		
		//����
		
		df = DateFormat.getInstance();
	    time = df.format(date);
	    Date d2 = df.parse(time);
	    System.out.println(d2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
