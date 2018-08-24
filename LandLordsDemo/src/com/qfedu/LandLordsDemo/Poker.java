package com.qfedu.LandLordsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 扑克牌类
 * @author JKMaster
 *
 */
public class Poker {
	  //表示存储的花色和点数
	  private static final String[] color = {"♥","♦","♠","♣"};
	  private static final String[] num = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	  private static final String[] king = {"大🦁","小🐯"};
	  
	  //存储所有的牌
	  private static List<String> list = new ArrayList<>();
	  
	  //存储牌
	  public static void setPoker() {
		  for(int i =0;i<color.length;i++) {//花色
			  for(int j = 0;j<num.length;j++) {//点数
				  list.add(color[i]+num[j]);
				  
			  }
			  if(i<king.length) {
				  list.add(king[i]);
			  }
		  }
	  }
	  
	  //洗牌
	  public static void flushPoker() {
		  Collections.shuffle(list);
	  }
	  
	  
	  //发牌
	  public static void dealPoker(List<String> p1List,List<String> p2List,List<String> p3List,List<String> p4List) {
		  //循环遍历操作集合中的元素下标,操作了集合集合中的元素
		  for(int i  = 0;i<list.size();i++) {
			  if(i<list.size()-3) {
				if (i % 3 == 0) {
					p1List.add(list.get(i));
				} else if (i % 2 == 0) {
					p2List.add(list.get(i));
				} else {
					p3List.add(list.get(i));
				}
			 }else {
				 p4List.add(list.get(i));//最后留给地主的3牌
			 }
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
