package com.qfedu.Day11.InnerClass.MemberInnerClass;
//��Ա�ڲ���
public class Outter {
    String name = "С��";
    public void display() {
    	System.out.println("�ⲿ�෽��");
    	//String name1 = this.new Inner().name;
    	String name1 = new Outter().new Inner().name;
    }
    //��Ա�ڲ���
    public class Inner{
    	String name = "С��";
    	public void show() {
    		String name = "С��";
    		//���ڲ����еķ������ʷ����еı���
    		System.out.println(name);
    		//���ڲ����еķ�������ͬ����Ա����ʹ��this�ؼ���
    		System.out.println(this.name);
    		//���ڲ����з����ⲿ���ͬ������,�ⲿ������.this.������
    		System.out.println(Outter.this.name);
    		//�ǿ���ֱ�ӷ����ⲿ���е����Ժͷ���(����ͬ��)
    		display();
    		
    	}
    	
    }
    public static void main(String[] args) {
		//�ڲ������
    	//�ȴ����ⲿ�����
//    	Outter out  = new Outter();
//    	Outter.Inner inner = out.new Inner();
    	Outter.Inner inner = new Outter().new Inner();
    	inner.show();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
