/**
 * 
 */
package com.qfedu.Day14.HomeWork.Playing;

/**
 * Description： 描述奥特曼<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Ultraman.java <br/>
 * 
 * @author 千锋智哥
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
	 
	//1.普通攻击
	public void attack(Monster m) {
		//伤害值
		int injury = (int)(Math.random()*20+10);
		int hp = m.getHp();
		hp -= injury;
		m.setHp(hp);
		//一旦伤害超过血量上限
		setMonsterHp(m);
	}
	
	//2.魔法
	public void MagicAttack(Monster[] ms) {
		for(Monster m : ms) {
			int hp = m.getHp();
			hp -= 30;
			m.setHp(hp);
			setMonsterHp(m);
			
		}
		
	}
	
	
	//3.必杀
	public void HugeAttack(Monster m) {
		//伤害值
		int injury = (int)(m.getHp() * 0.75) > 60 ? (int)(m.getHp()*0.75) : 60;
		int hp = m.getHp();
		hp -= injury;
		m.setHp(hp);
		//一旦伤害超过血量上限
		setMonsterHp(m);
	}
	
	
	//设置小怪兽血量-->让其始终0
   public void  setMonsterHp(Monster m) {
	   if(m.getHp() < 0) {
		   m.setHp(0);
	   }
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
