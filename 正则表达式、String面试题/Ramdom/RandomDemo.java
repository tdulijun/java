/**
 * 
 */
package com.qfedu.Day13.Ramdom;

import java.util.Arrays;
import java.util.Random;

/**
 * Description�������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:RandomDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class RandomDemo {

	public static void main(String[] args) {
		// α���
		Random r1 = new Random(10);
		System.out.println(r1.nextBoolean());//boolean����
		System.out.println(r1.nextDouble());//double����
		System.out.println(r1.nextInt());//int����
		//ȷ����Χ�����
		//���Դ������,���������������ķ�Χ[0,1)-->[0,100) 0~99
		System.out.println(r1.nextInt(100));
		
		System.out.println("----------------------------------------------");
		
		Random r2 = new Random(10);
		System.out.println(r2.nextBoolean());//boolean����
		System.out.println(r2.nextDouble());//double����
		System.out.println(r2.nextInt());//int����
		//ȷ����Χ�����
		//���Դ������,���������������ķ�Χ[0,1)-->[0,100) 0~99
		System.out.println(r2.nextInt(100));
		System.out.println("----------------------------------------------");
		//�������
		//ps:Ĭ�������ǵ�ǰʱ��currentTimeMillis()
		
		Random r3 = new Random();
		int[] array = new int[10];
		for(int i = 0;i<array.length;i++) {
			  array[i] = r3.nextInt(100);
			
		}
		System.out.println(Arrays.toString(array));
		
		//����34-179֮��������
		//nextInt(145)+34;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
