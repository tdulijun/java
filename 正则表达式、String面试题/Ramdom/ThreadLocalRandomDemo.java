/**
 * 
 */
package com.qfedu.Day13.Ramdom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Description�� ThreadLocalRandom��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThreadLocalRandomDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		//��������
		ThreadLocalRandom r = ThreadLocalRandom.current();
		int num1 = r.nextInt(100);
		//ֱ��ȷ����Χ ��һ�������ǲ����Ŀ�ʼ  �ڶ��������ǽ���
		int num2 = r.nextInt(34,179);

	}

}
