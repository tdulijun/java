package com.qfedu.Day11.InnerClass.MemberInnerClass;
//成员内部类
public class Outter {
    String name = "小白";
    public void display() {
    	System.out.println("外部类方法");
    	//String name1 = this.new Inner().name;
    	String name1 = new Outter().new Inner().name;
    }
    //成员内部类
    public class Inner{
    	String name = "小黑";
    	public void show() {
    		String name = "小红";
    		//在内部类中的方法访问方法中的变量
    		System.out.println(name);
    		//在内部类中的方法访问同名成员变量使用this关键字
    		System.out.println(this.name);
    		//在内部类中访问外部类的同名属性,外部类类名.this.属性名
    		System.out.println(Outter.this.name);
    		//是可以直接访问外部类中的属性和方法(不是同名)
    		display();
    		
    	}
    	
    }
    public static void main(String[] args) {
		//内部类对象
    	//先创建外部类对象
//    	Outter out  = new Outter();
//    	Outter.Inner inner = out.new Inner();
    	Outter.Inner inner = new Outter().new Inner();
    	inner.show();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
