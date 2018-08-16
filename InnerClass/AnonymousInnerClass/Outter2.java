package com.qfedu.Day11.InnerClass.AnonymousInnerClass;
//匿名内部类演示2
public class Outter2 {
  //new 一个接口 ---> 匿名内部类实现了一个接口
   private ISmoking instance = new ISmoking() {
	   //可以在匿名内部类中定义属性和方法,但是根本用不了,完全没有这个定义都是垃圾代码
//	   public int age = 30;
//	   public void show() {
//		   System.out.println("匿名内部类中自定义方法");
//	   }
	   //匿名内部类是不是实现了一个接口,只能调用接口中所提供的方法
	   @Override
	   public void smoke(String name) {
		   // TODO Auto-generated method stub
		
	   }
   };
   
   public void showInfos() {
//	   instance.age = 20;
//	   instance.show();
	   instance.smoke("小熊猫");
   }
}
