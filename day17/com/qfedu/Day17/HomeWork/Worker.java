/**
 * 
 */
package com.qfedu.Day17.HomeWork;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Work.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Worker {
	//�Ե�ǰ���������  --> ���������
	//������� --> �����洢�����������Ϣ
	//���� ���� ���ʣ� ��Ϊ void work()
	//���Ե�:�����Ա����
	private String name;
	private int age;
	private int money;

	//���췽��ʱ����˽�л� --> ���� 
	//                  --> �򵥹���  ������
	
	//���췽�� --> �޲�   -->�в� 
	//�ṩ�˳�Ա������ݵĸ�ֵ��ʽ
	public Worker() { //û�в���
		//super(); ���ø���Ĺ��췽��(�޲�)
		//���ﻹ����ʹ��һЩ�������(������) ��������
		//��ʼ������ ,���ϳ�ʼ��
		//����Ա����һЩ��ʼֵ(�̶���)
		
	}
	public Worker(String name,int age,int money) {
		this.name = name;
		this.age = age;
		this.money = money;
		
	}
	
	
	
	//getter��setter���� --> �����ṩ���ʺ��޸Ĳ���
	public String getName() { //��ȡ��ǰ��Ա����
		return name;
	}
	public void setName(String name) {//�޸ĵ�ǰ��Ա����
		this.name = name;      
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	//������Ϊ --> ����
	public void work() {
		System.out.println(name+"�����ڹ����õ�нˮ:"+money);
	}
	
	
	/* 
	 * ��ӡ�Զ���������Ϣ
	 */
	@Override
	public String toString() {
		
		return name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
