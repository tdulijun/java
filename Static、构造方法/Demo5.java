package com.qianfeng.test;
/*
 * ���췽��:
 * ����ʱ��Ĺ���:����+()
 * ����:�Զ�������Խ��г�ʼ��,��������Լ�������,ϵͳ�����Ĭ�ϵ��޲ι��췽��
 * 
 * �����Լ��Ĺ��췽��:����
 * 1.�޲εĹ��췽��:�Ὣ��Ա������ʼ����null��0��false
 * 2.�вεĹ��췽��:�Ὣ��Ա������ʼ������ֵ(��ֵ��ͨ�����������ֵ)
 * 
 * ����:����:
 * ���δ�  ������(�����б�){
 * 		//������
 * 		//ִ�д���
 * }
 * 
 * ע���:1.û�з���ֵ��һ��     2.����������������
 * 
 * ʹ�ù��췽����ע���:
 * 1.һ���������Լ��Ĺ��췽��,�Ͳ�����ȥ����ϵͳ�Ĺ��췽��.
 * 2.������췽��֮�������صĹ�ϵ
 * 
 * this:��һ���ؼ���,��������������.������ǵ�ǰ����ĵ�ַ,ָ��ǰ�Ķ���.
 * ����:���ڵ�ǰ����ڲ��õ���ǰ������õ�ʱ��.
 * 
 * this�������ܽ�:
 * 1.���ֳ�Ա�����;ֲ�����
 * 2.�����ڹ��췽���е����������صĹ��췽��,��ߴ���ĸ�����,�򻯴���.
 * 
 * this��ע���:
 * 1.����Ϊ������ʱ��,ֻ�����ڹ��췽��.
 * 2.�����Լ������Լ�--��ѭ��
 * 3.�໥֮�䲻�ܵ���--��ѭ��
 * 4.�ڹ��췽���е����������صĹ��췽��--���������ڵ�һ��.
 * 5.�ھ�̬�����в���ʹ��this
 */
public class Demo5 {
	public static void main(String[] args) {
		Student student = new Student();
		student.age = 19;
		
		Student student1 = new Student("����");
		student1.age = 19;
		System.out.println(student1.name);
	}
}

class Student{
    String name;
    int age;
    double weight;
    double height;
    
    
    //�޲ι��췽��
    public Student(){
    	//this(); ��ѭ��
    	//�ڹ��췽�����ڲ��Զ��������Եĳ�ʼ��.
    	System.out.println("�޲ι��췽��");
    }
    //�вι��췽��
    //����Ա�������β�����һ��ʱ,�����ڲ�ʶ������β�.���ݵ��Ǿͽ�ԭ��
    //�ͽ�ԭ���Ǵ��ڴ�ĽǶ�˵��.
    public Student(String name){
    	
    	this.name = name;
    	System.out.println("�вι��췽��");
    }
    
    public Student(String name,int age){
    	this(name);
    	this.age = age;
    	System.out.println("�вι��췽��");
    }
    
    public Student(String name,int age,double height,double weight){
    	this(name, age);//�൱���ڵ��������������Ĺ��췽��
    	this.height = height;
    	this.weight = weight;
    	System.out.println("�вι��췽��");
    }
}
