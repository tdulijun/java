package com.qfedu.Day11.InnerClass.AnonymousInnerClass;
//�����ڲ�����ʾ2
public class Outter2 {
  //new һ���ӿ� ---> �����ڲ���ʵ����һ���ӿ�
   private ISmoking instance = new ISmoking() {
	   //�����������ڲ����ж������Ժͷ���,���Ǹ����ò���,��ȫû��������嶼����������
//	   public int age = 30;
//	   public void show() {
//		   System.out.println("�����ڲ������Զ��巽��");
//	   }
	   //�����ڲ����ǲ���ʵ����һ���ӿ�,ֻ�ܵ��ýӿ������ṩ�ķ���
	   @Override
	   public void smoke(String name) {
		   // TODO Auto-generated method stub
		
	   }
   };
   
   public void showInfos() {
//	   instance.age = 20;
//	   instance.show();
	   instance.smoke("С��è");
   }
}
