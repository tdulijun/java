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
public class ExceptionDemo4 {

	public static void main(String[] args) {
		System.out.println(Result1());// 3
		//System.out.println((int)(Math.random()*5));
		System.out.println(Result2());
	}
	public static int Result1() {
		int x = 9;
		int y = 3;
		int result = 0;
		try {
		    result = x/y;
		    return result;
			
		}catch(ArithmeticException e) {
			return Integer.MAX_VALUE;
		}finally {
			result++;
			System.out.println("result="+result);// 1 / 4
		}

	}
	public static int Result2() {
		
		try {
			
			return 1 ;
		}finally {
			
			//�﷨:ֻ��finally���д���return���,��Զ���ص���fianlly�еĽ��,Ҫ������������
			return 100;
		}
	}
	
	

}
