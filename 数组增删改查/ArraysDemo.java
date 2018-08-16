import java.util.Arrays;

/**
 * Arrays工具类
 * @author JKMaster
 *
 */
public class ArraysDemo {

	public static void main(String[] args) {
		int[]arr=new int[]{1,324,5,6,6,72};
		//打印数组
		String str=Arrays.toString(arr);
		System.out.println(str);
		//排序数组--->只能升序排列
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//二分查找
		if(Arrays.binarySearch(arr, 5)>0){
			System.out.println("元素存在");
		}else{
			System.out.println("元素不存在");
		}
		//数组复制
		arr=Arrays.copyOf(arr, 20);
		System.out.println(Arrays.toString(arr));
		//填充元素
		int []brr=new int[10];
		Arrays.fill(brr, 20);
		System.out.println(Arrays.toString(brr));
		
		int[]crr=new int[5];
		int[]drr=new int[5];
		//默认equals在没有发生重写的前提下，比较的还是地址
		System.out.println(crr.equals(drr));
		int a=5;
		int b=5;
		System.out.println(a==b);
		//比较的值为true
		System.out.println(Arrays.equals(crr, drr));
	}

}
