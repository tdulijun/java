/**
 * 
 */
package com.qfedu.Day15.Exception;

/**
 * Description： try...catch...catch<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ExceptionDemo2.java <br/>
 * 
 * @author 千锋智哥
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
//			//打印异常信息 --> 打印系统所自订的异常信息
//			System.out.println(e.getMessage());
//		}catch (ArithmeticException e) {
//			/*
//			 * java.lang.ArithmeticException: / by zero
//				at com.qfedu.Day15.Exception.ExceptionDemo2.main(ExceptionDemo2.java:23)
//			 */
//			//打印跟中栈信息
//			e.printStackTrace();
//		}
		//如下语法需要注意
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
//			//打印跟中栈信息
//			e.printStackTrace();
//		//Exception是父类---> 接收所有异常,剩余的子类异常就无法接收异常信息了	
//			//所以父类异常需要出现在子类异常的后面
//		}catch(Exception e) {
//			//打印异常信息 --> 打印系统所自订的异常信息
//			System.out.println(e.getMessage());
//		}
		//1.7中的新特性
		String num1 = "10";
		String num2 = "0";
		try {
		int i1 = Integer.parseInt(num1);
		int i2 = Integer.parseInt(num2);
		int result = i1/i2;
		System.out.println(result);
		//平级捕获异常 需要满足 父类不能出现在子类的前面
		}catch (ArithmeticException | NumberFormatException e) {
			//打印跟中栈信息
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
