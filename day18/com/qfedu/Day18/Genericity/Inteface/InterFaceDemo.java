/**
 * 
 */
package com.qfedu.Day18.Genericity.Inteface;

/**
 * Description�� ���巺�ͽӿ�<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:InterFaceDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
//���������Ƶ�ʹ�÷�ʽ
public interface InterFaceDemo<T> {
	//1.8֮ǰ
	String NAME = "1";  //public static final 
	//���󷽷� ȫ�־�̬����
	void show(T t); // public abstract
	//1.8֮��
	//����ʵ�ַ���
	//default ����   static ���� --> ���ǹ���public
	//default������д static ���� 
	//default����ͨ���ӿڶ������ static�ӿ�������

}
