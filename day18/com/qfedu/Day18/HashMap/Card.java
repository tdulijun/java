/**
 * 
 */
package com.qfedu.Day18.HashMap;

/**
 * Description������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Card.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Card {
    //cardNo�����п��ţ�startDate���������ڣ� money
	private String cardNo;
	private String startDate;
	private String money;
	
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Card(String cardNo, String startDate, String money) {
		super();
		this.cardNo = cardNo;
		this.startDate = startDate;
		this.money = money;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "����:"+cardNo+"��������:"+startDate+"���:"+money;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
