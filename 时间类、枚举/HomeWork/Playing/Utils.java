/**
 * 
 */
package com.qfedu.Day14.HomeWork.Playing;

/**
 * Description： 工具类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Utils.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Utils {
	//不能被创建对象
	private Utils(){
		
	}
	//所有的方法都必须是static 
	//属性也必须是static
	//选一只或者小怪兽
	public static  Monster selectMonster(Monster[] ms) {
		Monster m; 
		do {
		  int index = (int)(Math.random()*ms.length);
		  m = ms[index];
		}while(m.getHp() == 0);
		return m;
	}
	
	//判断有没有活的小怪兽
	public static boolean aliveMonster(Monster[] ms) {
		 for(Monster m : ms) {
			 if(m.getHp() > 0) {
				 return true;
			 }
		 }
		 return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
