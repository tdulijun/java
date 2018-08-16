package com.qfedu.MiniDVD;

import java.util.Scanner;

//DVD系统模拟
public class MiniDvDSystem {

	public static void main(String[] args) {
		 //获取用户输入
		Scanner input = new Scanner(System.in);
		//DVD数组中是长度为,并且有三个值
		DVD[] dvds = new DVD[6];
		dvds[0] = new DVD("罗马假日",0,1,15);
		dvds[1] = new DVD("风声鹤唳",1,0,12);
		dvds[2] = new DVD("浪漫满屋",1,0,30);
		
		//创建DVDMananger的对象,逻辑都在这个类中
		DVDMananger  manager = new DVDMananger();
		//模拟整个dvd处理义务的状态
		EXIT:while(true){
			//1.先显示当前的菜单信息
			System.out.println("\n欢迎使用迷你DVD管理器");
			System.out.println("----------------------------------------------------");
			System.out.println("1.新增DVD");
			System.out.println("2.查看DVD");
			System.out.println("3.删除DVD");
			System.out.println("4.借出DVD");
			System.out.println("5.归还DVD");
			System.out.println("6.退出DVD");
			System.out.println("----------------------------------------------------");
			//2.获取用户的输入
			System.out.println("请选择:");
			int num = input.nextInt();
			//创建一个DVD对象,用来处理业务
			DVD dvd = new DVD();
			switch (num) {
			case 1:
				System.out.println("--->新增DVD");
				System.out.println("请输入DVD的名字:");
				dvd.setName(input.next());
				dvd.setState(1);
				if(manager.addDVD(dvds, dvd)){
					System.out.println("新增DVD"+dvd.getName()+"成功!"); 
				}else{
					System.out.println("新增DVD"+dvd.getName()+"失败!");
				}
				break;
			case 2:
				System.out.println("--->查看DVD");
				manager.selectDVD(dvds);
				break;
			case 3:
				System.out.println("--->删除DVD");
				System.out.println("请输入DVD的名字:");
				dvd.setName(input.next());
				System.out.println(dvd.getName());
				if(manager.deleteDVD(dvds, dvd)){
					System.out.println("删除DVD"+dvd.getName()+"成功!"); 
				}else{
					System.out.println("删除DVD"+dvd.getName()+"失败!");
				}
				break;
			case 4:
				System.out.println("--->借出DVD");
				System.out.println("请输入DVD的名字:");
				dvd.setName(input.next());
				System.out.println("请输入DVD借出的日期:");
				dvd.setDate(input.nextInt());
				if(manager.lendDVD(dvds, dvd)){
					System.out.println("借出DVD"+dvd.getName()+"成功!");
				}else{
					System.out.println("借出DVD"+dvd.getName()+"失败!");
				}
				break;
			case 5:
				System.out.println("--->归还DVD");
				System.out.println("请输入DVD的名字:");
				dvd.setName(input.next());
				if(manager.returnDVD(dvds, dvd)){
					System.out.println("归还DVD"+dvd.getName()+"成功!"); 
				}else{
					System.out.println("归还DVD"+dvd.getName()+"失败!");
				}
				break;

			default:
				System.out.println("--> 退出DVD");
				break EXIT;
			}
			System.out.println("*******************************************");
			System.out.println("输入0返回");
			//这里的获取没有任何意义
			int n = input.nextInt();
		}
		System.out.println("谢谢使用");

	}

}
