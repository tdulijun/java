/**
 * 
 */
package com.qfedu.Day21.IO.Properties;

/**
 * Description�� ���ļ��е����ݶ�ȡ����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Test {
	public static void main(String[] args) {
	  String user = PropertiesUtil.getValue("com.qfedu.user");
	  String pwd = PropertiesUtil.getValue("com.qfedu.pwd");
	  String driver = PropertiesUtil.getValue("com.qfedu.drive");
	  System.out.println(user + " " + pwd + " " + driver); 
		
	}

}
