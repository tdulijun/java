/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer;

/**
 * Description�� ���ݹ���(���ݹ�ͨ��)<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ShareResource.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ShareResource {
	private String name;
	private String gender;
	/**
	 * ������������Դ�д洢����
	 * @param name   ����
	 * @param gender  �Ա�
	 */
	public void push(String name,String gender) {
		this.name = name;
		//�ӳٲ���
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.gender = gender;
	}
	/**
	 * ������������Դ��ȡ������
	 */
	public void pop() {
		//�ӳٲ���
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "-" + gender);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
