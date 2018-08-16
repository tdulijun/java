/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description： 测试类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test {

	public static void main(String[] args) {
	//1.
		  Car car = new Car();
		  car.drive();
    //2.
		  BaoMu bm = new BaoMu();
		  bm.maicai();
		  bm.zuofan();
		  
		  //6.
		 Person p = new Person();
		 STCompany st = new STCompany();
		 YDCompany sd = new YDCompany();
		 SFCompany sf = new SFCompany();
		 //重载的问题,重载可以自动选择最合适的方法
		 p.sendLand(sf);
		 p.sendAir(sf);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
