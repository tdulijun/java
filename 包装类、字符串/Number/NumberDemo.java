/**
 * 
 */
package com.qfedu.Day12.Number;

/**
 * Description�� ��ʾ��װ��Ĳ����װ��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:NumberDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class NumberDemo {

	public static void main(String[] args) {
         //������������
		int  age = 12;
		//�Զ�װ��
		//������ԭ�뿴��	Integer ageObj = Integer.valueOf(age);
		//valueof �ķ���ֵ��ʹ�� new Integer(i);
		//�Զ�װ��ײ�����ֶ�װ��
		Integer ageObj = age;
		//�ֶ�װ��
		Integer ageObj2 = new Integer(age);
		//�Զ�����
		//�ײ���û����ֶ�����  ageObj.intValue() 
		int age2 = ageObj;
		//�ֶ�����
		int age3 = ageObj2.intValue();
		
       

	}

}
