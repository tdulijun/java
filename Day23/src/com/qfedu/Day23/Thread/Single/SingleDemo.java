/**
 * 
 */
package com.qfedu.Day23.Thread.Single;

/**
 * Description： 懒汉单利<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SingleDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class SingleDemo {
	 private static SingleDemo instance;
	 
     private SingleDemo() {
    	 
     }
     /*
      * 因为在多线程并发访问当前懒汉单利模式下是无法保证当前创建的对象是唯一
      * 让当前创建对象的执行代码同步代码块即可,代码块是相当损耗性能
      * 所以我们就需要减少代码块的范围
      * 提供一个检查机制:
      * 双重检查加锁机制
      * 即可以保证线程安全,也可以不让性能得到损耗
      */
     public static SingleDemo getInstance() {
		if (instance == null) {
			synchronized ("") {
				if (instance == null) {
					instance = new SingleDemo();
				}
			}
		}
    	 return instance;
     }
}
