/**
 * 
 */
package com.qfedu.Day15.Exception.self;

/**
 * Description£∫ xxxx<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author «ß∑Ê÷«∏Á
 * @version : 1.0
 */
public class Demo {

	public static void main(String[] args)throws HuanbanException {
		//throw new HuanbanException();
		
		int a = 10;
		if(a != 10) {
			throw new HuanbanException();
		}
		try {
		int b = 10;
		}catch(HuanbanException e) {
			e.printStackTrace();
		}
	}

}
