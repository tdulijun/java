/**
 * 
 */
package com.qfedu.Day14.Enum.Extend;


public enum Type2 {
	//�����ڲ���,������
      A{
    	  public void show() {
    		  System.out.println("A�Լ��ķ���");
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
