/**
 * 
 */
package com.qfedu.Day15.Exception.change;

/**
 * Description������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Demo {
	public static void main(String[] args) {
		show();

	}
	
	public static void display() {
		throw new  AException("����A�쳣");
	}
	public static void show() {
		try {
		 display();
		}catch(AException e) {
			throw new  BException("����B�쳣");
		}
	}

}
