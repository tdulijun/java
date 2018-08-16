/**
 * 
 */
package com.qfedu.Day13.FacetoFace;

/**
 * Description： 面试题2<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:StringDemo2.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class StringDemo2 {
	 public static final String A = "ab";
	 public static final String B = "cd";
	 //可以给static final进行赋值
	 public static final String C;
	 public static final String D;
	 static {
		 C = "ab";
		 D = "cd";
	 }
	 
     public static void main(String[] args) {
    	 String str = "abcd";
    	 String str1 = "ab";
    	 String str2 = "cd";
    	 String str3 = str1 + str2;//new Stringbuilder进行拼接 --> 堆空
    	 System.out.println(str == str3);//false
    	 String str4 = "ab"+str2;//new Stringbuilder进行拼接 --> 堆空
    	 System.out.println(str == str4);//false
    	 /*
    	  * A和B都是常量,常量只能赋值一次
    	  * A和B这两个常量在声明时期就已经能确定其值了
    	  *在计算 A+B == "ab" + "cd" --> 指向的位置其实就和str一致了
    	  */
    	 String str5 = A + B;//"ab"+"cd"
    	 System.out.println(str == str5);//true
    	 /*
    	  * C和D都是常量,没有任何问题,只不过使用静态代码块,进行初始化赋值
    	  * 在编译时期C和D没有能力确定值什么
    	  * str6 就相当于 使用new Stringuilder来创建的 也就是存储在堆中
    	  */
    	 String str6 = C + D; //"ab"+"cd"
    	 System.out.println(str == str6);//false
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
		
	}
}
