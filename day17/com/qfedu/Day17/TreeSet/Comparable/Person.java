/**
 * 
 */
package com.qfedu.Day17.TreeSet.Comparable;

/**
 * Description�� ����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Person.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Person implements Comparable{
       private int age;
       private int height;//

	public Person(int age,int height) {
		super();
		this.age = age;
		this.height = height;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
    	
    	return "����"+age+","+"���"+height;
    }
	/* 
	 * �ǶԶ�����Ҫ��������Խ��бȽϵķ���
	 */
	@Override
	public int compareTo(Object o) {
		Person other = (Person)o;
		
		//�Ƚϵ������� ���� �������� ���� ������ ��Ĺ�ϵ
//		if(this.age > other.age) {
//			return 1; //���� ��������  �����ǽ���
//		}else if(this.age == other.age){
//			//������д ���������߽���
//			if(this.height > other.height) {
//				return -1;
//			}else if(this.height == other.height) {
//				//������ , ��������
//				return 0;
//			}else {
//				return 1;
//			}
//	
//		}else {
//			return -1;
//		}
		//String ������������Ҫ����,�����ṩ�ȽϷ���
//		String str1 = "abc";
//		String str2 = "ABC";
//		str1.compareTo(str2);
//		
		
		
		//��ʲô��ʽ�Ϳ��Եõ�����,���� �� ��
		//��Ҫ������õ�ǰ�����ֵ - ��������ֵ ����
		//��Ҫ������õ�ǰ��������ֵ - ��ǰ�����ֵ ����
		return this.age - other.age;
		
		
		

		
	}
       
	

}
