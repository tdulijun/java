/**
 * 
 */
package com.qfedu.Day23.Thread.Single;

/**
 * Description�� ��������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SingleDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class SingleDemo {
	 private static SingleDemo instance;
	 
     private SingleDemo() {
    	 
     }
     /*
      * ��Ϊ�ڶ��̲߳������ʵ�ǰ��������ģʽ�����޷���֤��ǰ�����Ķ�����Ψһ
      * �õ�ǰ���������ִ�д���ͬ������鼴��,��������൱�������
      * �������Ǿ���Ҫ���ٴ����ķ�Χ
      * �ṩһ��������:
      * ˫�ؼ���������
      * �����Ա�֤�̰߳�ȫ,Ҳ���Բ������ܵõ����
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
