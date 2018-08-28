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
public class BufferedReaderAndWriterDemo2 {
	public static void main(String[] args) throws Exception {
		//ָ����ȡ�ļ����ַ������д���ļ����ַ����벢��Ҫ��ʹ���ַ�����������ʽ���
		//��������
		File src = new File("dir/����ʹ�����·�����ȡ���ļ�.txt");
		File des = new File("dir/ʹ���˻���������ʽ��ɵ��ļ�.txt");
		
		ReaderAndWriterNew(src,des,"GBK","UTF-8");  //�¶�д��ʽ
		

	}
	/**
	 * ʹ�û���������ʽ���ָ�������ļ��Ķ�д����
	 * @param src Դ�ļ�
	 * @param des Ŀ���ļ�(д���λ��)
	 * @param srcCharSetName Դ�ļ��ı���
	 * @param desCharSetName Ŀ���ļ��ı���
	 * @throws Exception  �׳�����IO�쳣
	 */

	public static void ReaderAndWriterNew(File src,File des,String srcCharSetName,String  desCharSetName) throws Exception {
		/*
		 * psд���Ĳ���:
      			1.����������(ȷ�������������������)
      			2.ѭ����ȡ�ļ��е�����  --> ����һ����������ȡʵ�ʶ�ȡ�ĳ���
        		            	�ж��Ƿ��ȡ���ļ���ĩβ-1
 								���û�� ������д��ȥ
      			3.�ر���		
      	ͨ��BufferedReader�� ���������������һ�ΰ�װ,�õ�ǰ���߱��˻�����,�Ӷ��������������
      	   ������Ҳ��֮Ϊ��װ��	
      	   ��ʽ����Ƕ���������
      	   InputStream is = new FileInputStream();
      	   InputStreamReader isr = new InputStreamReader(new FileInputStream());
      	   BufferedReader br  = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(src), srcCharSetName));				
		 */
		//��ȡ
		BufferedReader br  = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(src), srcCharSetName));
		
		//д��
		BufferedWriter bw  = 
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream(des),desCharSetName));
	
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
