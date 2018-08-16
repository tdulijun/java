/**
 * 
 */
package com.qfedu.Day13.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.IconView;

/**
 * Description： 作业<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HomeWork.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class HomeWork {

/**
 * 1.从控制台录入一个字符串，如果这个字符串以大写字母开头，将该字符串转成全小写；
 * 如果这个字符串以小写字母开头，将该字符串转成全大写
   2.去除字符串中所有的空格。例如 a b c d e  f --> abcdef
   3.将一个字符串进行反转。将字符串中指定部分进行反转 例如 abcdefg --> abfedcg
   4.将电话号中间4位替换成XXXX 例如13842383838-->138XXXX3838
   5.已知字符串:"this is a test of java"
         执行以下操作:
    1.统计出字符串中s出现的次数
    2.取出字符串中"test"
    3.将字符串转换成一个字符数组
    4.将字符串中每个单词的第一个字母变成大写,输出到控制台
    5.将字符串是此案倒叙输出 "java of test a is this"

	6.输入一个时间，输出它的下一秒时间(字符串版本)
 	例如
 	输入 20:39:40
 	输出 20:39:41
		20:39:59
		20:40:00
		20:59:59
		21:00:00
		23:59:59
		00:00:00
	7."华为"公司去年的营业额是：1798798099079798098
   	格式化后的金额信息是：1,798,798,099,079,798,098
	 */
	public static void main(String[] args) {
		//1.
		//  First();
		//2.
		//  second();
       //3.
		//  thrid();
		//4.
		 //   fourth();
		//5.
		//  fifth();
		//6.
		//   sixth();
		//7.
		    seventh();
		
	}
     public static void First() {
    	 Scanner input = new Scanner(System.in);
    	 String str = input.next();
    	 if(str.charAt(0)>='A' && str.charAt(0)<='Z') {
    		 System.out.println(str.toLowerCase());
    	 }else {
    		 System.out.println(str.toUpperCase());
    	 }
     }
	
     public static void second() {
    	 String str = " a b c d e  f ";
    	 StringBuffer sbr = new StringBuffer();
    	 //字符串底层是一个字符数组,提供length() 可以使用类似数组的方式直接操作字符串
    	 for(int  i = 0; i<str.length();i++) {
    		 if(str.charAt(i)!=' ') {
    			 sbr.append(str.charAt(i));
    		 }
    	 }
    	 System.out.println(sbr);
    	 
     }
	
     public static void thrid() {
    	 Scanner input = new Scanner(System.in);
    	 String str = input.next();
    	 System.out.println("请输入开始的位置:");
    	 int beginIndex = input.nextInt();
    	 System.out.println("请输入结束的位置:");
    	 int endIndex = input.nextInt();
    	 //进行截取
    	 String subStr = str.substring(beginIndex, endIndex+1);
    	 StringBuffer sbr = new StringBuffer(subStr);
    	 sbr.reverse();//进行字符串翻转
    	 String newStr = sbr.toString();//翻转完成的
    	 str = str.replace(subStr, newStr);
    	 System.out.println(str);
    	 
     }
	
     public static void fourth() {
    	 String str = "13842383838";
    	 char[] buf = str.toCharArray();
    	 for(int i =0 ;i<buf.length;i++) {
    		 if(i>=3 && i<=6) {
    			 buf[i] = 'X';
    		 }
    	 }
    	 //通过字符串创建字符串
    	 String newStr = new String(buf);
    	 System.out.println(newStr);
    	
     }
	
     public static void fifth() {
    	 //5.1
    	 String str = "this is a test of java";
    	 int count = 0;
    	 for(int i = 0;i<str.length();i++) {
    		 if(str.charAt(i) == 's') {
    			 count++;
    		 }
    	 }
    	 System.out.println("s的次数是:"+count);
    	 
    	 //5.2
    	 int index = str.indexOf("test");
    	 String subStr = str.substring(index,(index+"test".length()));
    	 System.out.println("截取:"+subStr);
    	 
    	 //5.3
    	 char[] buf = str.toCharArray();
    	 System.out.println("字符数组:"+Arrays.toString(buf));
    	 
    	 //5.4
    	 String[] strArray = str.split(" ");
    	 System.out.println("字符串数组存储的元素:"+Arrays.toString(strArray));
    	 StringBuffer sbr = new StringBuffer();
    	 char[] bufs;
    	 for(String s : strArray) {
    		  bufs =  s.toCharArray();
    		  bufs[0] = (char)(bufs[0] - 32);
    		  for(int i = 0;i<bufs.length;i++) {
    			  sbr.append(bufs[i]);
    		  }
    		  sbr.append(' ');
    	 }
    	 System.out.println("第一个单词字母大写后的字符串:"+sbr);
    	 
    	 //5.5
    	 for(int i = 0;i<strArray.length/2;i++) {
    		 String  tmp = strArray[i];
    		 strArray[i] = strArray[strArray.length-1-i];
    		 strArray[strArray.length-1-i] = tmp;
    		 
    	 }
    	 //按照要求进行拼接
    	 /*
    	  * 第一个参数就要按照什么隔开(拼)
    	  * 第二个参数是一个字符串数组
    	  */
    	 String newStr = String.join(" ", strArray);
    	 System.out.println(newStr);
     }
	
     public static void sixth() {
    	 Scanner input = new Scanner(System.in);
    	 String time = input.next();//20:39:40
    	 String[] times = time.split(":");//20,39,40
    	 int h  = new Integer(times[0]);
    	 int m  = new Integer(times[1]);
    	 int s  = new Integer(times[2]);
    	 s++;
    	 if(s == 60) {
    		 s = 0;
    		 m++;
    		 if(m == 60) {
    			 m = 0;
    			 h++;
    			 if(h == 24) {
    				 h = 0;
    			 }
    		 }
    	 }
    	 System.out.println(String.format("%02d", h)+":"+
    	             String.format("%02d", m)+":"+String.format("%02d", s));
     }
	  public static void seventh() {
		  String str = "1798798099079798098";
		  StringBuffer sbr = new StringBuffer(str);
		  for(int index = sbr.length()-3; index > 0; index -= 3) {
			   sbr.insert(index, ',');
		  }
		  System.out.println(sbr);
	  }
	
	
	
	
	
	
	
	
	
}
