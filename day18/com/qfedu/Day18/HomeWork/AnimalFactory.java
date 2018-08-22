/**
 * 
 */
package com.qfedu.Day18.HomeWork;



/**
 * Description： 简单工厂(工厂类)<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:AnimalFactory.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 * 管理对象的创建
 */
public class AnimalFactory {
     private AnimalFactory() {}
     public static Animal getAnimal(int tui,String AnimalName) {
    	 switch (AnimalName) {
		case "猫":
			return new Cat(tui);
		case "鱼":
			return new Fish(tui);
		case "企鹅":
			return new QQ(tui);
		default:
			throw new RuntimeException("没有这种动物");
		}
    	 
    	 
    	 
     }
}
