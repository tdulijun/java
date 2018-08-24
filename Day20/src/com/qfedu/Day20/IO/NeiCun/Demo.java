/**
 * 
 */
package com.qfedu.Day20.IO.NeiCun;

import java.io.*;

/**
 * Description： 内存流的演示<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Demo {
	public static void main(String[] args)throws Exception{
		//showByteArray();
		//1.数据写入字符串流中
		StringWriter writer = new StringWriter();
		writer.write("小龙是什么地方的人?");
		writer.write("河南人");
		writer.write("B哥是什么地方的人?");
		writer.write("火星人");
		
		StringReader reader = new StringReader(writer.toString());
		char[] buffer = new char[1024];
		int len = 0;
		while((len = reader.read(buffer))!=-1) {
			System.out.println(new String(buffer,0,len));
		}
		

	}
	public static void showByteArray()throws Exception {
		//因为,需要将数据先存储到内存数据中然后才能使用内存流将数据读取出来
				//创建字节内存输出流 程序-->内存 写入数据
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				bos.write("ABCDEFG".getBytes());//将数据写入到内存
				//要使用数组来保存数据
				byte[] buffer = bos.toByteArray();
				
				//读取  内存中数据将数据在读取到 --> 程序中
				//参数是一个数组 --> 存储着写入到写入到内存中的数据
				ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
			      byte[] bs = new byte[5];
			      int len = 0;
			      while((len = bis.read(bs))!=-1) {
			    	  System.out.println(new String(bs,0,len));
			      }
				bis.close();
				bos.close();
				//CharArrayReader 和 CharArrayWriter 使用方式和 byte是一样的 改变数组数据类型即可
	}

}
