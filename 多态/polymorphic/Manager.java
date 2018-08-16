package com.qfedu.Day11.polymorphic;
//java类是单一继承 ,一个类只能有一个直接父类
//多重(多层)--> 简介继承 一个间接父类
/*
 * Manger 直接父类 Employee
 * Employee 直接父类  Object
 * Manger 间接的继承于 Object 
 * 
 */
public class Manager extends Employee {
    private int jiangjin;
    public Manager() {
    	
    }
    public Manager(int salary,int jiangjin) {
    	super(salary);
    	//为了区分父类中的属性和子类中属性,父类中的属性使用super赋值
    	//子类中的属性使用this
    	this.jiangjin = jiangjin;
    	
    }
    
    public int getJiangjin() {
    	return jiangjin;
    }
    
    public void setJiangjin(int jiangjin) {
    	this.jiangjin = jiangjin;
    }
	
    @Override
    public void addMoney() {
    	System.out.println("薪水是:"+(getSalary()+jiangjin));
    	
    }
	
	

}
