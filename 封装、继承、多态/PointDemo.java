package com.qianfeng.test;

import java.util.Scanner;
public class PointDemo {
		public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
			System.out.print("�������1�ĺ�����:");
				double x1 = scanner.nextDouble();
			System.out.print("�������1��������:");
				double y1 = scanner.nextDouble();
				Point2 p1=new Point2(x1, y1);
				System.out.print("��1������Ϊ��");
				/*
				 * �������Ի� ��������ʽ��ӡ
				 */
				p1.show();
			System.out.print("�������2�ĺ�����:");
				double x2 = scanner.nextDouble();
			System.out.print("�������2��������:");
				double y2 = scanner.nextDouble();
				Point2 p2=new Point2(x2, y2);
				System.out.print("��2������Ϊ��");
				/*
				 * �������Ի� ��������ʽ��ӡ
				 */
				p2.show();
				 /*
				   * ����һ  ��̬����
				   */
				//double distance = Point2.distance(new Point2(x1, y1), new Point2(x2, y2));
				/*
				 *  ������ �Ǿ�̬����
				 */
							double distance = new Point2(x1, y1).distance(new Point2(x2, y2));
			System.out.println("����֮��ľ���Ϊ: " + distance);
		}
}

class Point2 {
	public  double x;
	public  double y;
	/*
	 * �вι��캯��
	 */
		public Point2(double x, double y){
			this.x = x;
			this.y = y;
		}
		/*
		 * �������Ի� ��������ʽ��ӡ
		 */
		  public void show(){
		        System.out.println("("+x+","+y+")");
		    }
		  /*
		   * ����һ  ��̬����
		   */
		public static double distance(Point2 p1, Point2 p2){
//			return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
			return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y-p2.y, 2));
		}
		/*
		 *  ������ �Ǿ�̬����
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
