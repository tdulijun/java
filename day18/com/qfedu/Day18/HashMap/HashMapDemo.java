/**
 * 
 */
package com.qfedu.Day18.HashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Description�� HashMap���÷���<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HashMapDemo.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public class HashMapDemo {
	public static void main(String[] args) {
		//1.����Map���϶���
		Map<String,String> map = new HashMap<>();
        //2.��map���϶����д洢map�����е�Ԫ��
		Map<String,String> map1 = new HashMap<>(map);
		
		//���÷���:
		//1.�򼯺������Ԫ��
		/*
		 * ����������з���ֵ��,���ص��� value����������
		 */
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		map.put("key6", "value6");
		System.out.println(map);
		//2.�򼯺�����Ӽ���(��Ӽ����е�Ԫ��)
		map1.putAll(map);
		System.out.println(map1);
		
		//3.��ռ���,���ϻ���
		map1.clear();
		System.out.println(map1);
		
		//4.�жϼ������Ƿ����ָ����keyֵ
		//true֤������  false ������
		boolean res = map.containsKey("key7");
		System.out.println(res);
		
		//5.�жϼ������Ƿ����ָ����valueֵ
		//true֤������  false ������
		boolean result = map.containsValue("value7");
		System.out.println(result);
		
		//6ͨ��key��ȡvalueֵ ,��key�����ڷ���null
		String value = map.get("key4");
		System.out.println(value);
		
		//7.�жϼ����Ƿ��ǿ�,˵�����ϴ���,û��Ԫ��
		System.out.println(map1.isEmpty());
		
		//8.key�൱�ڴ洢����set������ ���� ����Ψһ
		//��ȡ���е�keyֵ���洢��set������
		Set<String> set = map.keySet();
		//��ʱ���е�key�ǲ��Ƕ���set���ϼ�������
		//�ǲ���ͨ������set���Ͼ��ܻ�ȡ��ı�map���϶�Ӧ�ļ�ֵ��
		for(String keys : set) {
			if(keys.equals("key6")) {
				//�������򼯺������Ԫ��,�޸Ķ�Ӧ�ļ�ֵ��
				map.put(keys, "vlaue10");
			}
		}
		System.out.println(map);
		
		//9.��ȡMap����������Value��ֵ,�洢��Collection������
		Collection<String> c = map.values();
		for(String value1 : c) {
			System.out.println(value1);
		}
		
		
		//10.��ȡ���м�ֵ�Ե��ܺ�(����)
		System.out.println(map.size());
		
		//11.ͨ��keyɾ����Ӧ�ļ�ֵ�� ,����ֵ�Ƕ�Ӧ��value
		//ɾ���ɹ����ȡ��Ӧ��value ʧ���򷵻�null
		String value2 = map.remove("key9");
		System.out.println(value2);
		//12.
		/*
		 * Set<Map.Entry<K,V>> entrySet() 
          		���ش�ӳ����������ӳ���ϵ�� Set ��ͼ��
            		ͨ���˷������Եĵ�һ��set����
           ��Ҫ��set������ӷ��� ���������������һ��Map.Entry
           Map.Entry�Լ�Ҳ�з��� �������������Ҫ��map�����д洢��
           key��value����������һ��
		 * */
		
		Set<Map.Entry<String,String>> mapSet =   map.entrySet();
		System.out.println(mapSet);
		for(Map.Entry<String, String> entry :mapSet) {
			//ȡ��key �� value
			System.out.println(entry.getKey()+" ---> "+ entry.getValue());
		}
		
		//������������ͬ��keyֵ���һ����ӵļ�ֵ�Ի������һ����Ӽ�ֵ��
		map1.put("key1", "value1");
		map1.put("key1", "value2");
		System.out.println(map1);
		
		map1.put("key1", "value1");
		map1.put("key2", "value1");
		System.out.println(map1);
		
		/*
		 * ����:
		 һ���˶�Ӧ�������п� Card�� cardNo�����п��ţ�startDate���������ڣ� money�����
                         �����һ����������һ���˵����ƣ��õ�����˵��������п���Ϣ�� ��ֵ��
                  һ���Զ�        value��ʲô?
                  ��������:
                 1.ͨ����һ�仰��֪�õ�һ����Ϣ������Ҫһ������Card�ķ�ʽ
                   	��java������ֻ��������������� Ӧ�ô���һ��Card��
                 2.Card�ĺ����ṩ��һЩ��Ϣ ��������  �������� ���
                                        ��Щ���Ե������Ƕ������Ϣ����,����Ϣ����Ӧ�����������
                 3.�ڶ��仰��������һЩ��Ϣ,���ȼ�Ȼ������һ������ ��ô��ȻҪ�õ�Scanner
                   		������String�����������ַ���  �������������ڶ��˵�һ����������
                   		����Ӧ���ƶ϶��� ���Դ���һ������ ���������� 
                   	�����������������������StringҲ����ʹ���Լ��������������
                 4.�ڶ��仰����һ����Ϣ����һ�����ж��ſ�������
                     	����Ӧ�ú���ȷ�������ǵ�����һ��?��ô�������ʾ���ſ���?--> ����
                           ѡ���Ǹ�������? һ���˿�����ͬһ�����а���ſ� �����ڲ������������������Ӧ��ʹ�� List
                 5.�����Щ��Ϣ����,������ͨ��������ȡ��Ӧ�Ŀ�,��ô����Ҫһ���ȶ��Ļ�ȡģʽ
                   ��ֵ��  key-value��ʽ   �� key ������   value ��list���� �����д��ڶ��ſ�
                     	
		 */
		  System.out.println("������һ������:");
		  Scanner input = new Scanner(System.in);
		  String name = input.next();
		  List<Card> list = new ArrayList<>();
		  list.add(new Card("88888888", "1900-01-01", "1"));
		  list.add(new Card("77777777", "1292-02-02", "10000"));
		  list.add(new Card("66666666", "2018-08-22", "1000000000000000000000000"));
		  
		  //�ǳ������ļ����д洢������һ������
		  Map<String,List<Card>> hmap = new HashMap<>();
		   hmap.put("������", list);
		  System.out.println("�Ե����ڲ�ѯ.......");
		  if(hmap.containsKey(name)) {
//	        	List<Card> listmap =  hmap.get(name);
//	        	for(Card c1 : listmap) {
//	        		System.out.println(c1);
//	        	}
			  System.out.println(hmap.get(name));
			  
		  }else {
			  System.out.println("������˼û�������");
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
