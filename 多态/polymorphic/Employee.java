package com.qfedu.Day11.polymorphic;
/**
 * Ա���� --> ����
 * @author JKMaster
 * �Ժ�Ŀ�����,ֻҪ�Ǹ�����������ɳ�����,�������ṩ��Ϣ��һ����ֱ�Ӵ��������
 * �������ǲ���ֱ�Ӵ��������
 * 
 */
public abstract class  Employee {
	  private int salary;
	  public Employee() {
		  
	  }
	  public Employee(int salary) {
		  //�����β����ͳ�Ա������
		  this.salary = salary;
		  
	  }
	  //getter/setter
	  //��ȡ��Ӧ�ĳ�Ա����
	  public int getSalary() {
		  return salary;
	  }
	  //��ֵ��Ӧ�ĳ�Ա����
	  public void setSalary(int salary) {
		  this.salary = salary;
	  }
	  //���󷽷�����û�з�����,�����������ڳ�������
	  public abstract void addMoney();
	  

}
