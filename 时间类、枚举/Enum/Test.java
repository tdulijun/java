/**
 * 
 */
package com.qfedu.Day14.Enum;

public class Test {
	public static void main(String[] args) {
		  //��ȡö���е�ֵ
		   Blood b = Blood.A;
		   //���Ի�ȡ���ĸ�ö�ٳ�������ǰö�ٶ���ֵ
		   String str =  b.name();
		   System.out.println(str);
		   //��ǰ��ֵ��ö�ٳ��������
		   int index =  b.ordinal();
		   System.out.println(index);
		   //��������д洢��������ö�ٳ���ֵ
		   Blood[] bs = Blood.values();
		   //����һ���ַ������Ի��ö�ٶ���--����ַ�����Ҫ��ö�ٳ��������ڵ�
		   Blood b2 = Blood.valueOf("A");
		   
		   //ö��ֵ�����ж�--switch..case
		    switch (b) {
		    //case��ƥ�����ö���ṩ����
		    //ö�ٿ���switchƥ���ԭ������,���ڵײ�ÿ��ö�ٳ�������һ�����ֵ
			case A:
				
				break;

			default:
				break;
			}
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
