/**
 * 
 */
package com.qfedu.Day15.Exception;

/**
 * Description��try...catch...finally��ʽ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ExceptionDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ExceptionDemo3 {

	public static void main(String[] args) {
		System.out.println("-----------------------begin-----------------------");
		int x = 9;
		int y = 0;
		try {
		//��δ�����ܻ�����쳣
		int result = x/y;
		System.out.println("���:"+result);
		//1.������ȷ�쳣����,��д��ǰ�쳣����
		//2.��֪���쳣�� --> Exception
		}catch(ArithmeticException e) {
			System.out.println("����Ϊ0,����������!!!!!!");
			//System.exit(1);
			//finally������returnִ��
			//finallyֻ��ʹ��ֹͣJVM�ķ���ʱ�Ų�ִ��
		}finally {
			
			System.out.println("�ر���Դ,finally��䱻ִ����..");
			
		}
		System.out.println("-------------------------end-------------------------");

		
	}

}
