/**
 * 
 */
package com.qfedu.Day21.IO.BufferedReaderAndWriter;

import java.io.*;

/**
 * Description： 字符缓冲输入输出流<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:BufferedReaderAndWriterDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class BufferedReaderAndWriterDemo {
	public static void main(String[] args) throws Exception {
		/*
		 * 需求:现在所有异常一律抛出 throws,先在当前工程下创建一个文件夹dir,
          	将当前程序使用字符缓冲输入输出流循环读取并写入到dir文件夹下
		 */
		ReaderAndWriterOld();
		

	}
	public static void ReaderAndWriterOld() throws Exception {
		/*
		 * ps写流的步骤:
      			1.创建流对象(确定流的流向和数据类型)
      			2.循环读取文件中的数据  --> 定义一个变量来获取实际读取的长度
        		            	判断是否读取到文件的末尾-1
 								如果没有 将数据写出去
      			3.关闭流		
      	通过BufferedReader对 传入参数的流进行一次包装,让当前流具备了缓冲流,从而提高了流的流速
      	   缓冲流也称之为包装流						
		 */
		//读取
		BufferedReader  br  = 
				new BufferedReader(
						new FileReader(
								new File("src/com/qfedu/Day21/IO/BufferedReaderAndWriter/BufferedReaderAndWriterDemo.java")));
		
		//写入
		BufferedWriter bw = 
				new BufferedWriter(
						new FileWriter(
								new File("dir/BufferedReaderAndWriter.java")));
		char[] cbuf = new char[1024];
		int len = 0;
		while((len = br.read(cbuf))!=-1) {
			bw.write(cbuf,0,len);
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
