package com.qianfeng.test;

public class Demo6 {
	/*
	 * ��������:û�����ֵĶ���
	 * ����:�򻯴���
	 */
	public static void main(String[] args) {
		 new Dog();//��������
		 
		 //���÷���
		 //ʹ�ó���:��Ϊ��������
		 //Dog dog = new Dog();
		 feedDog(new Dog());
		 
		 new Dog().age = 4;
		 new Dog().name = "bingbing";
		 System.out.println(new Dog().age+"   "+new Dog().name);
	}
	
	public static void feedDog(Dog dog){//dog = new Dog()
		dog.age = 3;
	}
}

class Dog{
	String name;
	int age;
}
