/**
 * 
 */
package com.qfedu.Day18.HomeWork;



/**
 * Description�� �򵥹���(������)<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:AnimalFactory.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 * �������Ĵ���
 */
public class AnimalFactory {
     private AnimalFactory() {}
     public static Animal getAnimal(int tui,String AnimalName) {
    	 switch (AnimalName) {
		case "è":
			return new Cat(tui);
		case "��":
			return new Fish(tui);
		case "���":
			return new QQ(tui);
		default:
			throw new RuntimeException("û�����ֶ���");
		}
    	 
    	 
    	 
     }
}
