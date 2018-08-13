package com.qfedu.Day11.polymorphic3;
class Fu{
	int num  = 10;
	public void show() {
		System.out.println("父类的方法");
	}
	
}
class Zi extends Fu{
	int num = 20;
	@Override
	public void show() {
		System.out.println("子类重写的方法");
	}
}
public class Test {

	public static void main(String[] args) {
		 
		Fu fu = new Zi();
		System.out.println(fu.num);
		fu.show();
		 

	}

}
