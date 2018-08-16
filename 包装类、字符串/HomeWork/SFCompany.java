/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description£º Ë³·á¿ìµÝ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SFCompany.java <br/>
 * 
 * @author Ç§·æÖÇ¸ç
 * @version : 1.0
 */
public class SFCompany extends Company implements ILandTransportation,IAirTransportation{

	
	
	
	public SFCompany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SFCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.qfedu.Day12.HomeWork.IAirTransportation#sendAir()
	 */
	@Override
	public void sendAir() {
		System.out.println("Ë³·á¿ìµÝ·¢¿ÕÔË");
		
	}

	/* (non-Javadoc)
	 * @see com.qfedu.Day12.HomeWork.ILandTransportation#sendLand()
	 */
	@Override
	public void sendLand() {
		System.out.println("Ë³·á¿ìµÝ·¢Â½ÔË");
		
	}

}
