/**
 * 
 */
package com.qfedu.Day19.File;

import java.io.File;

/**
 * Description： 遍历目录<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:FileDemo3.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class FileDemo3 {
     public static void main(String[] args) {
    	//需求listFiles() 打印出你workspace目下所有的文件包括文件夹下的文件(递归)
    	 //1.创建File对象
    	 //ps:因个人电脑差异,建议不要遍历C盘
//    	 File file = new File("D:\\DBworkspace");
//    	 listFiles(file);
    	 
    	 //深度遍历目录树形式
    	 File file1 = new File("C:\\");
    	 showlistFilesTree(file1, 0);
    	 
	}
     /*
      * 简单遍历像是
      */
     public static void listFiles(File f) {
    	 //先打印第一次的file对象
    	 System.out.println(f);
    	 File[] files =  f.listFiles();
    	 for(File file : files) {
    		 //只要判断是文件目录就继续遍历
    		 if(file.isDirectory()) {
    			 listFiles(file);
    		 }
    	 }
    	 
     }
     /**
      * 遍历层级目录树形式
      * @param f 遍历的目录
      * @param level 是层级
      * 
      */
     public static void showlistFilesTree(File f,int level) {
    	  StringBuilder sbr = new StringBuilder("| --");
    	  for(int i = 0;i<level;i++) {
    		  sbr.insert(0, "|  ");
    	  }
    	  //先进行判断
    	  File[] files = f.listFiles();
    	  if(files == null) {
    		  return;
    	  }
    	  for(File file:files) {
    		  //打印 concat 是拼接 --> +
    		  System.out.println(sbr.toString().concat(file.getName()));
    		  if(file.isDirectory()) {
    			  showlistFilesTree(file, level+1);
    		  }
    	  }
    	  
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
