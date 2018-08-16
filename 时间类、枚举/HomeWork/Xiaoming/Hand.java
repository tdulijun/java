/**
 * 
 */
package com.qfedu.Day14.HomeWork.Xiaoming;

/**
 * Description： 手描述类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Hand.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Hand {
	   //若在一个类中要使用另外一个类的属性或方法
      //提供两种方式
	 //1.作为当前类一个属性,可以在整个类中进行访问
	  //2.作为当前类中一个方法的参数而存在,只能在当前方法体内
	  //左右手
	  private String type;
	  //拿的牌
	  private Poker poker;
	  public Hand() {
		  
	  }
	  public Hand(String type,Poker poker) {
		    this.type = type;
		    this.poker = poker;
	  }
	
	  
	 //属性私有化是为了数据安全,但是数据安全后不能对外提供访问,getter和setter
	  //不是必须存在getter和setter 可以只有getter或setter
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
