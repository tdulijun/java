/**
 * 
 */
package com.qfedu.Day18.Genericity.Class;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Point.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 * Point����Խ���String,double,float,int,long ��Ϊ��������������
 */
public class Point<T> {//������ -->���ж���ķ��Ϳ�����������ʹ�� -->ͨ����
	//��û�и�ArrayListָ������ʱ,���Խ����κ���������
	//��ʱ������ArrayList�ϵ�<E> �൱��ʲô --> Object
	//������Ϊ���Ե��������Ͷ����� ,��ǰ���������ǲ���ȷ���� ֻ��ʹ����һ����ĸT��Ϊռλʹ��
	private T x;
	private T y;
	public Point() {
		
	}
	public Point(T x, T y) {//���з���������Ϊ��������
		this.x = x;
		this.y = y;
		
	}
	
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	public void show(T z) {
		System.out.println(z);
	}
	

}
