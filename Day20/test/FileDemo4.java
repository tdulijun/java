/**
 * 
 */
package com.qfedu.Day19.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Description�������ļ�<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:FileDemo4.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class FileDemo4 {
	 public static void main(String[] args) {
		File file = new File("D:\\Java\\week3\\Day13\\��Ƶ");
		//ʵ�ִ˽ӿڵ���ʵ�������ڹ������ļ���FilenameFilte
		//����ֵ��һ������--->File���������
		 File[] files = file.listFiles(new  FilenameFilter() {
			/*
			 *dir file����
			 *name ��file·���µĶ��ļ�����
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
