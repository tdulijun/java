/**
 * 
 */
package com.qfedu.Day14.HomeWork.Playing;

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
		//����������
		Ultraman u = new Ultraman("B��",500);
		//������������
		String[] names = {"miss","��Ī","С��","2��"};
        Monster[] monsters = new Monster[4];
        for(int i = 0 ;i<monsters.length;i++) {
        	Monster m = new Monster(names[i], 220);
        	monsters[i] = m;
        }
        //�غ���:
        int round = 1;
        do {
        	System.out.println("===============��"+round+"�غ�================");
        	int p = (int)(Math.random()*10);
        	//0-5 --> 6����
        	//�����������߼�
           if(p<6) {
        	   Monster m = Utils.selectMonster(monsters);
        	   u.attack(m);
        	   System.out.println(u.getName()+"������ʹ������ͨ����,������:"+m.getName());
           }else if(p<9) {
        	   u.MagicAttack(monsters);
        	   System.out.println(u.getName()+"ʹ����ħ������");
           }else {
        	   Monster m = Utils.selectMonster(monsters);
        	   u.HugeAttack(m);
        	   System.out.println(u.getName()+"������ʹ���˱�ɱ������:"+m.getName()); 
           }
        	//С���޹���
           for(Monster m :monsters) {
        	   if(m.getHp() > 0) {
        		   m.attack(u);
        	   }
           }
         System.out.println("С���޹����˰�����");
         System.out.println(u.getName()+"������ֵ��:"+u.getHp());
         for(Monster m :monsters) {
        	 System.out.println(m.getName()+"������ֵ��:"+m.getHp());
         }
        round += 1;	
        	
        	
        }while(u.getHp() > 0 && Utils.aliveMonster(monsters));
        
        
        if(u.getHp() > 0) {
        	System.out.println(u.getName()+"������ʤ��!!!!!!!");
        }else {
        	System.out.println("С����ʤ��!!!!!1");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

	}

}
