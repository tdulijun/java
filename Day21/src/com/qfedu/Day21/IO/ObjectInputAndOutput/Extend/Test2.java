/**
 * 
 */
package com.qfedu.Day21.IO.ObjectInputAndOutput.Extend;

import java.io.*;
import java.util.*;

/**
 * Description：系统对象序列化和反序列化<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test2 {

	public static void main(String[] args)throws Exception {
		//创建一个集合存储多个对象 
		//ArrayList是一个系统类并且实现了Serializable接口
		ArrayList<Student> list = new ArrayList<>();
		//向当前集合中存储多个对象
		Collections.addAll(list
				, new Student("张三",18,"男")
				, new Student("李四",12,"男")
				, new Student("王五",15,"女")
				, new Student("赵六",20,"男"));
		//序列化
		ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("dirs/系统对象序列化"));
		//简介达成多个对象序列化
		oos.writeObject(list);
		oos.flush();
		System.out.println("写完了!");
		
		//反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dirs/系统对象序列化"));
		Object obj = ois.readObject(); //Object类型
		//ArrayList<Student> list1 = (ArrayList<Student>)obj;
		System.out.println(obj);
	
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
