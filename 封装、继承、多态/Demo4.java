package com.qianfeng.test;
/*
 * �̳��й��췽����ʹ��
 * 
 * 1.��һ��������ֻ��һ���������Ĺ��췽��,ֻ��ʹ�ô�������,����ʹ���޲ε�.�����ʹ��,�����ֶ������޲εĹ��췽��
 * 2.��������ֻ�д������Ĺ��췽��,����Ĺ��췽���оͱ����ڵ�һ���ֶ����ø���������Ĺ��췽��(super(����))
 * 3.�����Ǵ������췽����ʱ��,����Լ���дsuper(),ϵͳ���Զ�����
 * ԭ��:������Ҳ������Ҫ���г�ʼ��,����������Ա������Լ��Ĺ��췽�����г�ʼ��,���Ա������super(),
 * ����ÿ�����췽���ж�Ĭ����һ��super()
 * 
 * ΪʲôҪ��super���ڷ����ĵ�һ��?
 * ��:������Ĺ��췽�����п����õ����������,��������ʹ��֮ǰ�����Ƚ��г�ʼ��,�����޷�ʹ��.
 * 
 * ��֮:�ڼ̳���ϵ��,��Ϊ������õİ취���ǽ��޲ι��췽�����вι��췽����д��.
 */
public class Demo4 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.getName();
	}
}

class Animal{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}
	
}

class Dog extends Animal{
	//�޲ι��췽��
	public Dog() {
		//super();//Ĭ�ϵ��ø�����޲ι��췽��
		//ע��:���д��������ڵ�һ��
		super("��������");//�ֶ����ø����вι��췽��
		
		
	}
	//�вι��췽��
	public Dog(String name) {
		super("��������");
		this.setName(name);
	}
}
