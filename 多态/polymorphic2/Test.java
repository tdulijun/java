package com.qfedu.Day11.polymorphic2;
//测试
public class Test {

	public static void main(String[] args) {
		
		//对象的向上转型
		//会默认提升为父类类型,无法调用子类特有的属性和行为
		Animal a = new Dog(1,"小白","柯基");
		System.out.println("年龄:"+a.getAge());
		System.out.println("名字:"+a.getName());
		//需要打印品种
		//System.out.println("品种:"+a.getKind());
		a.show();
		a.display();
		
		//一定是提升后的父类对象,即可以调用父类属性和行为,也可以调用子类的属性和行为
		Dog dog = (Dog)a;
		System.out.println("年龄:"+dog.getAge());
		System.out.println("名字:"+dog.getName());
		//需要打印品种
		System.out.println("品种:"+dog.getKind());
		dog.show();
		dog.display();
		
		//错误案例:
		//ClassCastException: --> 强制类型转换异常
		//com.qfedu.Day11.polymorphic2.Dog cannot be cast to com.qfedu.Day11.polymorphic2.Cat
		//com.qfedu.Day11.polymorphic2.Dog 类的全限定名 --> 反射
//		Cat cat = (Cat)a;
//		System.out.println("年龄:"+cat.getAge());
//		System.out.println("名字:"+cat.getName());
//		//需要打印品种
//		System.out.println("品种:"+cat.getGender());
//		cat.show();
//		cat.display();
		
		
		//为了防止错误
		//就像转Cat
		
	    //boolean result = a instanceof Cat;
	    if(a instanceof Cat) {
	    	Cat cat = (Cat)a;
	    	System.out.println("是猫");
	    }else {
	    	System.out.println("不是猫类型");
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
