/**
 * 
 */
package com.qfedu.Day18.HomeWork;

/**
 * Description�� ����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Animal.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 * ������ --> Ϊ�˷�ֹ�ⲿ����ֱ�Ӵ����������
 */
public abstract class Animal {
      private int tui;

	public int getTui() {
		return tui;
	}

	public void setTui(int tui) {
		this.tui = tui;
	}

	public Animal(int tui) {
		super();
		this.tui = tui;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
      
}
