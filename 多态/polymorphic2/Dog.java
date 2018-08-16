package com.qfedu.Day11.polymorphic2;
//子类
public class Dog extends Animal{
     //特有属性
	 private String kind;

	public Dog() {
		
	}

	public Dog(int age, String name,String kind) {
		super(age, name);
		this.kind = kind;
		
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public void show() {
		System.out.println("----------------Dog子类重写之后----------------");
	}
	 
}
