package com.qfedu.Day11.DesignMode.SimpleFactory;
//Ů��
public  class Woman extends Person {

	public Woman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Woman(String name, int age, char gender, int height, int weight) {
		super(name, age, gender, height, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("�Զ���");
		
	}

	@Override
	public void sleep() {
		System.out.println("˯��");
		
	}

	@Override
	public void speak() {
		System.out.println("10000�仰");
		
	}
	
	public void Keeping() {
		System.out.println("������");
	}
     
}
