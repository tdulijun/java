package com.qianfeng.test;

import java.util.Scanner;
public class PointDemo {
		public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
			System.out.print("请输入点1的横坐标:");
				double x1 = scanner.nextDouble();
			System.out.print("请输入点1的纵坐标:");
				double y1 = scanner.nextDouble();
				Point2 p1=new Point2(x1, y1);
				System.out.print("点1的坐标为：");
				/*
				 * 考虑人性化 按坐标形式打印
				 */
				p1.show();
			System.out.print("请输入点2的横坐标:");
				double x2 = scanner.nextDouble();
			System.out.print("请输入点2的纵坐标:");
				double y2 = scanner.nextDouble();
				Point2 p2=new Point2(x2, y2);
				System.out.print("点2的坐标为：");
				/*
				 * 考虑人性化 按坐标形式打印
				 */
				p2.show();
				 /*
				   * 方法一  静态调用
				   */
				//double distance = Point2.distance(new Point2(x1, y1), new Point2(x2, y2));
				/*
				 *  方法二 非静态调用
				 */
							double distance = new Point2(x1, y1).distance(new Point2(x2, y2));
			System.out.println("两点之间的距离为: " + distance);
		}
}

class Point2 {
	public  double x;
	public  double y;
	/*
	 * 有参构造函数
	 */
		public Point2(double x, double y){
			this.x = x;
			this.y = y;
		}
		/*
		 * 考虑人性化 按坐标形式打印
		 */
		  public void show(){
		        System.out.println("("+x+","+y+")");
		    }
		  /*
		   * 方法一  静态方法
		   */
		public static double distance(Point2 p1, Point2 p2){
//			return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
			return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y-p2.y, 2));
		}
		/*
		 *  方法二 非静态方法
		 */
		public  double distance(Point2 p){
			return Math.sqrt(p.x-x)*(p.x-x)+(p.y-y)*(p.y-y);
		}
		
		
		public  double getX() {
			return x;
		}
		public  double getY() {
			return y;
		}
}
