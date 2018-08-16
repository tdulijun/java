/**
 * 
 */
package com.qfedu.Day14.Enum.Extend;

public enum Type3 {
	 
     A{
    	 public void show() {
    		 System.out.println("重写抽象方法");
    	 }
     };
	
	
     public abstract void  show();
}
