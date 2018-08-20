/**
 * 
 */
package com.qfedu.Day16.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	   public static void main(String[] args) {
		  List list = new ArrayList();
		  list.add("A");
		  list.add("B");
		  list.add("C");
		  list.add("D");
		  list.add("E");
		  
		  //创建迭代器对象
//		  Iterator it =  list.iterator();
//		  while(it.hasNext()) {
//			  if("B".equals(it.next())) {
//				  //通过集合删除了"B"元素
//				  //list.remove("B");绝对不要这样操作
//				  //迭代器对象.remove();
//				  it.remove();
//			  }
//			  
//		  }
		  
		  //迭代器bug --> 官方的   快速失败迭代器
		  //修改不了原码 --> 坚决避免在迭代器中使用集合对象的增删来操作
		  //迭代器中只要删除集合的倒数的二个元素都不异常
		  Iterator it =  list.iterator();
		  while(it.hasNext()) {
			  if("D".equals(it.next())) {
				  list.remove("D");
			  }
			  
		  }
		   
		  
		  for(Object obj : list) {
			  System.out.println(obj);
		  }
	  
	}

}
