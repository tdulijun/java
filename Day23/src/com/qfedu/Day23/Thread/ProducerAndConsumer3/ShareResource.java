/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description�� ���ݹ���(���ݹ�ͨ��)<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ShareResource.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 3.0
 */
public class ShareResource {
	private String name;
	private String gender;
	//�����ֵ-->���ж���Դ�����Ƿ��ǿ�
	//���ǿյ� true    ��ֵ false
	private static boolean isEmpty  = true;
	//����������
	private final Lock lock = new ReentrantLock();
	//ȫ�µĵȴ��ͻ���
	private Condition condition = lock.newCondition();
	
	/**
	 * ������������Դ�д洢����
	 * @param name   ����
	 * @param gender  �Ա�
	 */
	public void push(String name,String gender)  {
		lock.lock(); //����
			//isEmpty�ǿյ�--> ��ǰ��������û��������������
			//isEmpty���ǿ� --> ��ǰ�Ѿ���������,�ȴ�
			if(!isEmpty) {
				 try {
				 condition.await();//����Ҫ���߳̽���ȴ�״̬,����ͨ��ͬ���������в������е���
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//��������
				this.name = name;
			// �ӳٲ���
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.gender = gender;
		   //��Ҫ�޸Ķ�Ӧ�Ĺ���ֵ
				isEmpty = false;
				//������
				//���ǵ�һ��ִ��,�ջ���,�������κ�Ӱ��
				condition.signal();
	     lock.unlock();
			
			
		
	}
	/**
	 * ������������Դ��ȡ������
	 */
	public void pop() {
		//�ӳٲ���
		lock.lock();
			//���жϵ�ǰ��������
			if(isEmpty) {
				try {
					condition.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//����
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "-" + gender);
			//�޸ĵ�ǰ��ʶ
			isEmpty = true;
			condition.signal();
		 lock.unlock();	
			
		
	}
	
	

}
