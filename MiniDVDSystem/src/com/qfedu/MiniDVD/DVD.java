package com.qfedu.MiniDVD;
//DVD���������
public class DVD {
	private String name;//����
	private int state;//״̬(0:�Ѿ����,1�ɽ�)
	private int date;//���������
	private int count;//�������
	//�в��޲ι��췽��
	public DVD() {
		
	}
	public DVD(String name, int state, int date, int count) {
		
		this.name = name;
		this.state = state;
		this.date = date;
		this.count = count;
	}
	
	
	//set��get����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	//�ж�DVD�������Ƿ�洢����ͬ��Ԫ��
	//DVD�����Ƿ�����ͬ-->����
	//����һ��,����Ϊ�Ѿ��洢������DVD������
	
	@Override
	public boolean equals(Object obj) {
		   //Object �������ֱ�ӻ��Ӹ���
		   //�������޷�����������������Ժ���Ϊ
		   //����ǰobjת��Ϊ��ǰ��Ӧ�������
		   DVD other = (DVD)obj;
		return this.name.equals(other.name);
	}
	//��equals�ȽϵĽ����true,��Ҫ����ǰ����hashcodeֵҲҪһ��
	@Override
	public int hashCode() {
		return name.hashCode()+count;
	}
	
	//��ʾ��ӡDVD�����ֵ
	@Override
	public String toString() {
	    return (state == 0 ? "�ѽ��":"�ɽ�")+"\t\t<<"+name+">>\t"+
	           (date == 0 ?"":date+"��")+"\t\t"+(count == 0 ? "":count+"��");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
