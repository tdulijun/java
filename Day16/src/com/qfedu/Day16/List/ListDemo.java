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
       //�жϵ�ǰ�������Ƿ����ָ�������е�Ԫ��
       boolean res = list1.containsAll(list2);
       System.out.println(res);
       List list3 = new ArrayList();
       //��ѧ: �ռ����κμ��ϵ��Ӽ�
       System.out.println(list1.containsAll(list3));
       //�������������е�Ԫ��,ɾ������Ԫ��
        // list1.retainAll(list2);
       //ɾ�����������е�Ԫ���ڵ�ǰ����
       //list1.removeAll(list2);
      // System.out.println(list1);
       
       //��ȡ��ǰ��ǰ ������ʼ��λ��,������������λ��
       List list4  =  list1.subList(1, 3);
       //list4��ȡ�Ĳ����µĶѿռ�
       //list4��ȡ���ǽ�ȡ֮��Ŀռ�
       System.out.println(list4);

	}

}
