package com.qfedu.Day11.polymorphic;

public class Satff extends Employee{
	private int butie;
	

	public Satff() {	
		
	}

	public Satff(int salary,int butie) {
		super(salary);
		this.butie = butie;
	}
	
	public int getButie() {
		return butie;
	}

	public void setButie(int butie) {
		this.butie = butie;
	}

	@Override
	public void addMoney() {
	    System.out.println("нˮ:"+(getSalary()+butie));
		
	}
	
     
	
	
	
}
