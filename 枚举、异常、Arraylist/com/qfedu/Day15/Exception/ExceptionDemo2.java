/**
 * 
 */
package com.qfedu.Day15.Exception;

/**
 * Description�� try...catch...catch<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ExceptionDemo2.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ExceptionDemo2 {

	public static void main(String[] args) {
//		String num1 = "10";
//		String num2 = "0";
//		try {
//		int i1 = Integer.parseInt(num1);
//		int i2 = Integer.parseInt(num2);
//		int result = i1/i2;
//		System.out.println(result);
//		}catch(NumberFormatException e) {
//			//��ӡ�쳣��Ϣ --> ��ӡϵͳ���Զ����쳣��Ϣ
//			System.out.println(e.getMessage());
//		}catch (ArithmeticException e) {
//			/*
//			 * java.lang.ArithmeticException: / by zero
//				at com.qfedu.Day15.Exception.ExceptionDemo2.main(ExceptionDemo2.java:23)
//			 */
//			//��ӡ����ջ��Ϣ
//			e.printStackTrace();
//		}
		//�����﷨��Ҫע��
//		String num1 = "10";
//		String num2 = "0";
//		try {
//		int i1 = Integer.parseInt(num1);
//		int i2 = Integer.parseInt(num2);
//		int result = i1/i2;
//		System.out.println(result);
//		
//		}catch (ArithmeticException e) {
//			/*
//			 * java.lang.ArithmeticException: / by zero
//				at com.qfedu.Day15.Exception.ExceptionDemo2.main(ExceptionDemo2.java:23)
//			 */
//			//��ӡ����ջ��Ϣ
//			e.printStackTrace();
//		//Exception�Ǹ���---> ���������쳣,ʣ��������쳣���޷������쳣��Ϣ��	
//			//���Ը����쳣��Ҫ�����������쳣�ĺ���
//		}catch(Exception e) {
//			//��ӡ�쳣��Ϣ --> ��ӡϵͳ���Զ����쳣��Ϣ
//			System.out.println(e.getMessage());
//		}
		//1.7�е�������
		String num1 = "10";
		String num2 = "0";
		try {
		int i1 = Integer.parseInt(num1);
		int i2 = Integer.parseInt(num2);
		int result = i1/i2;
		System.out.println(result);
		//ƽ�������쳣 ��Ҫ���� ���಻�ܳ����������ǰ��
		}catch (ArithmeticException | NumberFormatException e) {
			//��ӡ����ջ��Ϣ
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
