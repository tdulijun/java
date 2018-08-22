/**
 * 
 */
package com.qfedu.Day18.HomeWork;

import java.util.Random;
import java.util.TreeSet;

/**
 * Description： 双色球<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:DoubleBall.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class DoubleBall {
	public static void main(String[] args) {
		 redBall();

	}
	/**
	 * 红球
	 */
	public static void  redBall() {
		TreeSet set = new TreeSet();
		//创建一个随机数的对象
		Random random = new  Random();
		//TreeSet中存满6个 --> 可定没有重复 打印的结果--> 排序好了
		while(true) {
			if(set.size() != 6) {
				 set.add(random.nextInt(31)+1);
			}else {
				break;
			}
			
		}
		System.out.println(set);
		
		
		
	}

}
