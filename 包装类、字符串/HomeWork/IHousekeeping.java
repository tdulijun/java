/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description： 家政接口<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:IHousekeeping.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public interface IHousekeeping {
	 String name = "提莫"; //public static final
	 void xiyifu(); //public abstract
	 void saodi();
	 void maicai();
	 void zuofan();
   //default static Java8之后 default是可以重写 static不行
	 
}
