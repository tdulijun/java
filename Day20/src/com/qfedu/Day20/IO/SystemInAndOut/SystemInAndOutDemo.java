/**
 * 
 */
package com.qfedu.Day20.IO.SystemInAndOut;

import java.io.*;

/**
 * Description�� ��׼����������ض���<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:SystemInAnd.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class SystemInAndOutDemo{
      public static void main(String[] args) {
		   //��ȻҪ�ı���������
    	  //1.��Ҫ������������
    	  //�ȹ���system.in������͹���System.out������
    	  //1.7֮��Java�ṩ����try...catch�﷨ ����ֱ���ͷŶ���
    	  //ps���ж������ʹ��;����,��ֻ��һ������Ͳ���Ҫ�ֺ���
    	  try(InputStream is = new FileInputStream("src/com/qfedu/Day20/IO/ReaderAndWriter/ReaderAndWriterDemo.java");
    			  PrintStream ps = new PrintStream(new File("dir/newJava.java"))){
    		  //�޸ĵ�ǰ��׼�������������
    		  System.setIn(is);//��ʱSystem.in�Ͳ����ڿ���̨�ϻ�ȡ������,���Ǵ��㶨������л�ȡ����
    		  System.setOut(ps);//��ʱSystem.out�Ͳ����ӡ������̨����,��ӡ�����������λ��
    		  
    		  //��ǰ�����������ֽ���
    		  byte[] buf = new byte[1024];
    		  int len = 0;
    		  while((len = System.in.read(buf))!=-1) {
    			  System.out.write(buf, 0, len);
    		  }
    		 
    		  //��׼����������ı�����̨
    		  
    		  //�ı���������
    		  
    		  //1.��Ҫʹ��
    		  /*
    		   * FileOutputStream(FileDescriptor fdObj) ����һ����ָ���ļ���������д�����ݵ�����ļ���
    		   * ������һ���ļ������� ---> �ļ����
    		   * �������ǽ��Ѿ��ĵ�ԭ�б�׼����������Ļ�ϵͳ
    		   * ��Ҫ������̬�ֶ�(����)
    		   * static FileDescriptor in ��׼�������ľ���� 
    		   * static FileDescriptor out ��׼������ľ�� 
    		   * ��ǰ��������Ѿ���ȡ��ϵͳ����ı�׼
    		   */
    		PrintStream  ps1 = new PrintStream(new FileOutputStream(FileDescriptor.out));
    		 System.setOut(ps1);
    		 System.out.println("����д����!!!!!");//���ܴ�ӡ������̨��,��Ϊ�ı�����������
    		  
    		  
    		  
    		  
    		  System.out.flush();
    
    		  
    	  }catch(IOException e) {
    		  e.printStackTrace();
    	  }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
