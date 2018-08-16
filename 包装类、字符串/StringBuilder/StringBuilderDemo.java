/**
 * 
 */
package com.qfedu.Day12.StringBuilder;

public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//构建StringBuilder对象
		//默认使用无参构造方法创建对象,系统会自动开始一个16大小字节数组
		//自动扩容,创建一个更大的数组,将原有数组中成员复制到新数组中,使用这个新数组
		StringBuilder sbr = new StringBuilder();
		 //使用给定容量大小的数组
		StringBuilder sbr1 = new StringBuilder(80);
		
		//使用字符串创建StringBuilder对象
		StringBuilder sbr2 = new StringBuilder("小黄人");
		
		
		//绝对不能使用这种方式创建
		//StringBuilder sbr3 = "abcdefug";
		
		//1.向字符串中添加内容,是想最后一位置添加
		sbr2.append("小红人"); 
		sbr2.append('小');
		sbr2.append(10);
		System.out.println(sbr2);
		//链式编程 就是因为当前append返回值是this-->当前对象
		//this关键字,当做参数传递
		sbr.append("你好").append("我好").append("大家好");
		System.out.println(sbr);
		
		//2.获取长度 length();
		
		//3.删除指定位置的字符串
		/*
		 * 第一个参数是开始的位置(包含)
		 * 第二个参数是结束的位置(不包含)
		 */
		sbr2.delete(0, 3);
		System.out.println(sbr2);
		
		//4.删除指定位置的字符串
		sbr2.deleteCharAt(0);
		System.out.println(sbr2);
		
		//将指定字符串插入到指定位置
		//第一个参数要插入的位置,原有字符串后移
		//第二个参数要插入的字符串
		sbr2.insert(1, "啦啦啦啦啦啦啦");
		System.out.println(sbr2);
		
		//替换指定位置的字符串
		/*
		 * 第一个参数开始的位置(包括)
		 * 第二个参数结束的位置(不包括)
		 * 第三个参数替换的字符串
		 */
		sbr2.replace(1, 7, "饿了么");
		System.out.println(sbr2);
		
		//反转
		sbr2.reverse();
		System.out.println(sbr2);
		
		
		//修改指定位置的字符
		sbr2.setCharAt(0, 'k');
		
		
		
		//StringBuilder转换为String字符串
		String str = sbr2.toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
