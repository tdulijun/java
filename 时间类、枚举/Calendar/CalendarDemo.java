/**
 * 
 */
package com.qfedu.Day14.Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Description�� ��ʾ������Calendar<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:CalendarDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//��ȡ��ǰ����(��ȡĬ��ʱ��)
		/*
		 *Java.util.GregorianCalendar
		 *[time=1534401313570,areFieldsSet=true,
		 *areAllFieldsSet=true,lenient=true,
		 *zone=sun.util.calendar.ZoneInfo
		 *[id="Asia/Shanghai",offset=28800000,
		 *dstSavings=0,useDaylight=false,
		 *transitions=19,lastRule=null],
		 *firstDayOfWeek=1,minimalDaysInFirstWeek=1,
		 *ERA=1,YEAR=2018,MONTH=7,WEEK_OF_YEAR=33,
		 *WEEK_OF_MONTH=3,DAY_OF_MONTH=16,
		 *DAY_OF_YEAR=228,DAY_OF_WEEK=5,
		 *DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,
		 *HOUR=2,HOUR_OF_DAY=14,MINUTE=35,
		 *SECOND=13,MILLISECOND=570,
		 *ZONE_OFFSET=28800000,DST_OFFSET=0] 
		 */
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		//��ȡ��������ʱ��
		System.out.println("ϵͳʱ��Ϊ:");
        int year =  c.get(Calendar.YEAR);
        //Calendar���� �����·��Ǵ�0��ʼ 11���� �ֱ��Ӧ1-12 
        //�������·���Ҫ����+1����������ȷ���·�
        int month = c.get(Calendar.MONTH);
		//���� DATE
        int day = c.get(Calendar.DATE);
        //Сʱ
        int hour = c.get(Calendar.HOUR);
        //����
        int minute = c.get(Calendar.MINUTE);
        //��
        int second = c.get(Calendar.SECOND);
        System.out.println(year+"��"+(month+1)+"��"+day+"��"+hour+"Сʱ"+minute+"����"+second+"��");
		
		
		//��Date --> Calendarת����Date
		Date d = c.getTime();//��ǰ��ݾ���1970��ĺ���ֵ
		
		//����:��ȡ2018��8��16������һ��ĵڼ���,�ڼ���,��ǰ���еڼ���
		Calendar c2 = Calendar.getInstance();
		//��һ�������Ƕ�Ӧ���ֶ�
		//����:  ���õ���ʲô      ������ֵ
//	    c2.set(Calendar.YEAR, 2018);
//		//���·� -->���õ�ʱ�� -1
//	    c2.set(Calendar.MONTH, 7);
//	    //��������
//	    c2.set(Calendar.DATE,16);
	    //������������ķ���
	    c2.set(2018,7,16);
	    int day1 = c2.get(Calendar.DAY_OF_YEAR);//��һ��ĵڼ���
		System.out.println(day1);
		int week = c2.get(Calendar.WEEK_OF_YEAR);//�ڼ�����
		int dayofMonth = c2.get(Calendar.DAY_OF_MONTH);//��ǰ�·ݵ�����
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
