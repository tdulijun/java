/**
 * 
 */
package com.qfedu.Day22.Thread.yield;

/**
 * Description£∫ œﬂ≥Ã¿Ò»√<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadYieldDemo.java <br/>
 * 
 * @author «ß∑Ê÷«∏Á
 * @version : 1.0
 */
public class ThreadYieldDemo {

	
	public static void main(String[] args) {
		Thread OldThread = new OldMan();
		Thread YoungThread = new YoungMan();
		YoungThread.start();
		OldThread.start();

	}

}
