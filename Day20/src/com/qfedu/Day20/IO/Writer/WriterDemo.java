/**
 * 
 */
package com.qfedu.Day20.IO.Writer;

import java.io.*;

/**
 * Description：字符输出流<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:WriterDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class WriterDemo {

	public static void main(String[] args) {
		//1.构建流对象 --> 写出去(输出流)
		String str1 = "饿了!";
		String str2 = "今天早饭就吃了一个三明治\n";
		String str3 = "经过了1个半小时 饿了...真的饿\n";
		String str4 = "吃饭去吧!!!!";
		Writer writer = null;
		try {
			//FileWriter和FileInputStrea类似
			//都提供了一个构造方法 这个方法可以在文件的末尾追加新的数据
			//参数是boolean 默认值是false代表不追加 ,若需要追加请使用true
			writer = new FileWriter("dir/饿了么.txt");
			//提供一个特有方法 参数是字符串 将字符串写出去
			writer.write(str1);
			writer.write(str2);
			writer.write(str3);
			writer.write(str4);
			//append 正常使用的效果和wirter是一样的
		    //除非使用了 可以追加 不然,一般情况下是不会会使用这个方法
			writer.append("拜拜!!!");
			//出上面这些方法外最常用的就是write(cbuf, off, len);
			writer.flush();
			System.out.println("写完了");
			
			
			
			
			
			
			
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
		}
		
		

	}

}
