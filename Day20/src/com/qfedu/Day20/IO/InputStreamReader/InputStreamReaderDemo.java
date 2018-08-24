/**
 * 
 */
package com.qfedu.Day20.IO.InputStreamReader;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Description�� �ֽ���ת���ַ���Ӧ��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:InputStreamReaderDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) {
		//1.����ȷʹ�õ��� ���� (��ȡ In/read)
		//ps:һ��һ��Ҫע��,����������ʱ,�������ݵ���ʲô
		//��ǰ���Ǵ�����һ��ת��������,��ʱ���ǽ��ֽ�������ת��Ϊ�ַ�������
		//��ǰ���ֽ�ת���ַ����Ļ���д�� --->ʹ�õ���Ĭ�ϱ���GBK
		//  ctrl + / ����ע��
//		InputStreamReader isr = null;
//		try {
//			isr = 
//					new InputStreamReader(
//							new FileInputStream(
//									new File("src/com/qfedu/Day20/IO/Reader/ReaderDemo.java")));
//			//���Ի�ȡ��ǰ�ļ����ַ�����
//			//�������ò���,�������ֻ���ڳ���������������ܻ�õ�ǰ�ļ��ı���
//			System.out.println("��ǰ�ļ����ַ�����ʱ:"+isr.getEncoding());
//			//2.��ǰ���е� ������ʲô  char�ַ�
//			char[] cbuf = new char[1024];
//			int len = 0;
//			while((len = isr.read(cbuf))!=-1) {
//				 System.out.println(new String(cbuf,0,len));
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			if(isr != null) {
//				try {
//					isr.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
		//ʹ�ñ��뼯����ʽ����ȡ����
		//��ǰfile1.txt�ļ��ı���ʱUTF-8
		//��ʱ������ת��������ʹ�õ���UTF-8���뼯
		try(InputStreamReader isr = 
				new InputStreamReader(
						new FileInputStream(
								new File("dir/file1.txt")),Charset.forName("UTF-8"))){
			System.out.println("��ǰ�ļ�������:"+isr.getEncoding());
			char[] cbuf = new char[1024];
			int len = 0;
			while((len = isr.read(cbuf))!=-1) {
				//ȫת��Ϊ��д
				System.out.println(new String(cbuf,0,len).toUpperCase());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
