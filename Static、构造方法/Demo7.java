package com.qianfeng.test;

public class Demo7 {
	//����:һ������һ������
	public static void main(String[] args) {
		Persons persons = new Persons();
		persons.name = "ren";
		
		Persons haizi = new Persons();
		persons.baby = haizi;
		
	}
}
//һ������һ���������,������һ����������������.�����ɼ��ķ�Χ�ڶ��ǿ���ʹ�õ�,�����Լ����ڲ�.
class Persons{
	String name;
	int age;
	Persons baby;
}

//��ҵ:������֮��ľ���
//1.Ҫʹ�����ַ���ʵ����� :��̬�����ͷǾ�̬����
//2.ƽ���ͼ��     Math.sqrt(a)

