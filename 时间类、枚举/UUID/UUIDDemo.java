/**
 * 
 */
package com.qfedu.Day14.UUID;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

public class UUIDDemo {

	public static void main(String[] args) {
		//ת��Ϊһ���ַ�������ʽչʾ
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		//��ǰID�û���ͬһ�����ǵ�һ��ע��  
		//ע�� --> ��֤��
		
		//���������֤��
		Random random = new  Random();
		String strUUID = UUID.randomUUID().toString();
		String[] strs = strUUID.split("-");
		int index = random.nextInt(strs.length);
		if(strs[index].length() == 4) {
			System.out.println("��֤����:"+strs[index]);
		}else {
			System.out.println("��֤����:"+strs[index].substring(0, 4));
		}
		
		
		//���ɷ�ʽ
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		str += str.toLowerCase();
		str += "0123456789";
		StringBuilder sbr = new StringBuilder();
		for(int i = 0 ; i<4;i++) {
			char ch = str.charAt(random.nextInt(str.length()));
			sbr.append(ch);
		}
		System.out.println(sbr);

	}

}
