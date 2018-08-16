package com.qianfeng.test;

public class ArrayTool {
	 //��ͨ����
		public static int search(int[] arr,int key){
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == key) {
					return i;//�����±�
				}
			}
			
			return -1;//û�в鵽ֵ
		}
		 //���ֲ���
		public static int ErFenSearch(int[] arr,int key){
			int l = 0;
			int h = arr.length-1;
			
			while (l<=h) {//>>1��λ�����  ,��˼�������ƶ���λ,�������2
				int m = (l+h)>>1;
				if (arr[m] == key) {
					return m;
				}else if (arr[m] > key) {
					h = m-1;
				}else if (arr[m] < key) {
					l = m+1;
				}
			}
			
			return -1;//û�в鵽ֵ
		}
		
		//ð������
		public static void bubbleSort(int[] arr){
			for (int i = 0; i < arr.length-1; i++) {//���Ƶ�������Ĵ���
				for (int j = 0; j < arr.length-1-i; j++) {//ȷ��һ�����ֵʱ��Ҫ�ȽϵĴ���
					//�Ƚ���������ֵ--���н���
					if (arr[j] > arr[j+1]) {
						arr[j] = arr[j] ^ arr[j+1];
						arr[j+1] = arr[j] ^ arr[j+1];
						arr[j] = arr[j] ^ arr[j+1];
					}
				}
			}
		}
		//ѡ������
		public  static void  SelectSort(int[] arr) {
			for (int i = 0; i < arr.length-1; i++) {//���Ƶ�������Ĵ���
				for (int j = i; j < arr.length-1; j++) {//ȷ��һ�����ֵʱ��Ҫ�ȽϵĴ���
					//�Ƚ���������ֵ--���н���
					if (arr[i] > arr[j+1]) {
						arr[i] = arr[i] ^ arr[j+1];
						arr[j+1] = arr[i] ^ arr[j+1];
						arr[i] = arr[i] ^ arr[j+1];
					}
				}
		    }
		}
		
		//ͨ����ַ����
		public static void change(int[] arr){
			arr[0] = arr[0] ^ arr[1];
			arr[1] = arr[0] ^ arr[1];
			arr[0] = arr[0] ^ arr[1];
		}
}
