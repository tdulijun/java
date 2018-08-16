import java.util.Arrays;

public class TowArrayDemo {
	   public static void main(String[] args) {
	//数组中存储的数据类型：int 数据类型：数组 = new(创建)[二维数组的长度][]
	   int [][]arr=new int[4][];
	   arr[0]=new int[5];
	   arr[1]=new int[6];
	   for (int i = 0; i < arr.length; i++) {
		   System.out.println(Arrays.toString(arr[i]));
	   }
	   int [][]brr={
		   {1,1,1,0,1,1,1},
		   {1,1,0,1,0,1,1},
		   {1,0,1,1,1,0,1},
		   {1,1,0,1,0,1,1},
		   {1,1,1,0,1,1,1}
		   };
	   for (int i = 0; i < brr.length; i++) {
		   for (int j = 0; j < brr[i].length; j++) {
			   if(brr[i][j]==0){
				   System.out.print("*");
			   }else{
				System.out.print(" ");
			   }
		   }
		System.out.println();
	   }
	}
	
}

