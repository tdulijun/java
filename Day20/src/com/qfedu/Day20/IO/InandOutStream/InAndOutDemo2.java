/**
 * 
 */
package com.qfedu.Day20.IO.InandOutStream;

import java.io.*;

/**
 * Description�� xxxx<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:InAndOutDemo2.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class InAndOutDemo2 {


	public static void main(String[] args)throws Exception {
		//1���ļ����е����ݹ��˳���
		File srcFile = new  File("Java");
		File desFile = new  File("test");
		File[] files = srcFile.listFiles(new FilenameFilter() {
			/*
			 * dir ��Ӧ�ľ���srcFile�е��ļ�·��
			 * name ��Ӧ����srcFile���ļ�·���µ��ļ���
			 */
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith(".java") && new File(dir,name).isFile();
			}
		});
		//2�õ��ļ���·��,����Ӧ·�����ļ�д�뵽�µ��ļ���
		for(File file : files) {
			//���������� ����(��) ���(д) 
			InputStream is  = new FileInputStream(file);
			OutputStream os = new FileOutputStream(new File(desFile,file.getName()));
			 byte[] buf = new byte[1024];
			 int len = 0;
			 while((len = is.read(buf))!=-1) {
				 os.write(buf, 0, len);
			 }
			 os.flush();
			 System.out.println("����д����!!!!");
			 //�����ɵ����ȹر�
			 os.close();
			 is.close();
			
		}
		

	}

}
