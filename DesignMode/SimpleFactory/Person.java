package com.qfedu.Day11.DesignMode.SimpleFactory;
//»À¿‡
public abstract class Person {
      private String  name;
      private int  age;
      private char gender;
      private int height;
      private int weight;
      
	public Person() {
		
	}

	public Person(String name, int age, char gender, int height, int weight) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public abstract void  eat();
	public abstract void sleep();
	public abstract void speak();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
      
}
