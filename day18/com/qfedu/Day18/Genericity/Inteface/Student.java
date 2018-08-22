/**
 * 
 */
package com.qfedu.Day18.Genericity.Inteface;

/**
 * Description： xxxx<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Student.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
//2.泛型类实现泛型接口,此时可以通过泛型类型中的泛型来占位泛型接口中的泛型
// 创建当前泛型类对象的时,此时就可以制定泛型的数据类型
public class Student<M> implements InterFaceDemo<M>{

	/* (non-Javadoc)
	 * @see com.qfedu.Day18.Genericity.Inteface.InterFaceDemo#show(java.lang.Object)
	 */
	@Override
	public void show(M t) {
		// TODO Auto-generated method stub
		
	}

}
