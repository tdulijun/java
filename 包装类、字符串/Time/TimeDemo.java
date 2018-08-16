/**
 * 
 */
package com.qfedu.Day12.Time;

public class TimeDemo {
	public static void main(String[] args) {
		System.out.println("String�ַ���ƴ��10000�ε�ʱ��:"+StringTime()+"����");
		System.out.println("StringBuffer�ַ���ƴ��10000�ε�ʱ��:"+StringBufferTime()+"����");
		System.out.println("StringBuilder�ַ���ƴ��10000�ε�ʱ��:"+StringBuilderTime()+"����");

	}
	//String
	public static long StringTime() {
		//��ȡ��ʼ��ʱ��
		long beginTime = System.currentTimeMillis();
		String str = "";
		for(int i = 0;i<1000000;i++) {
			str += i;
		}
		long endTime = System.currentTimeMillis();
		return endTime - beginTime;
	
	}
	//StringBuffer
	public static long StringBufferTime() {
		//��ȡ��ʼ��ʱ��
		long beginTime = System.currentTimeMillis();
		StringBuffer sbr = new StringBuffer();
		for(int i = 0;i<1000000;i++) {
			sbr.append(i);
		}
		long endTime = System.currentTimeMillis();
		return endTime - beginTime;
		
	}
	//StringBuilder
	public static long StringBuilderTime() {
		//��ȡ��ʼ��ʱ��
		long beginTime = System.currentTimeMillis();
		StringBuilder sbr = new StringBuilder();
		for(int i = 0;i<1000000;i++) {
			sbr.append(i);
		}
		long endTime = System.currentTimeMillis();
		return endTime - beginTime;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
