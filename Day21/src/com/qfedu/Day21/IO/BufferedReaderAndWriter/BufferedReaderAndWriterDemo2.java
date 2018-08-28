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
public class BufferedReaderAndWriterDemo2 {
	public static void main(String[] args) throws Exception {
		//指定读取文件的字符编码和写出文件的字符编码并且要求使用字符缓冲流的形式完成
		//构建数据
		File src = new File("dir/这是使用了新方法读取的文件.txt");
		File des = new File("dir/使用了缓冲流的形式完成的文件.txt");
		
		ReaderAndWriterNew(src,des,"GBK","UTF-8");  //新读写方式
		

	}
	/**
	 * 使用缓冲流的形式完成指定编码文件的读写操作
	 * @param src 源文件
	 * @param des 目标文件(写入的位置)
	 * @param srcCharSetName 源文件的编码
	 * @param desCharSetName 目标文件的编码
	 * @throws Exception  抛出所有IO异常
	 */

	public static void ReaderAndWriterNew(File src,File des,String srcCharSetName,String  desCharSetName) throws Exception {
		/*
		 * ps写流的步骤:
      			1.创建流对象(确定流的流向和数据类型)
      			2.循环读取文件中的数据  --> 定义一个变量来获取实际读取的长度
        		            	判断是否读取到文件的末尾-1
 								如果没有 将数据写出去
      			3.关闭流		
      	通过BufferedReader对 传入参数的流进行一次包装,让当前流具备了缓冲流,从而提高了流的流速
      	   缓冲流也称之为包装流	
      	   流式可以嵌套流对象的
      	   InputStream is = new FileInputStream();
      	   InputStreamReader isr = new InputStreamReader(new FileInputStream());
      	   BufferedReader br  = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(src), srcCharSetName));				
		 */
		//读取
		BufferedReader br  = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(src), srcCharSetName));
		
		//写入
		BufferedWriter bw  = 
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream(des),desCharSetName));
	
		//读取: readLine(); -->读取一行字符串
		//1.br.readLine(); --> 循环读取 
		// null空值-->没有开辟内存空间
		//循环读取数据 --> 数据写出去? -->参数是XXX类型 	
	    String content = null;
	    //ps:若使用readLine方式读取数据,首先会认为读取到\n或\r作为一行的纪委,然后若读取到文件的末尾会返回null
	    //   readLine不会读取换行符(回车)
	    while((content = br.readLine())!=null) {
	    	//写出去
	    	bw.write(content);
	    	//在写出数据时,需要手动添加换行符,保证数据格式的正确
	    	bw.newLine();
	    }
	   
	    bw.flush();
	    System.out.println("写完了!!!");
	    bw.close();
	    br.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
