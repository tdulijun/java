/**
 * 
 */
package com.qfedu.Day12.String;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		//String�ڵײ�����δ洢
        //�ַ����ײ����һ���ַ����� private final char value[];
		//String str = "abcd";//�ȼ��� char[] cs = {'a','b','c','d'};
		
		//1.��δ����ַ���
		//ֱ�Ӹ�ֵ�����ַ���
		//"abc"�洢���ַ�����(������)
		String str1 = "abc";
		//ͨ��new�ؼ��ִ����ַ���
		/*
		 * ��ǰ������ʽ�ᴴ����������
		 * ����һ��
		 * ��"abc"�ڳ�������û�б�����,��ô�ͻ��ڳ������д����ַ���
		 * ��ͨ��new�ؼ����ڶѿռ䴴����һ������
		 * �ͻ���������
		 * 
		 * ��"abc"�Ѿ��ڳ����ش���,��ͨ��new�ؼ����ڶѿռ䴴����һ�������һὫ"abc"����һ��
		 * �洢���ѿռ� 
		 * ֻ�ᴴ��һ������ѿռ�Ķ���
		 */
		String str2 = new String("abc");
		
	 
		//���÷���:
		//1.��ȡ�ַ����е�ָ���ַ�
		/*
		 * �ַ����ײ�洢���ַ�����
		 * �������Ĳ���ֵ�Ǵ�0��ʼ ���ַ�������-1
		 * ���������Χ�ͻ�����쳣StringIndexOutOfBoundsException
		 */
		char ch = str1.charAt(0);
		System.out.println(ch);
		
		//2.�ַ����Ƚϴ�С (ASCII��ֵ )
		//ֻҪ��һ����һ�����ܵõ����,��ȫһ��Ҳ�ܵõ����
		//int���͵���ֵ
		/*
		 * >0    ��ǰ�ַ������ڴ����ַ��� 
		 * ==0  ��ǰ�ַ������ڴ����ַ���
		 * <0    ��ǰ�ַ���С�ڴ����ַ���
		 * ps:C# �ַ����е��ַ����Ƚϲ�������ASCIIֵ,�����ַ�����
		 * ��ǰ�ַ���: ���÷������ַ���
		 * �����ַ���: ��������Ĳ���       
		 */
		  String str3 = "abc";
		  String str3_1 = "ABC";
		  int result = str3.compareTo(str3_1);
		  if(result > 0) {
			  System.out.println("str3�ַ�����");
		  }else if(result < 0) {
			  System.out.println("str3_1�ַ�����");
		  }else {
			  System.out.println("�����ַ������");
		  }
		
		  //3.�ַ�����ƴ��
		  //3.1 +ƴ��
		  String str4 = "hello";
		  String str4_1 = "world";
		  String str4_2 = str4 + str4_1;
		  System.out.println(str4_2);
		  //3.2����ƴ��
		  String str4_3 = str4.concat(str4_1);
		  System.out.println(str4_3);
		  
		  //4.�ж��ַ������Ƿ����ָ���ַ���
		  // true ���� / false ������
		  String str5 = "�õ�";
		  String str5_1 = "��";
		  boolean result1 = str5.contains(str5_1);
		  System.out.println(result1);
		  
		  //5.���ж��ַ����Ƿ���ͬ����ʹ��equals
		  //�ַ�����ͬtrue ��ͬfalse
		  String str6 = "����";
		  String str6_1 = "����";
		  System.out.println(str6.equals(str6_1));
		  
		  //6.��ʽ���ַ���(��̬����)
		  /*��һ������ ��ʽ�����Ʒ�
		   * %d ����  %fС��  %c�ַ�  %s�ַ���  %C����
		   * �ڶ�������ʱҪ��ʽ��������
		   * ��ʽ�����Ʒ���Ҫ�͸�ʽ������һһ��Ӧ
		   * 
		   */
		  //����С������λ ������λС�� ��.�� ֧����������
		  String str7 = String.format("%.2f", 1.23556);
		  System.out.println(str7);
		  //������λ��0
		  String str7_1 = String.format("%02d", 11);
		  System.out.println(str7_1);
		  
		  
		  //7.�ӵ�ǰ�ַ������ҵ���һ�γ��ֵ�λ��
		  //7.1���ַ����в���ָ���ַ���(��һ�γ��ֵ�λ��)
		  //�ҵ��˷��ص�һ�γ��ֵ�λ��, û�ҵ�����-1
          String str8 = "abcdefc";
          char ch1 =  'c';
          int num = str8.indexOf(ch1);
		  System.out.println(num);
		  
		  //��ָ��������λ�þ�������(��һ�γ��ֵ�λ��)
		  //ָ��λ���ǰ����ڲ��ҷ�Χ
		  //�ҵ��˷��ص�һ�γ��ֵ�λ��, û�ҵ�����-1
		  int num1 = str8.indexOf(ch1, 3);
		  System.out.println(num1);
		  
		  //������������,�����������ǲ����ַ���������������һ��
		 //�ҵ��˷��ص�һ�γ��ֵ�λ��, û�ҵ�����-1
		  String str8_1 = "are you ok!";
		  String str8_2 = "ok";
		  System.out.println(str8_1.indexOf(str8_2));
		
		  //8.�ж� �ַ����Ƿ�Ϊ�� isEmpty()
		  //�ַ����ǲ���""�մ� ������  �ǲ��� null
		  //true �մ� false ����
		  String str9 = "";
		  System.out.println(str9.isEmpty());
		  
		  //9.��ȡ�ַ�������
		  System.out.println("abcdefghijklmn".length());
		
		  
		  
		  //10.�滻ָ���ַ�����ָ���ַ�
		  String str10 = "��ñ���";
		  System.out.println(str10.replace('��', '��'));
		  
		  //11.�ж�����XXX��ͷ, XXX��β
		  //true �� false ����
		  System.out.println("www.baidu.com".startsWith("www"));
		  System.out.println("www.baidu.com".endsWith("com"));
		
		
		  //12.��ȡ�ַ���
		  //12.1��ȡָ��λ�õ��ַ���(������ǰλ��,�ӵ�ǰλ�ÿ�ʼ��ȡ)
		  String str11 = "�����!";
		  System.out.println(str11.substring(2));
		  
		  //12.2��ȡָ��λ�õ��ַ���(��ʼ��λ�úͽ�����λ��)
		  /*
		   * ��һ���ǿ�ʼ��λ��(����)
		   * �ڶ����ǽ�����λ��(������)
		   */
		   String str12 = "��ñ���,�찲��!";
		   System.out.println(str12.substring(2, 8));
		
		
		  //13.���ַ���ת��Ϊ�ַ�����
		   String str13 = "�ʹ�,����,�ú�԰";
		   char[] arr = str13.toCharArray();
		   System.out.println(Arrays.toString(arr));
		   
		  //14.���ַ���ת��Ϊ��д��ĸ��Сд��ĸ
		   //���е���ĸ��ת��,��������ĸ
		  String str14 = "abcdefg";
		  System.out.println(str14.toUpperCase());//��д
		  System.out.println(str14.toLowerCase());//Сд
		
		  //15.����ֵת�����ַ���(����)
		  String str15 = String.valueOf(10);
		  System.out.println(str15);
		
		  //16.ȥ���ַ�����ǰ��Ŀո�(��ǿո�)
		   String str16 = " hello world ";
		   String str16_1 = str16.trim();
		   System.out.println(str16_1);
		 
		   //17.�ַ����Ĳ��
		   String str17 = "a b c d";
		   //�ַ�������
		   String[] str17_1 = str17.split(" ");
		   System.out.println(Arrays.toString(str17_1));
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		
		
		
		
		
	}

}
