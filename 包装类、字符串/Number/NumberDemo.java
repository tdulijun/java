/**
 * 
 */
package com.qfedu.Day12.Number;

/**
 * Description： 演示包装类的拆箱和装箱<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:NumberDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class NumberDemo {

	public static void main(String[] args) {
         //基本数据类型
		int  age = 12;
		//自动装箱
		//反编译原码看到	Integer ageObj = Integer.valueOf(age);
		//valueof 的返回值是使用 new Integer(i);
		//自动装箱底层就是手动装箱
		Integer ageObj = age;
		//手动装箱
		Integer ageObj2 = new Integer(age);
		//自动拆箱
		//底层调用还是手动拆箱  ageObj.intValue() 
		int age2 = ageObj;
		//手动拆箱
		int age3 = ageObj2.intValue();
		
       

	}

}
