/**
 * 
 */
package com.qfedu.Day19.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Description： 诗词系统<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test {
      public static void main(String[] args) {
		 Poem p1 = new Poem("春晓","孟浩然","唐朝","春天不洗脚,处处蚊子咬");
		 Poem p2 = new Poem("沁园春.雪","毛爷爷","近代","啊 全是雪............");
		 Map<String,Poem> map = new HashMap<>();
		 map.put(p1.getName(), p1);
		 map.put(p2.getName(), p2);
		 System.out.println("------------------ 国家图书馆诗词查阅系统  -------------------");
		 Scanner input  = null;
		 while(true) {
		   System.out.println("请录入您要查看的诗词名：");
		   input = new Scanner(System.in);
		   String name = input.next();
		   if(map.containsKey(name)) {
			   System.out.println(map.get(name));
		   }else {
			   System.out.println("诗词系统中没有当前诗词!!!!");
		   }
		   System.out.println("还要继续阅读吗？请输入yes|no");
		   String res = input.next();
		   if("no".equals(res)) {
			   System.out.println("谢谢使用！^-^");
			   break;
		   }
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
