/**
 * 
 */
package com.qfedu.Day21.IO.Properties;

/**
 * Description： 将文件中的内容读取回来<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
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
