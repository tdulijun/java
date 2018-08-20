/**
 * 
 */
package com.qfedu.Day16.Lianbiao;

/**
 * Description： 双向链表<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:MyLinkedList.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class MyLinkedList {
     //存在节点 连接链表使用的(链表的组成)
	 private Node first; // 第一个节点
	 private Node last; // 最后一个节点
	 private int size; //节点的数量
	 
	  //对链表中的节点进行描述
	 class Node{
		  //定义上一个节点 和 下一个节点
		  Node  prev;
		  Node  next;
		  Object  ele; //当前节点中存储的数据
		  //构造方法 方便给基点中的数据进行赋值
		  public Node(Object ele) {
			  this.ele = ele;
		  }
		
		 
	 }
	 
	 //第一个方法 向头节点添加元素
	 public void addFirst(Object ele) {
		 //1. 创建节点对象
		 Node node = new Node(ele);
		 if(size == 0) {
			 this.first = node;
			 this.last = node;
		 }else {
			 //把之前的第一个基点作为新增基点的下一个节点
			 node.next = this.first; 
			 //把新增的基点作为原有节点的上一个基点
			 this.first.prev = node;
			 //重置开始节点
			 this.first = node;
		 }
		 size ++;
		 
	 }
	 
	 
	 
	 //第二个方法 向头节点添加元素
	 public void addLast(Object ele) {
		//1. 创建节点对象
		 Node node = new Node(ele);
		 if(size == 0 ) {
			 this.first = node;
			 this.last = node;
			 
		 }else {
			 //把新增的节点作为原有节点的下一个节点
			 this.last.next = node;
			 //把之前最后一个节点作为当前节点的上一个节点
			 node.prev = this.last;
			 //重置最后一个基点
			 this.last = node;
		 }
		 size++;
 
	 }
	 
	 //删除元素
	 public void remove(Object ele) {
		 //先获取第一个节点
		 Node current = this.first;
		 //寻找节点
		 for(int i = 0; i < size; i++) {
			 if(!current.ele.equals(ele)){
			   if(current.next == null) {
				   return;
			   }
			   current = current.next;
			 }
		 
		 }
		 //删除
		 if(current == first) {
			 this.first = current.next;
			 this.first.prev = null;
		 }else if(current == last) {
			 this.last = current.prev;
			 this.last.next = null;
		 }else {
			 //当前对象的上一个节点对象的下一个节点 得到 当前对象的下一个节点
			 current.prev.next = current.next;
			 //当前对象的下一个基点对象的上一个节点 的带 当前对象的上一个节点
			 current.next.prev = current.prev;
		 }
		 size--;
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //打印当前链表中存储的元素
	 @Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder sbr = new StringBuilder();
		// 获取节点对象
		Node node = this.first;
		sbr.append("[");
		for (int i = 0; i < size; i++) {
			sbr.append(node.ele);
			if (i != size - 1) {
				sbr.append(",");
			} else {
				sbr.append("]");
			}
			node = node.next; // 取自己的下一个节点
		}
		

		return sbr.toString();
	}
	 
	
	
	
	
}
