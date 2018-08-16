/**
 * 
 */
package com.qfedu.Day13.NumberClass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Description： 数据类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Demo {
	public static void main(String[] args) {
		//Math数学类:这里封装了一些常用的数据公式,Math是一个工具类里面的方法都是static方法
		//ps:大数据--> 数学,应用数学+计算机
		//求次方法
		double max = Math.pow(2, 31)-1;
		//求随机数
		double random = Math.random()*100;
		//比较两个数随最大或最小
		System.out.println(Math.max(1, 2));
		System.out.println(Math.min(1, 2));
		//求绝对值
		System.out.println(Math.abs(-1));
		//开平方
		System.out.println(Math.sqrt(4));
		//定义PI
		System.out.println(Math.PI);

		//BigDecimal(精确)
		//double是一个不精确存的(1/3乘以3是一个无线接近于1的值)
		System.out.println("0.09+0.01="+(0.09+0.01));
		System.out.println("1.0-0.33="+(1.0-0.33));
		System.out.println("4.015*1000="+(4.015*1000));
		System.out.println("12.3/100="+(12.3/100));
		//不能精确的计算结果
		BigDecimal num1 = new BigDecimal("0.09");
		BigDecimal num2 = new BigDecimal("0.01");
		//System.out.println(num1+num2);
		//已经将数据封装到了BigDecimal中所以我们在次操作数据的时候,就是在操作两个对象
		//所以不能直接使用运算符进行计算
		//BigDecimal中已经封装好了对应的计算方法
		System.out.println(num1.add(num2));
		
		//BigInteger
		BigInteger num3 = 
				new  BigInteger("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
	    
        BigInteger num4 = new BigInteger("7");
        //mod求余数
        if((num3.mod(num4)).toString().equals("0")) {
        	System.out.println("能被整除");
        }else {
        	System.out.println("不能被整除");
        }
        
        //格式化数据
        //static NumberFormat getInstance()  返回当前默认语言环境的通用数值格式。 
        NumberFormat nf = NumberFormat.getInstance();
        //只能帮助格式化16位
        System.out.println(nf.format(1234567891111111.0));
        //有一个构造方法-->可以传入一个字符串 ,自定义格式   
        DecimalFormat df = new DecimalFormat();
        System.out.println(df.format(1234567891111111.0));
		
		

	}

}
