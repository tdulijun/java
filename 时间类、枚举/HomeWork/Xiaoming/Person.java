/**
 * 
 */
package com.qfedu.Day14.HomeWork.Xiaoming;

/**
 * Description： 人类描述<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Person.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Person {
	 //一个属性 手 --> 左右手
	 private Hand leftHand;//左手
	 private Hand rightHand;//右手
	 public Person() {
		 
	 }
	 public Person(Hand leftHand ,Hand rightHand) {
		 this.leftHand = leftHand;
		 this.rightHand = rightHand;
	 }
     
	  //交换牌
	 public void swapPokerForHand() {
		//拿到牌(知道牌)
		 Poker leftPoker = leftHand.getPoker();
		 Poker rightPoker = rightHand.getPoker();
		 leftHand.setPoker(rightPoker);
		 rightHand.setPoker(leftPoker);
	 }
	 
	 //展示牌
	 public void showInfosPoker() {
		 //拿到牌(知道牌)
		 Poker leftPoker = leftHand.getPoker();
		 Poker rightPoker = rightHand.getPoker();
		 System.out.println(leftHand.getType()+"拿的牌:"+leftPoker.getColor()+""+leftPoker.getNum());
		 System.out.println(rightHand.getType()+"拿的牌:"+rightPoker.getColor()+""+rightPoker.getNum());
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
