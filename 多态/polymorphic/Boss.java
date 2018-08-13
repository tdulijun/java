package com.qfedu.Day11.polymorphic;

public class Boss {
    private String name;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		  //创建Boss
		Boss boss = new Boss();
		boss.setName("小龙");
		Manager m = new Manager(1000,500);
		Salesman smn = new Salesman(800,2000);
		Satff sa = new Satff(10000,9000);
		//员工到达100人-->所有员工介绍自己的薪水
		System.out.println("---------------年终介绍:-------------");
//	     showInfosMananger(m);
//	     showInfosSalesman(smn);
//	     showInfosSatff(sa);
		  showInfosEmployee(m);
		  //showInfosEmployee(smn);
	
	}
	//100遍--->只要一个方法就可以所有员工介绍
	//多态:同一个事物,被不同对象所触发得到的结果是不同
	//对象多态-->需要是继承关系 --> 父类
//	public static void showInfosMananger(Manager m) {
//		m.addMoney();
//	}
//	public static void showInfosSalesman(Salesman smn) {
//		smn.addMoney();
//	}
//	public static void showInfosSatff(Satff sa) {
//		sa.addMoney();
//	}
	//除了老板都是员工
	//父类的对象可以接受一个子类的引用
	//参数 Employee  e = m;-->(new Manager());
	public static void showInfosEmployee(Employee e) {
		//子类重写类父类的方法,默认执行的一定是重写之后的方法
		e.addMoney();
		
		
	}
	

}
