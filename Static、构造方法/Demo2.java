package com.qianfeng.test;
//ʵ��:����������: 
//Ҫ��:
//����:Animal   
//����:����-name,����-age,�Ա�-sex,���-height,����-weight    
//��Ϊ:��,˵��,��,���,��
public class Demo2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "�ϻ�";
		animal.run();
	}
}

class Animal{
	String name;
	int age;
	String sex;
	double height;
	double weight;
	
	public void run(){
		System.out.println("�ܲ�");
	}
	public void play(){
		System.out.println("���");
	}
	public void jump(){
		System.out.println("��");
	}
	public void eat() {
		System.out.println("��");
	}
	public void talk(){
		System.out.println("˵��");
	}
}
