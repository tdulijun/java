/**
 * 
 */
package com.qfedu.Day22.Thread.Join;

/**
 * Description： 妹子<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Meizi.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Meizi extends Thread {
   
    @Override
    public void run() {
    	 for(int i =1 ;i<=50;i++) {
    		 System.out.println("妹子再看精钢葫芦娃大战七个小矮人"+i+"集");
    		 if(i == 10) {
    			 //自己进入准备状态
    			 Boy boy = new  Boy();
    			 boy.start();
    			 try {
					boy.join();//合并
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		 }
    	 }
    }
}
