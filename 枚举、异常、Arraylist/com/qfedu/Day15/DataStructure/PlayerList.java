/**
 * 
 */
package com.qfedu.Day15.DataStructure;

import java.util.Arrays;

/**
 * Description：通用类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:PlayerList.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class PlayerList {
	//存储场上球员的球衣号码
	  private Object[] players = null;
	   //场上球员的个数
	  private  int size = 0;
  
	  public PlayerList() {
		  this(10);//调用空参数构造方法 大小默认是10
	  }
	  
	  //1.初始容量为5的线性列表,准备存储场上的5个球员
	  public  PlayerList(int initialCapacity) {
		  if(initialCapacity<0) {
			  throw new RuntimeException("容量不能是负数");
		  }
		   players = new Integer[initialCapacity];
		  
	  }
	  //2.安排5个球员上场
	  public  void add(Object playerNum) {
		  //判断扩容
		  if(size == players.length) {
			  Object[] temp =  Arrays.copyOf(players, players.length*2);
			  players = temp;
		  }
		    //向数组中存储元素
		    players[size] =  playerNum;
		     //存储元素球员个数就需要增加
		    size++;
	  }
	  //3.查询指定位置的球员的球衣号码
	  public  Object get(int index) {
		  if(index < 0 || index >= size) {
			  throw new ArrayIndexOutOfBoundsException("下标越界");
		  }
		  return players[index];
		  
	  }
	  //4.根据求以号码查询该球员在场上的索引
	  public int getIndexByPlayerNum(Integer playerNum) {
		  for(int index = 0; index < size ; index++) {
			  if(players[index].equals(playerNum)) {
				  return index;
			  }
			  
		  }
		  //没有找到
		  return -1;
	  }
	  //5.替换场上索引位置为2的球员,修改其球衣编码333
	  public  void set(int index ,Integer newPlayerNum) {
		  if(index < 0 || index >= size) {
			  throw new ArrayIndexOutOfBoundsException("下标越界");
		  }
		  players[index] = newPlayerNum;
	  }
	  
	  //6.替换球衣号码为22的球员替换为222
	  public  void update(Integer oldPlayerNum,Integer newPlayerNum) {
		  int index = getIndexByPlayerNum(oldPlayerNum);
		  if(index >= 0) {
			  set(index,newPlayerNum);
		  }
	  }
	  //7.把场上索引位置为2的球员罚下(不补位)
	  public  void delete(int index) {
		  if(index < 0 || index >= size) {
			  throw new ArrayIndexOutOfBoundsException("下标越界");
		  }
		  //数组中没有真正的删除
		  for(int i = index;i<size-1;i++) {
			  players[i] = players[i+1];
		  }
		  //把最后一个球员设置为null
		  players[size-1] = null;
		  
		  //需要减少球员的个数
		   size--;
	  }
	  //8.按照球员在场上的位置,打印球衣号码
	  /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		  return Arrays.toString(players);
	}
}
