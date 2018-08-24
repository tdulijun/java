/**
 * 
 */
package com.qfedu.Day20.IO.InandOutStream;

import java.io.*;

/**
 * Description�� ͼƬ��д����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:InAndOutDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class InAndOutDemo {
	public static void main(String[] args) {
		//1.����ǰ�����е��ļ���ȡ���ڴ�
		InputStream is = null;
		//2.���ڴ��������ٴ�д�뵽������
		OutputStream os = null;
		try {
			is = new FileInputStream(new File("D:\\123\\1.jpg"));
			os = new FileOutputStream(new File("img/1.jpg"));
			
			//����ʹ�õ��ļ��ֽ���������� --> �ֽ�
			//��д����
			//1.�ֽ�����洢��ǰ���� һ�ξ���1KB  ��4  �� 8
			byte[] buf = new byte[1024];
			//ps:read�������з���ֵ��:ʵ�ʶ�ȡ���ݵĳ���
			//����ȡ���ļ���ĩβ -1 û�ж�ȡ��-1������ȡ
			int len = 0; //�����洢ʵ�ʶ�ȡ���
			while( (len = is.read(buf))!=-1) {
				//д������
				os.write(buf, 0, len);
			}
			os.flush();
			System.out.println("����д����!!!");
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		     if(is != null) {
		    	 try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     }
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
