/**
 * 
 */
package com.qfedu.Day19.File;

import java.io.File;

/**
 * Description�� ����Ŀ¼<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:FileDemo3.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class FileDemo3 {
     public static void main(String[] args) {
    	//����listFiles() ��ӡ����workspaceĿ�����е��ļ������ļ����µ��ļ�(�ݹ�)
    	 //1.����File����
    	 //ps:����˵��Բ���,���鲻Ҫ����C��
//    	 File file = new File("D:\\DBworkspace");
//    	 listFiles(file);
    	 
    	 //��ȱ���Ŀ¼����ʽ
    	 File file1 = new File("C:\\");
    	 showlistFilesTree(file1, 0);
    	 
	}
     /*
      * �򵥱�������
      */
     public static void listFiles(File f) {
    	 //�ȴ�ӡ��һ�ε�file����
    	 System.out.println(f);
    	 File[] files =  f.listFiles();
    	 for(File file : files) {
    		 //ֻҪ�ж����ļ�Ŀ¼�ͼ�������
    		 if(file.isDirectory()) {
    			 listFiles(file);
    		 }
    	 }
    	 
     }
     /**
      * �����㼶Ŀ¼����ʽ
      * @param f ������Ŀ¼
      * @param level �ǲ㼶
      * 
      */
     public static void showlistFilesTree(File f,int level) {
    	  StringBuilder sbr = new StringBuilder("| --");
    	  for(int i = 0;i<level;i++) {
    		  sbr.insert(0, "|  ");
    	  }
    	  //�Ƚ����ж�
    	  File[] files = f.listFiles();
    	  if(files == null) {
    		  return;
    	  }
    	  for(File file:files) {
    		  //��ӡ concat ��ƴ�� --> +
    		  System.out.println(sbr.toString().concat(file.getName()));
    		  if(file.isDirectory()) {
    			  showlistFilesTree(file, level+1);
    		  }
    	  }
    	  
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
