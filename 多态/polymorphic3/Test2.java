package com.qfedu.Day11.polymorphic3;
class  A{
	public static void show() {
		System.out.println("����ľ�̬����");
	}
	
}
class B extends A{
	/*
	 * ��̬�����ǲ�����д��,����
	 * �������ṩͬ����̬����ʱ,���ظ����ͬ������,ʹ�������ͬ������
	 */
	public static void show() {
		System.out.println("����ľ�̬����");
	}
	
	
}


public class Test2 {
	
    public static void main(String[] args) {
		B b = new B();
		b.show();
	}
}
