/**
 * 
 */
package com.qfedu.Day12.Number;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:NumberDemo2.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class NumberDemo2 {
      public static void main(String[] args) {
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);//false �Ƚ���i1��i2����Ķ��е�ַ
		//Object��equals �Ƚϵ��ǵ�ַ
		//Integer�е�equalsһ������д
		System.out.println(i1.equals(i2));//true
		
		//��Ԫԭ��:-->�ܾúܾ���ǰ�ڴ��Ǻܱ��� 64M
		//����޽��ƵĴ���Integer����,�ڴ��վ�����
		//�������Byte,Short Long Integer [-128 ~ 127]
		//�������Χ֮����,�Ѿ������˶���,��ô�� �������´����µĶ���
		//�������������ͬһ���ռ�
		Integer i3 = Integer.valueOf(123);
	    Integer i4 = Integer.valueOf(123);
	    System.out.println(i3 == i4);//true
	    
	    
	    Integer i5 = 123;
	    Integer i6 = 123;
	    System.out.println(i5 == i6);//true
	    
	    Integer i7 = new Integer(250);
	    Integer i8 = new Integer(250);
	    System.out.println(i7 == i8);
	    
	    Integer i9 = Integer.valueOf(250);
	    Integer i10 = Integer.valueOf(250);
	    System.out.println(i3 == i4);//true
	    
	    
	    Integer i11 = 250;
	    Integer i12 = 250;
	    System.out.println(i11 == i12);//false
	    System.out.println(i11.equals(i12));//true
	    
	    
	    
	}
}
