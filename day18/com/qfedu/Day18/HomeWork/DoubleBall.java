/**
 * 
 */
package com.qfedu.Day18.HomeWork;

import java.util.Random;
import java.util.TreeSet;

/**
 * Description�� ˫ɫ��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:DoubleBall.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class DoubleBall {
	public static void main(String[] args) {
		 redBall();

	}
	/**
	 * ����
	 */
	public static void  redBall() {
		TreeSet set = new TreeSet();
		//����һ��������Ķ���
		Random random = new  Random();
		//TreeSet�д���6�� --> �ɶ�û���ظ� ��ӡ�Ľ��--> �������
		while(true) {
			if(set.size() != 6) {
				 set.add(random.nextInt(31)+1);
			}else {
				break;
			}
			
		}
		System.out.println(set);
		
		
		
	}

}
