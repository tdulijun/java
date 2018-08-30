/**
 * 
 */
package com.qfedu.Day22.Thread.Join;

/**
 * Description： 男生<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Boy.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Boy extends Thread{
	    @Override
	    public void run() {
	    	for(int i= 1 ; i<=10;i++) {
	    		System.out.println("男生再看喜羊羊和灰太狼第"+i+"集");
	    	}
	    	
	    }
}
