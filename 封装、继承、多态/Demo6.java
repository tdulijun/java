package com.qianfeng.test;

public class Demo6 {
	public static void main(String[] args) {
		
	}
	//����:ʵ��һ������,Ҫ��:ʵ���������ļӼ��˳�����.
		public int jiSuan(char status,int a,int b){
			int temp = 0;
			 if (status == '+') {
				temp = a+b;
			}else if (status == '-') {
				temp = a-b;
			}else if (status == '*') {
				temp = a*b;
			}else if (status == '/') {
				if (b != 0) {
					temp = a/b;
				}else {
					System.out.println("����Ϊ����");
				}
			}
			 
			 return temp;
		}
}
