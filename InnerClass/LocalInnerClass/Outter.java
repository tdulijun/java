package com.qfedu.Day11.InnerClass.LocalInnerClass;
//�ֲ��ڲ���
public class Outter {
  String name = "С��";
  public void show() {
	  /*
	   *���ֲ��ڲ�������˷����еľֲ�����,name��������ᱻĬ�����final����(java7֮���Զ����)
	   *������java7֮ǰ,����Ҫ�ֶ����final
	   *���������оֲ�������Ҫ�ṩ���ֲ�����ʹ��,��ô����ֲ���������ʹ��final 
	   */
	final int age = 30;
	 
	  //�ֲ��ڲ���
	  class Inner{
		  String info = "��Ϣ";
		  public void display() {
			  System.out.println(name);
			  System.out.println(info);
			  System.out.println(age);
		  }
	  }
	  //�ֲ�����Ķ���ֻ���ڷ������д���
	  new Inner().display();
	  
  }
}
