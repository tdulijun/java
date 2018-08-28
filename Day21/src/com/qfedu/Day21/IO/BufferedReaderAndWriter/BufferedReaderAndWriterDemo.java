/**
 * 
 */
package com.qfedu.Day21.IO.BufferedReaderAndWriter;

import java.io.*;

/**
 * Description�� �ַ��������������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:BufferedReaderAndWriterDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class BufferedReaderAndWriterDemo {
	public static void main(String[] args) throws Exception {
		/*
		 * ����:���������쳣һ���׳� throws,���ڵ�ǰ�����´���һ���ļ���dir,
          	����ǰ����ʹ���ַ��������������ѭ����ȡ��д�뵽dir�ļ�����
		 */
		//ReaderAndWriterOld(); //�϶�д��ʽ
		ReaderAndWriterNew();  //�¶�д��ʽ
		

	}
	public static void ReaderAndWriterOld() throws Exception {
		/*
		 * psд���Ĳ���:
      			1.����������(ȷ�������������������)
      			2.ѭ����ȡ�ļ��е�����  --> ����һ����������ȡʵ�ʶ�ȡ�ĳ���
        		            	�ж��Ƿ��ȡ���ļ���ĩβ-1
 								���û�� ������д��ȥ
      			3.�ر���		
      	ͨ��BufferedReader�� ���������������һ�ΰ�װ,�õ�ǰ���߱��˻�����,�Ӷ��������������
      	   ������Ҳ��֮Ϊ��װ��						
		 */
		//��ȡ
		BufferedReader  br  = 
				new BufferedReader(
						new FileReader(
								new File("src/com/qfedu/Day21/IO/BufferedReaderAndWriter/BufferedReaderAndWriterDemo.java")));
		
		//д��
		BufferedWriter bw = 
				new BufferedWriter(
						new FileWriter(
								new File("dir/BufferedReaderAndWriter.java")));
		char[] cbuf = new char[1024];
		int len = 0;
		while((len = br.read(cbuf))!=-1) {
			bw.write(cbuf,0,len);
		}
		bw.flush();
		bw.close();
		br.close();
	}
	//ϵͳ���ṩ���������еķ���
	//��ȡ: readLine(); -->��ȡһ���ַ���
	//д��: newLine();  --> д��һ�����з�
	public static void ReaderAndWriterNew() throws Exception {
		/*
		 * psд���Ĳ���:
      			1.����������(ȷ�������������������)
      			2.ѭ����ȡ�ļ��е�����  --> ����һ����������ȡʵ�ʶ�ȡ�ĳ���
        		            	�ж��Ƿ��ȡ���ļ���ĩβ-1
 								���û�� ������д��ȥ
      			3.�ر���		
      	ͨ��BufferedReader�� ���������������һ�ΰ�װ,�õ�ǰ���߱��˻�����,�Ӷ��������������
      	   ������Ҳ��֮Ϊ��װ��						
		 */
		//��ȡ
		BufferedReader  br  = 
				new BufferedReader(
						new FileReader(
								new File("src/com/qfedu/Day21/IO/BufferedReaderAndWriter/BufferedReaderAndWriterDemo.java")));
		
		//д��
		BufferedWriter bw = 
				new BufferedWriter(
						new FileWriter(
								new File("dir/����ʹ�����·�����ȡ���ļ�.txt")));
		//��ȡ: readLine(); -->��ȡһ���ַ���
		//1.br.readLine(); --> ѭ����ȡ 
		// null��ֵ-->û�п����ڴ�ռ�
		//ѭ����ȡ���� --> ����д��ȥ? -->������XXX���� 	
	    String content = null;
	    //ps:��ʹ��readLine��ʽ��ȡ����,���Ȼ���Ϊ��ȡ��\n��\r��Ϊһ�еļ�ί,Ȼ������ȡ���ļ���ĩβ�᷵��null
	    //   readLine�����ȡ���з�(�س�)
	    while((content = br.readLine())!=null) {
	    	//д��ȥ
	    	bw.write(content);
	    	//��д������ʱ,��Ҫ�ֶ���ӻ��з�,��֤���ݸ�ʽ����ȷ
	    	bw.newLine();
	    }
	   
	    bw.flush();
	    System.out.println("д����!!!");
	    bw.close();
	    br.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
