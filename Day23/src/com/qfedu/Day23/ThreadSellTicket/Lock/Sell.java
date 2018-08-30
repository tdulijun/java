/**
 * 
 */
package com.qfedu.Day23.ThreadSellTicket.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description： 演示Lock锁<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Sell.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Sell implements Runnable {
    private static int  tickets = 100;
    //创建锁对象  实现类ReentrantLock  Lock对象
    private final Lock lock = new ReentrantLock();
	
	@Override
	public void run() {
		for(int i = 0;i<100;i++) {
			
			//try ... finally -->为了是finally代码块
			//ps不加这个语句块效果是一样的
			try {
				lock.lock(); // 就是对象锁
					if (tickets > 0) {
						System.out.println("当前售票员:" + Thread.currentThread().getName() 
								+ "第[" + tickets-- + "]");
					}
			} finally { 
				//释放资源
				lock.unlock();
			}
			
			
//			synchronized ("") {//代替的是对象锁
//				
//				System.out.println("当前售票员:"+Thread.currentThread().getName()
//						+"第["+tickets--+"]");
//			}
			
		}
		
	}

	
	public static void main(String[] args) {
		//不要这样写 --> 不能保证对象是唯一的 Lock锁不住
//		Thread td1 = new  Thread(new Sell(),"刘德华");
//		Thread td2 = new  Thread(new Sell(),"刘德华");
//		Thread td3 = new  Thread(new Sell(),"刘德华");
//		Thread td4 = new  Thread(new Sell(),"刘德华");
		//使用Lock必须保证对象是唯一的,所以推荐使用下面中方式
		Sell sell = new Sell();
		Thread td1 = new  Thread(sell,"刘德华");
		Thread td2 = new  Thread(sell,"刘德华");
		Thread td3 = new  Thread(sell,"刘德华");
		Thread td4 = new  Thread(sell,"刘德华");
		
		td1.start();
		td2.start();
		td3.start();
		td4.start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
