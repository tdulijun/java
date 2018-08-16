package com.qfedu.Day11.InnerClass.StaticInnerClass;
//静态内部类演示
public class Outter {
     String name = "小白";
     static int age = 20;
     public void display() {
    	 System.out.println("外部类的成员方法");
     }
     public static void showInfos() {
    	 System.out.println("外部类的静态方法");
     }
     //静态内部类
     public static class Inner{
    	 static String name = "小黑";
    	 public void show(){
    		 //访问外部类的age属性
    		 System.out.println(age);
    		 //访问静态内部类中是属性
    		 System.out.println(name);
    		 //访问外部类的成员属性(方法),就必须创建对象
    		 System.out.println(new Outter().name);
             showInfos();		 
    	 }
    	 
     }
     public static void main(String[] args) {
		Outter.Inner inner = new Outter.Inner();
		inner.show();
		//静态内部类在其他类中可以通过,可以通过外部类类名.内部类类名
		System.out.println(Outter.Inner.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    	 
    	 
	}
}
