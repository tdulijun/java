/**
 * 
 */
package com.qfedu.Day14.Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Description： 演示日历类Calendar<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:CalendarDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//获取当前对象(获取默认时区)
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
		//获取各种有用时间
		System.out.println("系统时间为:");
        int year =  c.get(Calendar.YEAR);
        //Calendar日类 计算月份是从0开始 11结束 分别对应1-12 
        //看到的月份需要进行+1操作才是正确的月份
        int month = c.get(Calendar.MONTH);
		//天数 DATE
        int day = c.get(Calendar.DATE);
        //小时
        int hour = c.get(Calendar.HOUR);
        //分钟
        int minute = c.get(Calendar.MINUTE);
        //秒
        int second = c.get(Calendar.SECOND);
        System.out.println(year+"年"+(month+1)+"月"+day+"天"+hour+"小时"+minute+"分钟"+second+"秒");
		
		
		//看Date --> Calendar转换成Date
		Date d = c.getTime();//当前年份距离1970年的毫秒值
		
		//案例:获取2018年8月16日是这一年的第几天,第几周,当前月中第几天
		Calendar c2 = Calendar.getInstance();
		//第一个参数是对应的字段
		//例如:  设置的是什么      具体数值
//	    c2.set(Calendar.YEAR, 2018);
//		//设月份 -->设置的时候 -1
//	    c2.set(Calendar.MONTH, 7);
//	    //设置天数
//	    c2.set(Calendar.DATE,16);
	    //基本不用上面的方法
	    c2.set(2018,7,16);
	    int day1 = c2.get(Calendar.DAY_OF_YEAR);//这一年的第几天
		System.out.println(day1);
		int week = c2.get(Calendar.WEEK_OF_YEAR);//第几个周
		int dayofMonth = c2.get(Calendar.DAY_OF_MONTH);//当前月份的日期
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
