package com.qianfeng.test;

public class ArrayTool {
	 //普通查找
		public static int search(int[] arr,int key){
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == key) {
					return i;//返回下标
				}
			}
			
			return -1;//没有查到值
		}
		 //二分查找
		public static int ErFenSearch(int[] arr,int key){
			int l = 0;
			int h = arr.length-1;
			
			while (l<=h) {//>>1移位运算符  ,意思是向右移动移位,代表除以2
				int m = (l+h)>>1;
				if (arr[m] == key) {
					return m;
				}else if (arr[m] > key) {
					h = m-1;
				}else if (arr[m] < key) {
					l = m+1;
				}
			}
			
			return -1;//没有查到值
		}
		
		//冒泡排序
		public static void bubbleSort(int[] arr){
			for (int i = 0; i < arr.length-1; i++) {//控制的是整体的次数
				for (int j = 0; j < arr.length-1-i; j++) {//确定一个最大值时需要比较的次数
					//比较两个数的值--进行交换
					if (arr[j] > arr[j+1]) {
						arr[j] = arr[j] ^ arr[j+1];
						arr[j+1] = arr[j] ^ arr[j+1];
						arr[j] = arr[j] ^ arr[j+1];
					}
				}
			}
		}
		//选择排序
		public  static void  SelectSort(int[] arr) {
			for (int i = 0; i < arr.length-1; i++) {//控制的是整体的次数
				for (int j = i; j < arr.length-1; j++) {//确定一个最大值时需要比较的次数
					//比较两个数的值--进行交换
					if (arr[i] > arr[j+1]) {
						arr[i] = arr[i] ^ arr[j+1];
						arr[j+1] = arr[i] ^ arr[j+1];
						arr[i] = arr[i] ^ arr[j+1];
					}
				}
		    }
		}
		
		//通过地址传递
		public static void change(int[] arr){
			arr[0] = arr[0] ^ arr[1];
			arr[1] = arr[0] ^ arr[1];
			arr[0] = arr[0] ^ arr[1];
		}
}
