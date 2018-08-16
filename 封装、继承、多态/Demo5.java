package com.qianfeng.test;
/*
 * ���ģʽ:ǰ���ܽ�����ľ������ֱ������ʹ��.
 * ���ģʽ����:23��       ���õ�:����,ģ��,����,װ��,������,����
 * �������ģʽ:һ����ֻ������һ������,����һ��ȫ�ֵķ��ʵ�,�ṩ��ȥ�����ʹ��
 * ����:
 * Ҫ��Ƶ�����:
 * 1.�û�ֻ����һ������
 * 2.����ȫ�ֵķ��ʵ�?  �õ��Ķ������ȫ�ֵķ��ʵ�.    ��ô����ȫ��? static
 * 3.�ṩ��ȥ?
 * 4.�����ʹ��?--�����Ĺ���.
 * 
* �����������:1.����ʵ����������֮��Ĵ�ֵ
  * 2.������ȫ�ַ�Χ�ڵ��úܶ�Ĺ���.
 * �ô�:������������������ȫû�й�ϵ��ǰ����,ʵ��ֵ�Ĵ���,�����������,������ھ���
 * 
 * �����,�ھ�����΢����˵:��������������֮��Ĺ�ϵ
 * �ô�:����Ӧ�þ�������ھ���,���������,������߳���Ľ�׳��,���Ӵ���Ŀ���ֲ��,����ʵ��ģ��������
 * 
 * �����������ϸ��ھ�?
 * �ڴ����������ϵ��ʱ��,����֮��Ĺ�ϵԽ���������Խ��,�ھ���Խ��.��֮,��ϵԽ��ɢ�����Խ��,�ھ���Խ��.
 */

//����������
//����ʽ:�ڶ��������ͬʱ��ɳ�ʼ��
class SingleInstance{
	//2.������ڲ�����һ��˽�еĶ���
	//��singleInstance��ɾ�̬��--�൱���ṩȫ�ֵķ��ʵ�
	private static SingleInstance singleInstance = new SingleInstance();
	//1.�����췽��˽�л�
	private SingleInstance() {
	}
	
	//3.ͨ��һ�������ķ����������ṩ��ȥ,����ҷ���
	//������������ɾ�̬��
	public static SingleInstance getInstance(){
		return singleInstance;
	}
	
	//������--�Ǿ�̬�ĳ�Ա
	int num;
}

//����ʽ:ʲôʱ��ʹ��ʲôʱ��ֵ
class SingleInstance1{
	//������ڲ�����һ��˽�еĶ���
	//��singleInstance��ɾ�̬��--�൱���ṩȫ�ֵķ��ʵ�
	private static SingleInstance1 singleInstance = null;
	//�����췽��˽�л�
	private SingleInstance1() {
	}
	
	//ͨ��һ�������ķ����������ṩ��ȥ,����ҷ���
	//������������ɾ�̬��
	public static SingleInstance1 getInstance(){
		if (singleInstance == null) {
			singleInstance = new SingleInstance1();
		}
		return singleInstance;
	}
	
	//������--�Ǿ�̬�ĳ�Ա
}


public class Demo5 {
	public static void main(String[] args) {
		//SingleInstance�Ѿ���˽�л�,������ֱ�ӵ���
//		SingleInstance singleInstance1 = new SingleInstance();
//		SingleInstance singleInstance2 = new SingleInstance();
//		System.out.println(singleInstance1 == singleInstance2);//false
		
		//���û���ȡ��������
//		SingleInstance singleInstance1 = SingleInstance.getInstance();
//		SingleInstance singleInstance2 = SingleInstance.getInstance();
//		System.out.println(singleInstance1 == singleInstance2);//true
		
		//ʵ�ֹ���:��A��Ķ����е�num1��ֵ����B��Ķ��������num2
		
		//��һ�ַ�ʽ:ֱ�Ӹ�ֵ,����һ����ĳ�Ա��������˽�е�,���Բ��Ƽ�
		A a = new A();
		a.num1 = 4;
		
		B b = new B();
		b.num2 = a.num1;
		
		//�ڶ���:ͨ������
		b.test(a);
		
		//�����ַ�ʽ:ͨ������
		a.ceshiDanli1();
		b.ceshiDanli2();
	}
}
class A{
	int num1;
	
	//ͨ��������ֵ
	public void ceshiDanli1(){
		SingleInstance singleInstance = SingleInstance.getInstance();
		singleInstance.num = num1;
	}
}

class B{
	int num2;
	
	//ͨ������
	public void test(A a){
		num2 = a.num1;
	}
	
	//ͨ��������ֵ
	public void ceshiDanli2(){
		SingleInstance singleInstance = SingleInstance.getInstance();
		num2 = singleInstance.num;
	}
}





