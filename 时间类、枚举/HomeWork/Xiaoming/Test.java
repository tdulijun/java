/**
 * 
 */
package com.qfedu.Day14.HomeWork.Xiaoming;

/**
 * Description£∫ ≤‚ ‘¿‡<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author «ß∑Ê÷«∏Á
 * @version : 1.0
 */
public class Test {
	public static void main(String[] args) {
	   Poker aPoker = new Poker("∫ÏÃ“","A");
	   Poker bPoker = new Poker("∑Ω∆¨","K");
	   Hand leftHand = new Hand("◊Û ÷", aPoker);
	   Hand rightHand = new Hand("”“ ÷",bPoker);
	   Person xiaoming = new Person(leftHand,rightHand);
	   xiaoming.showInfosPoker();
	   System.out.println("----------------------------Ωªªª∫Û--------------------------");
	   xiaoming.swapPokerForHand();
	   xiaoming.showInfosPoker();

	}

}
