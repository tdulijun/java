/**
 * 
 */
package com.qfedu.Day15.Exception;

public class ExceptionDemo {

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
			
		}
		System.out.println("-------------------------end-------------------------");

		
	}

}
