/**
 * 
 */
package com.qfedu.Day23.Thread.Single;

import java.util.*;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */  
public class Test {
	  //�ڲ������д���һ�����϶���洢����
	  private Set<SingleDemo> sets = new HashSet<>();
	
	   //����һ����Ա�ڲ���
	  class MyThread extends Thread{
		 
		@Override
		public void run() {
			for(int i = 1;i<=20;i++) {
				//��ǰ���������20�ζ���
				sets.add(SingleDemo.getInstance());
			}
			System.out.println("��ӡ�����и��Ķ���:");
			for(SingleDemo sd : sets) {
				System.out.println(sd);
			}
			
			
		}
	  }
	
	    public static void main(String[] args) {
		    Test outter = new Test();
		    outter.new MyThread().start();
		    outter.new MyThread().start();
		}
	
	
	
	
	
	

}
