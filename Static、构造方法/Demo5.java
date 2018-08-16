package com.qianfeng.test;
/*
 * 构造方法:
 * 调用时候的构成:类名+()
 * 作用:对对象的属性进行初始化,如果我们自己不创建,系统会调用默认的无参构造方法
 * 
 * 创建自己的构造方法:两种
 * 1.无参的构造方法:会将成员变量初始化成null或0或false
 * 2.有参的构造方法:会将成员变量初始化并赋值(赋值成通过参数传入的值)
 * 
 * 定义:构成:
 * 修饰词  方法名(参数列表){
 * 		//方法体
 * 		//执行代码
 * }
 * 
 * 注意点:1.没有返回值这一项     2.方法名必须是类名
 * 
 * 使用构造方法的注意点:
 * 1.一旦创建了自己的构造方法,就不会再去调用系统的构造方法.
 * 2.多个构造方法之间是重载的关系
 * 
 * this:是一个关键字,是引用数据类型.保存的是当前对象的地址,指向当前的对象.
 * 场景:想在当前类的内部拿到当前类的引用的时候.
 * 
 * this的作用总结:
 * 1.区分成员变量和局部变量
 * 2.可以在构造方法中调用其他重载的构造方法,提高代码的复用性,简化代码.
 * 
 * this的注意点:
 * 1.在作为方法的时候,只适用于构造方法.
 * 2.不能自己调用自己--死循环
 * 3.相互之间不能调用--死循环
 * 4.在构造方法中调用其他重载的构造方法--代码必须放在第一行.
 * 5.在静态方法中不能使用this
 */
public class Demo5 {
	public static void main(String[] args) {
		Student student = new Student();
		student.age = 19;
		
		Student student1 = new Student("冰冰");
		student1.age = 19;
		System.out.println(student1.name);
	}
}

class Student{
    String name;
    int age;
    double weight;
    double height;
    
    
    //无参构造方法
    public Student(){
    	//this(); 死循环
    	//在构造方法的内部自动进行属性的初始化.
    	System.out.println("无参构造方法");
    }
    //有参构造方法
    //当成员变量和形参名字一致时,方法内部识别的是形参.依据的是就近原则
    //就近原则是从内存的角度说的.
    public Student(String name){
    	
    	this.name = name;
    	System.out.println("有参构造方法");
    }
    
    public Student(String name,int age){
    	this(name);
    	this.age = age;
    	System.out.println("有参构造方法");
    }
    
    public Student(String name,int age,double height,double weight){
    	this(name, age);//相当于在调用有两个参数的构造方法
    	this.height = height;
    	this.weight = weight;
    	System.out.println("有参构造方法");
    }
}
