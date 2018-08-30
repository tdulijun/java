/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer2;

/**
 * Description： 生产者<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Producer.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Producer implements Runnable{
	//若在一个类中向使用另外一个类的属性和方法
	//第一种作为当前类的属性而存在 -->尽量遵守客观现实逻辑
	//第二个作为当前类中所提供的方法的参数存在
	private ShareResource resource;
	public Producer(ShareResource resource) {
		this.resource = resource;
	}
	/* 
	 * 完成生产操作
	 */
	@Override
	public void run() {
		  for(int  i = 0;i<50;i++) {
			  if(i%2==0) {
				  resource.push("春哥", "男");
			  }else {
				  resource.push("凤姐","女");
			  }
			  
		  }
		
	}
	

}
