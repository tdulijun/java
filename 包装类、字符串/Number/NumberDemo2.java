/**
 * 
 */
package com.qfedu.Day12.Number;

/**
 * Description： 笔试题<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:NumberDemo2.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class NumberDemo2 {
      public static void main(String[] args) {
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);//false 比较是i1和i2对象的堆中地址
		//Object中equals 比较的是地址
		//Integer中的equals一定是重写
		System.out.println(i1.equals(i2));//true
		
		//享元原则:-->很久很久以前内存是很宝贵 64M
		//如果无节制的创建Integer对象,内存终究会慢
		//缓存机制Byte,Short Long Integer [-128 ~ 127]
		//在这个范围之间若,已经创建了对象,那么就 不会重新创建新的对象
		//两个对象会引用同一个空间
		Integer i3 = Integer.valueOf(123);
	    Integer i4 = Integer.valueOf(123);
	    System.out.println(i3 == i4);//true
	    
	    
	    Integer i5 = 123;
	    Integer i6 = 123;
	    System.out.println(i5 == i6);//true
	    
	    Integer i7 = new Integer(250);
	    Integer i8 = new Integer(250);
	    System.out.println(i7 == i8);
	    
	    Integer i9 = Integer.valueOf(250);
	    Integer i10 = Integer.valueOf(250);
	    System.out.println(i3 == i4);//true
	    
	    
	    Integer i11 = 250;
	    Integer i12 = 250;
	    System.out.println(i11 == i12);//false
	    System.out.println(i11.equals(i12));//true
	    
	    
	    
	}
}
