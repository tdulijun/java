/**
 * 
 */
package com.qfedu.Day13.Ramdom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Description： ThreadLocalRandom类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadLocalRandomDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		//创建对象
		ThreadLocalRandom r = ThreadLocalRandom.current();
		int num1 = r.nextInt(100);
		//直接确定范围 第一个参数是产生的开始  第二个参数是结束
		int num2 = r.nextInt(34,179);

	}

}
