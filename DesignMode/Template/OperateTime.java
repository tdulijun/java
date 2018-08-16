package com.qfedu.Day11.DesignMode.Template;
//父类,计算时间
public abstract class OperateTime {
     //计算时间
	  public void time() {
		  //获取开始的时间
		  long beginTime = System.currentTimeMillis(); //毫秒值
		  //实际测试代码的逻辑 
		  //延迟操作,具体逻辑是由子类来完成
		  dowork();		  
		  long endTime = System.currentTimeMillis(); 
		  System.out.println("耗时:"+(endTime-beginTime)+"毫秒");
	  }
	  
	  //抽象方法
	  public abstract void dowork();
}
