/**
 * 
 */
package com.qfedu.Day13.FacetoFace;

/**
 * Description�� ������2<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:StringDemo2.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class StringDemo2 {
	 public static final String A = "ab";
	 public static final String B = "cd";
	 //���Ը�static final���и�ֵ
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
    	 String str3 = str1 + str2;//new Stringbuilder����ƴ�� --> �ѿ�
    	 System.out.println(str == str3);//false
    	 String str4 = "ab"+str2;//new Stringbuilder����ƴ�� --> �ѿ�
    	 System.out.println(str == str4);//false
    	 /*
    	  * A��B���ǳ���,����ֻ�ܸ�ֵһ��
    	  * A��B����������������ʱ�ھ��Ѿ���ȷ����ֵ��
    	  *�ڼ��� A+B == "ab" + "cd" --> ָ���λ����ʵ�ͺ�strһ����
    	  */
    	 String str5 = A + B;//"ab"+"cd"
    	 System.out.println(str == str5);//true
    	 /*
    	  * C��D���ǳ���,û���κ�����,ֻ����ʹ�þ�̬�����,���г�ʼ����ֵ
    	  * �ڱ���ʱ��C��Dû������ȷ��ֵʲô
    	  * str6 ���൱�� ʹ��new Stringuilder�������� Ҳ���Ǵ洢�ڶ���
    	  */
    	 String str6 = C + D; //"ab"+"cd"
    	 System.out.println(str == str6);//false
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
		
	}
}
