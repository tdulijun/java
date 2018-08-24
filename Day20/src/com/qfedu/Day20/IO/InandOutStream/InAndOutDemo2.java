/**
 * 
 */
package com.qfedu.Day20.IO.InandOutStream;

import java.io.*;

/**
 * Description： xxxx<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:InAndOutDemo2.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class InAndOutDemo2 {


	public static void main(String[] args)throws Exception {
		//1将文件夹中的数据过滤出来
		File srcFile = new  File("Java");
		File desFile = new  File("test");
		File[] files = srcFile.listFiles(new FilenameFilter() {
			/*
			 * dir 对应的就是srcFile中的文件路径
			 * name 对应的是srcFile中文件路径下的文件名
			 */
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith(".java") && new File(dir,name).isFile();
			}
		});
		//2拿到文件的路径,将对应路径的文件写入到新的文件中
		for(File file : files) {
			//构建流对象 输入(读) 输出(写) 
			InputStream is  = new FileInputStream(file);
			OutputStream os = new FileOutputStream(new File(desFile,file.getName()));
			 byte[] buf = new byte[1024];
			 int len = 0;
			 while((len = is.read(buf))!=-1) {
				 os.write(buf, 0, len);
			 }
			 os.flush();
			 System.out.println("老子写完了!!!!");
			 //最后完成的流先关闭
			 os.close();
			 is.close();
			
		}
		

	}

}
