/**
 * 
 */
package com.qfedu.Day18.Genericity.Class;

/**
 * Description�� ���Է�����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Test {
	//���ʹ�÷�����
	 public static void main(String[] args) {
		 //���Ƽ�
//		 Point p1 = new Point();
//		 //Ĭ���Ƿ�����,�ڴ�������ʱ��ָ����������Ҳ����ʹ�õ���,��ָ������Object
//		 p1.show(10);
		 //��δ�������
		 Point<String> p1 = new Point<>();
		 p1.setX("1");
		 
		 //T �൱�� Object
		 Point<Integer> p2 = new  Point<>();
		 p2.setX(1);
		 
		 Point<Boolean> p3 = new Point<>();
		 p3.setX(true);
	}

}
