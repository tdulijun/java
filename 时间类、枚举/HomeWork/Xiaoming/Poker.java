/**
 * 
 */
package com.qfedu.Day14.HomeWork.Xiaoming;

/**
 * Description���˿� ����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Poker.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Poker {
	   private String color; //�ƵĻ�ɫ
	   private String num ;// �Ƶĵ���
	   //���췽��ʱ�������ص�
	   //�޲ι��췽��
	   public Poker() {
		   //super();//�����ڵ�һ��
		   //this("1","2");//�����ڵ�һ��
		 
	   }
	   //�вι��췽��
	   public Poker(String color ,String num) {
		    this.color = color ;
		    this.num = num;
	   }
	  
	   //getter�ǻ�ȡ���� -->һ���з���ֵ,����û�в���
	   public String getColor() {
		     return color;
		     
	   }
	   //Setter�Ǹ����Ը�ֵ -->һ��û�з���ֵ,����һ���в���
	   public void setColor(String color) {
		   this.color = color;
	   }
	   
	   //getter�ǻ�ȡ���� -->һ���з���ֵ,����û�в���
	   public String getNum() {
		     return num; // --> return this.num;
		     
	   }
	   //Setter�Ǹ����Ը�ֵ -->һ��û�з���ֵ,����һ���в���
	   public void setNum(String num) {
		   this.num = num;
	   }
//	   public void  show() {
//		   //this���Ե�����������
//		   System.out.println(this);
//	   }
//	   
	   
	   //static���ȼ��Ǹ��ڶ���static�Ѿ������˵��Ƕ���û��
//	   public static void show() {
//		   System.out.println(this.num);
//	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
      
}
