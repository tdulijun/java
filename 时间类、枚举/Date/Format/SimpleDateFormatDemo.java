/**
 * 
 */
package com.qfedu.Day14.Date.Format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description�� ʱ���ʽ��SimpleDateFormat��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SimpleDateFormatDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class SimpleDateFormatDemo {
	//DateFormat --> short long ������
	public static void main(String[] args) throws ParseException {
		//����һ������ģʽ
		//H 24Сʱ  h 12Сʱ
		String pattern = "yyyy-MM-dd HH:mm:ss";
		//��������
		SimpleDateFormat sdf = new SimpleDateFormat();
		//ʹ������ģʽ
		sdf.applyPattern(pattern);
		
		String time = sdf.format(new Date());
		System.out.println(time);
		//����
		Date d = sdf.parse(time);
		System.out.println(d);
		
		

	}

}
