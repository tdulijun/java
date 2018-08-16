/**
 * 
 */
package com.qfedu.Day14.Enum;

public class Test {
	public static void main(String[] args) {
		  //获取枚举中的值
		   Blood b = Blood.A;
		   //可以获取是哪个枚举常量给当前枚举对象赋值
		   String str =  b.name();
		   System.out.println(str);
		   //当前赋值的枚举常量的序号
		   int index =  b.ordinal();
		   System.out.println(index);
		   //这个数组中存储的是所有枚举常量值
		   Blood[] bs = Blood.values();
		   //传入一个字符串可以获得枚举对象--这个字符串需要是枚举常量所存在的
		   Blood b2 = Blood.valueOf("A");
		   
		   //枚举值进行判断--switch..case
		    switch (b) {
		    //case所匹配的是枚举提供常量
		    //枚举可以switch匹配的原因在于,在于底层每个枚举常量都有一个序号值
			case A:
				
				break;

			default:
				break;
			}
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
