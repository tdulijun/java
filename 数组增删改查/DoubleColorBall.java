import java.util.Arrays;

/**  
 * All rights Reserved, Designed By www.1000phone.com
 * @Title:  DoubleColorBall.java   
 * @Package    
 * @Description:  
 * @author: cqh  
 * @date:   2018年8月5日 下午6:46:07   
 * @version V1.0 
 * @Copyright: 2018 www.1000phone.com  Inc. All rights reserved. 
 * 注意：本内容仅限于千锋互联科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DoubleColorBall {
	public static void main(String[] args) {
		
	}
	
	public static void selectRedBallNumber(int[]arr){
		//定义红球数组
		int[]redBallNumber=new int[32];
		//红球数组赋值
		for (int i = 0; i < redBallNumber.length; i++) {
			redBallNumber[i]=i+1;
		}
		//定义选中红球数组
		int[]redBall=new int[6];
		//为红球数组赋值
		int i=0;
		//用do while做是不是更好？
		while(i<6){
			int num=(int)(Math.random()*32);
			//判断选中的球号码是否为0,如果为0重新选择，不为0，加入到选中号码数组中，修改选中球对应的数值为0
			if(redBallNumber[num]!=0){
				redBall[i]=redBallNumber[num];
				redBallNumber[num]=0;   
				i++;
			}
		}
		//用for循环实现
		/*for (int i = 0; i < redBall.length;) {
			int num=(int)(Math.random()*32);
			System.out.println(num);
			if(red[num]!=0){
				redBall[i]=red[num];
				red[num]=0;
				i++;
			}
		}*/
		System.out.println(Arrays.toString(redBall));
	}
	 /*
	  * 对比法: 
	  * 1.数组存储要取出的数据 1-32
	  * 2.创建一个和当前数组中长度一样的数组来表示是否求被取出了
	  *    boolean --> 默认都是false
	  * 3.随机获取当前1-32个数中的值   下标
	  *   若 boolean类型数组中的值时f --> 当前值没有被取过 --> 取值
	  *   若                                             t --> 当前值被取过  --> 重新获取下标
	  * 
	  */
	
	public static void  selectRedBallNumber1(int[] array){
		//1.创建当前红球存储的数组 
		int[] redBallNumber = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,
				18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
		//2.创建一个和红球数组所对应的boolean类型数组
		//创建数组是有默认值的, 存储都是false --> 默认false 没有被取过
		boolean[] exist  = new boolean[redBallNumber.length];
		
		//获取当前红球存储到需要数组中
		for (int i = 0; i < array.length; i++) {
			//定义一个变量存下标值
			int index = 0;
			//循环判断值是够被取走了
			do{
				//获取下标值
				index = (int)(Math.random()*32);
				//boolean类型的数组默认是false --> 判断时候是false 即可
			}while(exist[index] == true);
			//将当前值赋值给红球数组
			array[i] = redBallNumber[index];
			//修改当期boolean类型数组里的值
			exist[index] = true;
			
		}
		  Arrays.sort(array);
		  /*
		   * 当期取值的方式最多一次出现5组不重复
		   * 证明 boolean 已经有30个值时true
		   * 重置当前boolean类型数组
		   */
	}

}

