package com.qfedu.LandLordsDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 玩家类
 * @author JKMaster
 *
 */
public class Player {
	private String name;
	// 存储玩家手里的牌
	private List<String> pokers = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPokers() {
		return pokers;
	}

	public void setPokers(List<String> pokers) {
		this.pokers = pokers;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name) {
		super();
		this.name = name;
		this.pokers = pokers;
	}
	
	//打印玩家手里的牌
	public void showInfosPoker() {
		System.out.println(name+":"+pokers);
	}

}
