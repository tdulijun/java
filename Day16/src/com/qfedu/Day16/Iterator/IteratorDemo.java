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
		  
		  //��������������
//		  Iterator it =  list.iterator();
//		  while(it.hasNext()) {
//			  if("B".equals(it.next())) {
//				  //ͨ������ɾ����"B"Ԫ��
//				  //list.remove("B");���Բ�Ҫ��������
//				  //����������.remove();
//				  it.remove();
//			  }
//			  
//		  }
		  
		  //������bug --> �ٷ���   ����ʧ�ܵ�����
		  //�޸Ĳ���ԭ�� --> ��������ڵ�������ʹ�ü��϶������ɾ������
		  //��������ֻҪɾ�����ϵĵ����Ķ���Ԫ�ض����쳣
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
