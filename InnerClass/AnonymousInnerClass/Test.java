package com.qfedu.Day11.InnerClass.AnonymousInnerClass;

public class Test {

	public static void main(String[] args) {
		//�����ڲ����ǲ���ֻʹ��һ��,һ���ṩ���ӿ�
		//�����ڲ����Ǿֲ��ڲ����һ������
		ISmoking i = new ISmoking() {
			
			@Override
			public void smoke(String name) {
			   System.out.println("�����"+name+"��");
				
			}
		};
		i.smoke("ܽ����");
		
		new ISmoking() {
			
			@Override
			public void smoke(String name) {
				 System.out.println("�����"+name+"��");
				
			}
		}.smoke("��ɳ");
		
		

	}

}
