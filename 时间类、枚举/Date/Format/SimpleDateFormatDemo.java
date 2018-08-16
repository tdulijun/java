/**
 * 
 */
package com.qfedu.Day14.Date.Format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description： 时间格式化SimpleDateFormat类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SimpleDateFormatDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class SimpleDateFormatDemo {
	//DateFormat --> short long 抽象类
	public static void main(String[] args) throws ParseException {
		//定义一个日期模式
		//H 24小时  h 12小时
		String pattern = "yyyy-MM-dd HH:mm:ss";
		//创建对象
		SimpleDateFormat sdf = new SimpleDateFormat();
		//使用哪种模式
		sdf.applyPattern(pattern);
		
		String time = sdf.format(new Date());
		System.out.println(time);
		//解析
		Date d = sdf.parse(time);
		System.out.println(d);
		
		

	}

}
