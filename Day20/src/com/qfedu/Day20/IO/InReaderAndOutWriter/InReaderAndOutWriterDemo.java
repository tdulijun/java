/**
 * 
 */
package com.qfedu.Day20.IO.InReaderAndOutWriter;

import java.io.*;

public class InReaderAndOutWriterDemo {
	public static void main(String[] args) {
		//1.创建连个文件对象
		File src = new File("dir/file1.txt");
		File des = new File("test/GBK编码文件.txt");
		
		//ps:只要读取文件是编码正确,写出文件时就可以改变编码
		//   读取时就是错误的,写出时一定也是错误
		copyFile(src, des, "UTF-8", "GBK");
   
	}
	/**
	 * 使用转换流指定编码格式来进行文件拷贝
	 * @param src 源文件
	 * @param des 目标文件
	 * @param srcCharSet 源文件编码
	 * @param desCharSet 目标文件编码
	 */
	public  static  void  copyFile(File src ,File des, String srcCharSet,String desCharSet) {
		//创建转换流对象
	    try(Reader reader = new InputStreamReader(new FileInputStream(src), srcCharSet);
	    Writer writer = new OutputStreamWriter(new FileOutputStream(des),desCharSet)){
	    	//读
	    	char[] cbuf = new char[1024];
	    	int  len = 0;
	    	while((len = reader.read(cbuf))!=-1) {
	    		//写
	    		writer.write(cbuf, 0, len);
	    	}
	    	System.out.println("写完了!!!!!");
	    	
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
		
	}

}
