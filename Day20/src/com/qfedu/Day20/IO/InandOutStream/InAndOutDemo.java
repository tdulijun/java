/**
 * 
 */
package com.qfedu.Day20.IO.InandOutStream;

import java.io.*;

/**
 * Description： 图片读写操作<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:InAndOutDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class InAndOutDemo {
	public static void main(String[] args) {
		//1.将当前磁盘中的文件读取到内存
		InputStream is = null;
		//2.将内存中数据再次写入到磁盘中
		OutputStream os = null;
		try {
			is = new FileInputStream(new File("D:\\123\\1.jpg"));
			os = new FileOutputStream(new File("img/1.jpg"));
			
			//现在使用的文件字节输入输出流 --> 字节
			//读写流程
			//1.字节数组存储当前数据 一次就是1KB  乘4  乘 8
			byte[] buf = new byte[1024];
			//ps:read方法是有返回值的:实际读取内容的长度
			//若读取到文件的末尾 -1 没有读取到-1继续读取
			int len = 0; //用来存储实际读取额长度
			while( (len = is.read(buf))!=-1) {
				//写出数据
				os.write(buf, 0, len);
			}
			os.flush();
			System.out.println("老子写完了!!!");
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		     if(is != null) {
		    	 try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     }
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
