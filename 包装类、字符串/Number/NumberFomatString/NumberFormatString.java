/**
 * 
 */
package com.qfedu.Day12.Number.NumberFomatString;

/**
 * Description�� String�Ͱ�װ�໥��ת��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:NumberFormatString.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class NumberFormatString {
	public static void main(String[] args) {
		//��ĳ���ַ���ת��Ϊ��װ������
		//ת�����Ե��Ǳ��������ֲ��������ݴ洢��Χ֮��
		//�����������ַ��ͻ����
		/*
		 * NumberFormatException: For input string: "123a"
		 * ����ת���쳣
		 * 
		 */
		Integer i1 = Integer.valueOf("123");
		Integer i2 = 123;
		System.out.println(i1+i2);
		//ͬ��Ҫ׼�������ԭ��
		Integer i3 = new Integer("123");
		
		//����װ��ת��Ϊ�ַ���
        String str1 = i1.toString();
        
        //��������������ת��Ϊ�ַ���
        String str2 = 17 + "";
        
        //��Stringת��Ϊ������������
        String str3 = "12345";
        int num = Integer.parseInt(str3);
        
        //ps:true / false ��װ��ͬ�����
        //֮��true��false�������������۲�����ʲô ������Ĭ��ֵ false
        Boolean b = new Boolean("С��è");
        System.out.println(b);
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
