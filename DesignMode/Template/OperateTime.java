package com.qfedu.Day11.DesignMode.Template;
//����,����ʱ��
public abstract class OperateTime {
     //����ʱ��
	  public void time() {
		  //��ȡ��ʼ��ʱ��
		  long beginTime = System.currentTimeMillis(); //����ֵ
		  //ʵ�ʲ��Դ�����߼� 
		  //�ӳٲ���,�����߼��������������
		  dowork();		  
		  long endTime = System.currentTimeMillis(); 
		  System.out.println("��ʱ:"+(endTime-beginTime)+"����");
	  }
	  
	  //���󷽷�
	  public abstract void dowork();
}
