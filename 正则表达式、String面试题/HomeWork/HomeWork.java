/**
 * 
 */
package com.qfedu.Day13.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.IconView;

/**
 * Description�� ��ҵ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HomeWork.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class HomeWork {

/**
 * 1.�ӿ���̨¼��һ���ַ������������ַ����Դ�д��ĸ��ͷ�������ַ���ת��ȫСд��
 * �������ַ�����Сд��ĸ��ͷ�������ַ���ת��ȫ��д
   2.ȥ���ַ��������еĿո����� a b c d e  f --> abcdef
   3.��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת ���� abcdefg --> abfedcg
   4.���绰���м�4λ�滻��XXXX ����13842383838-->138XXXX3838
   5.��֪�ַ���:"this is a test of java"
         ִ�����²���:
    1.ͳ�Ƴ��ַ�����s���ֵĴ���
    2.ȡ���ַ�����"test"
    3.���ַ���ת����һ���ַ�����
    4.���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д,���������̨
    5.���ַ����Ǵ˰�������� "java of test a is this"

	6.����һ��ʱ�䣬���������һ��ʱ��(�ַ����汾)
 	����
 	���� 20:39:40
 	��� 20:39:41
		20:39:59
		20:40:00
		20:59:59
		21:00:00
		23:59:59
		00:00:00
	7."��Ϊ"��˾ȥ���Ӫҵ���ǣ�1798798099079798098
   	��ʽ����Ľ����Ϣ�ǣ�1,798,798,099,079,798,098
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
    	 //�ַ����ײ���һ���ַ�����,�ṩlength() ����ʹ����������ķ�ʽֱ�Ӳ����ַ���
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
    	 System.out.println("�����뿪ʼ��λ��:");
    	 int beginIndex = input.nextInt();
    	 System.out.println("�����������λ��:");
    	 int endIndex = input.nextInt();
    	 //���н�ȡ
    	 String subStr = str.substring(beginIndex, endIndex+1);
    	 StringBuffer sbr = new StringBuffer(subStr);
    	 sbr.reverse();//�����ַ�����ת
    	 String newStr = sbr.toString();//��ת��ɵ�
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
    	 //ͨ���ַ��������ַ���
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
    	 System.out.println("s�Ĵ�����:"+count);
    	 
    	 //5.2
    	 int index = str.indexOf("test");
    	 String subStr = str.substring(index,(index+"test".length()));
    	 System.out.println("��ȡ:"+subStr);
    	 
    	 //5.3
    	 char[] buf = str.toCharArray();
    	 System.out.println("�ַ�����:"+Arrays.toString(buf));
    	 
    	 //5.4
    	 String[] strArray = str.split(" ");
    	 System.out.println("�ַ�������洢��Ԫ��:"+Arrays.toString(strArray));
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
    	 System.out.println("��һ��������ĸ��д����ַ���:"+sbr);
    	 
    	 //5.5
    	 for(int i = 0;i<strArray.length/2;i++) {
    		 String  tmp = strArray[i];
    		 strArray[i] = strArray[strArray.length-1-i];
    		 strArray[strArray.length-1-i] = tmp;
    		 
    	 }
    	 //����Ҫ�����ƴ��
    	 /*
    	  * ��һ��������Ҫ����ʲô����(ƴ)
    	  * �ڶ���������һ���ַ�������
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
