package com.qianfeng.test;
//��װ��:(���ݶ����Եķ�װ��˵��):�ѶԳ�Ա�����ķ��ʽ���˽�л�,ͨ��һ�������ķ�����ӵ�ʵ�ַ���.
//�ô�:����˴���İ�ȫ��,�����˴���Ŀɶ��Ժ͸�����.
public class Demo2 {
	public static void main(String[] args) {
		/*
		 * ��ǹ���
		 */
		Gun gun = new Gun();
		//���ǰѳ����г��ֵĲ������߼������ݳ�Ϊ������
		/*
		 * ԭ��:ֱ�ӽ������ݸ�ֵ���˳�Ա����
		 * ���:1.��Ҫ������ֱ�Ӹ�ֵ����Ա����--����Ա����˽�л�
		 * 2.ͨ��������ӵķ�����,�ڷ������ȹ���,�ٸ�ֵ
		 */
		//gun.bulletNumber = -5;
		gun.addBullet(-5);
		gun.shoot();
		/*
		 * ��Ϊ�����е����Զ�Ҫ���и�ֵȡֵ,����ϵͳָ����һ���׵Ĺ淶--get,set
		 * set:--��ֵ�Ĺ���
		 * ����: ���δ�  ����ֵ  ������(�����б�){������
		 * 		return ����ֵ
		 * }
		 * ���δ�:һ����public
		 * ����ֵ:��void
		 * ������:set+��Ա����������,������Ҫ����ĸ��д.
		 * �����б�:ֻ��һ������,���Ҳ��������ͺ��������Ա����һ��
		 * ������:����Ҫreturn    Ҫд�Ĵ�����:this.��Ա����=����������
		 * get:--ȡֵ�Ĺ���
		 * ����: ���δ�  ����ֵ  ������(�����б�){������
		 * 		return ����ֵ
		 * }
		 * ���δ�:һ����public
		 * ����ֵ:�������Ա����һ��
		 * ������:get+��Ա����������,������Ҫ����ĸ��д.
		 * �����б�:����Ҫ����
		 * ������Ĵ���:return  ��Ա����
		 * 
		 * ��ݷ�ʽ:shift+alt+s
		 */
	}
}

class Gun{
	//��private���ε�ֻ���ڵ�ǰ���ڿɼ�
	private int bulletNumber;
	private int age;
	private String name;
	private double weight;
	private double height;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//�ӵ������
	public void addBullet(int bulletNumber){
		//���˵Ĺ���
		if (bulletNumber >=0) {
			this.bulletNumber = bulletNumber;
		}else {
			this.bulletNumber = 0;
		}
	}
	
	public void setBulletNumber(int bulletNumber){
		this.bulletNumber = bulletNumber;
	}
	public int getBulletNumber() {
		return bulletNumber;
	}
	
	//�������
	public void shoot(){
		if (bulletNumber > 0) {
			--bulletNumber;
		}
		System.out.println("ʣ�µ��ӵ�����:"+ bulletNumber);
	}
}