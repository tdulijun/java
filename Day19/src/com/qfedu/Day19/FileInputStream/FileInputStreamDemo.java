/**
 * 
 */
package com.qfedu.Day19.FileInputStream;
//IO包下的流,所以若一个流对象就需要导入一个包,那么就需要很多的包
//所以,就以java.io.* 一次性导入所有IO包下类
import java.io.*;
import java.util.Arrays;


/**
 * Description： 文件字节输入流演示<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:FileInputStreamDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class FileInputStreamDemo {


	public static void main(String[] args) {
		
		//先创建字节输入流对象 
		//ps .是当前路径
	    // FileNotFoundException 没有找到文件异常 抛出当前异常,路径错了
		//在没有讲到对象流之前,所有的流都使用try...catch抓取
		InputStream is = null;
		try {
			is = new FileInputStream("dir/file.txt");
			/*
			 * int read()  从此输入流中读取一个数据字节。 
			 * int read(byte[] b) 从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。 
			 * int read(byte[] b, int off, int len) 从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。 
			 */
			//1.在文件中读取一个字节,文件中的内容 
			//ps:在控制台上打印的值是97 为什么? 因为是ASCII吗
			//字节流 --> byte  将当前a转换为 ASCII来进行存储,所以就在控制台上看到97这个值
			/*
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			//若读取到文件末尾时,系统会返回一个负数表示读取到了文件的末尾
			//那么这个负数就是-1 
			//假如,有某个判断只要判断读取到-1就到了文件的末尾,不读取了
			//     如果没有读取到-1就可以继续读取
			System.out.println(is.read());
			*/
			//2.读取字节数组长度的内容,并存储到字节数组中
			//创建一个字节数组
			//ps:实际是先读取字节数组中长度的内容(数组的长度是多少就读取多少个字节)
			//   在存到当前字节数组中,所读取的内容就在字节数组存放
			
			byte[] arr = new byte[10];
			is.read(arr);
			System.out.println(Arrays.toString(arr));
			
			//3.读取字节数组长度的内容,从什么位置开始读读取的长度是多少\
			
//			byte[] arr = new byte[10];
//			/*
//			 * 第一个参数是字节数组
//			 * 第二个参数是从什么位置开始存储
//			 * 第三个参数是实际读取的长度是多少(存储的长度是多少)
//			 */
//			is.read(arr,2,5);
//			System.out.println(Arrays.toString(arr));
//			//不要使用上面这个样的打印形式上面这种形式只能打印数值无法看到实际内容
//			//将当前内容转换为字符串
//			//第一个参数是字节数组 ,第二个参数是数组中存储元素的位置, 第三个参数是读取数组中内容的长度
//			System.out.println(new String(arr, 2, 5));
			
			//需要进行循环读数据应该如何使用
			//当我们使用 read(byte[] b)方法进行数据读取或得到一个返回值
			//是int类型,如果读取到文件末尾就返回-1,没有读取到文件末尾就返回实际读取的长度
			
			//1.先创建字节数组并设置读取长度
			    byte[] buf = new byte[10];
			//2.通过方法来进行读取 ,判断读取的实际长度是否到达-1,没有就继续读,有就停止读取
			    int len =  0;
			    while( (len = is.read(buf)) != -1) {

					//2.在读取的过程中进行打印
			    	System.out.println(new String(buf,0,len));
			    	
			    }
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//释放资源
			//关闭流资源
			if(is != null) {
			   try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
