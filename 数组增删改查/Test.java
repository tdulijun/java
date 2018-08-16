/**  
 * All rights Reserved, Designed By www.1000phone.com
 * @Title:  Test.java   
 * @Package    
 * @Description:  
 * @author: cqh  
 * @date:   2018年8月6日 上午11:38:54   
 * @version V1.0 
 * @Copyright: 2018 www.1000phone.com  Inc. All rights reserved. 
 * 注意：本内容仅限于千锋互联科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class Test {

	public static void main(String[] args) {
		int x =11;
		show(x);
		System.out.println("main方法的x的值是"+x);
		int[]arr=new int[3];
		arr[1]=25;
		showArray(arr);
		System.out.println(arr[0]);//是多少？
	}
	public static void show(int x){
		x=9;
		System.out.println("show方法的x值是"+x);
	}
	public static void showArray(int[]arr){
		arr[0]=24;
		System.out.println(arr[0]+arr[1]);
	}
	
}
