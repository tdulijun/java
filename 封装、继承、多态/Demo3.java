package com.qianfeng.test;
/*
 * �̳�:��������A����B��,��������֮��������ӵĹ�ϵ,�ͽм̳�
 * 
 * B�̳���A     B extends A
 * 
 * ��д:���������븸��ͬ��(������,����,����ֵ�ȶ�Ҫ��ͬ)�ķ���.
 * ע���:�൱�������ͬ������������ĸ�����,������ȥ���ø��෽��.
 * 
 * ����:�ڲ��ı丸�����ֵ�ǰ����,�ڸ���ԭ�й��ܵĻ���֮��,ʵ��һЩ�����Լ��Ĺ���.ʵ�ֶ�ԭ�й��ܵ�����.
 * 
 * this:��һ��������������,������ǵ�ǰ����ĵ�ַ,����ǰ�Ķ���
 * super:��һ���ؼ���,���ǲ���������������.����ͨ��super���ø���ĳ�Ա
 * 
 * ע������:
 * 1.˽�з������ܱ���д
 * 2.�����ͬ��������Ȩ��Ҫ���ڵ��ڸ����ͬ������
 * 3.��̬�ķ���ֻ�ܸ��Ǿ�̬�ķ���
 */
public class Demo3 {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.color = "��ɫ";//���ø��������
		iphone.fangShui();//�����Լ��ķ���
		//������ø���ķ���ԭ��:�����������ҵ���ǰ���������,�ڵ�ǰ�Ķ����������������,�ҵ���,ֱ�ӵ���.�Ҳ���,��ȥ��������
		//����ִ��,ֱ���ҵ�Object,�������û��,˵��ȷ��û���������,����.
		iphone.callPhone();//���ø���ķ���
	}
}
//ע��:���ʲô����д,Ĭ�ϸ�����Object
class Phone{
	String color;
	int model;
	
	public void callPhone(){
		System.out.println("��绰");
	}
	
	public static void play(){
		
	}
}

//�������� Iphone �̳��� Phone
class Iphone extends Phone{
//	String color;
//	int model;
	String gui;
	
	public void callPhone(){
		//this.callPhone();//���õı������callPhone����--��ѭ��
		super.callPhone();//ֱ�ӵ��õĸ���ķ���
		
		System.out.println("ִ���Լ��Ĺ���");
	}
	
	public void fangShui(){
		
		System.out.println("��ˮ");
	}
	
	//��̬�ķ���ֻ�ܸ��Ǿ�̬��
	public static void play() {

	}
}

class HuaWei extends Phone{
//	String color;
//	int model;
	
//	public void callPhone(){
//		System.out.println("��绰");
//	}
//	
	public void Niu(){
		System.out.println("ţ");
	}
}
