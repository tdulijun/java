/**
 * 
 */
package com.qfedu.Day14.HomeWork.Playing;

/**
 * Description�� С����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Monster.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Monster {
	 private String name;
	 private int hp;
	 
	public Monster() {
		
	}
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	//1.��ͨ����
		public void attack(Ultraman u) {
			//�˺�ֵ
			int injury = (int)(Math.random()*15+5);
			int hp = u.getHp();
			hp -= injury;
			u.setHp(hp);
			//һ���˺�����Ѫ������
			setMonsterHp(u);
		}
		
	
		
		//���ð�����Ѫ��-->����ʼ��0
	   public void  setMonsterHp(Ultraman u) {
		   if(u.getHp() < 0) {
			   u.setHp(0);
		   }
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
