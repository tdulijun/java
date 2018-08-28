/**
 * 
 */
package com.qfedu.Day21.IO.ObjectInputAndOutput.Extend;

import java.io.*;
import java.util.*;

/**
 * Description：对象序列化和反序列化<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test {

	public static void main(String[] args)throws Exception {
		//创建一个集合存储多个对象
		List<Student> list = new ArrayList<>();
		//向当前集合中存储多个对象
		Collections.addAll(list, new Student("张三",18,"男")
				, new Student("李四",12,"男")
				, new Student("王五",15,"女")
				, new Student("赵六",20,"男"),null);
		//调用序列化方法
		//ObjectInputStreamSerializable(list);
		//反序列化
		List<Student> list1 = ObjectOutputStreamSerializable();
		
		Iterator it = list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
	/**
	 * 多个对象的反序列化
	 * @throws Exception 异常
	 */
	public static List<Student> ObjectOutputStreamSerializable()throws Exception{
		//将当前多个对象进行反序列化 读取回来  -->多个对象,可定需要使用循环,循环停止的条件是什么,如何看到每一个对象中的值
		//只能能完成循环读取,出现异常先不管--> EOF
		ObjectInputStream ois = new  ObjectInputStream(new FileInputStream("dirs/多个对象的序列化"));
		//反序列化就是将文件中的对象读取回来
		//判断一个对象是否存在 --> 判断当前对象地址是够为null
		Object obj = null;
		/*
		 * readObject读取文件中的对象,若达到流的末尾(文件末尾) 会返回EOFException
		 * 正常判断文件的末尾其实就是读取到最后一个对象是地址是null证明你没有数据了
		 * 此时即可以达到避免EOFException,也可以达到读取文件对象的最后一个
		 * 所以,若需要对多个对象进行序列化时,习惯将最后一位存为null表示文件的末尾
		 */
		List<Student> list = new  ArrayList<>();
		while((obj = ois.readObject()) != null) {
			//System.out.println(obj);
			//readObject的返回值类型是Object,此时需要进行强制类型操作
			//list.add(obj);
			Student stu = (Student)obj; 
			list.add(stu);
				
		}
		return  list;
	}
	/**
	 * 多个对象序列化方法
	 * @param list  集合中存储多个对象
	 * @throws Exception  异常
	 */
	public static void ObjectInputStreamSerializable(List<Student> list)throws Exception {
		//创建流对象进行序列化操作ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dirs/多个对象的序列化"));
		//将集合中所有的对象进行序列操作
		//将集合中的对象取出来
		for(Student stu : list) {
			oos.writeObject(stu);
		}
		System.out.println("多个对象序列化完成!!!!");
		oos.flush();
		oos.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
