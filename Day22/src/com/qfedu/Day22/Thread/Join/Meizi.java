/**
 * 
 */
package com.qfedu.Day22.Thread.Join;

/**
 * Description�� ����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Meizi.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Meizi extends Thread {
   
    @Override
    public void run() {
    	 for(int i =1 ;i<=50;i++) {
    		 System.out.println("�����ٿ����ֺ�«�޴�ս�߸�С����"+i+"��");
    		 if(i == 10) {
    			 //�Լ�����׼��״̬
    			 Boy boy = new  Boy();
    			 boy.start();
    			 try {
					boy.join();//�ϲ�
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		 }
    	 }
    }
}
