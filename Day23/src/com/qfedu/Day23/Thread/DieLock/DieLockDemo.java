/**
 * 
 */
package com.qfedu.Day23.Thread.DieLock;

/**
 * Description： 完成死锁<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:DieLockDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class DieLockDemo  implements Runnable{
     private static Zhangsan zs = new Zhangsan();
     private static Lisi ls = new Lisi();
     //谁先说
     private boolean flg = false;
  
    @Override
    public void run() {
    	
    	if(flg) {//值为真 张三先说
    		synchronized (zs) {
    			zs.say();
    		   try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		   synchronized (ls) {
       			zs.get();
   				
   			}
				
			}
    		
    	}else {
    		synchronized (ls) {
    			ls.say();
    			try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			synchronized (zs) {
    				   ls.get();	
    				}
			}
    		
    		
    		
    	}
    
    }
    public static void main(String[] args) {
	   DieLockDemo t1 = new  DieLockDemo();//张三
	   DieLockDemo t2 = new  DieLockDemo();//李四
	     t1.flg = true;
	     t2.flg = false;
	     Thread Athread = new Thread(t1);
	     Thread Bthread = new  Thread(t2);
	     Athread.start();
	     Bthread.start();
	   
	}
    

}
