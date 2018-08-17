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
		//这段代码可能会出现异常
		int result = x/y;
		System.out.println("结果:"+result);
		//1.若能明确异常类型,就写当前异常类型
		//2.不知道异常类 --> Exception
		}catch(ArithmeticException e) {
			System.out.println("除数为0,出现了问题!!!!!!");
			
		}
		System.out.println("-------------------------end-------------------------");

		
	}

}
