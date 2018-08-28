/**
 * 
 */
package com.qfedu.Day21.IO.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Description： 工具类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:PropertiesUtil.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class PropertiesUtil {
	 //工具类中提供的都是静态方法
	 //不能允许外部对当前类创建对象
	private PropertiesUtil() {
		
	}
	
	//定义一个静态变量获取资源文件对象
	private static Properties p ; 
	
	//类在创建的同时,就像Properties读取进来
	//这是一种方式
	static {
		//静态属性进行初始化
		p = new  Properties();
		
		//进行文件的加载
		//参数是一个字节输入流
		try {
			//这里的异常不要抛出,将当前异常进行抓取
			p.load(new FileInputStream("dir/config.properties"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//第二种就是使用类的加载器 ClassLoader --> 必须使用反射 暂留
	
	
	//提供一个静态方法,通过对应的key得到对应的value
	public static String getValue(String key) {
		//properties对象如何去除对应的value值
		return p.getProperty(key);
				
	}
 	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
