/**
 * 
 */
package com.qfedu.Day14.HomeWork.Playing;

/**
 * Description�� ����������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Ultraman.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Ultraman {
	 private String name;
	 private int hp;
	 
	public Ultraman() {
		
	}
	public Ultraman(String name, int hp) {
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
	public void attack(Monster m) {
		//�˺�ֵ
		int injury = (int)(Math.random()*20+10);
		int hp = m.getHp();
		hp -= injury;
		m.setHp(hp);
		//һ���˺�����Ѫ������
		setMonsterHp(m);
	}
	
	//2.ħ��
	public void MagicAttack(Monster[] ms) {
		for(Monster m : ms) {
			int hp = m.getHp();
			hp -= 30;
			m.setHp(hp);
			setMonsterHp(m);
			
		}
		
	}
	
	
	//3.��ɱ
	public void HugeAttack(Monster m) {
		//�˺�ֵ
		int injury = (int)(m.getHp() * 0.75) > 60 ? (int)(m.getHp()*0.75) : 60;
		int hp = m.getHp();
		hp -= injury;
		m.setHp(hp);
		//һ���˺�����Ѫ������
		setMonsterHp(m);
	}
	
	
	//����С����Ѫ��-->����ʼ��0
   public void  setMonsterHp(Monster m) {
	   if(m.getHp() < 0) {
		   m.setHp(0);
	   }
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
