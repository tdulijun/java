package com.qfedu.Day11.polymorphic;

public class Boss {
    private String name;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		  //����Boss
		Boss boss = new Boss();
		boss.setName("С��");
		Manager m = new Manager(1000,500);
		Salesman smn = new Salesman(800,2000);
		Satff sa = new Satff(10000,9000);
		//Ա������100��-->����Ա�������Լ���нˮ
		System.out.println("---------------���ս���:-------------");
//	     showInfosMananger(m);
//	     showInfosSalesman(smn);
//	     showInfosSatff(sa);
		  showInfosEmployee(m);
		  //showInfosEmployee(smn);
	
	}
	//100��--->ֻҪһ�������Ϳ�������Ա������
	//��̬:ͬһ������,����ͬ�����������õ��Ľ���ǲ�ͬ
	//�����̬-->��Ҫ�Ǽ̳й�ϵ --> ����
//	public static void showInfosMananger(Manager m) {
//		m.addMoney();
//	}
//	public static void showInfosSalesman(Salesman smn) {
//		smn.addMoney();
//	}
//	public static void showInfosSatff(Satff sa) {
//		sa.addMoney();
//	}
	//�����ϰ嶼��Ա��
	//����Ķ�����Խ���һ�����������
	//���� Employee  e = m;-->(new Manager());
	public static void showInfosEmployee(Employee e) {
		//������д�ุ��ķ���,Ĭ��ִ�е�һ������д֮��ķ���
		e.addMoney();
		
		
	}
	

}
