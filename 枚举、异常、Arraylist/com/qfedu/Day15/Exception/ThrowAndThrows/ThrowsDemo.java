/**
 * 
 */
package com.qfedu.Day15.Exception.ThrowAndThrows;

/**
 * Description： throws异常<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThrowsDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ThrowsDemo {
	//后果:main已经是最终的位置,若在main中继续抛出异常,接受者只有一个JVM
	//得到的结结果就是在控制台上打印跟中栈信息
	//ps:throws主要的作用就是提示调用者有异常需要处理,一般会和编译时异常一起使用
      public static void main(String[] args)throws NumberFormatException {
    	  
    	  String str = "123a";
    	  
    	  //正确的做法就是需要处理这个异常try...catch
    	  //但是处理异常还有一种方法继续throws
    	  int num = getResult(str);
		
	}
     public static int getResult(String value)throws NumberFormatException {
    	 return new Integer(value);
     }
}
