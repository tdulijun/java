package com.qfedu.Day11.InnerClass.StaticInnerClass;
//��̬�ڲ�����ʾ
public class Outter {
     String name = "С��";
     static int age = 20;
     public void display() {
    	 System.out.println("�ⲿ��ĳ�Ա����");
     }
     public static void showInfos() {
    	 System.out.println("�ⲿ��ľ�̬����");
     }
     //��̬�ڲ���
     public static class Inner{
    	 static String name = "С��";
    	 public void show(){
    		 //�����ⲿ���age����
    		 System.out.println(age);
    		 //���ʾ�̬�ڲ�����������
    		 System.out.println(name);
    		 //�����ⲿ��ĳ�Ա����(����),�ͱ��봴������
    		 System.out.println(new Outter().name);
             showInfos();		 
    	 }
    	 
     }
     public static void main(String[] args) {
		Outter.Inner inner = new Outter.Inner();
		inner.show();
		//��̬�ڲ������������п���ͨ��,����ͨ���ⲿ������.�ڲ�������
		System.out.println(Outter.Inner.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    	 
    	 
	}
}
