/**
 * 
 */
package com.qfedu.Day23.Thread.ProducerAndConsumer2;

/**
 * Description�� ���ݹ���(���ݹ�ͨ��)<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ShareResource.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 2.0
 */
public class ShareResource {
	private String name;
	private String gender;
	//�����ֵ-->���ж���Դ�����Ƿ��ǿ�
	//���ǿյ� true    ��ֵ false
	private static boolean isEmpty  = true;
	/**
	 * ������������Դ�д洢����
	 * @param name   ����
	 * @param gender  �Ա�
	 */
	public void push(String name,String gender) {
		synchronized ("") {
			//isEmpty�ǿյ�--> ��ǰ��������û��������������
			//isEmpty���ǿ� --> ��ǰ�Ѿ���������,�ȴ�
			if(!isEmpty) {
				 try {
					"".wait();//����Ҫ���߳̽���ȴ�״̬,����ͨ��ͬ���������в������е���
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
				"".notify();
	
			
			
		}
	}
	/**
	 * ������������Դ��ȡ������
	 */
	public void pop() {
		//�ӳٲ���
		synchronized ("") {
			//���жϵ�ǰ��������
			if(isEmpty) {
				try {
					"".wait();
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
			"".notify();
			
		}
	}
	}
