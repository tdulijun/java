package com.qfedu.Day11.polymorphic;
//java���ǵ�һ�̳� ,һ����ֻ����һ��ֱ�Ӹ���
//����(���)--> ���̳� һ����Ӹ���
/*
 * Manger ֱ�Ӹ��� Employee
 * Employee ֱ�Ӹ���  Object
 * Manger ��ӵļ̳��� Object 
 * 
 */
public class Manager extends Employee {
    private int jiangjin;
    public Manager() {
    	
    }
    public Manager(int salary,int jiangjin) {
    	super(salary);
    	//Ϊ�����ָ����е����Ժ�����������,�����е�����ʹ��super��ֵ
    	//�����е�����ʹ��this
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
    	System.out.println("нˮ��:"+(getSalary()+jiangjin));
    	
    }
	
	

}
