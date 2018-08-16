/**
 * 
 */
package com.qfedu.Day13.NumberClass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Description�� ������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Demo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Demo {
	public static void main(String[] args) {
		//Math��ѧ��:�����װ��һЩ���õ����ݹ�ʽ,Math��һ������������ķ�������static����
		//ps:������--> ��ѧ,Ӧ����ѧ+�����
		//��η���
		double max = Math.pow(2, 31)-1;
		//�������
		double random = Math.random()*100;
		//�Ƚ���������������С
		System.out.println(Math.max(1, 2));
		System.out.println(Math.min(1, 2));
		//�����ֵ
		System.out.println(Math.abs(-1));
		//��ƽ��
		System.out.println(Math.sqrt(4));
		//����PI
		System.out.println(Math.PI);

		//BigDecimal(��ȷ)
		//double��һ������ȷ���(1/3����3��һ�����߽ӽ���1��ֵ)
		System.out.println("0.09+0.01="+(0.09+0.01));
		System.out.println("1.0-0.33="+(1.0-0.33));
		System.out.println("4.015*1000="+(4.015*1000));
		System.out.println("12.3/100="+(12.3/100));
		//���ܾ�ȷ�ļ�����
		BigDecimal num1 = new BigDecimal("0.09");
		BigDecimal num2 = new BigDecimal("0.01");
		//System.out.println(num1+num2);
		//�Ѿ������ݷ�װ����BigDecimal�����������ڴβ������ݵ�ʱ��,�����ڲ�����������
		//���Բ���ֱ��ʹ����������м���
		//BigDecimal���Ѿ���װ���˶�Ӧ�ļ��㷽��
		System.out.println(num1.add(num2));
		
		//BigInteger
		BigInteger num3 = 
				new  BigInteger("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
	    
        BigInteger num4 = new BigInteger("7");
        //mod������
        if((num3.mod(num4)).toString().equals("0")) {
        	System.out.println("�ܱ�����");
        }else {
        	System.out.println("���ܱ�����");
        }
        
        //��ʽ������
        //static NumberFormat getInstance()  ���ص�ǰĬ�����Ի�����ͨ����ֵ��ʽ�� 
        NumberFormat nf = NumberFormat.getInstance();
        //ֻ�ܰ�����ʽ��16λ
        System.out.println(nf.format(1234567891111111.0));
        //��һ�����췽��-->���Դ���һ���ַ��� ,�Զ����ʽ   
        DecimalFormat df = new DecimalFormat();
        System.out.println(df.format(1234567891111111.0));
		
		

	}

}
