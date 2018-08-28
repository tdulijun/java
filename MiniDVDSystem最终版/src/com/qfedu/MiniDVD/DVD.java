package com.qfedu.MiniDVD;
//DVD类的描述类
public class DVD {
	private String name;//名称
	private int state;//状态(0:已经借出,1可借)
	private int date;//借出的日期
	private int count;//借出次数
	//有参无参构造方法
	public DVD() {
		
	}
	public DVD(String name, int state, int date, int count) {
		
		this.name = name;
		this.state = state;
		this.date = date;
		this.count = count;
	}
	
	
	//set和get方法
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
	
	//判断DVD数组中是否存储了相同的元素
	//DVD数组是否有相同-->名称
	//名字一样,就认为已经存储到当期DVD数组中
	
	@Override
	public boolean equals(Object obj) {
		   //Object 所有类的直接或间接父类
		   //父类是无法调用子类的特有属性和行为
		   //将当前obj转换为当前对应类的类型
		   DVD other = (DVD)obj;
		return this.name.equals(other.name);
	}
	//若equals比较的结果是true,需要将当前对象hashcode值也要一致
	@Override
	public int hashCode() {
		return name.hashCode()+count;
	}
	
	//显示打印DVD对象的值
	@Override
	public String toString() {
	    return (state == 0 ? "已借出":"可借")+"\t\t<<"+name+">>\t"+
	           (date == 0 ?"":date+"日")+"\t\t"+(count == 0 ? "":count+"次");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
