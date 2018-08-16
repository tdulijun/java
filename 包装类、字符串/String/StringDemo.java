/**
 * 
 */
package com.qfedu.Day12.String;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		//String在底层是如何存储
        //字符串底层就是一个字符数组 private final char value[];
		//String str = "abcd";//等价于 char[] cs = {'a','b','c','d'};
		
		//1.如何创建字符串
		//直接赋值创建字符串
		//"abc"存储在字符串池(常量池)
		String str1 = "abc";
		//通过new关键字创建字符串
		/*
		 * 当前创建方式会创建几个对象
		 * 至少一个
		 * 若"abc"在常量池中没有被创建,那么就会在常量池中创建字符串
		 * 在通过new关键字在堆空间创建出一个对象
		 * 就会两个对象
		 * 
		 * 若"abc"已经在常量池存在,在通过new关键字在堆空间创建出一个对象并且会将"abc"拷贝一份
		 * 存储到堆空间 
		 * 只会创建一个对象堆空间的对象
		 */
		String str2 = new String("abc");
		
	 
		//常用方法:
		//1.获取字符串中的指定字符
		/*
		 * 字符串底层存储是字符数组
		 * 这个传入的参数值是从0开始 到字符串长度-1
		 * 不是这个范围就会出现异常StringIndexOutOfBoundsException
		 */
		char ch = str1.charAt(0);
		System.out.println(ch);
		
		//2.字符串比较大小 (ASCII码值 )
		//只要有一个不一样就能得到结果,若全一样也能得到结果
		//int类型的数值
		/*
		 * >0    当前字符串大于传入字符串 
		 * ==0  当前字符串等于传入字符串
		 * <0    当前字符串小于传入字符串
		 * ps:C# 字符串中的字符串比较不是遵守ASCII值,本地字符编码
		 * 当前字符串: 调用方法的字符串
		 * 传入字符串: 方法传入的参数       
		 */
		  String str3 = "abc";
		  String str3_1 = "ABC";
		  int result = str3.compareTo(str3_1);
		  if(result > 0) {
			  System.out.println("str3字符串大");
		  }else if(result < 0) {
			  System.out.println("str3_1字符串大");
		  }else {
			  System.out.println("两个字符串相等");
		  }
		
		  //3.字符串的拼接
		  //3.1 +拼接
		  String str4 = "hello";
		  String str4_1 = "world";
		  String str4_2 = str4 + str4_1;
		  System.out.println(str4_2);
		  //3.2方法拼接
		  String str4_3 = str4.concat(str4_1);
		  System.out.println(str4_3);
		  
		  //4.判断字符串中是否存在指定字符串
		  // true 存在 / false 不存在
		  String str5 = "好的";
		  String str5_1 = "的";
		  boolean result1 = str5.contains(str5_1);
		  System.out.println(result1);
		  
		  //5.若判断字符串是否相同必须使用equals
		  //字符串相同true 不同false
		  String str6 = "北京";
		  String str6_1 = "深圳";
		  System.out.println(str6.equals(str6_1));
		  
		  //6.格式化字符串(静态方法)
		  /*第一个参数 格式化控制符
		   * %d 整数  %f小数  %c字符  %s字符串  %C汉字
		   * 第二个参数时要格式化的数据
		   * 格式化控制符需要和格式化数据一一对应
		   * 
		   */
		  //保留小数后两位 保留几位小数 就.几 支持四舍五入
		  String str7 = String.format("%.2f", 1.23556);
		  System.out.println(str7);
		  //不足两位补0
		  String str7_1 = String.format("%02d", 11);
		  System.out.println(str7_1);
		  
		  
		  //7.从当前字符串中找到第一次出现的位置
		  //7.1在字符串中查找指定字符串(第一次出现的位置)
		  //找到了返回第一次出现的位置, 没找到返回-1
          String str8 = "abcdefc";
          char ch1 =  'c';
          int num = str8.indexOf(ch1);
		  System.out.println(num);
		  
		  //从指定索引的位置据向后查找(第一次出现的位置)
		  //指定位置是包含在查找范围
		  //找到了返回第一次出现的位置, 没找到返回-1
		  int num1 = str8.indexOf(ch1, 3);
		  System.out.println(num1);
		  
		  //还有两个重载,这两个重载是查找字符串方法和上面是一样
		 //找到了返回第一次出现的位置, 没找到返回-1
		  String str8_1 = "are you ok!";
		  String str8_2 = "ok";
		  System.out.println(str8_1.indexOf(str8_2));
		
		  //8.判断 字符串是否为空 isEmpty()
		  //字符串是不是""空串 而不是  是不是 null
		  //true 空串 false 不是
		  String str9 = "";
		  System.out.println(str9.isEmpty());
		  
		  //9.获取字符串长度
		  System.out.println("abcdefghijklmn".length());
		
		  
		  
		  //10.替换指定字符串中指定字符
		  String str10 = "你好北京";
		  System.out.println(str10.replace('你', '您'));
		  
		  //11.判断所以XXX开头, XXX结尾
		  //true 是 false 不是
		  System.out.println("www.baidu.com".startsWith("www"));
		  System.out.println("www.baidu.com".endsWith("com"));
		
		
		  //12.截取字符串
		  //12.1截取指定位置的字符串(包含当前位置,从当前位置开始截取)
		  String str11 = "你好呗!";
		  System.out.println(str11.substring(2));
		  
		  //12.2截取指定位置的字符串(开始的位置和结束的位置)
		  /*
		   * 第一个是开始的位置(包含)
		   * 第二个是结束的位置(不包含)
		   */
		   String str12 = "你好北京,天安门!";
		   System.out.println(str12.substring(2, 8));
		
		
		  //13.将字符串转换为字符数组
		   String str13 = "故宫,长城,颐和园";
		   char[] arr = str13.toCharArray();
		   System.out.println(Arrays.toString(arr));
		   
		  //14.将字符串转换为大写字母或小写字母
		   //所有的字母都转换,必须是字母
		  String str14 = "abcdefg";
		  System.out.println(str14.toUpperCase());//大写
		  System.out.println(str14.toLowerCase());//小写
		
		  //15.将数值转换成字符串(重载)
		  String str15 = String.valueOf(10);
		  System.out.println(str15);
		
		  //16.去掉字符串中前后的空格(半角空格)
		   String str16 = " hello world ";
		   String str16_1 = str16.trim();
		   System.out.println(str16_1);
		 
		   //17.字符串的拆分
		   String str17 = "a b c d";
		   //字符串数组
		   String[] str17_1 = str17.split(" ");
		   System.out.println(Arrays.toString(str17_1));
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		
		
		
		
		
	}

}
