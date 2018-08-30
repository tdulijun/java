/**
 * 
 */
package com.qfedu.Day22.Thread.yield;

/**
 * Description： 老人<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:OldMan.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class OldMan extends Thread{
	@Override
	public void run() {
		for(int i= 1;i<=100;i++) {
			System.out.println("老人在公交车上经过了["+i+"]站");
		}
	}
	

}
