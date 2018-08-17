/**
 * 
 */
package com.qfedu.Day15.Exception;

/**
 * Description：try...catch...finally形式<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ExceptionDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ExceptionDemo3 {

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
			//System.exit(1);
			//finally优先于return执行
			//finally只有使用停止JVM的方法时才不执行
		}finally {
			
			System.out.println("关闭资源,finally语句被执行了..");
			
		}
		System.out.println("-------------------------end-------------------------");

		
	}

}
