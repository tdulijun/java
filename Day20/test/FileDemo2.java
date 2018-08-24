/**
 * 
 */
package com.qfedu.Day19.File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * Description�� ���÷���<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:FileDemo2.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		FileMethod1();
		FileMethod2();
		FileMethod3();
		FileMethod4();

	}
	//File�ļ�����·���ķ���
    public static void  FileMethod1() {
    	//1.����File����
    	File  f = new File("D:\\abc\\xxx\\123.txt");
    	//��ȡ��ǰ�������·��   (·����ʽ����)
    	System.out.println(f.getAbsolutePath());
       //��ȡ��ǰ�������·��  (�ļ�/�ļ��з�ʽ����)
    	System.out.println(f.getAbsoluteFile());
    	//��ȡ��ǰ������ļ�·�� -->����·����һ��
    	//ps:����ǰ·�������ļ�,����ʹ��getPath����ȡ
        System.out.println(f.getPath());
        //��ȡ�ļ�������
        System.out.println(f.getName());
        //��ȡ��·��(·����ʽ����)
    	System.out.println(f.getParent());
    	//��ȡ��·��(�ļ�/�ļ��з�ʽ����)
    	System.out.println(f.getParentFile());
    
    }
    //��μ�鵱ǰ�ļ�������
    public static void FileMethod2() {
    	File  f = new File("D:\\abc\\xxx\\123.txt");
    	//��鵱ǰ�ļ��ǲ���һ����ִ���ļ�(��Windows��Ч���ǳ�������,Linux)
    	//��ִ�е��ļ�.exe .dll(��)
    	System.out.println(f.canExecute());
    	//�ж��ǲ��ǿɶ�
    	System.out.println(f.canRead());
    	//�ж��ǲ��ǿ�д
    	System.out.println(f.canWrite());
    	//��ȡ�ļ������޸�ʱ��(����ֵ) -->ת��
    	System.out.println(new Date(f.lastModified()).toLocaleString());
    	//��ȡ�ļ��Ĵ�С(��λ���ֽ�)
    	System.out.println(f.length());
    	//�̵�ǰ�ļ��Ƿ��������ļ�
    	System.out.println(f.isHidden());
    	
    }
    
    //�ļ�����Ļ�������(�ļ�)
    public static void FileMethod3() throws IOException {
    	File  dir = new File("D:\\abc\\xxx");
    	//ͬ����·����ƴ�Ӵ���file����
    	File f = new File(dir,"123.txt");
    	//File f = new File("D:\\abc\\xxx","123.txt");
    	//�жϵ�ǰFile�����ǲ���һ���ļ�
    	System.out.println(f.isFile());
    	//�жϵ�ǰFile�����ǲ���һ���ļ���
    	System.out.println(dir.isDirectory());
    	//ɾ���ļ�/�ļ��� --> trueɾ���ɹ�  false ɾ��ʧ��
    	//System.out.println(f.delete());
    	//�ж��ļ��Ƿ���� 
    	//System.out.println(f.exists());
    	if(!f.exists()) { //�ļ�����������  �������Ǽٵ�
    		//�����ļ�
    		//io��--> IOException -->io����һ���ĸ����쳣
    		f.createNewFile();
    	}else {
    		//ɾ���ļ�
    		f.delete();
    		//ps:��JVMֹͣʱɾ���ļ�
    		//f.deleteOnExit();
    	}
   
    }
    //�ļ�����Ļ�������(Ŀ¼(�ļ���))
    public static void  FileMethod4() {
    	File f = new File("D:\\123\\456\\789\\11111");
    	//�ж��ǲ����ļ���
    	System.out.println(f.isDirectory());
    	//�жϵ�ǰ�ļ����Ƿ����
    	System.out.println(f.exists());
    	//�����ļ��� -->mkdir���뱳���� --> LinuxҲ��ʹ��mkdir�����ļ���
    	//true �����ɹ�  false ����ʧ��
    	System.out.println(f.mkdir());
    	//��㼶�ļ��д���
    	//File f1 = new File("D:\\zhige\\ooo\\ppp\\xxx\\qqq");
    	//true �����ɹ�  false ����ʧ��
    	//System.out.println(f1.mkdirs());
    	//�г����е��ļ���
    	File f1 = new File("D:\\baidu\\BaiduNetdisk");
    	String[] names = f1.list();
    	System.out.println(Arrays.toString(names));
        //�г������ļ�����
    	File[] files = f1.listFiles();
    	System.out.println(Arrays.toString(files));
    	//�г�ϵͳ���̷�
    	File[] roots = File.listRoots();
    	System.out.println(Arrays.toString(roots));
    }
     
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
