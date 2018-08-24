/**
 * 
 */
package com.qfedu.Day20.IO.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.qfedu.Day20.IO.SystemInAndOut.SystemInAndOutDemo;

public class BufferedInputStreamDemo {	
	public static void main(String[] args) {
		//再碰到异常一样要抓取
		//参数是一个字节输入流对象
		try(BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream(
								new File("src/com/qfedu/Day20/IO/BufferedInputStream/BufferedInputStreamDemo.java")))){
			//判断当前流对象是否支持mark标记 --> true 支持 false 不支持
			System.out.println("判断是否支持标记:"+bis.markSupported());
			bis.mark(1);//字节个数,给了什么数那么下次读取就在什么位置开始
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = bis.read(buf))!=-1) {
				System.out.println(new String(buf,0,len));
				
			}
			System.out.println("----------------------再次重新读取文件的内容-------------------------");
			bis.reset();//重启标记
			while((len = bis.read(buf))!=-1) {
				System.out.println(new String(buf,0,len));
				
			}
			//一次读取一个节
			/*
			 * hello
			 * bis.read() --> h
			 * bis.read() --> e
			 * bis.mark(3) 对多可以读取几个字节
			 * bis.read() --> l
			 * bis.read() --> l
			 * bis.read() --> o
			 * bis.reset();
			 * bis.read() //llo
			
			 * 
			 */
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
