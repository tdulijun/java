/**
 * 
 */
package com.qfedu.Day13.Ramdom;

import java.util.Arrays;
import java.util.Random;

/**
 * Description：随机数<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:RandomDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class RandomDemo {

	public static void main(String[] args) {
		// 伪随机
		Random r1 = new Random(10);
		System.out.println(r1.nextBoolean());//boolean类型
		System.out.println(r1.nextDouble());//double类型
		System.out.println(r1.nextInt());//int类型
		//确定范围的随机
		//可以传入参数,这个参数就是随机的范围[0,1)-->[0,100) 0~99
		System.out.println(r1.nextInt(100));
		
		System.out.println("----------------------------------------------");
		
		Random r2 = new Random(10);
		System.out.println(r2.nextBoolean());//boolean类型
		System.out.println(r2.nextDouble());//double类型
		System.out.println(r2.nextInt());//int类型
		//确定范围的随机
		//可以传入参数,这个参数就是随机的范围[0,1)-->[0,100) 0~99
		System.out.println(r2.nextInt(100));
		System.out.println("----------------------------------------------");
		//正常随机
		//ps:默认种子是当前时间currentTimeMillis()
		
		Random r3 = new Random();
		int[] array = new int[10];
		for(int i = 0;i<array.length;i++) {
			  array[i] = r3.nextInt(100);
			
		}
		System.out.println(Arrays.toString(array));
		
		//生成34-179之间的随机数
		//nextInt(145)+34;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
