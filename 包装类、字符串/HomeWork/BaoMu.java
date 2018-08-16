/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description： 保姆类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:BaoMu.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 *普通子类实现接口,必须实现接口中的抽象方法
 *抽象类实现接口,可以选择实现也可以选择不实现,因为抽象类中可以存在抽象方法
 */
public  class BaoMu implements IHousekeeping {


	@Override
	public void xiyifu() {
		System.out.println("洗衣服");
		
	}

	
	@Override
	public void saodi() {
		System.out.println("扫地");
		
	}


	@Override
	public void maicai() {
		System.out.println("买菜");
		
	}


	@Override
	public void zuofan() {
		System.out.println("做饭");
		
	}

}
