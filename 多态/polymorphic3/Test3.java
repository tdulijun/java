package com.qfedu.Day11.polymorphic3;
//��  ��̬ --> ��ʼ --> ����
class  SuperClass{
	
	static {
		System.out.println("����ľ�̬�����");
	}
	
	{
		System.out.println("����ĳ�ʼ�������");
	}
	
	public SuperClass() {
		System.out.println("������޲ι��췽��");
	}
	
}

class SubClass extends SuperClass{
	static {
		System.out.println("����ľ�̬�����");
	}
	
	{
		System.out.println("����ĳ�ʼ�������");
	}
	
	public SubClass() {
		System.out.println("������޲ι��췽��");
	}
}


public class Test3 {
 
	
	 public static void main(String[] args) {
		  new SubClass();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
