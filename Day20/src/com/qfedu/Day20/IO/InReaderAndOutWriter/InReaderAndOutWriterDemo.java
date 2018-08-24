/**
 * 
 */
package com.qfedu.Day20.IO.InReaderAndOutWriter;

import java.io.*;

public class InReaderAndOutWriterDemo {
	public static void main(String[] args) {
		//1.���������ļ�����
		File src = new File("dir/file1.txt");
		File des = new File("test/GBK�����ļ�.txt");
		
		//ps:ֻҪ��ȡ�ļ��Ǳ�����ȷ,д���ļ�ʱ�Ϳ��Ըı����
		//   ��ȡʱ���Ǵ����,д��ʱһ��Ҳ�Ǵ���
		copyFile(src, des, "UTF-8", "GBK");
   
	}
	/**
	 * ʹ��ת����ָ�������ʽ�������ļ�����
	 * @param src Դ�ļ�
	 * @param des Ŀ���ļ�
	 * @param srcCharSet Դ�ļ�����
	 * @param desCharSet Ŀ���ļ�����
	 */
	public  static  void  copyFile(File src ,File des, String srcCharSet,String desCharSet) {
		//����ת��������
	    try(Reader reader = new InputStreamReader(new FileInputStream(src), srcCharSet);
	    Writer writer = new OutputStreamWriter(new FileOutputStream(des),desCharSet)){
	    	//��
	    	char[] cbuf = new char[1024];
	    	int  len = 0;
	    	while((len = reader.read(cbuf))!=-1) {
	    		//д
	    		writer.write(cbuf, 0, len);
	    	}
	    	System.out.println("д����!!!!!");
	    	
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
		
	}

}
