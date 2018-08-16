/**
 * 
 */
package com.qfedu.Day14.HomeWork.Playing;

/**
 * Description： 测试类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test {
	public static void main(String[] args) {
		//创建奥特曼
		Ultraman u = new Ultraman("B哥",500);
		//创建名字数组
		String[] names = {"miss","提莫","小苍","2兔"};
        Monster[] monsters = new Monster[4];
        for(int i = 0 ;i<monsters.length;i++) {
        	Monster m = new Monster(names[i], 220);
        	monsters[i] = m;
        }
        //回合数:
        int round = 1;
        do {
        	System.out.println("===============第"+round+"回合================");
        	int p = (int)(Math.random()*10);
        	//0-5 --> 6个数
        	//奥特曼攻击逻辑
           if(p<6) {
        	   Monster m = Utils.selectMonster(monsters);
        	   u.attack(m);
        	   System.out.println(u.getName()+"奥特曼使用了普通攻击,攻击了:"+m.getName());
           }else if(p<9) {
        	   u.MagicAttack(monsters);
        	   System.out.println(u.getName()+"使用了魔法攻击");
           }else {
        	   Monster m = Utils.selectMonster(monsters);
        	   u.HugeAttack(m);
        	   System.out.println(u.getName()+"奥特曼使用了必杀攻击了:"+m.getName()); 
           }
        	//小怪兽攻击
           for(Monster m :monsters) {
        	   if(m.getHp() > 0) {
        		   m.attack(u);
        	   }
           }
         System.out.println("小怪兽攻击了奥特曼");
         System.out.println(u.getName()+"的生命值是:"+u.getHp());
         for(Monster m :monsters) {
        	 System.out.println(m.getName()+"的生命值是:"+m.getHp());
         }
        round += 1;	
        	
        	
        }while(u.getHp() > 0 && Utils.aliveMonster(monsters));
        
        
        if(u.getHp() > 0) {
        	System.out.println(u.getName()+"奥特曼胜利!!!!!!!");
        }else {
        	System.out.println("小怪兽胜利!!!!!1");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

	}

}
