/**
 * 
 */
package com.qfedu.Day20.IO.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.qfedu.Day20.IO.SystemInAndOut.SystemInAndOutDemo;

public class BufferedInputStreamDemo {	
	public static void main(String[] args) {
		//�������쳣һ��Ҫץȡ
		//������һ���ֽ�����������
		try(BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream(
								new File("src/com/qfedu/Day20/IO/BufferedInputStream/BufferedInputStreamDemo.java")))){
			//�жϵ�ǰ�������Ƿ�֧��mark��� --> true ֧�� false ��֧��
			System.out.println("�ж��Ƿ�֧�ֱ��:"+bis.markSupported());
			bis.mark(1);//�ֽڸ���,����ʲô����ô�´ζ�ȡ����ʲôλ�ÿ�ʼ
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = bis.read(buf))!=-1) {
				System.out.println(new String(buf,0,len));
				
			}
			System.out.println("----------------------�ٴ����¶�ȡ�ļ�������-------------------------");
			bis.reset();//�������
			while((len = bis.read(buf))!=-1) {
				System.out.println(new String(buf,0,len));
				
			}
			//һ�ζ�ȡһ����
			/*
			 * hello
			 * bis.read() --> h
			 * bis.read() --> e
			 * bis.mark(3) �Զ���Զ�ȡ�����ֽ�
			 * bis.read() --> l
			 * bis.read() --> l
			 * bis.read() --> o
			 * bis.reset();
			 * bis.read() //llo
			
			 * 
			 */
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
