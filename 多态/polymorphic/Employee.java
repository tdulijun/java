package com.qfedu.Day11.polymorphic;
/**
 * 员工类 --> 父类
 * @author JKMaster
 * 以后的开发中,只要是父类最好是做成抽象类,父类是提供信息的一般是直接创建对象的
 * 抽象类是不能直接创建对象的
 * 
 */
public abstract class  Employee {
	  private int salary;
	  public Employee() {
		  
	  }
	  public Employee(int salary) {
		  //区分形参名和成员变量名
		  this.salary = salary;
		  
	  }
	  //getter/setter
	  //获取对应的成员变量
	  public int getSalary() {
		  return salary;
	  }
	  //赋值对应的成员变量
	  public void setSalary(int salary) {
		  this.salary = salary;
	  }
	  //抽象方法必须没有方法体,抽象必须存在在抽象类中
	  public abstract void addMoney();
	  

}
