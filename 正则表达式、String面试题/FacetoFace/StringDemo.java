/**
 * 
 */
package com.qfedu.Day13.FacetoFace;

/**
 * Description�� ������1<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:StringDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class StringDemo {
         public static void main(String[] args) {
			 //��������д����˶��ٸ���
        	 //���1��,����һ����������
        	 /*ֱ�Ӵ����ڳ��е�,���Իᴴ��"ABCD" һ��
        	  * ������"ABCD",һ����������������֮ǰ�����õ��Ǹ��ַ��� 
        	  */
        	 String str1 = "ABCD";
        	 //����1�� ���2��
        	 /*
        	  * ������"ABCD",һ����������������֮ǰ�����õ��Ǹ��ַ���
        	  * ֻ���ڶ��п��ٵ�ַ,Ȼ��"ABCD"���ڶ���
        	  * 
        	  * ������û�оͻ��ȴ���һ��"ABCD",Ȼ��󴴶���
        	  */
        	 String str2 = new  String("ABCD");
        	 //�����ַ������е�ƴ��,�ײ�����Զ��Ż� ������һ������ �����Ż�����
        	 String str3 = "A"+"B"+"C"+"D"; // "ABCD"
        	 String str4 = "AB" + "CD"; //"ABCD"
        	 System.out.println(str1 == str2);//false
        	 System.out.println(str1 == str3);//true  
        	 System.out.println(str1 == str4);//true
        	 
        	 //String str5 = (new StringBuilder(String.valueOf(str5_1))).append(str5_2).toString();
        	 //�����ڲ����ַ���ƴ�ӵ�ʱ��,�ڱ���׶��ڼ����޷�ȷ����ֵ��ʲô
        	 //ֻ���������ڼ�,�����Ż�õ�������ֵ,str5���ĵ��Ŀռ�ͻᱻ�ı�Ϊ�ѿռ�
        	 String str5_1 = "AB";
        	 String str5_2 = "CD";
        	 String str5 = str5_1 + str5_2;
        	 System.out.println(str1 == str5);//false 3
        	 //�����ڱ���׶����޷�ȷ��,���÷�����ʱ��,�������ͺͽ��ַ����洢������Ч����һ��
        	 //	String str6 = (new StringBuilder(String.valueOf(getString()))).append("CD").toString();
        	 String str6 = getString() + "CD";
        	 System.out.println(str1 == str6);// false  
        	 
		}
         
         public static  String getString() {
        	 return "AB";
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
}
