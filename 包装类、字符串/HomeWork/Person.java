/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description�� ��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Person.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class Person {
      //�ӿ�-->��һ������ĳ�����
	//��̬ --> �̳л�ʵ�� �ӿڿ��Խ���һ��ʵ���˽ӿڵ���������(����)
	//���������͸ĳɽӿ�,���ܵĲ����ǲ���ֻ����ʵ���˽ӿڵ���
	public void sendLand(ILandTransportation l) {
	      l.sendLand();
	}
	public void sendAir(IAirTransportation a) {
		a.sendAir();
	}
    
}
