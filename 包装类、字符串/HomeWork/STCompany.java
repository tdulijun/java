/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description： 申通快递<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:STCompany.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class STCompany extends Company implements IAirTransportation{

	
	public STCompany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public STCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendAir() {
		System.out.println("申通快递发空运");
		
	}

}
