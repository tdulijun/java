/**
 * 
 */
package com.qfedu.Day23.ThreadSellTicket.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description�� ��ʾLock��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Sell.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Sell implements Runnable {
    private static int  tickets = 100;
    //����������  ʵ����ReentrantLock  Lock����
    private final Lock lock = new ReentrantLock();
	
	@Override
	public void run() {
		for(int i = 0;i<100;i++) {
			
			//try ... finally -->Ϊ����finally�����
			//ps�����������Ч����һ����
			try {
				lock.lock(); // ���Ƕ�����
					if (tickets > 0) {
						System.out.println("��ǰ��ƱԱ:" + Thread.currentThread().getName() 
								+ "��[" + tickets-- + "]");
					}
			} finally { 
				//�ͷ���Դ
				lock.unlock();
			}
			
			
//			synchronized ("") {//������Ƕ�����
//				
//				System.out.println("��ǰ��ƱԱ:"+Thread.currentThread().getName()
//						+"��["+tickets--+"]");
//			}
			
		}
		
	}

	
	public static void main(String[] args) {
		//��Ҫ����д --> ���ܱ�֤������Ψһ�� Lock����ס
//		Thread td1 = new  Thread(new Sell(),"���»�");
//		Thread td2 = new  Thread(new Sell(),"���»�");
//		Thread td3 = new  Thread(new Sell(),"���»�");
//		Thread td4 = new  Thread(new Sell(),"���»�");
		//ʹ��Lock���뱣֤������Ψһ��,�����Ƽ�ʹ�������з�ʽ
		Sell sell = new Sell();
		Thread td1 = new  Thread(sell,"���»�");
		Thread td2 = new  Thread(sell,"���»�");
		Thread td3 = new  Thread(sell,"���»�");
		Thread td4 = new  Thread(sell,"���»�");
		
		td1.start();
		td2.start();
		td3.start();
		td4.start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
