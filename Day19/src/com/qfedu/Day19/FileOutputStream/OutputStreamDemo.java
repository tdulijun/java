/**
 * 
 */
package com.qfedu.Day19.FileOutputStream;

import java.io.*;

/**
 * Description�� �ļ��ֽ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:OutputStream.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class OutputStreamDemo {
	public static void main(String[] args) {
		
	
		OutputStream os = null;
		OutputStream oos = null;
		try {
			//�����ļ��ֽ������,������ʲôλ�ý��ļ�д��ȥ
			//��д�����ļ�����û���õ�ǰ�ļ�,���Զ�����
			//os = new FileOutputStream("dir/newFile.txt");
			//�����ļ��ֽ������,������ʲôλ�ý��ļ�д��ȥ,ȷ��׷��
			//���Ḳ��ԭ���ļ�����,������ԭ���ļ����ݵĻ����ϼ���д��
			oos = new  FileOutputStream("dir/newFile.txt",true);
			/*
			 * void write(byte[] b) �� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С� 
               void write(byte[] b, int off, int len)��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ�������� 
               void write(int b) ��ָ���ֽ�д����ļ�������� 
			 */
//			os.write(97);
//			//getBytes()����ǰ�ַ���ת��Ϊ�ֽ�����
//			os.write("abcdefg".getBytes());
//			os.write("ABCD".getBytes(), 1, 3);
			oos.write("����׷�ӵ�����".getBytes());
			oos.flush();
			System.out.println("����д����!!!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(os != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
