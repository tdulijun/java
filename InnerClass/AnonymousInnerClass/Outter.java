package com.qfedu.Day11.InnerClass.AnonymousInnerClass;
//��ʾ�����ڲ���

public class Outter {
   private int num =  56;
   //������������
   /*
    * �ӿ��ǲ���ֱ�Ӵ�������
    * �ӿ�-->��һ������ĳ�����
    * �ӿ���֧�ֶ�̬������
    * �ӿڿ��Խ���һ��ʵ���˽ӿڵ�ʵ�������
    */
   private ISmoking instance = new ISmoking() 
   {

	@Override
	public void smoke(String name) {
		// TODO Auto-generated method stub
		
	}
	   
   };
    public void show() {
    	instance.smoke("�ƺ�¥1969");
    	
    }
}
