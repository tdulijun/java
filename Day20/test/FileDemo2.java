/**
 * 
 */
package com.qfedu.Day19.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * Description： 常用方法<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:FileDemo2.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		FileMethod1();
		FileMethod2();
		FileMethod3();
		FileMethod4();

	}
	//File文件操作路径的方法
    public static void  FileMethod1() {
    	//1.创建File对象
    	File  f = new File("D:\\abc\\xxx\\123.txt");
    	//获取当前对象绝对路径   (路径方式考虑)
    	System.out.println(f.getAbsolutePath());
       //获取当前对象绝对路径  (文件/文件夹方式考虑)
    	System.out.println(f.getAbsoluteFile());
    	//获取当前对象的文件路径 -->绝对路径是一样
    	//ps:若当前路径下是文件,建议使用getPath来获取
        System.out.println(f.getPath());
        //获取文件的名字
        System.out.println(f.getName());
        //获取父路径(路径方式考虑)
    	System.out.println(f.getParent());
    	//获取父路径(文件/文件夹方式考虑)
    	System.out.println(f.getParentFile());
    
    }
    //如何检查当前文件的属性
    public static void FileMethod2() {
    	File  f = new File("D:\\abc\\xxx\\123.txt");
    	//检查当前文件是不是一个可执行文件(在Windows中效果非常的明显,Linux)
    	//可执行的文件.exe .dll(豆)
    	System.out.println(f.canExecute());
    	//判断是不是可读
    	System.out.println(f.canRead());
    	//判断是不是可写
    	System.out.println(f.canWrite());
    	//获取文件最后的修改时间(毫秒值) -->转换
    	System.out.println(new Date(f.lastModified()).toLocaleString());
    	//获取文件的大小(单位是字节)
    	System.out.println(f.length());
    	//盘当前文件是否是隐藏文件
    	System.out.println(f.isHidden());
    	
    }
    
    //文件对象的基本操作(文件)
    public static void FileMethod3() throws IOException {
    	File  dir = new File("D:\\abc\\xxx");
    	//同父子路径的拼接创建file对象
    	File f = new File(dir,"123.txt");
    	//File f = new File("D:\\abc\\xxx","123.txt");
    	//判断当前File对象是不是一个文件
    	System.out.println(f.isFile());
    	//判断当前File对象是不是一个文件夹
    	System.out.println(dir.isDirectory());
    	//删除文件/文件夹 --> true删除成功  false 删除失败
    	//System.out.println(f.delete());
    	//判断文件是否存在 
    	//System.out.println(f.exists());
    	if(!f.exists()) { //文件不存在是真  存在了是假的
    		//创建文件
    		//io包--> IOException -->io包下一场的父类异常
    		f.createNewFile();
    	}else {
    		//删除文件
    		f.delete();
    		//ps:在JVM停止时删除文件
    		//f.deleteOnExit();
    	}
   
    }
    //文件对象的基本操作(目录(文件夹))
    public static void  FileMethod4() {
    	File f = new File("D:\\123\\456\\789\\11111");
    	//判断是不是文件夹
    	System.out.println(f.isDirectory());
    	//判断当前文件夹是否存在
    	System.out.println(f.exists());
    	//创建文件夹 -->mkdir必须背下来 --> Linux也是使用mkdir创建文件夹
    	//true 创建成功  false 创建失败
    	System.out.println(f.mkdir());
    	//多层级文件夹创建
    	//File f1 = new File("D:\\zhige\\ooo\\ppp\\xxx\\qqq");
    	//true 创建成功  false 创建失败
    	//System.out.println(f1.mkdirs());
    	//列出所有的文件名
    	File f1 = new File("D:\\baidu\\BaiduNetdisk");
    	String[] names = f1.list();
    	System.out.println(Arrays.toString(names));
        //列出所有文件对象
    	File[] files = f1.listFiles();
    	System.out.println(Arrays.toString(files));
    	//列出系统的盘符
    	File[] roots = File.listRoots();
    	System.out.println(Arrays.toString(roots));
    }
     
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
