/**
 * 
 */
package com.qfedu.Day12.Time;

public class TimeDemo {
	public static void main(String[] args) {
		System.out.println("String字符串拼接10000次的时间:"+StringTime()+"毫秒");
		System.out.println("StringBuffer字符串拼接10000次的时间:"+StringBufferTime()+"毫秒");
		System.out.println("StringBuilder字符串拼接10000次的时间:"+StringBuilderTime()+"毫秒");

	}
	//String
	public static long StringTime() {
		//获取开始的时间
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
		//获取开始的时间
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
		//获取开始的时间
		long beginTime = System.currentTimeMillis();
		StringBuilder sbr = new StringBuilder();
		for(int i = 0;i<1000000;i++) {
			sbr.append(i);
		}
		long endTime = System.currentTimeMillis();
		return endTime - beginTime;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
