/**
 * 
 */
package com.qfedu.Day18.HomeWork;

/**
 * Description： 创建自定义异常<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:TUIException.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 * 继承Exception --> 编译时异常 --> 在书写代码调用方法或其他的属性时就会出现异常信息,必须处理
 * 				    try...catch...finally   throws
 * 继承RuntimeException -->运行时异常  在程序运行以后,才会出现的异常 出现异常之后,可以捕捉也继续抛出
 */
public class TUIException extends Exception{

	/**
	 *  区分JdK版本号使用 --> 对象流
	 */
	private static final long serialVersionUID = -2974291582387079751L;

	public TUIException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TUIException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public TUIException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TUIException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TUIException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
   
	
}
