/**
 * 
 */
package com.qfedu.Day18.Genericity.Method;

/**
 * Description： 泛型方法<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:MethodClass.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class MethodClass<T> {
	//当前方法使用泛型类型就和类是一致的了
    public void show(T t) {
    	
    }
    //类所定义的泛型不能再静态方法中使用,提供自己的泛型方法
//    public static void  display(T t) {
//    	System.out.println(t);
//    }
    //泛型方法的定义
    //什么时候能确定这个泛型的数据类型-->调用方法时传递参数,就会决定方法的泛型的数据数据类型
    public<E> void dispaly(E e) {
    	System.out.println(e);
    }
    
    public static<K> void showInfos(K k) {
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
