/**
 * 
 */
package com.qfedu.Day22.Thread.yield;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:YoungMan.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class YoungMan  extends Thread{
	    @Override
	    public void run() {
	    	for(int i = 1; i<=100;i++) {
	    		System.out.println("�������ڹ������Ͼ�����["+i+"]վ");
	    		//ÿ����5վ
	    		if(i%5==0) {
	    			System.out.println("����������.....");
	    			//��̬���� 
	    			Thread.yield();
	    		}
	    	}
	    }
} 
