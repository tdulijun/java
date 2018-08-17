/**
 * 
 */
package com.qfedu.Day15.DataStructure;

import java.util.Arrays;

/**
 * Description�� ��Ա��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:BasketballPlayer.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class BasketballPlayer {
        //�洢������Ա�����º���
	  public static Integer[] players = null;
	   //������Ա�ĸ���
	  public static int size = 0;
   
	  //1.��ʼ����Ϊ5�������б�,׼���洢���ϵ�5����Ա
	  public static void init(int initialCapacity) {
		  if(initialCapacity<0) {
			  throw new RuntimeException("���������Ǹ���");
		  }
		   players = new Integer[initialCapacity];
		  
	  }
	  //2.����5����Ա�ϳ�
	  public static void add(Integer playerNum) {
		  //�ж�����
		  if(size == players.length) {
			  Integer[] temp =  Arrays.copyOf(players, players.length*2);
			  players = temp;
		  }
		    //�������д洢Ԫ��
		    players[size] =  playerNum;
		     //�洢Ԫ����Ա��������Ҫ����
		    size++;
	  }
	  //3.��ѯָ��λ�õ���Ա�����º���
	  public static Integer get(int index) {
		  if(index < 0 || index >= size) {
			  throw new ArrayIndexOutOfBoundsException("�±�Խ��");
		  }
		  return players[index];
		  
	  }
	  //4.�������Ժ����ѯ����Ա�ڳ��ϵ�����
	  public static int getIndexByPlayerNum(Integer playerNum) {
		  for(int index = 0; index < size ; index++) {
			  if(players[index].equals(playerNum)) {
				  return index;
			  }
			  
		  }
		  //û���ҵ�
		  return -1;
	  }
	  //5.�滻��������λ��Ϊ2����Ա,�޸������±���333
	  public static void set(int index ,Integer newPlayerNum) {
		  if(index < 0 || index >= size) {
			  throw new ArrayIndexOutOfBoundsException("�±�Խ��");
		  }
		  players[index] = newPlayerNum;
	  }
	  
	  //6.�滻���º���Ϊ22����Ա�滻Ϊ222
	  public static void update(Integer oldPlayerNum,Integer newPlayerNum) {
		  int index = getIndexByPlayerNum(oldPlayerNum);
		  if(index >= 0) {
			  set(index,newPlayerNum);
		  }
	  }
	  //7.�ѳ�������λ��Ϊ2����Ա����(����λ)
	  public static void delete(int index) {
		  if(index < 0 || index >= size) {
			  throw new ArrayIndexOutOfBoundsException("�±�Խ��");
		  }
		  //������û��������ɾ��
		  for(int i = index;i<size-1;i++) {
			  players[i] = players[i+1];
		  }
		  //�����һ����Ա����Ϊnull
		  players[size-1] = null;
		  
		  //��Ҫ������Ա�ĸ���
		   size--;
	  }
	  //8.������Ա�ڳ��ϵ�λ��,��ӡ���º���
	  public static void print() {
		  if(players == null) {
			  System.out.println("null");
			  return;
		  }
		  if(size == 0) {
			  System.out.println("[]");
			  return;
		  }
		  StringBuilder sbr = new  StringBuilder();
		  sbr.append("[");
		  for(int i = 0;i<size;i++) {
			  sbr.append(players[i]);
			  if(i != size - 1) {
				  sbr.append(",");
			  }else {
				  sbr.append("]");
			  }
			  
		  }
		  System.out.println(sbr.toString());
	  }
	  
	  
	  
	  
	  
	  
	  
}
