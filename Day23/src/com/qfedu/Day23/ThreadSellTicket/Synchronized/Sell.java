/**
 * 
 */
package com.qfedu.Day23.ThreadSellTicket.Synchronized;

/**
 * Description： 买票第二版本<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Sell.java <br/>
 * 保证所有对象共享同一个资源,添加对象锁-->同步代码块
 * @author 千锋智哥
 * @version : 2.0
 */
public class Sell implements Runnable {
   //全局局静态变量,所有线程对象共享,只要有对象进行修改,其他对象拿到都是修改过后的值
	  private  static int tickets = 100; //线程访问的临介资源
	    
	    /* 卖票的逻辑写在run方法
		 */
		@Override
		public void run() {
	    
		   for(int i = 0;i<100;i++) {
			   //对象锁 --> 同步代码块
			   synchronized("") {
			     if(tickets > 0) { //防止出现负数和0
			    	 //延迟执行 睡眠
			    	 //sleep在同步代码块和等待是不会释放cpu时间片
			    	 
//			    	 try {
//						Thread.sleep(300);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
			    	 
			    	 System.out.println("当前售票员是:"+Thread.currentThread().getName()
			    			 +"第["+tickets--+"]票");
			     }
			   }
		   }

			
		}
	public static void main(String[] args) {
	     //创建对象 
	   Thread td1 = new Thread(new Sell(), "刘德华");
	   Thread td2 = new Thread(new Sell(), "郭富城");
	   Thread td3 = new Thread(new Sell(), "张学友");
	   Thread td4 = new Thread(new Sell(), "吴奇隆");
	   
	   td1.start();
	   td2.start();
	   td3.start();
	   td4.start();
	   

	}


	

}
