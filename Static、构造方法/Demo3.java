package com.qianfeng.test;
/*
 * 总结成员变量的特点:
 * 1.在创建对象的时候会被赋上初始值
 * 2.可以在创建类的同时直接给值,供所有的对象共享.
 * 3.可以在没有被static修饰的方法之外使用.
 * 
 * 比较成员变量和局部变量?
 * 					成员变量							局部变量
 * 1.作用域:	整个对象 				;从定义变量开始到他所在的函数/for/if等结束
 * 2.默认值:有默认值				;没有默认值,如果想使用,必须先赋值后使用
 * 3.存放位置:放在堆区里面的对象中;放在栈区里面的方法中
 * 4.释放机制:跟对象保持一致,通过垃圾回收机制回收;使用完立即释放
 * 
 * 成员可以分成两类:
 * 1.静态的成员-被static修饰的.静态的成员变量和方法--可以通过引用和类名调用
 * 2.非静态的成员:非静态的成员变量和方法----只能通过引用调用
 * 
 * 为什么可以通过类名直接调用静态的成员?
 * 
  为什么可以通过类名直接调用静态的成员变量?
 * *当成员被static修饰之后就变成了静态的,会在class生成的同时放在静态方法区中一份,而静态方法区的特点是内容会随着
程序的结束而释放,所以对象的创建与否不能影响他们的调用,所以可以直接使用类名调用


静态的成员方法和非静态的成员方法优先使用哪一个?
答:优先使用静态的成员方法
原因:静态的方法比非静态的效率高,节省内存.

注意:但是有一种情况例外:当方法中必须使用非静态的成员变量的时候,这时必须使用非静态的方法

总结:被static修饰的成员变量会变成静态的成员变量,成员方法会变成静态的成员方法.

在使用类名调用成员的时候,实际上是在使用类的字节码文件对象调用静态成员.
 */
public class Demo3 {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "bingbing";
		person.age = 2;
		person.show();
		System.out.println(person.name);
		
		//通过类名调用静态成员
		Person.age = 4;
		Person.show();
		//Person.name = "lisi";  类名不能直接调用非静态的成员
	}
}

class Person{
	String name = "zhangsan";//可以在创建类的同时直接给值
	static int age;
	
	public void run(){
		System.out.println("跑");
	}
	
	public static void show() {
		System.out.println("展示");
	}
}
