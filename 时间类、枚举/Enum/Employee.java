/**
 * 
 */
package com.qfedu.Day14.Enum;

public class Employee {
     //��Ա����(������Ϣ)
	//private WeekDay restday;
	private WeekDays restday;//����ö������
	public Employee() {
		
	}
	public Employee(WeekDays restday) {
		  this.restday = restday;
	}
	public WeekDays getRestday() {
		return restday;
	}
	public void setRestday(WeekDays restday) {
		this.restday = restday;
	}
	
	 
}
