/**
 * 
 */
package com.qfedu.Day20.IO.BufferedOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Description： 字节输出缓冲流<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:BufferedOutputStreamDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args)throws Exception {
		//在控制台上获取数据-->bis流对象就可以在控制台上获取数据
		//ps:Scanner --> 在控制台上获取数据
		BufferedInputStream bis = new BufferedInputStream(System.in);
	    PrintStream ps = new PrintStream(new FileOutputStream(new File("dir/字节缓冲流输出的数据.txt")));
	    System.setOut(ps);
		//构建标准输出流
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		//在控制台上输入数据输入什么就写入到对应的文件中
		byte[] bs = new byte[1024];
		int len = 0;
		while(true) {
			//获取控制台输入
			len = bis.read(bs);
		   //创建一个字符串
			String content = new String(bs,0,len);
			//只要是输入886,这个程序就停止
			//获取到换行符  \r\n
			if("886\r\n".equals(content)) {
				break;
			}
			bos.write(content.getBytes());
			bos.flush();
		}	
		bos.close();
		bis.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
