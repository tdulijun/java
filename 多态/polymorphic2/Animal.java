package com.qfedu.Day11.polymorphic2;
//���� ����
public abstract class Animal {
	//��һ��Ҫ��Ӣ��,alt + shift + a
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
    
     //�ṩһ������
	public void  show() {
		System.out.println("------------����ķ���------------");
	}
	
	public void display() {
		 System.out.println("-------------�������з���----------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
      
}
