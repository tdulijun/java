package com.qfedu.Day11.polymorphic2;
//����
public class Dog extends Animal{
     //��������
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
		System.out.println("----------------Dog������д֮��----------------");
	}
	 
}
