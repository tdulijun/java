/**
 * 
 */
package com.qfedu.Day23.ThreadSellTicket;

/**
 * Description�� ��Ʊ��һ�汾<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Sell.java <br/>
 * ��֤���ж�����ͬһ����Դ
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Sell implements Runnable {
   //ȫ�־־�̬����,�����̶߳�����,ֻҪ�ж�������޸�,���������õ������޸Ĺ����ֵ
	  private  static int tickets = 100; //�̷߳��ʵ��ٽ���Դ
	    
	    /* ��Ʊ���߼�д��run����
		 */
		@Override
		public void run() {
		   for(int i = 0;i<100;i++) {
			     if(tickets > 0) { //��ֹ���ָ�����0
			    	 //�ӳ�ִ�� ˯��
			    	 try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	 
			    	 System.out.println("��ǰ��ƱԱ��:"+Thread.currentThread().getName()
			    			 +"��["+tickets--+"]Ʊ");
			     }
		   }

			
		}
	public static void main(String[] args) {
	     //�������� 
	   Thread td1 = new Thread(new Sell(), "���»�");
	   Thread td2 = new Thread(new Sell(), "������");
	   Thread td3 = new Thread(new Sell(), "��ѧ��");
	   Thread td4 = new Thread(new Sell(), "����¡");
	   
	   td1.start();
	   td2.start();
	   td3.start();
	   td4.start();
	   

	}


	

}
