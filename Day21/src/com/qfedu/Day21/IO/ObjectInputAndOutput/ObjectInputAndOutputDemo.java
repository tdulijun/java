/**
 * 
 */
package com.qfedu.Day21.IO.ObjectInputAndOutput;

import java.io.*;

/**
 * Description： 对象的序列化和反序列化<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ObjectInputAndOutputDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ObjectInputAndOutputDemo {
	public static void main(String[] args) throws Exception {
		//ObjectOutputStreamSerializable();
	 
		//创建方法快捷方式 alt+shift+m --> 一个是名字,一个是修饰符
		ObjectInputStreamSerializable();
		
		
		
		
	}

	/**
	 * 对象的反序列化操作
	 * @throws Exception序列化异常,文件找不到异常,IO异常
	 * 
	 */
	public static void ObjectInputStreamSerializable()throws Exception {
		//反序列化 -->将文件中存储对象读取回来
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dir/序列化文件.txt"));
		//如何将对象反序列化出来 -->将当前对象从文件中读取出来
		//返回值是一个Object
	    Object obj = ois.readObject();
	    System.out.println(obj);
	}

	/**
	 * 实现了对象的序列化
	 * @throws Exception 序列化异常,文件找不到异常,IO异常
	 * 
	 */
	public static void ObjectOutputStreamSerializable() throws Exception {
		//自定义类对象的序列化操作
		Student stu= new Student("成龙", 61, "男");
		//1.将当前对象进行序列化操作
		//序列化操作就是将当前对象固化成文件
		//就需要将当前对象写的入到文件中
		//序列化文件不是一个可读文件(不是人类可读),所以序列化文件一般是不适用后缀名
		//只有通过反序列化的方式才能读取文件中的内容
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dir/序列化文件.txt"));
	   //2. 将当前对象进行序列化(将当前对象写入到文件中)
		//只要对对象进行序列化或反序列化操作,那么当前对象必须是实现Serializable接口
		//若没有实现会抛出异常
		oos.writeObject(stu);
		oos.flush();
		System.out.println("写完了");
	    oos.close();
	}

}
