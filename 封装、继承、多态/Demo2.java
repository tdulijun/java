package com.qianfeng.test;
//封装性:(根据对属性的封装来说明):把对成员变量的访问进行私有化,通过一个公共的方法间接的实现访问.
//好处:提高了代码的安全性,增加了代码的可读性和复用性.
public class Demo2 {
	public static void main(String[] args) {
		/*
		 * 开枪射击
		 */
		Gun gun = new Gun();
		//我们把程序中出现的不符合逻辑的数据称为脏数据
		/*
		 * 原因:直接将脏数据赋值给了成员变量
		 * 解决:1.不要将数据直接赋值给成员变量--将成员变量私有化
		 * 2.通过方法间接的访问他,在方法内先过滤,再赋值
		 */
		//gun.bulletNumber = -5;
		gun.addBullet(-5);
		gun.shoot();
		/*
		 * 因为对所有的属性都要进行赋值取值,所以系统指定了一整套的规范--get,set
		 * set:--赋值的过程
		 * 构成: 修饰词  返回值  方法名(参数列表){方法体
		 * 		return 返回值
		 * }
		 * 修饰词:一定是public
		 * 返回值:是void
		 * 方法名:set+成员变量的名字,但是需要首字母大写.
		 * 参数列表:只有一个参数,并且参数的类型和名字与成员变量一致
		 * 方法体:不需要return    要写的代码是:this.成员变量=参数的名字
		 * get:--取值的过程
		 * 构成: 修饰词  返回值  方法名(参数列表){方法体
		 * 		return 返回值
		 * }
		 * 修饰词:一定是public
		 * 返回值:类型与成员变量一致
		 * 方法名:get+成员变量的名字,但是需要首字母大写.
		 * 参数列表:不需要参数
		 * 方法体的代码:return  成员变量
		 * 
		 * 快捷方式:shift+alt+s
		 */
	}
}

class Gun{
	//被private修饰的只能在当前类内可见
	private int bulletNumber;
	private int age;
	private String name;
	private double weight;
	private double height;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//子弹的添加
	public void addBullet(int bulletNumber){
		//过滤的过程
		if (bulletNumber >=0) {
			this.bulletNumber = bulletNumber;
		}else {
			this.bulletNumber = 0;
		}
	}
	
	public void setBulletNumber(int bulletNumber){
		this.bulletNumber = bulletNumber;
	}
	public int getBulletNumber() {
		return bulletNumber;
	}
	
	//射击方法
	public void shoot(){
		if (bulletNumber > 0) {
			--bulletNumber;
		}
		System.out.println("剩下的子弹数量:"+ bulletNumber);
	}
}