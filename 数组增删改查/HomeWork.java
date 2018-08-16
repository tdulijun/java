
/**  
 * All rights Reserved, Designed By www.1000phone.com
 * @Title:  HomeWork.java   
 * @Package day01   
 * @Description:  
 * @author: cqh  
 * @date:   2018年8月5日 下午5:38:03   
 * @version V1.0 
 * @Copyright: 2018 www.1000phone.com  Inc. All rights reserved. 
 * 注意：本内容仅限于千锋互联科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class HomeWork {
	//ctrl+s  保存
	public static void main(String[] args) {
		int[]arr=new int[]{Integer.MIN_VALUE,6,Integer.MIN_VALUE,46,46,49};
		//arr=null;
		//maxAndIndex(arr);
		//avgScore(arr,10,2);
		secondMax(arr);
	}
	/**
	 * 
	 * @Title: maxAndIndex   
	 * @Description: 输出最大值和最大值下标   
	 * @param: @param arr      
	 * @return: void      
	 * @throws
	 */
	
	/*
	 * 定义最大值数组第一个元素 int max=arr[0]， int index=0;
	 * 遍历数组和最大值比较，如果大于最大值重新赋值
	 * 记录下标
	 */
	public static void maxAndIndex(int[]arr){
		if(arr==null){
			System.out.println("数据不合法");
			return;
		}
		int max=arr[0];
		//遍历数组，和最大值比较，如果大于max,则把arr[i]赋值给max
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
		}
		//拿max与数组中的每一个元素比较，相等时输出最大值，以及下标
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			if(max==arr[i]){
				System.out.println(max+":"+i);
				count++;
			}
		}
		System.out.println("最大值的个数："+count);
		
	}
	/**
	 * 
	 * @Title: avgScore   ，
	 * @Description: 平均分数   
	 * @param: @param arr      
	 * @return: void      
	 * @throws
	 */
	public static void avgScore(int[]arr,int x,int y){
		if(arr==null){
			return;
		}
		if(arr!=null&&arr.length==x){
			int max=arr[0];
			int min=arr[0];
			//求和
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				count+=arr[i];
				if(arr[i]>max){
					max=arr[i];
				}
				if(arr[i]<min){
					min=arr[i];
				}
			}
			double avg=(count-max-min)/(x-y+0.0);
			System.out.println(avg);
		}
		
	}
	/**
	 * 
	 * @Title: secondMax   
	 * @Description: 第二大的值和下标  
	 * @param: @param arr      
	 * @return: void      
	 * @throws
	 */
	/*
	 * 老大带着老二打天下。
	 */
	public static void secondMax(int[]arr){
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>second){
				if(arr[i]>first){
					second=first;
					first=arr[i];
				}else if(arr[i]!=first){
					second=arr[i];
				}
			}
		}
		if(first==Integer.MIN_VALUE){
			System.out.println("所有值都是Int最小值");
		}else if(second==Integer.MIN_VALUE){
			System.out.println("数组中所有数值都相同");
		}else{
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==second){
					System.out.println(second+":"+i);
				}
			}
		}
	}
	
	
   
}
