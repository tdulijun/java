/**
 * 
 */
package com.qfedu.Day14.HomeWork.Xiaoming;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Test {
	public static void main(String[] args) {
	   Poker aPoker = new Poker("����","A");
	   Poker bPoker = new Poker("��Ƭ","K");
	   Hand leftHand = new Hand("����", aPoker);
	   Hand rightHand = new Hand("����",bPoker);
	   Person xiaoming = new Person(leftHand,rightHand);
	   xiaoming.showInfosPoker();
	   System.out.println("----------------------------������--------------------------");
	   xiaoming.swapPokerForHand();
	   xiaoming.showInfosPoker();

	}

}
