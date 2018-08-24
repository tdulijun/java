package com.qfedu.LandLordsDemo;

import java.util.Comparator;

/**
 * 扑克牌比较规则
 * @author JKMaster
 *
 */
public class Relu implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		//定义两个Integer类型存储 转换后的值进行比较
		Integer i1;
		Integer i2;
		//点数和花色进行拆分
		//"2","3","4","5","6","7","8","9","10","J","Q","K","A" "🦁","🐯"
		String str1 = o1.substring(1);
		String str2 = o2.substring(1);
		
		if(str1.equals("J")) {
			i1 = 11;
		}else if(str1.equals("Q")) {
			i1 = 12;
		}else if(str1.equals("K")) {
			i1 = 13;
		}else if(str1.equals("A")) {
			i1 = 14;
		}else if(str1.equals("🐯")) {
			i1 = 15;
		}else if(str1.equals("🦁")) {
			i1 = 16;
		}else {
			i1 = new Integer(str1);
		}
		
		if(str2.equals("J")) {
			i2 = 11;
		}else if(str2.equals("Q")) {
			i2 = 12;
		}else if(str2.equals("K")) {
			i2 = 13;
		}else if(str2.equals("A")) {
			i2 = 14;
		}else if(str2.equals("🐯")) {
			i2 = 15;
		}else if(str2.equals("🦁")) {
			i2 = 16;
		}else {
			i2 = new Integer(str2);
		}
		
		
		
		
		
		return i1 - i2;
	}

}
