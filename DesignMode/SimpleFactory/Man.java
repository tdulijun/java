package com.qfedu.Day11.DesignMode.SimpleFactory;
//男人
public class Man  extends Person{

	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Man(String name, int age, char gender, int height, int weight) {
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
		System.out.println("7000局话");
		
	}
	
	public void play() {
		System.out.println("玩");
	}

	     
}
