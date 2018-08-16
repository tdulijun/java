/**
 * 
 */
package com.qfedu.Day14.UUID;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

public class UUIDDemo {

	public static void main(String[] args) {
		//转换为一个字符串的形式展示
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		//当前ID用户是同一个或是第一次注册  
		//注册 --> 验证码
		
		//生成随机验证码
		Random random = new  Random();
		String strUUID = UUID.randomUUID().toString();
		String[] strs = strUUID.split("-");
		int index = random.nextInt(strs.length);
		if(strs[index].length() == 4) {
			System.out.println("验证码是:"+strs[index]);
		}else {
			System.out.println("验证码是:"+strs[index].substring(0, 4));
		}
		
		
		//生成方式
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
