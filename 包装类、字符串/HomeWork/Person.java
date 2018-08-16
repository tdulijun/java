/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description： 人<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Person.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Person {
      //接口-->是一个特殊的抽象父类
	//多态 --> 继承或实现 接口可以接受一个实现了接口的子类引用(对象)
	//将参数类型改成接口,接受的参数是不是只能是实现了接口的类
	public void sendLand(ILandTransportation l) {
	      l.sendLand();
	}
	public void sendAir(IAirTransportation a) {
		a.sendAir();
	}
    
}
