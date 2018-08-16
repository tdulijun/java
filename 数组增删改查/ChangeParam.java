/**
 * 
 * 契约性
 *可变参数:JDK1.5
 *在设计方法时,可以一次性传入多个参数,在不使用数组的前提下,可变参数
 *方法的参数列表中
 *数据类型... 参数名
 *ps:
 *1.既然是可变参数,可长可短-->什么都没有(什么参数也不传递) 
 *                       --> 传入多个参数 
 *2.在方法中可变参数可以当做数组使用
 *3.在参数列表中,若使用可变参数,一定需要放到所有参数的最后
 * 
 */
public class ChangeParam {
     public static void main(String[] args) {
    	int[]arr={2,3,4,56,7};
		show(1,2,3);
		
	}
     //基本工资+奖金+加班-罚款-个人所得税-保险
    public static void show(int...array){
    	//System.out.println("没有元素");
    	for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
    }
      
}

