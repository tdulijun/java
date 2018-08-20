/**
 * 
 */
package com.qfedu.Day16.Lianbiao;

/**
 * Description： 测试双向链表<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Test.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyLinkedList ml = new MyLinkedList();
		ml.addFirst("第一个元素");
		ml.addLast("第二个元素");
		ml.addFirst("第0个元素");
		System.out.println(ml);

	}

}
