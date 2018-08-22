/**
 * 
 */
package com.qfedu.Day17.TreeSet.Comparable;

/**
 * Description： 人类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Person.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Person implements Comparable{
       private int age;
       private int height;//

	public Person(int age,int height) {
		super();
		this.age = age;
		this.height = height;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
    	
    	return "年龄"+age+","+"身高"+height;
    }
	/* 
	 * 是对对象需要排序的属性进行比较的方法
	 */
	@Override
	public int compareTo(Object o) {
		Person other = (Person)o;
		
		//比较的是年龄 升序 必须满足 整数 负数和 零的关系
//		if(this.age > other.age) {
//			return 1; //正数 就是升序  负数是降序
//		}else if(this.age == other.age){
//			//继续书写 年龄相等身高降序
//			if(this.height > other.height) {
//				return -1;
//			}else if(this.height == other.height) {
//				//身高相等 , 体重升序
//				return 0;
//			}else {
//				return 1;
//			}
//	
//		}else {
//			return -1;
//		}
		//String 引用类型若需要排序,都会提供比较方法
//		String str1 = "abc";
//		String str2 = "ABC";
//		str1.compareTo(str2);
//		
		
		
		//用什么方式就可以得到正数,负数 或 零
		//需要升序就用当前对象的值 - 传入对象的值 升序
		//需要降序就用当前传入对象的值 - 当前对象的值 降序
		return this.age - other.age;
		
		
		

		
	}
       
	

}
