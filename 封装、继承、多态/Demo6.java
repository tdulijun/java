package com.qianfeng.test;

public class Demo6 {
	public static void main(String[] args) {
		
	}
	//例题:实现一个函数,要求:实现两个数的加减乘除功能.
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
					System.out.println("除数为零了");
				}
			}
			 
			 return temp;
		}
}
