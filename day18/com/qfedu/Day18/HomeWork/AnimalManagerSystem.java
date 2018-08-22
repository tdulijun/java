/**
 * 
 */
package com.qfedu.Day18.HomeWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Description： 动物园系统<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:AnimalManagerSystem.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class AnimalManagerSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set set = new HashSet();
		while(true) {
			System.out.println("请输入您要添加的动物:");
			String name = input.next();
			System.out.println("请输入退的个数:");
			int tui = input.nextInt();
			//通过工厂就能的到对象
			try {
			Animal animal = AnimalFactory.getAnimal(tui, name);
			addAnimal(animal);
			set.add(animal);
			System.out.println("谢谢添加");
			break;
			}catch(TUIException | RuntimeException e) {
				System.out.println(e.getMessage());
			}
			
		}

	}
	/**
	 * 就是一个检查动物退是否正确的一个方法
	 * @param a 父类Animal
	 * @throws TUIException 个数不对
	 */
	 public static void addAnimal(Animal a)throws TUIException {
		 if(a instanceof Cat) {
			 Cat c = (Cat)a;
			 if(c.getTui() != 4) {
				 throw new TUIException("这个退不对");
			 }
		 }else if(a instanceof Fish) {
			 Fish f = (Fish)a;
			 if(f.getTui() != 0) {
				 throw new  TUIException("这个鱼是不可能有退的,若有拿来看!!!!");
			 }
		 }else {
			 QQ qq = (QQ)a;
			 if(qq.getTui() != 2) {
				 throw new TUIException("这个退不对");
			 }
		 }
		 System.out.println("添加成功");
	 }
	
	
	
	
	
	
	
	
	
	

}
