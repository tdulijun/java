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
 * Description： HashMap常用方法<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:HashMapDemo.java <br/>
 * 
 * @author 千锋智哥
 * @version : 1.0
 */
public class HashMapDemo {
	public static void main(String[] args) {
		//1.创建Map集合对象
		Map<String,String> map = new HashMap<>();
        //2.向map集合对象中存储map集合中的元素
		Map<String,String> map1 = new HashMap<>(map);
		
		//常用方法:
		//1.向集合中添加元素
		/*
		 * 这个方法是有返回值的,返回的是 value的数据类型
		 */
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		map.put("key6", "value6");
		System.out.println(map);
		//2.向集合中添加集合(添加集合中的元素)
		map1.putAll(map);
		System.out.println(map1);
		
		//3.清空集合,集合还在
		map1.clear();
		System.out.println(map1);
		
		//4.判断集合中是否存在指定的key值
		//true证明存在  false 不存在
		boolean res = map.containsKey("key7");
		System.out.println(res);
		
		//5.判断集合中是否存在指定的value值
		//true证明存在  false 不存在
		boolean result = map.containsValue("value7");
		System.out.println(result);
		
		//6通过key获取value值 ,若key不存在返回null
		String value = map.get("key4");
		System.out.println(value);
		
		//7.判断集合是否是空,说明集合存在,没有元素
		System.out.println(map1.isEmpty());
		
		//8.key相当于存储到了set集合中 排重 保持唯一
		//获取所有的key值并存储到set集合中
		Set<String> set = map.keySet();
		//此时所有的key是不是都在set集合集合中了
		//是不是通过操作set集合就能获取或改变map集合对应的键值对
		for(String keys : set) {
			if(keys.equals("key6")) {
				//不仅是向集合中添加元素,修改对应的键值对
				map.put(keys, "vlaue10");
			}
		}
		System.out.println(map);
		
		//9.获取Map集合中所有Value的值,存储到Collection集合中
		Collection<String> c = map.values();
		for(String value1 : c) {
			System.out.println(value1);
		}
		
		
		//10.获取所有键值对的总和(个数)
		System.out.println(map.size());
		
		//11.通过key删除对应的键值对 ,返回值是对应的value
		//删除成功会获取对应的value 失败则返回null
		String value2 = map.remove("key9");
		System.out.println(value2);
		//12.
		/*
		 * Set<Map.Entry<K,V>> entrySet() 
          		返回此映射所包含的映射关系的 Set 视图。
            		通过此方法可以的到一个set集合
           需要给set集合添加泛型 这个方法的类型是一个Map.Entry
           Map.Entry自己也有泛型 这个泛型类型需要和map集合中存储的
           key和value的数据类型一致
		 * */
		
		Set<Map.Entry<String,String>> mapSet =   map.entrySet();
		System.out.println(mapSet);
		for(Map.Entry<String, String> entry :mapSet) {
			//取出key 和 value
			System.out.println(entry.getKey()+" ---> "+ entry.getValue());
		}
		
		//若存在两个相同的key值最后一次添加的键值对会替代第一次添加键值对
		map1.put("key1", "value1");
		map1.put("key1", "value2");
		System.out.println(map1);
		
		map1.put("key1", "value1");
		map1.put("key2", "value1");
		System.out.println(map1);
		
		/*
		 * 需求:
		 一个人对应多张银行卡 Card： cardNo：银行卡号，startDate：开户日期， money：余额
                         请设计一个程序，输入一个人的名称，得到这个人的所有银行卡信息。 键值对
                  一个对多        value是什么?
                  分析如下:
                 1.通过第一句话已知得到一个信息就是需要一个描述Card的方式
                   	在java中描述只能有类来完成所以 应该创建一个Card类
                 2.Card的后面提供了一些信息 包括卡号  开户日期 余额
                                        这些明显的属于是对类的信息描述,那信息描述应该是类的属性
                 3.第二句话中隐藏着一些信息,首先既然是输入一个人名 那么必然要用到Scanner
                   		人名是String类型所以是字符串  再者人名是属于对人的一种描述属性
                   		所以应该推断而出 可以创建一个人类 属性是人名 
                   	综上所述这个参数即可以用String也可以使用自己创建的类来完成
                 4.第二句话还有一个信息就是一个人有多张卡的问题
                     	这里应该很明确卡不能是单纯的一张?那么如何来表示多张卡呢?--> 集合
                           选用那个集合呢? 一个人可以在同一个银行办多张卡 所以在不考虑其他特殊情况下应该使用 List
                 5.最后将这些信息汇总,即可以通过人名获取对应的卡,那么就需要一个稳定的获取模式
                   键值对  key-value形式   即 key 是人名   value 是list集合 集合中存在多张卡
                     	
		 */
		  System.out.println("请输入一个人名:");
		  Scanner input = new Scanner(System.in);
		  String name = input.next();
		  List<Card> list = new ArrayList<>();
		  list.add(new Card("88888888", "1900-01-01", "1"));
		  list.add(new Card("77777777", "1292-02-02", "10000"));
		  list.add(new Card("66666666", "2018-08-22", "1000000000000000000000000"));
		  
		  //非常常见的集合中存储了另外一个集合
		  Map<String,List<Card>> hmap = new HashMap<>();
		   hmap.put("王健林", list);
		  System.out.println("稍等正在查询.......");
		  if(hmap.containsKey(name)) {
//	        	List<Card> listmap =  hmap.get(name);
//	        	for(Card c1 : listmap) {
//	        		System.out.println(c1);
//	        	}
			  System.out.println(hmap.get(name));
			  
		  }else {
			  System.out.println("不好意思没有这个人");
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
