/**
 * 
 */
package com.qfedu.Day22.Thread.yield;

/**
 * Description： 年轻人<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:YoungMan.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class YoungMan  extends Thread{
	    @Override
	    public void run() {
	    	for(int i = 1; i<=100;i++) {
	    		System.out.println("年轻人在公交车上经过了["+i+"]站");
	    		//每经过5站
	    		if(i%5==0) {
	    			System.out.println("年轻人让座.....");
	    			//静态方法 
	    			Thread.yield();
	    		}
	    	}
	    }
} 
