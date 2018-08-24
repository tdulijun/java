/**
 * 
 */
package com.qfedu.Day20.IO.InputStreamReader;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Description： 字节流转化字符流应用<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:InputStreamReaderDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) {
		//1.先明确使用的流 流向 (读取 In/read)
		//ps:一定一定要注意,创建流对象时,参数传递的是什么
		//当前就是创建了一个转换流对象,此时就是将字节输入流转换为字符输入流
		//当前是字节转换字符流的基本写法 --->使用的是默认编码GBK
		//  ctrl + / 批量注释
//		InputStreamReader isr = null;
//		try {
//			isr = 
//					new InputStreamReader(
//							new FileInputStream(
//									new File("src/com/qfedu/Day20/IO/Reader/ReaderDemo.java")));
//			//可以获取当前文件的字符编码
//			//几乎与用不了,这个方法只能在程序运行起来后才能获得当前文件的编码
//			System.out.println("当前文件的字符编码时:"+isr.getEncoding());
//			//2.当前流中的 数据是什么  char字符
//			char[] cbuf = new char[1024];
//			int len = 0;
//			while((len = isr.read(cbuf))!=-1) {
//				 System.out.println(new String(cbuf,0,len));
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(isr != null) {
//				try {
//					isr.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
		//使用编码集的形式来读取数据
		//当前file1.txt文件的编码时UTF-8
		//此时创建的转换流对象使用的是UTF-8编码集
		try(InputStreamReader isr = 
				new InputStreamReader(
						new FileInputStream(
								new File("dir/file1.txt")),Charset.forName("UTF-8"))){
			System.out.println("当前文件编码是:"+isr.getEncoding());
			char[] cbuf = new char[1024];
			int len = 0;
			while((len = isr.read(cbuf))!=-1) {
				//全转换为大写
				System.out.println(new String(cbuf,0,len).toUpperCase());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
