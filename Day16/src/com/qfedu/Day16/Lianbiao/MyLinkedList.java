/**
 * 
 */
package com.qfedu.Day16.Lianbiao;

/**
 * Description�� ˫������<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:MyLinkedList.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class MyLinkedList {
     //���ڽڵ� ��������ʹ�õ�(��������)
	 private Node first; // ��һ���ڵ�
	 private Node last; // ���һ���ڵ�
	 private int size; //�ڵ������
	 
	  //�������еĽڵ��������
	 class Node{
		  //������һ���ڵ� �� ��һ���ڵ�
		  Node  prev;
		  Node  next;
		  Object  ele; //��ǰ�ڵ��д洢������
		  //���췽�� ����������е����ݽ��и�ֵ
		  public Node(Object ele) {
			  this.ele = ele;
		  }
		
		 
	 }
	 
	 //��һ������ ��ͷ�ڵ����Ԫ��
	 public void addFirst(Object ele) {
		 //1. �����ڵ����
		 Node node = new Node(ele);
		 if(size == 0) {
			 this.first = node;
			 this.last = node;
		 }else {
			 //��֮ǰ�ĵ�һ��������Ϊ�����������һ���ڵ�
			 node.next = this.first; 
			 //�������Ļ�����Ϊԭ�нڵ����һ������
			 this.first.prev = node;
			 //���ÿ�ʼ�ڵ�
			 this.first = node;
		 }
		 size ++;
		 
	 }
	 
	 
	 
	 //�ڶ������� ��ͷ�ڵ����Ԫ��
	 public void addLast(Object ele) {
		//1. �����ڵ����
		 Node node = new Node(ele);
		 if(size == 0 ) {
			 this.first = node;
			 this.last = node;
			 
		 }else {
			 //�������Ľڵ���Ϊԭ�нڵ����һ���ڵ�
			 this.last.next = node;
			 //��֮ǰ���һ���ڵ���Ϊ��ǰ�ڵ����һ���ڵ�
			 node.prev = this.last;
			 //�������һ������
			 this.last = node;
		 }
		 size++;
 
	 }
	 
	 //ɾ��Ԫ��
	 public void remove(Object ele) {
		 //�Ȼ�ȡ��һ���ڵ�
		 Node current = this.first;
		 //Ѱ�ҽڵ�
		 for(int i = 0; i < size; i++) {
			 if(!current.ele.equals(ele)){
			   if(current.next == null) {
				   return;
			   }
			   current = current.next;
			 }
		 
		 }
		 //ɾ��
		 if(current == first) {
			 this.first = current.next;
			 this.first.prev = null;
		 }else if(current == last) {
			 this.last = current.prev;
			 this.last.next = null;
		 }else {
			 //��ǰ�������һ���ڵ�������һ���ڵ� �õ� ��ǰ�������һ���ڵ�
			 current.prev.next = current.next;
			 //��ǰ�������һ������������һ���ڵ� �Ĵ� ��ǰ�������һ���ڵ�
			 current.next.prev = current.prev;
		 }
		 size--;
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //��ӡ��ǰ�����д洢��Ԫ��
	 @Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder sbr = new StringBuilder();
		// ��ȡ�ڵ����
		Node node = this.first;
		sbr.append("[");
		for (int i = 0; i < size; i++) {
			sbr.append(node.ele);
			if (i != size - 1) {
				sbr.append(",");
			} else {
				sbr.append("]");
			}
			node = node.next; // ȡ�Լ�����һ���ڵ�
		}
		

		return sbr.toString();
	}
	 
	
	
	
	
}
