/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description： 车<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Car.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 * 普通子类若继承一个抽象父类,必须实现抽象父类中的抽象方法
 * 火车和飞机的实现方式和Car完全相同就是打印语句不同
 */
public class Car extends Vehicle{
  
    @Override
    public void drive() {
    	System.out.println("汽车行驶");
    	
    }
}
