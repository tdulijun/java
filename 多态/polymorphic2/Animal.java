package com.qfedu.Day11.polymorphic2;
//父类 动物
public abstract class Animal {
	//第一需要是英文,alt + shift + a
      private int age;
      private String name;
      
	public Animal() {
			}
	public Animal(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
     //提供一个方法
	public void  show() {
		System.out.println("------------父类的方法------------");
	}
	
	public void display() {
		 System.out.println("-------------父类特有方法----------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
      
}
