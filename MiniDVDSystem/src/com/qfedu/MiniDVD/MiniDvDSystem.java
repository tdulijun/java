package com.qfedu.MiniDVD;

import java.util.Scanner;

//DVDϵͳģ��
public class MiniDvDSystem {

	public static void main(String[] args) {
		 //��ȡ�û�����
		Scanner input = new Scanner(System.in);
		//DVD�������ǳ���Ϊ,����������ֵ
		DVD[] dvds = new DVD[6];
		dvds[0] = new DVD("�������",0,1,15);
		dvds[1] = new DVD("�������",1,0,12);
		dvds[2] = new DVD("��������",1,0,30);
		
		//����DVDMananger�Ķ���,�߼������������
		DVDMananger  manager = new DVDMananger();
		//ģ������dvd���������״̬
		EXIT:while(true){
			//1.����ʾ��ǰ�Ĳ˵���Ϣ
			System.out.println("\n��ӭʹ������DVD������");
			System.out.println("----------------------------------------------------");
			System.out.println("1.����DVD");
			System.out.println("2.�鿴DVD");
			System.out.println("3.ɾ��DVD");
			System.out.println("4.���DVD");
			System.out.println("5.�黹DVD");
			System.out.println("6.�˳�DVD");
			System.out.println("----------------------------------------------------");
			//2.��ȡ�û�������
			System.out.println("��ѡ��:");
			int num = input.nextInt();
			//����һ��DVD����,��������ҵ��
			DVD dvd = new DVD();
			switch (num) {
			case 1:
				System.out.println("--->����DVD");
				System.out.println("������DVD������:");
				dvd.setName(input.next());
				dvd.setState(1);
				if(manager.addDVD(dvds, dvd)){
					System.out.println("����DVD"+dvd.getName()+"�ɹ�!"); 
				}else{
					System.out.println("����DVD"+dvd.getName()+"ʧ��!");
				}
				break;
			case 2:
				System.out.println("--->�鿴DVD");
				manager.selectDVD(dvds);
				break;
			case 3:
				System.out.println("--->ɾ��DVD");
				System.out.println("������DVD������:");
				dvd.setName(input.next());
				System.out.println(dvd.getName());
				if(manager.deleteDVD(dvds, dvd)){
					System.out.println("ɾ��DVD"+dvd.getName()+"�ɹ�!"); 
				}else{
					System.out.println("ɾ��DVD"+dvd.getName()+"ʧ��!");
				}
				break;
			case 4:
				System.out.println("--->���DVD");
				System.out.println("������DVD������:");
				dvd.setName(input.next());
				System.out.println("������DVD���������:");
				dvd.setDate(input.nextInt());
				if(manager.lendDVD(dvds, dvd)){
					System.out.println("���DVD"+dvd.getName()+"�ɹ�!");
				}else{
					System.out.println("���DVD"+dvd.getName()+"ʧ��!");
				}
				break;
			case 5:
				System.out.println("--->�黹DVD");
				System.out.println("������DVD������:");
				dvd.setName(input.next());
				if(manager.returnDVD(dvds, dvd)){
					System.out.println("�黹DVD"+dvd.getName()+"�ɹ�!"); 
				}else{
					System.out.println("�黹DVD"+dvd.getName()+"ʧ��!");
				}
				break;

			default:
				System.out.println("--> �˳�DVD");
				break EXIT;
			}
			System.out.println("*******************************************");
			System.out.println("����0����");
			//����Ļ�ȡû���κ�����
			int n = input.nextInt();
		}
		System.out.println("ллʹ��");

	}

}
