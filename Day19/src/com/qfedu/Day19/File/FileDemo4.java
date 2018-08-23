/**
 * 
 */
package com.qfedu.Day19.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Description：过滤文件<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:FileDemo4.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class FileDemo4 {
	 public static void main(String[] args) {
		File file = new File("D:\\Java\\week3\\Day13\\视频");
		//实现此接口的类实例可用于过滤器文件名FilenameFilte
		//返回值是一个数组--->File对象的数组
		 File[] files = file.listFiles(new  FilenameFilter() {
			/*
			 *dir file对象
			 *name 是file路径下的而文件名字
			 */
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".mp4") && new File(dir,name).isFile();
			}
		});
		 for(File f : files) {
			 System.out.println(f);
		 }
		
	}
   
}
