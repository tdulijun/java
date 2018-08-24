/**
 * 
 */
package com.qfedu.Day20.IO.Reader;

import java.io.*;

/**
 * Description�� �ַ�������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ReaderDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ReaderDemo {
	public static void main(String[] args) {
		//1.���������� -->�������� (��)
		Reader reader = null;
		try {
			reader = new FileReader("dir/file.txt");
			
			//2.��������������ʲô ---> char����
			char[] cbuf = new char[1024];
			//ʵ�ʶ�ȡ���ݵĳ���
			int len =  0;
		    while((len = reader.read(cbuf))!=-1) {
		    	System.out.println(new String(cbuf,0,len));
		    }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
