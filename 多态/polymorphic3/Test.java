package com.qfedu.Day11.polymorphic3;
class Fu{
	int num  = 10;
	public void show() {
		System.out.println("����ķ���");
	}
	
}
class Zi extends Fu{
	int num = 20;
	@Override
	public void show() {
		System.out.println("������д�ķ���");
	}
}
public class Test {

	public static void main(String[] args) {
		 
		Fu fu = new Zi();
		System.out.println(fu.num);
		fu.show();
		 

	}

}
