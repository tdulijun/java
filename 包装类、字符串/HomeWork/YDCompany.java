/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description： 韵达快递<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:YDCompany.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class YDCompany  extends Company implements ILandTransportation{


	public YDCompany() {
		super();
		
	}

	public YDCompany(String name) {
		super(name);
		
	}

	/* (non-Javadoc)
	 * @see com.qfedu.Day12.HomeWork.ILandTransportation#sendLand()
	 */
	@Override
	public void sendLand() {
		System.out.println("韵达快递发陆运");
		
	}

}
