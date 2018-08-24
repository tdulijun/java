/**
 * 
 */
package com.qfedu.Day20.IO.Reader;

import java.io.*;

/**
 * Description： 字符输入流<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ReaderDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class ReaderDemo {
	public static void main(String[] args) {
		//1.创建流对象 -->流的流向 (读)
		Reader reader = null;
		try {
			reader = new FileReader("dir/file.txt");
			
			//2.流中数据类型是什么 ---> char类型
			char[] cbuf = new char[1024];
			//实际读取内容的长度
			int len =  0;
		    while((len = reader.read(cbuf))!=-1) {
		    	System.out.println(new String(cbuf,0,len));
		    }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
