/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description�� ˳����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SFCompany.java <br/>
 * 
 * @author ǧ���Ǹ�
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
		System.out.println("˳���ݷ�����");
		
	}

	/* (non-Javadoc)
	 * @see com.qfedu.Day12.HomeWork.ILandTransportation#sendLand()
	 */
	@Override
	public void sendLand() {
		System.out.println("˳���ݷ�½��");
		
	}

}
