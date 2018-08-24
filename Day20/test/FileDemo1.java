/**
 * 
 */
package com.qfedu.Day19.File;

import java.io.File;

/**
 * Description： 演示字段<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:FileDemo1.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class FileDemo1 {
	public static void main(String[] args) {
	    String path = File.pathSeparator;
	    char cpath = File.pathSeparatorChar;
	    System.out.println("路径分割符:"+path);
	    System.out.println("路径分割符:"+cpath);
	    //正常来说要拼接路径就需要使用路径符号,但是拼接比较麻烦
	    String spath = File.separator;
	    char ccpath = File.separatorChar;
	    System.out.println("路径分割符:"+spath);
	    System.out.println("路径分割符:"+ccpath);
	    //C:\Program Files (x86)\alipay
	    String  pathStr = "C:"+File.separator+"Program Files (x86)"+File.separator+"alipay";
	    System.out.println(pathStr);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
