/**
 * 
 */
package com.qfedu.Day13.FacetoFace;

/**
 * Description： 面试题1<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:StringDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class StringDemo {
         public static void main(String[] args) {
			 //下面语句中创建了多少个对
        	 //最多1个,最少一个都不创建
        	 /*直接创建在池中的,所以会创建"ABCD" 一个
        	  * 若池有"ABCD",一个都不创建会引用之前创建好的那个字符串 
        	  */
        	 String str1 = "ABCD";
        	 //最少1个 最多2个
        	 /*
        	  * 若池有"ABCD",一个都不创建会引用之前创建好的那个字符串
        	  * 只会在堆中开辟地址,然后将"ABCD"存在堆中
        	  * 
        	  * 若池中没有就会先创建一个"ABCD",然后后创堆中
        	  */
        	 String str2 = new  String("ABCD");
        	 //常量字符串进行的拼接,底层会做自动优化 看做是一个整体 进行优化编译
        	 String str3 = "A"+"B"+"C"+"D"; // "ABCD"
        	 String str4 = "AB" + "CD"; //"ABCD"
        	 System.out.println(str1 == str2);//false
        	 System.out.println(str1 == str3);//true  
        	 System.out.println(str1 == str4);//true
        	 
        	 //String str5 = (new StringBuilder(String.valueOf(str5_1))).append(str5_2).toString();
        	 //变量在操作字符串拼接的时候,在编译阶段期间是无法确定其值是什么
        	 //只有在运行期间,变量才会得到真正的值,str5所的到的空间就会被改变为堆空间
        	 String str5_1 = "AB";
        	 String str5_2 = "CD";
        	 String str5 = str5_1 + str5_2;
        	 System.out.println(str1 == str5);//false 3
        	 //方法在编译阶段是无法确认,调用方法的时候,这样做就和将字符串存储到变量效果是一样
        	 //	String str6 = (new StringBuilder(String.valueOf(getString()))).append("CD").toString();
        	 String str6 = getString() + "CD";
        	 System.out.println(str1 == str6);// false  
        	 
		}
         
         public static  String getString() {
        	 return "AB";
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
}
