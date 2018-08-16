package com.qfedu.Day11.DesignMode.Singleton;
//¶öººÄ£Ê½
public class SingleEhan {
	//1.
      private static SingleEhan instance = new SingleEhan();
    //2.
      private SingleEhan() {
    	  
      }
     //3.
      public static SingleEhan getInstance() {
    	  return instance;
      }
}
