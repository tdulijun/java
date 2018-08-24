/**
 * 
 */
package com.qfedu.Day20.IO.ReaderAndWriter;

import java.io.*;
/**
 * Description�� �ַ����������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ReaderAndWriterDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ReaderAndWriterDemo {
	public static void main(String[] args) {
		 //1.���������� --> ��������(����,���)
		 //2.���е�����Ӧ���� �ַ�
		Reader reader = null;
        Writer writer = null;
		try {
			reader = new FileReader("D:\\123\\2.jpg");
			writer = new FileWriter("img/2.jpg");
			
			//��ȷ�����е��������ַ�
			//�����ַ�����洢���ݲ���ȡ��С
			char[] cbuf = new char[1024];
			//��������洢ʵ�ʶ�ȡ�ĳ���
			int len = 0;
			while( (len = reader.read(cbuf)) != -1) {
				writer.write(cbuf, 0, len);
			}
			writer.flush();
			System.out.println("д����!!!!");
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
