/**
 * 
 */
package com.qfedu.Day18.HomeWork;

/**
 * Description�� �����Զ����쳣<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:TUIException.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 * �̳�Exception --> ����ʱ�쳣 --> ����д������÷���������������ʱ�ͻ�����쳣��Ϣ,���봦��
 * 				    try...catch...finally   throws
 * �̳�RuntimeException -->����ʱ�쳣  �ڳ��������Ժ�,�Ż���ֵ��쳣 �����쳣֮��,���Բ�׽Ҳ�����׳�
 */
public class TUIException extends Exception{

	/**
	 *  ����JdK�汾��ʹ�� --> ������
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
