/**
 * 
 */
package com.qfedu.Day15.Exception.ThrowAndThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

public class ThrowDemo {
	public static void main(String[] args)throws FileNotFoundException {
		//Ч����ͬ��return 
		//throw new RuntimeException();
		String str = "123a";
		try {
		int num = getNumber(str);
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}	
		
		try {
			new FileInputStream("C:\\test");
		} catch (FileNotFoundException e) {
			//1.7ʹ��throw�׳�һ���쳣����,throw new �쳣����()
			//1.7֮����ǿ�﷨catch���ǲ����ѽ���֪�쳣���Ͷ�e�ǲ��Ǿ����쳣����
			//throw����ֱ����catch������ֱ�ӽ��쳣�����׳�
			//ps:������ʹ�þ��޷��Զ�����Ϣ��
			//throw new FileNotFoundException();
		     throw e;
		}
//		int i = 0;
//		while(true) {
//			if(i == 200000) {
//				//��ò�Ҫ
//			   throw new RuntimeException("ѭ���Ѿ�ֹͣ");
//			}
//			i++;
//			
//		}
		

	}
    public static int getNumber(String value) {
    	try {
    	   return new Integer(value);
    	}catch(NumberFormatException e) {
    	   throw new NumberFormatException("ת������,���������ʲô???");
    	}
    }

	
}
