/**
 * 
 */
package com.qfedu.Day16.List;

import java.util.ArrayList;
import java.util.List;
public class ListDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
       List list1 = new ArrayList();
       List list2 = new ArrayList();
       list1.add(1);
       list1.add(2);
       list1.add(3);
       list1.add(4);
       
       list2.add(2);
       list2.add(3);
       //判断当前集合中是否存在指定集合中的元素
       boolean res = list1.containsAll(list2);
       System.out.println(res);
       List list3 = new ArrayList();
       //数学: 空集是任何集合的子集
       System.out.println(list1.containsAll(list3));
       //保留参数集合中的元素,删除其他元素
        // list1.retainAll(list2);
       //删除参数集合中的元素在当前集合
       //list1.removeAll(list2);
      // System.out.println(list1);
       
       //截取当前当前 包括开始的位置,不包括结束的位置
       List list4  =  list1.subList(1, 3);
       //list4获取的不是新的堆空间
       //list4获取的是截取之后的空间
       System.out.println(list4);

	}

}
