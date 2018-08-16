/**
 * 
 */
package com.qfedu.Day14.Enum;

public class Employee {
     //成员变量(那天休息)
	//private WeekDay restday;
	private WeekDays restday;//这是枚举类型
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
