/**
 * 
 */
package com.qfedu.Day12.StringBuilder;

public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����StringBuilder����
		//Ĭ��ʹ���޲ι��췽����������,ϵͳ���Զ���ʼһ��16��С�ֽ�����
		//�Զ�����,����һ�����������,��ԭ�������г�Ա���Ƶ���������,ʹ�����������
		StringBuilder sbr = new StringBuilder();
		 //ʹ�ø���������С������
		StringBuilder sbr1 = new StringBuilder(80);
		
		//ʹ���ַ�������StringBuilder����
		StringBuilder sbr2 = new StringBuilder("С����");
		
		
		//���Բ���ʹ�����ַ�ʽ����
		//StringBuilder sbr3 = "abcdefug";
		
		//1.���ַ������������,�������һλ�����
		sbr2.append("С����"); 
		sbr2.append('С');
		sbr2.append(10);
		System.out.println(sbr2);
		//��ʽ��� ������Ϊ��ǰappend����ֵ��this-->��ǰ����
		//this�ؼ���,������������
		sbr.append("���").append("�Һ�").append("��Һ�");
		System.out.println(sbr);
		
		//2.��ȡ���� length();
		
		//3.ɾ��ָ��λ�õ��ַ���
		/*
		 * ��һ�������ǿ�ʼ��λ��(����)
		 * �ڶ��������ǽ�����λ��(������)
		 */
		sbr2.delete(0, 3);
		System.out.println(sbr2);
		
		//4.ɾ��ָ��λ�õ��ַ���
		sbr2.deleteCharAt(0);
		System.out.println(sbr2);
		
		//��ָ���ַ������뵽ָ��λ��
		//��һ������Ҫ�����λ��,ԭ���ַ�������
		//�ڶ�������Ҫ������ַ���
		sbr2.insert(1, "��������������");
		System.out.println(sbr2);
		
		//�滻ָ��λ�õ��ַ���
		/*
		 * ��һ��������ʼ��λ��(����)
		 * �ڶ�������������λ��(������)
		 * �����������滻���ַ���
		 */
		sbr2.replace(1, 7, "����ô");
		System.out.println(sbr2);
		
		//��ת
		sbr2.reverse();
		System.out.println(sbr2);
		
		
		//�޸�ָ��λ�õ��ַ�
		sbr2.setCharAt(0, 'k');
		
		
		
		//StringBuilderת��ΪString�ַ���
		String str = sbr2.toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
