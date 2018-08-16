package com.qfedu.Day11.DesignMode.Singleton;
//懒汉模式单利
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
		 //引用类型是不能使用 == 来判断是否相等
		 // == 比较的是内存中的两块地址
		 // equals --> 比较引用类型中的内容是否相等
		 System.out.println(sl1 == sl2); //true 
		 System.out.println(sl1.hashCode());
		 System.out.println(sl2.hashCode());
		  System.out.println(sl1.equals(sl2));
		 
	}
}
