/**
 * 
 */
package com.qfedu.Day14.HomeWork.Xiaoming;

/**
 * Description�� ��������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Person.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Person {
	 //һ������ �� --> ������
	 private Hand leftHand;//����
	 private Hand rightHand;//����
	 public Person() {
		 
	 }
	 public Person(Hand leftHand ,Hand rightHand) {
		 this.leftHand = leftHand;
		 this.rightHand = rightHand;
	 }
     
	  //������
	 public void swapPokerForHand() {
		//�õ���(֪����)
		 Poker leftPoker = leftHand.getPoker();
		 Poker rightPoker = rightHand.getPoker();
		 leftHand.setPoker(rightPoker);
		 rightHand.setPoker(leftPoker);
	 }
	 
	 //չʾ��
	 public void showInfosPoker() {
		 //�õ���(֪����)
		 Poker leftPoker = leftHand.getPoker();
		 Poker rightPoker = rightHand.getPoker();
		 System.out.println(leftHand.getType()+"�õ���:"+leftPoker.getColor()+""+leftPoker.getNum());
		 System.out.println(rightHand.getType()+"�õ���:"+rightPoker.getColor()+""+rightPoker.getNum());
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
