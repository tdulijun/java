package com.qfedu.Day11.DesignMode.Singleton;
//����ģʽ����
public class SingleLazy {
    //1.
	private static SingleLazy instance;
	//2.
	private SingleLazy() {
		
	}
	public static SingleLazy getInstance() {
		if(instance == null) {
			instance = new SingleLazy();
		}
		return instance;
	}
   
	public static void main(String[] args) {
		 SingleLazy sl1 = SingleLazy.getInstance();
		 SingleLazy sl2 = SingleLazy.getInstance();
		 //���������ǲ���ʹ�� == ���ж��Ƿ����
		 // == �Ƚϵ����ڴ��е������ַ
		 // equals --> �Ƚ����������е������Ƿ����
		 System.out.println(sl1 == sl2); //true 
		 System.out.println(sl1.hashCode());
		 System.out.println(sl2.hashCode());
		  System.out.println(sl1.equals(sl2));
		 
	}
}
