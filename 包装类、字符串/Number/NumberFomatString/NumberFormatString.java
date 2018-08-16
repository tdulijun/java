/**
 * 
 */
package com.qfedu.Day12.Number.NumberFomatString;

/**
 * Description： String和包装类互相转换<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:NumberFormatString.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class NumberFormatString {
	public static void main(String[] args) {
		//将某个字符串转换为包装类类型
		//转换可以但是必须是数字并且在数据存储范围之内
		//若掺杂其他字符就会出现
		/*
		 * NumberFormatException: For input string: "123a"
		 * 数字转换异常
		 * 
		 */
		Integer i1 = Integer.valueOf("123");
		Integer i2 = 123;
		System.out.println(i1+i2);
		//同样要准守上面的原则
		Integer i3 = new Integer("123");
		
		//将包装类转换为字符串
        String str1 = i1.toString();
        
        //将基本数据类型转换为字符串
        String str2 = 17 + "";
        
        //将String转换为基本数据类型
        String str3 = "12345";
        int num = Integer.parseInt(str3);
        
        //ps:true / false 包装了同样如此
        //之人true和false除了这两个无论参数是什么 都返回默认值 false
        Boolean b = new Boolean("小黑猫");
        System.out.println(b);
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
