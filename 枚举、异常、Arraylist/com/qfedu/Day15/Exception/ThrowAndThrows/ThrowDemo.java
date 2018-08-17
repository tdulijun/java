/**
 * 
 */
package com.qfedu.Day15.Exception.ThrowAndThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

public class ThrowDemo {
	public static void main(String[] args)throws FileNotFoundException {
		//效果等同于return 
		//throw new RuntimeException();
		String str = "123a";
		try {
		int num = getNumber(str);
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}	
		
		try {
			new FileInputStream("C:\\test");
		} catch (FileNotFoundException e) {
			//1.7使用throw抛出一个异常对象,throw new 异常类型()
			//1.7之后增强语法catch中是不是已将获知异常类型而e是不是就是异常对象
			//throw可以直接在catch语句块中直接将异常对象抛出
			//ps:若这样使用就无法自定义信息了
			//throw new FileNotFoundException();
		     throw e;
		}
//		int i = 0;
//		while(true) {
//			if(i == 200000) {
//				//最好不要
//			   throw new RuntimeException("循环已经停止");
//			}
//			i++;
//			
//		}
		

	}
    public static int getNumber(String value) {
    	try {
    	   return new Integer(value);
    	}catch(NumberFormatException e) {
    	   throw new NumberFormatException("转换错误,你输入的是什么???");
    	}
    }

	
}
