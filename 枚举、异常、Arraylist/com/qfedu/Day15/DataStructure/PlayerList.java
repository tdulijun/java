/**
 * 
 */
package com.qfedu.Day15.DataStructure;

import java.util.Arrays;

/**
 * Description��ͨ����<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:PlayerList.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class PlayerList {
	//�洢������Ա�����º���
	  private Object[] players = null;
	   //������Ա�ĸ���
	  private  int size = 0;
  
	  public PlayerList() {
		  this(10);//���ÿղ������췽�� ��СĬ����10
	  }
	  
	  //1.��ʼ����Ϊ5�������б�,׼���洢���ϵ�5����Ա
	  public  PlayerList(int initialCapacity) {
		  if(initialCapacity<0) {
			  throw new RuntimeException("���������Ǹ���");
		  }
		   players = new Integer[initialCapacity];
		  
	  }
	  //2.����5����Ա�ϳ�
	  public  void add(Object playerNum) {
		  //�ж�����
		  if(size == players.length) {
			  Object[] temp =  Arrays.copyOf(players, players.length*2);
			  players = temp;
		  }
		    //�������д洢Ԫ��
		    players[size] =  playerNum;
		     //�洢Ԫ����Ա��������Ҫ����
		    size++;
	  }
	  //3.��ѯָ��λ�õ���Ա�����º���
	  public  Object get(int index) {
		  if(index < 0 || index >= size) {
			  throw new ArrayIndexOutOfBoundsException("�±�Խ��");
		  }
		  return players[index];
		  
	  }
	  //4.�������Ժ����ѯ����Ա�ڳ��ϵ�����
	  public int getIndexByPlayerNum(Integer playerNum) {
		  for(int index = 0; index < size ; index++) {
			  if(players[index].equals(playerNum)) {
				  return index;
			  }
			  
		  }
		  //û���ҵ�
		  return -1;
	  }
	  //5.�滻��������λ��Ϊ2����Ա,�޸������±���333
	  public  void set(int index ,Integer newPlayerNum) {
		  if(index < 0 || index >= size) {
			  throw new ArrayIndexOutOfBoundsException("�±�Խ��");
		  }
		  players[index] = newPlayerNum;
	  }
	  
	  //6.�滻���º���Ϊ22����Ա�滻Ϊ222
	  public  void update(Integer oldPlayerNum,Integer newPlayerNum) {
		  int index = getIndexByPlayerNum(oldPlayerNum);
		  if(index >= 0) {
			  set(index,newPlayerNum);
		  }
	  }
	  //7.�ѳ�������λ��Ϊ2����Ա����(����λ)
	  public  void delete(int index) {
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
	  /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		  return Arrays.toString(players);
	}
}
