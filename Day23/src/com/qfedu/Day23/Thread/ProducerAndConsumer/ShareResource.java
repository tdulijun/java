/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer;

/**
 * Description： 数据共享(数据共通类)<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ShareResource.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ShareResource {
	private String name;
	private String gender;
	/**
	 * 生产者向共享资源中存储数据
	 * @param name   名字
	 * @param gender  性别
	 */
	public void push(String name,String gender) {
		this.name = name;
		//延迟操作
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.gender = gender;
	}
	/**
	 * 消费者向共享资源中取出数据
	 */
	public void pop() {
		//延迟操作
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "-" + gender);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
