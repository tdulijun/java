/**
 * 
 */
package com.qfedu.Day14.HomeWork.Playing;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Utils.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Utils {
	//���ܱ���������
	private Utils(){
		
	}
	//���еķ�����������static 
	//����Ҳ������static
	//ѡһֻ����С����
	public static  Monster selectMonster(Monster[] ms) {
		Monster m; 
		do {
		  int index = (int)(Math.random()*ms.length);
		  m = ms[index];
		}while(m.getHp() == 0);
		return m;
	}
	
	//�ж���û�л��С����
	public static boolean aliveMonster(Monster[] ms) {
		 for(Monster m : ms) {
			 if(m.getHp() > 0) {
				 return true;
			 }
		 }
		 return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
