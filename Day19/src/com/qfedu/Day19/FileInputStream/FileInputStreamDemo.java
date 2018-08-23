/**
 * 
 */
package com.qfedu.Day19.FileInputStream;
//IO���µ���,������һ�����������Ҫ����һ����,��ô����Ҫ�ܶ�İ�
//����,����java.io.* һ���Ե�������IO������
import java.io.*;
import java.util.Arrays;


/**
 * Description�� �ļ��ֽ���������ʾ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:FileInputStreamDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class FileInputStreamDemo {


	public static void main(String[] args) {
		
		//�ȴ����ֽ����������� 
		//ps .�ǵ�ǰ·��
	    // FileNotFoundException û���ҵ��ļ��쳣 �׳���ǰ�쳣,·������
		//��û�н���������֮ǰ,���е�����ʹ��try...catchץȡ
		InputStream is = null;
		try {
			is = new FileInputStream("dir/file.txt");
			/*
			 * int read()  �Ӵ��������ж�ȡһ�������ֽڡ� 
			 * int read(byte[] b) �Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С� 
			 * int read(byte[] b, int off, int len) �Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С� 
			 */
			//1.���ļ��ж�ȡһ���ֽ�,�ļ��е����� 
			//ps:�ڿ���̨�ϴ�ӡ��ֵ��97 Ϊʲô? ��Ϊ��ASCII��
			//�ֽ��� --> byte  ����ǰaת��Ϊ ASCII�����д洢,���Ծ��ڿ���̨�Ͽ���97���ֵ
			/*
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			//����ȡ���ļ�ĩβʱ,ϵͳ�᷵��һ��������ʾ��ȡ�����ļ���ĩβ
			//��ô�����������-1 
			//����,��ĳ���ж�ֻҪ�ж϶�ȡ��-1�͵����ļ���ĩβ,����ȡ��
			//     ���û�ж�ȡ��-1�Ϳ��Լ�����ȡ
			System.out.println(is.read());
			*/
			//2.��ȡ�ֽ����鳤�ȵ�����,���洢���ֽ�������
			//����һ���ֽ�����
			//ps:ʵ�����ȶ�ȡ�ֽ������г��ȵ�����(����ĳ����Ƕ��پͶ�ȡ���ٸ��ֽ�)
			//   �ڴ浽��ǰ�ֽ�������,����ȡ�����ݾ����ֽ�������
			
			byte[] arr = new byte[10];
			is.read(arr);
			System.out.println(Arrays.toString(arr));
			
			//3.��ȡ�ֽ����鳤�ȵ�����,��ʲôλ�ÿ�ʼ����ȡ�ĳ����Ƕ���\
			
//			byte[] arr = new byte[10];
//			/*
//			 * ��һ���������ֽ�����
//			 * �ڶ��������Ǵ�ʲôλ�ÿ�ʼ�洢
//			 * ������������ʵ�ʶ�ȡ�ĳ����Ƕ���(�洢�ĳ����Ƕ���)
//			 */
//			is.read(arr,2,5);
//			System.out.println(Arrays.toString(arr));
//			//��Ҫʹ������������Ĵ�ӡ��ʽ����������ʽֻ�ܴ�ӡ��ֵ�޷�����ʵ������
//			//����ǰ����ת��Ϊ�ַ���
//			//��һ���������ֽ����� ,�ڶ��������������д洢Ԫ�ص�λ��, �����������Ƕ�ȡ���������ݵĳ���
//			System.out.println(new String(arr, 2, 5));
			
			//��Ҫ����ѭ��������Ӧ�����ʹ��
			//������ʹ�� read(byte[] b)�����������ݶ�ȡ��õ�һ������ֵ
			//��int����,�����ȡ���ļ�ĩβ�ͷ���-1,û�ж�ȡ���ļ�ĩβ�ͷ���ʵ�ʶ�ȡ�ĳ���
			
			//1.�ȴ����ֽ����鲢���ö�ȡ����
			    byte[] buf = new byte[10];
			//2.ͨ�����������ж�ȡ ,�ж϶�ȡ��ʵ�ʳ����Ƿ񵽴�-1,û�оͼ�����,�о�ֹͣ��ȡ
			    int len =  0;
			    while( (len = is.read(buf)) != -1) {

					//2.�ڶ�ȡ�Ĺ����н��д�ӡ
			    	System.out.println(new String(buf,0,len));
			    	
			    }
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//�ͷ���Դ
			//�ر�����Դ
			if(is != null) {
			   try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
