/**
 * 
 */
package com.qfedu.Day14.HomeWork.Xiaoming;

/**
 * Description：扑克 描述<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Poker.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Poker {
	   private String color; //牌的花色
	   private String num ;// 牌的点数
	   //构造方法时可以重载的
	   //无参构造方法
	   public Poker() {
		   //super();//必须在第一行
		   //this("1","2");//必须在第一行
		 
	   }
	   //有参构造方法
	   public Poker(String color ,String num) {
		    this.color = color ;
		    this.num = num;
	   }
	  
	   //getter是获取属性 -->一定有返回值,但是没有参数
	   public String getColor() {
		     return color;
		     
	   }
	   //Setter是给属性赋值 -->一定没有返回值,但是一定有参数
	   public void setColor(String color) {
		   this.color = color;
	   }
	   
	   //getter是获取属性 -->一定有返回值,但是没有参数
	   public String getNum() {
		     return num; // --> return this.num;
		     
	   }
	   //Setter是给属性赋值 -->一定没有返回值,但是一定有参数
	   public void setNum(String num) {
		   this.num = num;
	   }
//	   public void  show() {
//		   //this可以当做参数传递
//		   System.out.println(this);
//	   }
//	   
	   
	   //static优先级是高于对象static已经产生了但是对象还没有
//	   public static void show() {
//		   System.out.println(this.num);
//	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
      
}
