/**
 * 
 */
package com.qfedu.Day12.HomeWork;

/**
 * Description�� ��˾��<br/>
 * Copyright (c) , 2018, JK <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name:Company.java <br/>
 * 
 * @author ǧ���Ǹ�
 * @version : 1.0
 */
public abstract class Company  {
        private String name;
        

		public Company() {
			
		}
		

		public Company(String name) {
			
			this.name = name;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
        
}
