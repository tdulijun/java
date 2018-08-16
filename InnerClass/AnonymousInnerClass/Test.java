package com.qfedu.Day11.InnerClass.AnonymousInnerClass;

public class Test {

	public static void main(String[] args) {
		//匿名内部类是不是只使用一次,一般提供给接口
		//匿名内部类是局部内部类的一种特例
		ISmoking i = new ISmoking() {
			
			@Override
			public void smoke(String name) {
			   System.out.println("抽的是"+name+"烟");
				
			}
		};
		i.smoke("芙蓉王");
		
		new ISmoking() {
			
			@Override
			public void smoke(String name) {
				 System.out.println("抽的是"+name+"烟");
				
			}
		}.smoke("白沙");
		
		

	}

}
