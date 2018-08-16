import java.util.Scanner;

/**  
 * All rights Reserved, Designed By www.1000phone.com
 * @Title:  PermanentCalendar.java   
 * @Package    
 * @Description:  
 * @author: cqh  
 * @date:   2018年8月6日 上午3:02:52   
 * @version V1.0 
 * @Copyright: 2018 www.1000phone.com  Inc. All rights reserved. 
 * 注意：本内容仅限于千锋互联科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PermanentCalendar {
    //ctrl+F11 --> 运行
	//ctrl+s --> 保存  
	public static void main(String[] args) {
		//input-->警告无视 -->System.in-->标准输入流
	    Scanner input = new Scanner(System.in);
	    System.out.println("请输入年:");
	    int year = input.nextInt();
	    System.out.println("请输入月:");
	    int month = input.nextInt();
		//距离1900年的天数
	    int totalDays = getFormNowYearTo1900TotalDays(year);
	    //当前年份所经过的天数
	    int totalDaysFormYear =  getNowYearToDays(year, month);
        //求出星期数 --> 0是星期天 
	    int week = (totalDays+totalDaysFormYear+1)%7;
	    //格式化输入日历
	    formatCalendar(week,month,year);
	}
	
	
	public static void formatCalendar(int week,int month,int year) {
		 //计数--> 空格 打印日期
		int cut =  0;
		//表头
		System.out.println("星期日\t\t星期一\t\t星期二\t\t星期三\t\t星期四\t\t星期五\t\t星期六");
		//打印星期数
		for(int i = 1;i<=week;i++){
			System.out.print("\t\t");
			//计数
			cut++;
			
		}
		//打印日历
		for(int i = 1;i<=getNowMonthDays(year, month);i++){
			  System.out.print(i+"\t\t");
			  cut++;
			  if(cut%7 == 0){
				  System.out.println();
			  }
			
		}
		
	}
	/*
	 * 访问权限修饰符 [其他修饰符] 返回值类型 方法名(参数列表){
	 * 				方法体-->功能代码
	 *              return 
	 *              结束一个方法并带回一个返回值
	 *              return和返回值类型有关
	 *              void --> 无返回值类型 --> 可以使用return也可以不是使用
	 *                                       但是千万不能带回返回值
	 *              返回值类型-->基本数据类型
	 *                        -->引用数据类型
	 *               return所返回值需要和返回值类型一致,一次只能带回一个值
	 *                                 
	 *  
	 *  }
	 */
	  /**
	   * 判断闰年
	   * @param year  年份
	   * @return true是闰年  false不是闰年
	   */
	  public static boolean isLeapYear(int year){ 
		    return (year%4==0 && year%100!=0)||(year%400 ==0);
	  }
	  /**
	   * 获取当前月份的天数
	   * @param year  当前年
	   * @param month 当前月
	   * @return 当前月对应的天数
	   */
	  public static int getNowMonthDays(int year,int month){
		
		 switch (month) {
			case 2:
				 return isLeapYear(year) ? 29 : 28;
			case 4:	
			case 6:	
			case 9:	
			case 11:	
				 return 30;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				 return 31;
			default:
				 System.out.println("数据不合法");
				 return -1;
			}
		  
		  
	  }
	  /**
	   * 当前年距离1900年的总天数
	   * @param year 当前年
	   * @return  总天数
	   */
	  public static int getFormNowYearTo1900TotalDays(int year){
		  //统计所有的天数
		  int totalDays = 0;
		  for(int i = 1900;i<year;i++){
			  totalDays +=  isLeapYear(i) ? 366 : 365;
		  }
		  return totalDays;
	  }
	  /**
	   * 距离1月1日的总天数
	   * @param year  当前年
	   * @param month 当前月
	   * @return  距离1月1日的总天数
	   */
	  public static int getNowYearToDays(int year,int month){
		  //统计当月份距离1月1日的总天数
		  int totalDays = 0;
		  for(int  i = 1;i<month;i++){
			  totalDays += getNowMonthDays(year, i);
		  }
		  return totalDays;
	  }
	  
	

}

