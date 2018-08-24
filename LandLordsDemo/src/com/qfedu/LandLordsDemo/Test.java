package com.qfedu.LandLordsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * ������
 * @author JKMaster
 *
 */
public class Test {
     public static void main(String[] args) throws InterruptedException {
		System.out.println("------------------------------------JJ斗地主----------------------------------------");
		System.out.println("正在洗牌.....");
		Poker.setPoker();
		Poker.flushPoker();
		Thread.sleep(1000); //让当前线程睡眠,卡顿效果 毫秒单位
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个玩家的姓名:");
		String name1 = input.next();
		String name2 = input.next();
		String name3 = input.next();
		
		//存储3个玩家手里的扑克牌
		List<String> p1List = new ArrayList<>();
		List<String> p2List = new ArrayList<>();
		List<String> p3List = new ArrayList<>();
		//存储剩余的3张牌
		List<String> p4List = new ArrayList<>();
		
		System.out.println("进入发牌阶段......");
        Poker.dealPoker(p1List, p2List, p3List, p4List);
        Thread.sleep(1000); //������� --> ���ٵ�Ч��
		
        //玩家手里牌进行排序
        Collections.sort(p1List,new Relu());
        Collections.sort(p2List,new Relu());
        Collections.sort(p3List,new Relu());
        
        //将牌设置给玩家
        Player  p1 = new Player(name1);
        Player  p2 = new Player(name2);
        Player  p3 = new Player(name3);
        p1.setPokers(p1List);
        p2.setPokers(p2List);
        p3.setPokers(p3List);
        
        System.out.println("展示玩家的手牌:");
        p1.showInfosPoker();
        p2.showInfosPoker();
        p3.showInfosPoker();
        
        System.out.println("请输入要叫地主玩家的姓名:");
        String name4 = input.next();
        System.out.println("底牌是:"+p4List);
        if(p1.getName().equals(name4)) {
        	p1List.addAll(p4List);
        	Collections.sort(p1List,new Relu());
        }else if(p2.getName().equals(name4)) {
        	p2List.addAll(p4List);
        	Collections.sort(p1List,new Relu());
        }else {
        	p3List.addAll(p4List);
        	Collections.sort(p1List,new Relu());
        }
        
        
        System.out.println("展示玩家的手牌:");
        p1.showInfosPoker();
        p2.showInfosPoker();
        p3.showInfosPoker();
 
    	 
	}
}
