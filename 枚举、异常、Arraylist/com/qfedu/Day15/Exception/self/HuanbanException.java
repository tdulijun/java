/**
 * 
 */
package com.qfedu.Day15.Exception.self;

/**
 * Description�� �Զ����쳣<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HuanbanException.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class HuanbanException extends RuntimeException{
	/**
	 * �������������ֽ����ļ��ڲ�ͬJDK�汾�н�������ʹ��
	 * ���������л���˵
	 */
	private static final long serialVersionUID = 1L;

	//ǧ������main����
    //���ո��������Լ��Ĺ��췽��
	public HuanbanException() {
		super();
		// TODO Auto-generated constructor stub
	} 
    //Message �쳣��Ϣ
	//cause ��ǰ�쳣��ԭ��
	//enableSuppression  �Ƿ���������(ѹ�ƾ���)
	//writableStackTrace �Ƿ�д���ջ��Ϣ
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
