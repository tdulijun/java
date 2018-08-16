package com.qfedu.Day11.DesignMode.SimpleFactory;
//女人
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
		System.out.println("吃东西");
		
	}

	@Override
	public void sleep() {
		System.out.println("睡觉");
		
	}

	@Override
	public void speak() {
		System.out.println("10000句话");
		
	}
	
	public void Keeping() {
		System.out.println("做家务");
	}
     
}
