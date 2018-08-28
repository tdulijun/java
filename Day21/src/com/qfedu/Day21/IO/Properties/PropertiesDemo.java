/**
 * 
 */
package com.qfedu.Day21.IO.Properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties; 

/**
 * Description： Properties文件的写入<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:PropertiesDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class PropertiesDemo {
	public static void main(String[] args)throws Exception {
		//第二种写法 使用字符缓冲流获取控制台数据
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
		//此时写出的流对象所创建的文件必须后缀名是properties,这样才能创建一个Properties文件
		BufferedWriter bw = 
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("dir/config.properties")));
		//1.需要创建Properties对象-->util包下的
		Properties p = new Properties();
		//做一个循环读取将数据写到文件汇总
		while(true) {
			System.out.println("请输入key:");
			String key = br.readLine();
			
			//若当前获取key值为Over时,就完成整个输出
			if("over".equals(key)) {
				break;
			}
			
			System.out.println("请输入value:");
			String value = br.readLine();
			
			//以键值对的形式存储数据到Properties文件中
			//此时只是将数据写入到了Properties所创建的对象中
			p.setProperty(key, value);
			
		}
		
		
		//将Properties对象写成文件
		/*
		 * 若将Properties对象写文件需要使用下面的方法
		 * 第一个参数 是一个字节输出流
		 * 第二个参数 当前文件的注释
		 * 在properties文件中以#开头的就是注释
		 */
		p.store(bw, "我是注释");
		
		

	}

}
