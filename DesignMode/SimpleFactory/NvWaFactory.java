package com.qfedu.Day11.DesignMode.SimpleFactory;
//������
public class NvWaFactory {
	//���췽����Ҫ˽�� �����������ṩ�ķ������Ǿ�̬����
	public static Person CreatePerson(String gender) {
		 switch (gender) {
		case "����":
			return new Man();
		case "Ů��":
			return new Woman();
		default:
			//û���쳣,���쳣�Ļ�Ӧ���׳��쳣
			return null;
		}
		
	}

}
