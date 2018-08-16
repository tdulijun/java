/**
 * 
 */
package com.qfedu.Day14.Date.Format;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Description： 时间格式化DateFormat类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:DateFormatDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
	//格式化    Date类型对象 ----> String类型    format
	//解析       String类型时间字符串 ----> Date类型对象  parse	
     
		//先获取时间对象
		//ctrl+shift+o --> 快捷导入包
		Date date = new Date();
		System.out.println(date);
		//通过这个方法就可以获取一个时间风格--> short
		DateFormat df = DateFormat.getInstance();
		//格式化时间
		String time = df.format(date);
		System.out.println(time);
		//通过这个方法可以获取一个时间风格--> long
		df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		System.out.println(df.format(date));
		
		//解析
		
		df = DateFormat.getInstance();
	    time = df.format(date);
	    Date d2 = df.parse(time);
	    System.out.println(d2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
