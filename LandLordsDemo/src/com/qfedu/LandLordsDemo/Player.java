package com.qfedu.LandLordsDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * �����
 * @author JKMaster
 *
 */
public class Player {
	private String name;
	// �洢����������
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
	
	//��ӡ����������
	public void showInfosPoker() {
		System.out.println(name+":"+pokers);
	}

}
