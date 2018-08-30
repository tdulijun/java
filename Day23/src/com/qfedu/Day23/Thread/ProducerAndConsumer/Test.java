/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer;

/**
 * Description：测试生产者消费者模式<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test {


	public static void main(String[] args) {
		// 第一版本测试
		//1.创建生产者和消费者需要的共享资源对象
		ShareResource resource = new ShareResource();
		//2.开启线程进行生产和消费
		new Thread(new Producer(resource)).start();
		new Thread(new Consumer(resource)).start();

	}

}
