import javax.swing.text.Position.Bias;

/**  
 * All rights Reserved, Designed By www.1000phone.com
 * @Title:  sd.java   
 * @Package    
 * @Description:  
 * @author: cqh  
 * @date:   2018年8月6日 上午4:37:05   
 * @version V1.0 
 * @Copyright: 2018 www.1000phone.com  Inc. All rights reserved. 
 * 注意：本内容仅限于千锋互联科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */

/**
 * 数组的增删改查
 * @author JKMaster
 *
 */
public class SearchArrayDemo {
    public static void main(String[] args) {
		int []arr =new int[]{1,2,3,4,5};
		//inputArray(arr);
		//outputArray(arr);
		//int index=binarySearch(arr, 4);
		//System.out.println(index);
	}	
    /**
     * 
     * @Title: inputArray   
     * @Description: 添加元素
     * @param arr      
     * @return: void      
     * @throws
     */
    public static void inputArray(int[]arr){
    	for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*100+1);
		}
    }
    
    /**
     * 
     * @Title: outputArray   
     * @Description: 遍历数组   
     * @param arr      
     * @return: void      
     * @throws
     */
    public static void outputArray(int[]arr){
    	for (int i : arr) {
			System.out.print(i+"\t");
		}
    }
    
    /**
     * 
     * @Title: searchNum   
     * @Description: TODO(这里用一句话描述这个方法的作用)   
     * @param 查找数据的数组
     * @param 要查找的值      
     * @return: 返回下标或-1      
     * @throws
     */
    public static int searchNum(int[]arr,int x){
    	int i;
    	for (i = 0; i < arr.length; i++) {
			if(x==arr[i]){
				System.out.println(i);
				return i;
			}
		}
    	return -1;
    	
    }
   
    /**
     * 
     * @Title: bubbluSort   
     * @Description: 冒泡排序  
     * @param arr      
     * @return: void      
     * @throws
     */
    public static void bubbluSort(int[]arr){
    	for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int tmp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
    }
    /**
     * 
     * @Title: binarySearch   
     * @Description: 二分查找 
     * @param arr
     * @param n
     * @return      
     * @return: int      
     * @throws
     */
    public static int binarySearch(int[]arr,int n){
    	//inputArray(arr);
    	
    	bubbluSort(arr);
    	int beginIndex=0;
    	int endIndex=arr.length-1;
    	int middleIndex=(beginIndex+endIndex)/2;
    	while(true){
    		if(n>arr[middleIndex]){
    			beginIndex=middleIndex+1;
    		}else if(n<arr[middleIndex]){
    			endIndex=middleIndex-1;
    		}else{
    			return middleIndex;
    		}
    		middleIndex=(beginIndex+endIndex)/2;
    		if(beginIndex>endIndex){
    			return -1;
    		}
    	}
    	
    	
    	
    }
    /**
     * 
     * @Title: gai   
     * @Description: 改变数组当中的某一个元素  
     * @param 要更改的数组
     * @param 要改变的数组元素的下标
     * @param 要改为的值
     * @return      
     * @return: 返回值为true修改成功，false修改失败      
     * @throws
     */
    public static boolean gai(int[]arr,int location,int x){
		if(arr==null||location<0||location>arr.length-1){
			return false;
		}
    	arr[location]=x;
    	return true;
		
	}
    
    /**
     * 
     * @Title: removeArrayNumber   
     * @Description: 删除数组中的元素   
     * @param arr
     * @param Rnum
     * @return      
     * @return: int      
     * @throws
     */
    public static int removeArrayNumber(int[]arr,int Rnum){
    	//定义一个变量count，记录被修改的次数
    	int count=0;
    	for (int i = 0; i < arr.length-count; i++) {
			if(Rnum==arr[i]){
				//数组的值向前移动
				for (int j = i; j < arr.length-1; j++) {
					//后一个元素向前移动覆盖
					arr[j]=arr[j+1];
				}
				count++;
				i--;//向后移动一次
			}
		}
    	return count;
    }
    /**
     * 
     * @Title: outputArray1   
     * @Description: 输出删除数组元素的方法  
     * @param arr
     * @param count      
     * @return: void      
     * @throws
     */
    public static void outputArray1(int[]arr,int count){
    	for (int i = 0; i < arr.length-count; i++) {
			System.out.println(arr[i]);
		}
    }
}
