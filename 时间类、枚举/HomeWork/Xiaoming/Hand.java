/**
 * 
 */
package com.qfedu.Day14.HomeWork.Xiaoming;

/**
 * Description�� ��������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Hand.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Hand {
	   //����һ������Ҫʹ������һ��������Ի򷽷�
      //�ṩ���ַ�ʽ
	 //1.��Ϊ��ǰ��һ������,�������������н��з���
	  //2.��Ϊ��ǰ����һ�������Ĳ���������,ֻ���ڵ�ǰ��������
	  //������
	  private String type;
	  //�õ���
	  private Poker poker;
	  public Hand() {
		  
	  }
	  public Hand(String type,Poker poker) {
		    this.type = type;
		    this.poker = poker;
	  }
	
	  
	 //����˽�л���Ϊ�����ݰ�ȫ,�������ݰ�ȫ���ܶ����ṩ����,getter��setter
	  //���Ǳ������getter��setter ����ֻ��getter��setter
	  public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Poker getPoker() {
			return poker;
		}
		public void setPoker(Poker poker) {
			this.poker = poker;
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	

}
