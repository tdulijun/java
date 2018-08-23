/**
 * 
 */
package com.qfedu.Day19.HomeWork;

/**
 * Description： 诗词类<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Poem.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class Poem {
	//诗词的名字
	private String name;
	//作者
	private String zuozhe;
	//朝代
	private String chaodai;
	//内容
	private String neirong;
	public Poem(String name, String zuozhe, String chaodai, String neirong) {
		super();
		this.name = name;
		this.zuozhe = zuozhe;
		this.chaodai = chaodai;
		this.neirong = neirong;
	}
	public Poem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZuozhe() {
		return zuozhe;
	}
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	public String getChaodai() {
		return chaodai;
	}
	public void setChaodai(String chaodai) {
		this.chaodai = chaodai;
	}
	public String getNeirong() {
		return neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	

	@Override
	public String toString() {
		
		return "作者:"+zuozhe+"\n"+"朝代:"+chaodai+"\n"+"内容:"+neirong;
	}
	
	
	
	
	

}
