/**
 * 
 */
package com.qfedu.Day17.Genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * Description�� xxxx<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:GenericityDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class GenericityDemo {
	public static void main(String[] args) {
	    //�����ǿ��Դ洢�κ���������
		//List<Integer> list  = new ArrayList<Integer>();
		//1.7֮���˳��˷����Զ��ƶ�
		List<Integer> list  = new ArrayList<>();
		//ps:
		list.add(1);
		list.add(1);
		list.add(1);
		//���list����������Ԫ�صĺ�
		int sum = 0;
		for(int i = 0;i<list.size();i++) {
			sum+= list.get(i);
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
