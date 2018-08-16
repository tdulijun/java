package com.qfedu.MiniDVD;
//��Ҫ�߼� ,��������DVD��������
public class DVDMananger implements DVDInterface{
	/**
     * ����DVDӰƬ
     * @param dvds DVD����
     * @param dvd ��������dvd����
     * @return  
     * true --> �����ɹ�   false --> ����ʧ��
     */
	@Override
	public boolean addDVD(DVD[] dvds, DVD dvd) {
		  //1.DVD�����Ѿ�����,����������dvd��
		  if(dvds[dvds.length-1] != null){
			  System.out.println("��Ǹ,��Ƭ����,�����������µ�DVD��......");
			  return false;
		  }
		  //2.DVD�����д洢��dvd����ʹ����dvd������ͬ,dvd������ͬ��ͬһ��
		  //String���������������ַ������ж�Ӧ��ʹ��equals�����,String���Ѿ���д��equals
		  //������ǰDVD����Ѱ����ͬ����
		  if(isExistSameDVD(dvds, dvd)){
			  System.out.println("��Ǹ,DVD���Ѿ���洢����ͬ�ĵ�Ƭ,���ܽ�������...");
			  return false;
		  }
		  
		  //���������ҵ��յ�λ�����洢��ǰdvd����
		  for(int i = 0;i<dvds.length;i++){
			  if(dvds[i] == null){
				  dvds[i] = dvd;
				  break;
			  }
		  }
		  return true;
		  
	}
	/**
     * �鿴DVD����
     * @param dvds DVD����
     */
	@Override
	public void selectDVD(DVD[] dvds) {
	  //����һ��������,���
		int cut = 0;
		System.out.println("���\t\t״̬\t\t����\t\t�������\t\t�������");
		for(int i = 0;i<dvds.length;i++){
			if(dvds[i] != null){
				//�±��Ǵ�0��ʼ,����Ǵ�1��ʼ
				System.out.println((++cut)+"\t\t"+dvds[i]);
			}
		}
		
	}
	/**
     *ɾ��DVD��Ϣ 
     * @param dvds DVD����
     * @param dvd  Ҫɾ����dvd����
     * @return
     * true --> ɾ���ɹ�   false --> ɾ��ʧ��
     */
	@Override
	public boolean deleteDVD(DVD[] dvds, DVD dvd) {
		  //1.�����ڵ�dvd�ǲ���ɾ��
		if(!isExistSameDVD(dvds, dvd)){
			System.out.println("��Ǹ,DVD�в�������Ҫɾ����ӰƬ"+dvd.getName()+"����ɾ��DVD...");
		    return false;
		}
		System.out.println(dvd);
		//2.�Ѿ������DVD����ɾ��
		for(DVD dvdTmpe : dvds){
			 //Ҳ���ǵ�ǰdvd������null
		     //dvdsȡ�����Ķ���Ҳ����null
		     //dvdTmpe��dvd����һ������
			if(dvd!=null && dvdTmpe != null &&dvd.equals(dvdTmpe)){
				
				if(dvdTmpe.getState() == 0){
				    System.out.println("��Ǹ,��Ҫɾ����ӰƬ�Ѿ��ǽ��,"+dvd.getName()+"����ɾ��.....");
				    return false;
				}
			}
		}
		//ɾ����ǰ�����е�DVD��Ϣ
		//�������� --> null 
		//�������� ȡ���Ķ��������Ҫɾ���Ķ�����һ��, null����
		//{����1,����2,null,����4,null,����6} ����
		for(int i = 0;i<dvds.length;i++){
			if(dvd != null && dvd.equals(dvds[i])){
				//����ǰ����ֵΪnull
				dvds[i] = null;
				//�������Ԫ����ǰ�ƶ�
				for(int j = i; j<dvds.length-1;j++){
					dvds[j] = dvds[j+1];
				}
				//{����1,����2,����4,null,����6,null}
				//Ϊ�˷�ֹdvd�����һλҲ�ж���洢��,���ƶ���ʱ������ͬ����
				dvds[dvds.length-1] = null;
				break;
			}
		}
		return true;
		
	}
	 /**
     * ���DVD
     * @param dvds DVD����
     * @param dvd  ���dvd�Ķ���
     * @return
     * return --> ����ɹ�   false --> ���ʧ��
     */
	@Override
	public boolean lendDVD(DVD[] dvds, DVD dvd) {
		 //1.�����ڵ�ӰƬ���ܽ��
		if(!isExistSameDVD(dvds, dvd)){
			System.out.println("��Ǹ,DVD�в�����Ҫ�����ӰƬ"+dvd.getName()+"���ܽ��...");
		    return false;
		}
		//2.DVD�����л�ȡ�Ķ���״̬�� 0 ,��ʾ�Ѿ����
		for(DVD dvdTmpe : dvds){
			if(dvd!=null && dvdTmpe != null &&dvd.equals(dvdTmpe)){
				if(dvdTmpe.getState() == 0){
			        System.out.println("��Ǹ,DVD�ж�Ӧ�ĵ�Ƭ�Ѿ����"+dvd.getName()+"���ܽ�� ...");
			    return false;
				}
			}
		}
		  for(int i = 0; i<dvds.length;i++){
			  if(dvd != null && dvd.equals(dvds[i])){
				  //�޸ĵ�ǰ�洢��DVD�����ж����״̬
				  dvds[i].setState(0);
				  //���������
				  dvds[i].setDate(dvd.getDate());
				  //�������
				  dvds[i].setCount(dvds[i].getCount()+1);
				  break;
			  }
		  }
		  return true;
	}
	 /**
     * �黹DVD
     * @param dvds DVD����
     * @param dvd  �黹��dvd
     * @return
     * ture --> �黹�ɹ�    false --> �黹ʧ��
     */
	@Override
	public boolean returnDVD(DVD[] dvds, DVD dvd) {
		//1.�����ڵ�dvd���ܹ黹
		if(!isExistSameDVD(dvds, dvd)){
			System.out.println("��Ǹ,DVDϵͳ��û����Ҫ�黹�ĵ�Ƭ"+dvd.getName()+"���ܹ黹....");
		   return false;
		}
		//2.�ɽ�ĵ�Ƭ���ܹ黹
		for(DVD dvdTmpe : dvds){
			if(dvd!=null && dvdTmpe != null &&dvd.equals(dvdTmpe)){
				if(dvdTmpe.getState() == 1){
				System.out.println("��Ǹ,DVDϵͳ�е�Ƭ�ǿɽ�״̬"+dvd.getName()+"���ܹ黹....");
				return false;
				}
			}
		}
	

		for(int i = 0; i<dvds.length;i++){
			if(dvd != null && dvd.equals(dvds[i])){
				//�޸�״̬
				dvds[i].setState(1);
				//�޸�����
				dvds[i].setDate(0);
				break;
			}
		}
		return true;
	}
     /**
      *�ж��������Ƿ��Ѿ���������ͬ���� 
      * @param dvds DVD����
      * @param dvd  dvd����
      * @return
      * return --> ��ͬ   false --> û����ͬ
      */
	
	public boolean isExistSameDVD(DVD[] dvds,DVD dvd){
		for(DVD dvdTemp : dvds){
			if(dvd != null && dvdTemp != null && dvd.equals(dvdTemp)){
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
}
