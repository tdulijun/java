/**
 * 
 */
package com.qfedu.Day14.Enum.Extend;


public enum Type2 {
	//匿名内部类,作用于
      A{
    	  public void show() {
    		  System.out.println("A自己的方法");
    	  }
      },B;
	static int value;
	String type;
	public String getType() {
		return type;
	}
    public static int getValue() {
    	return value;
    }
	
}
