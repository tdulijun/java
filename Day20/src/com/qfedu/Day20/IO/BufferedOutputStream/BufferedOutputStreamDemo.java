/**
 * 
 */
package com.qfedu.Day20.IO.BufferedOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class BufferedOutputStreamDemo {
	public static void main(String[] args)throws Exception {
		//�ڿ���̨�ϻ�ȡ����-->bis������Ϳ����ڿ���̨�ϻ�ȡ����
		//ps:Scanner --> �ڿ���̨�ϻ�ȡ����
		BufferedInputStream bis = new BufferedInputStream(System.in);
	    PrintStream ps = new PrintStream(new FileOutputStream(new File("dir/�ֽڻ��������������.txt")));
	    System.setOut(ps);
		//������׼�����
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		//�ڿ���̨��������������ʲô��д�뵽��Ӧ���ļ���
		byte[] bs = new byte[1024];
		int len = 0;
		while(true) {
			//��ȡ����̨����
			len = bis.read(bs);
		   //����һ���ַ���
			String content = new String(bs,0,len);
			//ֻҪ������886,��������ֹͣ
			if("886\r\n".equals(content)) {
				break;
			}
			bos.write(content.getBytes());
			bos.flush();
		}	
		bos.close();
		bis.close();
	
	}

}
