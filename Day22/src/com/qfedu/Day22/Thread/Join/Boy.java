/**
 * 
 */
package com.qfedu.Day22.Thread.Join;

/**
 * Description�� ����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Boy.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Boy extends Thread{
	    @Override
	    public void run() {
	    	for(int i= 1 ; i<=10;i++) {
	    		System.out.println("�����ٿ�ϲ����ͻ�̫�ǵ�"+i+"��");
	    	}
	    	
	    }
}
