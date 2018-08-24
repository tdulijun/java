/**
 * 
 */
package com.qfedu.Day20.IO.ReaderAndWriter;

import java.io.*;
/**
 * Description： 字符输入输出流<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ReaderAndWriterDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ReaderAndWriterDemo {
	public static void main(String[] args) {
		 //1.构建流对象 --> 流的流向(输入,输出)
		 //2.流中的数据应该是 字符
		Reader reader = null;
        Writer writer = null;
		try {
			reader = new FileReader("D:\\123\\2.jpg");
			writer = new FileWriter("img/2.jpg");
			
			//明确了流中的数据是字符
			//创建字符数组存储内容并读取大小
			char[] cbuf = new char[1024];
			//定义变量存储实际读取的长度
			int len = 0;
			while( (len = reader.read(cbuf)) != -1) {
				writer.write(cbuf, 0, len);
			}
			writer.flush();
			System.out.println("写完了!!!!");
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
