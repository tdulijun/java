/**
 * 
 */
package com.qfedu.Day13.System;

/**
 * Description�� System����ʾ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SystemDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class SystemDemo {
	//����д��,����������������ǲ���Ҫ����,��Ϊ����ϵͳ�Զ�����
	//GC������ռ����Զ�����
	@Override
	protected void finalize() throws Throwable {
		System.out.println("���󱻻�����......");
	}
	public static void main(String[] args) {
//		System.out.println("ѭ����ʼ");
//		int i = 0;
//		while(true) {
//			if(i != 100000) {
//				System.out.println(i);
//			}else {
//				/**
//				 * ����ֹͣһ��������ֹͣ   ���ڵ���0����
//				 *        һ�����쳣ֹͣ   ����
//				 * ps:����ֹͣ��Ч����һ��       
//				 * ��JVM��ȥָ������ֹͣ ȡ���ڵ�ǰ��������������Ǹ���
//				 * ����Ҫ������Ҫʹ���������,
//				 */
//				System.exit(-1);
//			}
//			i++;
//			
//		}
//        //System.out.println("ѭ������");
		
		
		new SystemDemo();
		new SystemDemo();
		new SystemDemo();
		
		//��������,ֻ���Ǹ��������ջ���һ����ʾ,�ӿ����
		System.gc();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
