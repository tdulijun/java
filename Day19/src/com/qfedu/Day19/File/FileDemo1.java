/**
 * 
 */
package com.qfedu.Day19.File;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
	    String path = File.pathSeparator;
	    char cpath = File.pathSeparatorChar;
	    System.out.println("·���ָ��:"+path);
	    System.out.println("·���ָ��:"+cpath);
	    //������˵Ҫƴ��·������Ҫʹ��·������,����ƴ�ӱȽ��鷳
	    String spath = File.separator;
	    char ccpath = File.separatorChar;
	    System.out.println("·���ָ��:"+spath);
	    System.out.println("·���ָ��:"+ccpath);
	    //C:\Program Files (x86)\alipay
	    String  pathStr = "C:"+File.separator+"Program Files (x86)"+File.separator+"alipay";
	    System.out.println(pathStr);
	
	}

}
