package com.qianfeng.test;
//实例:创建动物类: 
//要求:
//名字:Animal   
//属性:名字-name,年龄-age,性别-sex,身高-height,体重-weight    
//行为:跑,说话,跳,玩儿,吃
public class Demo2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "老虎";
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
		System.out.println("跑步");
	}
	public void play(){
		System.out.println("玩儿");
	}
	public void jump(){
		System.out.println("跳");
	}
	public void eat() {
		System.out.println("吃");
	}
	public void talk(){
		System.out.println("说话");
	}
}
