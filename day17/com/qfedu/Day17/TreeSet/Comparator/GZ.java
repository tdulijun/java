/**
 * 
 */
package com.qfedu.Day17.TreeSet.Comparator;

import java.util.Comparator;

/**
 * Description�� �����Լ��ȽϷ�ʽ<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:GZ.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class GZ implements Comparator{

	/* 
	 * �ƶ�����
	 * ��һ�������ǵ�ǰ���� --> this
	 * �ڶ��������Ǵ������ --> other
	 */
	@Override
	public int compare(Object o1, Object o2) {
		Person pthis = (Person)o1;
		Person pother = (Person)o2;
		
		return pthis.getAge() - pother.getAge();
	}

}
