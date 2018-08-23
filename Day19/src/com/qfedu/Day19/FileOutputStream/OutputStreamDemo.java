/**
 * 
 */
package com.qfedu.Day19.FileOutputStream;

import java.io.*;

/**
 * Description： 文件字节输出流<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:OutputStream.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class OutputStreamDemo {
	public static void main(String[] args) {
		
	
		OutputStream os = null;
		OutputStream oos = null;
		try {
			//创建文件字节输出流,就是向什么位置将文件写出去
			//若写出的文件夹中没有用当前文件,会自动创建
			//os = new FileOutputStream("dir/newFile.txt");
			//创建文件字节输出流,就是向什么位置将文件写出去,确定追加
			//不会覆盖原有文件内容,而是在原有文件内容的基础上继续写入
			oos = new  FileOutputStream("dir/newFile.txt",true);
			/*
			 * void write(byte[] b) 将 b.length 个字节从指定 byte 数组写入此文件输出流中。 
               void write(byte[] b, int off, int len)将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。 
               void write(int b) 将指定字节写入此文件输出流。 
			 */
//			os.write(97);
//			//getBytes()将当前字符串转换为字节数组
//			os.write("abcdefg".getBytes());
//			os.write("ABCD".getBytes(), 1, 3);
			oos.write("我是追加的内容".getBytes());
			oos.flush();
			System.out.println("老子写完了!!!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(os != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
