/**
 * 
 */
package com.qfedu.Day19.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Description�� ʫ��ϵͳ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Test {
      public static void main(String[] args) {
		 Poem p1 = new Poem("����","�Ϻ�Ȼ","�Ƴ�","���첻ϴ��,��������ҧ");
		 Poem p2 = new Poem("��԰��.ѩ","ëүү","����","�� ȫ��ѩ............");
		 Map<String,Poem> map = new HashMap<>();
		 map.put(p1.getName(), p1);
		 map.put(p2.getName(), p2);
		 System.out.println("------------------ ����ͼ���ʫ�ʲ���ϵͳ  -------------------");
		 Scanner input  = null;
		 while(true) {
		   System.out.println("��¼����Ҫ�鿴��ʫ������");
		   input = new Scanner(System.in);
		   String name = input.next();
		   if(map.containsKey(name)) {
			   System.out.println(map.get(name));
		   }else {
			   System.out.println("ʫ��ϵͳ��û�е�ǰʫ��!!!!");
		   }
		   System.out.println("��Ҫ�����Ķ���������yes|no");
		   String res = input.next();
		   if("no".equals(res)) {
			   System.out.println("ллʹ�ã�^-^");
			   break;
		   }
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
