/**
 * 
 */
package com.qfedu.Day20.IO.NeiCun;

import java.io.*;

/**
 * Description�� �ڴ�������ʾ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Demo {
	public static void main(String[] args)throws Exception{
		//showByteArray();
		//1.����д���ַ�������
		StringWriter writer = new StringWriter();
		writer.write("С����ʲô�ط�����?");
		writer.write("������");
		writer.write("B����ʲô�ط�����?");
		writer.write("������");
		
		StringReader reader = new StringReader(writer.toString());
		char[] buffer = new char[1024];
		int len = 0;
		while((len = reader.read(buffer))!=-1) {
			System.out.println(new String(buffer,0,len));
		}
		

	}
	public static void showByteArray()throws Exception {
		//��Ϊ,��Ҫ�������ȴ洢���ڴ�������Ȼ�����ʹ���ڴ��������ݶ�ȡ����
				//�����ֽ��ڴ������ ����-->�ڴ� д������
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				bos.write("ABCDEFG".getBytes());//������д�뵽�ڴ�
				//Ҫʹ����������������
				byte[] buffer = bos.toByteArray();
				
				//��ȡ  �ڴ������ݽ������ڶ�ȡ�� --> ������
				//������һ������ --> �洢��д�뵽д�뵽�ڴ��е�����
				ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
			      byte[] bs = new byte[5];
			      int len = 0;
			      while((len = bis.read(bs))!=-1) {
			    	  System.out.println(new String(bs,0,len));
			      }
				bis.close();
				bos.close();
				//CharArrayReader �� CharArrayWriter ʹ�÷�ʽ�� byte��һ���� �ı������������ͼ���
	}

}
