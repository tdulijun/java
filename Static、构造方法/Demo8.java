package com.qianfeng.test;
/*
 * ��̬������:������ļ��ض�����,������������ִֻ��һ��.ִ��˳��������main()
 * ����: static+{����}
 * ����:�ʺ�������ĳ�ʼ��
 * ���������:���Ŷ���ļ��ض�����,ÿ�δ������󶼻�ִ��һ��.ִ��˳�������ڹ��췽��
 * ����:{����}
 * ����:�ʺ����ڶ���ĳ�ʼ��
 * 
 * �����˳��:��̬������>���������>���췽��
 */
public class Demo8 {
	static{//��̬������
		System.out.print("a");
	}
	public static void main(String[] args) {
          Pig pig = new Pig();
          Pig pig1 = new Pig();
          pig.play();
	}
	static{//��̬������
		System.out.print("d");
	}
}
class Pig{
	static{//��̬������
		System.out.print("f");
	}
	public Pig() {
		System.out.print("b");
	}
	{//���������
		System.out.print("c");
	}
	public  void  play() {
		System.out.print("e");
	}
}
