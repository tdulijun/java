/**
 * 
 */
package com.qfedu.Day17.HashSet.SelfClass;

/**
 * Description�� ѧ����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Student.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Student {
	private String name;
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	 //����д�������д,��������д --> �й�����Գд��
//	@Override
//	public boolean equals(Object obj) {
//		Student other = (Student)obj;
//		return this.name.equals(other.name) && this.age == other.getAge();
//	}
//
//	@Override
//	public int hashCode() {
//		return name.hashCode() + age;
//	}
	
	
	//���²�����������д --> ϵͳ�ṩ
	@Override
	public int hashCode() {
		//����ֵ 31 --> ����(����)
		//31����С �ܺõõ�  1����λ��5�� -1 2��5�η�-1
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	
	//����(Ӣ��) equals�ж�
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // ��ǰ����ĵ�ַ ���� ��������ַ
			return true;
		if (obj == null) //���������null û�е�ַ
			return false;
		if (getClass() != obj.getClass()) //���� ��ȡ��ǰ����ֽ����ļ� ������ ���������ֽ����ļ�
			return false;
		Student other = (Student) obj;//����ת�� �õ���ǰ��Ķ���
		if (age != other.age) //��ǰ��������� ������ ������������
			return false;
		if (name == null) { //��ǰ����û������
			if (other.name != null) //�����������ִ���
				return false;
		} else if (!name.equals(other.name))//�������ֲ����
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		
		return name + age ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
