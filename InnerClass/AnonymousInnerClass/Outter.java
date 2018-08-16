package com.qfedu.Day11.InnerClass.AnonymousInnerClass;
//演示匿名内部类

public class Outter {
   private int num =  56;
   //引用数据类型
   /*
    * 接口是不能直接创建对象
    * 接口-->是一个特殊的抽象父类
    * 接口是支持多态的特性
    * 接口可以接受一个实现了接口的实现类对象
    */
   private ISmoking instance = new ISmoking() 
   {

	@Override
	public void smoke(String name) {
		// TODO Auto-generated method stub
		
	}
	   
   };
    public void show() {
    	instance.smoke("黄鹤楼1969");
    	
    }
}
