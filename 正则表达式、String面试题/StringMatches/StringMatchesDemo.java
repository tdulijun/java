/**
 * 
 */
package com.qfedu.Day13.StringMatches;

/**
 * Description�� ����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:StringMatchesDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class StringMatchesDemo {
	public static void main(String[] args) {
		String name = "����˭";
		boolean result = name.matches("[����˭]");
		//[����˭] --> ��|��|˭
        System.out.println(result);
        boolean result2 = "��".matches("[����˭]");
        System.out.println(result2);
        //�ж��ַ���9�ǲ�������
        String number = "9";
        // \d ���� \w ��ĸ ���� �»��� \s �س� �ո�ȿհ׷�
        
         boolean result3 = number.matches("\\d");
         System.out.println(result3);
         
          //ƥ������: ��ĸ����_@��ĸ����.��ĸ���ֵĴ��� .com
          String regx = "\\w+@\\w+(\\.\\w+){1,2}";
          String email = "weixin@163.com";
          boolean result4 = email.matches(regx);
          System.out.println(result4);
          
          //ƥ���ֻ���  131 2 3 4 5 6 7 8 9   XXXX   XXXX
          //          14 7  
          //          16 6
          //          15 1 2 3 4 5 6 7 8 9
          //          17 1
          //          18 1 2 3 8
          //ǰ��λ��  1λ�Ǳ仯  9λ�ǹ̶���
         String numberPhone = "1[3|4|5|6|7|8]\\d{9}";
         String str = "11111111111";
         System.out.println(str.matches(numberPhone));
         
         
         
         
         
         
         
         
         
         
         
	}

}
