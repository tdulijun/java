/**
 * 
 */
package com.qfedu.Day15.Exception.ThrowAndThrows;

/**
 * Description�� throws�쳣<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:ThrowsDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class ThrowsDemo {
	//���:main�Ѿ������յ�λ��,����main�м����׳��쳣,������ֻ��һ��JVM
	//�õ��Ľ��������ڿ���̨�ϴ�ӡ����ջ��Ϣ
	//ps:throws��Ҫ�����þ�����ʾ���������쳣��Ҫ����,һ���ͱ���ʱ�쳣һ��ʹ��
      public static void main(String[] args)throws NumberFormatException {
    	  
    	  String str = "123a";
    	  
    	  //��ȷ������������Ҫ��������쳣try...catch
    	  //���Ǵ����쳣����һ�ַ�������throws
    	  int num = getResult(str);
		
	}
     public static int getResult(String value)throws NumberFormatException {
    	 return new Integer(value);
     }
}
