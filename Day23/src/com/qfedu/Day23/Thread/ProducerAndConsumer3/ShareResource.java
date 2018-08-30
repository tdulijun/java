/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description： 数据共享(数据共通类)<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ShareResource.java <br/>
 * 
 * @author 千锋智哥
 * @version : 3.0
 */
public class ShareResource {
	private String name;
	private String gender;
	//共享的值-->来判断资源对象是否是空
	//若是空的 true    有值 false
	private static boolean isEmpty  = true;
	//创建锁对象
	private final Lock lock = new ReentrantLock();
	//全新的等待和唤醒
	private Condition condition = lock.newCondition();
	
	/**
	 * 生产者向共享资源中存储数据
	 * @param name   名字
	 * @param gender  性别
	 */
	public void push(String name,String gender)  {
		lock.lock(); //上锁
			//isEmpty是空的--> 当前生产者是没有生产或被消费了
			//isEmpty不是空 --> 当前已经被生产了,等待
			if(!isEmpty) {
				 try {
				 condition.await();//若需要让线程进入等待状态,必须通过同步对象锁中参数进行调用
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//生产数据
				this.name = name;
			// 延迟操作
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.gender = gender;
		   //需要修改对应的共享值
				isEmpty = false;
				//消费者
				//若是第一次执行,空唤醒,不会有任何影响
				condition.signal();
	     lock.unlock();
			
			
		
	}
	/**
	 * 消费者向共享资源中取出数据
	 */
	public void pop() {
		//延迟操作
		lock.lock();
			//先判断当前共享数据
			if(isEmpty) {
				try {
					condition.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//消费
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "-" + gender);
			//修改当前标识
			isEmpty = true;
			condition.signal();
		 lock.unlock();	
			
		
	}
	
	

}
