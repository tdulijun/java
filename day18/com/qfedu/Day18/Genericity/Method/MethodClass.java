/**
 * 
 */
package com.qfedu.Day18.Genericity.Method;

/**
 * Description�� ���ͷ���<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:MethodClass.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class MethodClass<T> {
	//��ǰ����ʹ�÷������;ͺ�����һ�µ���
    public void show(T t) {
    	
    }
    //��������ķ��Ͳ����پ�̬������ʹ��,�ṩ�Լ��ķ��ͷ���
//    public static void  display(T t) {
//    	System.out.println(t);
//    }
    //���ͷ����Ķ���
    //ʲôʱ����ȷ��������͵���������-->���÷���ʱ���ݲ���,�ͻ���������ķ��͵�������������
    public<E> void dispaly(E e) {
    	System.out.println(e);
    }
    
    public static<K> void showInfos(K k) {
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
