/**
 * 
 */
package com.qfedu.Day14.Enum.Extend;

public class EnumExtendsDemo {

	
	public static void main(String[] args) {
		  //使用枚举中成员属性和方法
		  Type1 t = Type1.A;
		  t.type = "你好";
		  System.out.println(Type1.A.getType());
		  
		  
		  Type1.value = 30;
		  System.out.println(Type1.getValue());
		  
		  
		  Type3.A.show();
		
	}

}
