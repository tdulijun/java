/**
 * 
 */
package com.qfedu.Day23.ThreadSellTicket.Synchronized;

/**
 * Description�� ��Ʊ�����汾<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Sell.java <br/>
 * ��֤���ж�����ͬһ����Դ,ͬ���������ͬ��
 * @author ǧ���Ǹ�
 * @version : 3.0
 */
public class Sell2 implements Runnable {
   //ȫ�־־�̬����,�����̶߳�����,ֻҪ�ж�������޸�,���������õ������޸Ĺ����ֵ
	  private  static int tickets = 100; //�̷߳��ʵ��ٽ���Դ
	    
	    /* ��Ʊ���߼�д��run����
		 */
		@Override
		public void run() {
		   for(int i = 0;i<100;i++) {
			   SellTicket();
		   }

			
		}
		
   //��ǰͬ�������𵽵����ú�ͬ�����������һ����,��Ҫע�⵱ǰͬ����������������this		
   public synchronized void SellTicket() {
	   if(tickets > 0) { //��ֹ���ָ�����0

//	    	 try {
//				Thread.sleep(300);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	    	 
	    	 System.out.println("��ǰ��ƱԱ��:"+Thread.currentThread().getName()
	    			 +"��["+tickets--+"]Ʊ");
	     }
   }
		
		
	public static void main(String[] args) {
	     //�������� 
		//ͨ�������ķ�ʽ����Ψһ
		Sell2 sell = new Sell2();
	   Thread td1 = new Thread(sell, "���»�");
	   Thread td2 = new Thread(sell, "������");
	   Thread td3 = new Thread(sell, "��ѧ��");
	   Thread td4 = new Thread(sell, "����¡");
	   
	   td1.start();
	   td2.start();
	   td3.start();
	   td4.start();
	   

	}


	

}
