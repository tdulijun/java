/**
 * 
 */
package com.qfedu.Day15.Exception.self;

/**
 * Description： 自定义异常<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HuanbanException.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class HuanbanException extends RuntimeException{
	/**
	 * 用来编译生成字节码文件在不同JDK版本中进行区分使用
	 * 对象流序列化在说
	 */
	private static final long serialVersionUID = 1L;

	//千万不能有main方法
    //仿照父类生成自己的构造方法
	public HuanbanException() {
		super();
		// TODO Auto-generated constructor stub
	} 
    //Message 异常信息
	//cause 当前异常的原因
	//enableSuppression  是否启用抑制(压制警告)
	//writableStackTrace 是否写入堆栈信息
	public HuanbanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public HuanbanException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public HuanbanException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public HuanbanException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
}
