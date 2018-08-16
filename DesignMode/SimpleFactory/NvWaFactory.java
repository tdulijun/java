package com.qfedu.Day11.DesignMode.SimpleFactory;
//工厂类
public class NvWaFactory {
	//构造方法需要私有 工厂类中所提供的方法都是静态方法
	public static Person CreatePerson(String gender) {
		 switch (gender) {
		case "男人":
			return new Man();
		case "女人":
			return new Woman();
		default:
			//没有异常,有异常的话应该抛出异常
			return null;
		}
		
	}

}
