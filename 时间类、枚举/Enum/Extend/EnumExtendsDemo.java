/**
 * 
 */
package com.qfedu.Day14.Enum.Extend;

public class EnumExtendsDemo {

	
	public static void main(String[] args) {
		  //ʹ��ö���г�Ա���Ժͷ���
		  Type1 t = Type1.A;
		  t.type = "���";
		  System.out.println(Type1.A.getType());
		  
		  
		  Type1.value = 30;
		  System.out.println(Type1.getValue());
		  
		  
		  Type3.A.show();
		
	}

}
