/**
 * 
 */
package com.qfedu.Day13.StringMatches;

/**
 * Description： 正则<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:StringMatchesDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class StringMatchesDemo {
	public static void main(String[] args) {
		String name = "我是谁";
		boolean result = name.matches("[我是谁]");
		//[我是谁] --> 我|是|谁
        System.out.println(result);
        boolean result2 = "我".matches("[我是谁]");
        System.out.println(result2);
        //判断字符串9是不是数字
        String number = "9";
        // \d 数字 \w 字母 数字 下划线 \s 回车 空格等空白符
        
         boolean result3 = number.matches("\\d");
         System.out.println(result3);
         
          //匹配邮箱: 字母数字_@字母数字.字母出现的次数 .com
          String regx = "\\w+@\\w+(\\.\\w+){1,2}";
          String email = "weixin@163.com";
          boolean result4 = email.matches(regx);
          System.out.println(result4);
          
          //匹配手机号  131 2 3 4 5 6 7 8 9   XXXX   XXXX
          //          14 7  
          //          16 6
          //          15 1 2 3 4 5 6 7 8 9
          //          17 1
          //          18 1 2 3 8
          //前两位是  1位是变化  9位是固定的
         String numberPhone = "1[3|4|5|6|7|8]\\d{9}";
         String str = "11111111111";
         System.out.println(str.matches(numberPhone));
         
         
         
         
         
         
         
         
         
         
         
	}

}
