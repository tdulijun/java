/**
 * 
 */
package com.qfedu.Day18.HomeWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Description�� ����԰ϵͳ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:AnimalManagerSystem.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class AnimalManagerSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set set = new HashSet();
		while(true) {
			System.out.println("��������Ҫ��ӵĶ���:");
			String name = input.next();
			System.out.println("�������˵ĸ���:");
			int tui = input.nextInt();
			//ͨ���������ܵĵ�����
			try {
			Animal animal = AnimalFactory.getAnimal(tui, name);
			addAnimal(animal);
			set.add(animal);
			System.out.println("лл���");
			break;
			}catch(TUIException | RuntimeException e) {
				System.out.println(e.getMessage());
			}
			
		}

	}
	/**
	 * ����һ����鶯�����Ƿ���ȷ��һ������
	 * @param a ����Animal
	 * @throws TUIException ��������
	 */
	 public static void addAnimal(Animal a)throws TUIException {
		 if(a instanceof Cat) {
			 Cat c = (Cat)a;
			 if(c.getTui() != 4) {
				 throw new TUIException("����˲���");
			 }
		 }else if(a instanceof Fish) {
			 Fish f = (Fish)a;
			 if(f.getTui() != 0) {
				 throw new  TUIException("������ǲ��������˵�,����������!!!!");
			 }
		 }else {
			 QQ qq = (QQ)a;
			 if(qq.getTui() != 2) {
				 throw new TUIException("����˲���");
			 }
		 }
		 System.out.println("��ӳɹ�");
	 }
	
	
	
	
	
	
	
	
	
	

}
