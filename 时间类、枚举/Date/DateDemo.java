/**
 * 
 */
package com.qfedu.Day14.Date;

import java.util.Date;

/**
 * Description�� Date��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:DateDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����Date����
		Date date = new  Date();
		//ps:�����ڴ��������ʱ��ָ����ǰ�����ĸ�����
		//java.util.Date date1 = new java.util.Date();
		//���Ի�õ�ǰϵͳʱ��Thu Aug 16 11:27:41 CST 2018
		System.out.println(date);
		
		//�вεĹ��췽��-->long -->����ֵ
		//������ֵת��Ϊʱ��
		long time = System.currentTimeMillis();
	    Date date2 = new Date(time);
	    System.out.println(date2);
	    //����ֵ��1970��1��1��00:00:00����date��������ʾ�ĺ�����
	    System.out.println(date.getTime());
	    System.out.println("�й��˵�ʱ����:"+date.toLocaleString());
		
	    
	    
	

	}
	
	
	//��ʱ����д��  ע��
	//@Override --> ������������鵱ǰ�����Ƿ�����д����
	@Deprecated
	public void show() {
		System.out.println("����һ��������ʱ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
