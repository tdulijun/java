/**
 * 
 */
package com.qfedu.Day17.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Description�� ��ҵ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HomeWork.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class HomeWork {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
      /*��֪��һ������Worker�� ���ԣ����� ���� ���ʣ� ��Ϊ void work()
	a.�ڼ���������������˶�����Ϣ���£�
		zhang3  18   3000
		li4      25  3500
		wang5    22  3200
	b. ��li4֮ǰ����һ������ ��ϢΪ�� zhao6  24  3300
	c. ɾ��wang5����Ϣ
	d. ����forѭ����������ӡ���������й��˵���Ϣ
	e. ���õ������������Լ����е����й��˵���work����
      */
		
		List list = new ArrayList();
		//a. list�е�Ԫ�ش洢���ǵ�ַ
		// ������ֻ�ܴ洢����-->���õĵ�ַ
		list.add(new Worker("zhang3",18,3000));
		list.add(new Worker("li4",25,3500));
		list.add(new Worker("wang5",22,3200));
		System.out.println(list);
		
		//b. ֮���Լ��Ͽ��Դ洢�κ���������--> ��Ϊ�Ǹ���Object
		//   ����ת�� ��������ø�ֵ���˸���Ķ���  --> ֻ�ܵ��ø�������Ժͷ���,���ܵ����������кͷ���
		for(int  i = 0; i<list.size();i++) {
			if(((Worker)(list.get(i))).getName().equals("li4")) {
				list.add(i, new Worker("zhao6",24,3000));
				break;
				
			}
		}
	
		System.out.println(list);
		//c.
		for(int i = 0;i<list.size();i++) {
			if(((Worker)(list.get(i))).getName().equals("wang5")) {
				list.remove(i);
				break;
				
			}
		}
		/*
		 * ps��ʹ���±����ʽ: ����һ������Ķ���
		 * ��дequals ��  hashcode
		 * list.remove(new Worker("wang5",22,3200));
		 */
		
		//d.
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		//e.
		//1.��ȡ����������
		Iterator it =  list.iterator();
		//��������
		//2.�жϵ��������Ƿ������һ��Ԫ�� hasNext
		 // ��ȡ��ǰ�������ж���next-->�����еĶ���
		while(it.hasNext()) {
//			it.next();
//			it.next();
//			//һ��ѭ���ƶ�����  --> һ��������Ԫ��
			((Worker)(it.next())).work();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
