/**
 * 
 */
package com.qfedu.Day18.HomeWork;

/**
 * Description： 员工<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Worker.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Worker implements Comparable{
	private int age;
	private int workAge;
	private int money;
	public Worker(int age, int workAge, int money) {
		super();
		this.age = age;
		this.workAge = workAge;
		this.money = money;
	}
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWorkAge() {
		return workAge;
	}
	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		//没有泛型之前
		Worker other = (Worker)o;
		int  Sage = this.age - other.age;
		int  SworkAge = other.workAge - this.workAge;
		int  Smoney = other.money - this.money;
		
	    int  sum =  Sage == 0 ? SworkAge == 0 ? Smoney : SworkAge : Sage;
		
		//return sum;
		return this.age - other.age == 0 ?other.workAge - this.workAge == 0 ? other.money - this.money 
				: other.workAge-this.workAge : this.age-other.age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "年龄:"+age+","+"工龄:"+workAge+","+"薪水:"+money;
	}
	

}











