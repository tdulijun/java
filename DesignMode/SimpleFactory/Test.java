package com.qfedu.Day11.DesignMode.SimpleFactory;

public class Test {
		public static void main(String[] args) {
			//获取的是一个父类类型,需要向下转型
			Person p  = NvWaFactory.CreatePerson("男人");
			
			
		}
}
