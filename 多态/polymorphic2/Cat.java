package com.qfedu.Day11.polymorphic2;
//子类
public class Cat extends Animal{
        private String gender;

		public Cat() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Cat(int age, String name,String gender) {
			super(age, name);
			this.gender = gender;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
	
		@Override
		public void show() {
				System.out.println("-----------------Cat子类重写--------------");
		}
        
        
}
