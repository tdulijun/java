/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description�� ��ͨ���<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:STCompany.java <br/>
 * 
 * @author ǧ���Ǹ�
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
		System.out.println("��ͨ��ݷ�����");
		
	}

}
