package com.qfedu.Day11.polymorphic2;
//����
public class Test {

	public static void main(String[] args) {
		
		//���������ת��
		//��Ĭ������Ϊ��������,�޷������������е����Ժ���Ϊ
		Animal a = new Dog(1,"С��","�»�");
		System.out.println("����:"+a.getAge());
		System.out.println("����:"+a.getName());
		//��Ҫ��ӡƷ��
		//System.out.println("Ʒ��:"+a.getKind());
		a.show();
		a.display();
		
		//һ����������ĸ������,�����Ե��ø������Ժ���Ϊ,Ҳ���Ե�����������Ժ���Ϊ
		Dog dog = (Dog)a;
		System.out.println("����:"+dog.getAge());
		System.out.println("����:"+dog.getName());
		//��Ҫ��ӡƷ��
		System.out.println("Ʒ��:"+dog.getKind());
		dog.show();
		dog.display();
		
		//������:
		//ClassCastException: --> ǿ������ת���쳣
		//com.qfedu.Day11.polymorphic2.Dog cannot be cast to com.qfedu.Day11.polymorphic2.Cat
		//com.qfedu.Day11.polymorphic2.Dog ���ȫ�޶��� --> ����
//		Cat cat = (Cat)a;
//		System.out.println("����:"+cat.getAge());
//		System.out.println("����:"+cat.getName());
//		//��Ҫ��ӡƷ��
//		System.out.println("Ʒ��:"+cat.getGender());
//		cat.show();
//		cat.display();
		
		
		//Ϊ�˷�ֹ����
		//����תCat
		
	    //boolean result = a instanceof Cat;
	    if(a instanceof Cat) {
	    	Cat cat = (Cat)a;
	    	System.out.println("��è");
	    }else {
	    	System.out.println("����è����");
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
