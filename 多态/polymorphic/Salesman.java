package com.qfedu.Day11.polymorphic;

public class Salesman extends Employee{
	private int ticheng;
	//atl+shift+s

	public Salesman() {	
		
	}

	public Salesman(int salary,int ticheng) {
		super(salary);
		this.ticheng = ticheng;
	}
	
	public int getTicheng() {
		return ticheng;
	}

	public void setTicheng(int ticheng) {
		this.ticheng = ticheng;
	}

	@Override
	public void addMoney() {
	    System.out.println("нˮ:"+(getSalary()+ticheng));
		
	}
	
     
	
	
	
}
