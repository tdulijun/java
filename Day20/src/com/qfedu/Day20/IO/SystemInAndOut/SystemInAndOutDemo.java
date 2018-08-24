/**
 * 
 */
package com.qfedu.Day20.IO.SystemInAndOut;

import java.io.*;

/**
 * Description： 标准输入输出流重定向<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SystemInAnd.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class SystemInAndOutDemo{
      public static void main(String[] args) {
		   //既然要改变流的流向
    	  //1.就要创建流的流向
    	  //先构建system.in的流向和构建System.out的流向
    	  //1.7之后Java提供的新try...catch语法 可以直接释放对象
    	  //ps若有多个对象使用;隔开,若只有一个对象就不需要分号了
    	  try(InputStream is = new FileInputStream("src/com/qfedu/Day20/IO/ReaderAndWriter/ReaderAndWriterDemo.java");
    			  PrintStream ps = new PrintStream(new File("dir/newJava.java"))){
    		  //修改当前标准输输出流的流向
    		  System.setIn(is);//此时System.in就不会在控制台上获取数据了,而是从你定义的流中获取数据
    		  System.setOut(ps);//此时System.out就不会打印到控制台上了,打印你所定义的流位置
    		  
    		  //当前的流都属于字节流
    		  byte[] buf = new byte[1024];
    		  int len = 0;
    		  while((len = System.in.read(buf))!=-1) {
    			  System.out.write(buf, 0, len);
    		  }
    		 
    		  //标准输入输出流改变会控制台
    		  
    		  //改变流的流向
    		  
    		  //1.需要使用
    		  /*
    		   * FileOutputStream(FileDescriptor fdObj) 创建一个向指定文件描述符处写入数据的输出文件流
    		   * 参数是一个文件描述符 ---> 文件句柄
    		   * 帮组我们将已经改的原有标准输入输出流改回系统
    		   * 需要两个静态字段(属性)
    		   * static FileDescriptor in 标准输入流的句柄。 
    		   * static FileDescriptor out 标准输出流的句柄 
    		   * 当前流对象就已经获取了系统输出的标准
    		   */
    		PrintStream  ps1 = new PrintStream(new FileOutputStream(FileDescriptor.out));
    		 System.setOut(ps1);
    		 System.out.println("老子写完了!!!!!");//不能打印到控制台上,因为改变了流的流向
    		  
    		  
    		  
    		  
    		  System.out.flush();
    
    		  
    	  }catch(IOException e) {
    		  e.printStackTrace();
    	  }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
