package com.qfedu.Day11.DesignMode.Template;
//×ÓÀà
public class ArraySortMaoPo extends OperateTime{

	@Override
	public void dowork() {
		int[] array = new  int[10000];
		for(int i = 0;i<array.length;i++) {
			array[i] = (int)(Math.random()*10000);
			
		}
		for(int i = 0;i<array.length-1;i++) {
			for(int j = 0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		
		
		
	}

}
