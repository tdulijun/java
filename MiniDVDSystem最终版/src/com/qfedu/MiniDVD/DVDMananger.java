package com.qfedu.MiniDVD;

import java.util.Iterator;
import java.util.List;



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
	public boolean addDVD(List<DVD> dvds, DVD dvd) {
		// ���طǷ��Ĳ���
				// �ٵ�Ƭ��������������
				if (dvds.size() == 6) {
					System.out.println("��Ǹ����Ƭ��������������DVD!....");
					return false;
				}

				// �ڵ������Ѿ�������ͬ�ĵ�Ƭ�ˣ���������
				if (dvds.contains(dvd)) {
					System.out.println("��Ǹ���������Ѿ�������ͬ�ĵ�Ƭ�ˣ���������DVD!....");
					return false;
				}

				// --->�����������߼�
				// ˼·��
				// �ڼ���������һ��Ԫ��
				// ���ҵ�������Ϊnull��Ԫ�ض�Ӧ������
				// �ڽ����滻Ϊָ���Ķ���

				return dvds.add(dvd);
		  
	}
	/**
     * �鿴DVD����
     * @param dvds DVD����
     */
	@Override
	public void selectDVD(List<DVD>  dvds) {
		         // ˼·��
				// ��������ʱ��ֻ����Ϊnull��Ԫ�ش�ӡ����

				int cnt = 0;// ����������¼�����в�Ϊnull��Ԫ�صĸ�����
				System.out.println("���\t\t״̬\t\t����\t\t�������\t\t�������");

				Iterator<DVD> itr = dvds.iterator();
				while (itr.hasNext()) {
					System.out.println((++cnt) + "\t\t" + itr.next());
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
	public boolean deleteDVD(List<DVD> dvds, DVD dvd) {
		  //1.�����ڵ�dvd�ǲ���ɾ��
		if(!dvds.contains(dvd)){
			System.out.println("��Ǹ,DVD�в�������Ҫɾ����ӰƬ"+dvd.getName()+"����ɾ��DVD...");
		    return false;
		}
		 // ���ѽ���ĵ�Ƭ�����¼�
				DVD dvdTmp = getExactDVDInfo(dvds, dvd);
				if (dvdTmp.getState() == 0) {
					System.out.println("��Ǹ����Ҫ�¼ܵĵ�Ƭ��" + dvd.getName()
							+ "����״̬Ϊ���ѽ�����������¼�DVD!....");
					return false;
				}

		// ˼·��
		// ֱ�ӴӼ�����ɾ��ָ����dvd���󼴿�

		return dvds.remove(dvd);
		
	}
	 /**
     * ���DVD
     * @param dvds DVD����
     * @param dvd  ���dvd�Ķ���
     * @return
     * return --> ����ɹ�   false --> ���ʧ��
     */
	@Override
	public boolean lendDVD(List<DVD> dvds, DVD dvd) {
		       // ˼·��
				// �ٱ������ϣ��ҵ������ж�Ӧ��dvd����
				// ���޸ļ����е�dvd���������ֵ
				DVD dvdInCollection = getExactDVDInfo(dvds, dvd);
				
				if(!dvds.contains(dvdInCollection)){
					System.out.println("��Ǹ,DVD�в�������Ҫ�����ӰƬ"+dvd.getName()+"���ܽ��DVD...");
				    return false;
				}else if(dvdInCollection.getState() == 0){
					System.out.println("��Ǹ,DVD����Ҫ�����ӰƬ�Ѿ����"+dvd.getName()+"���ܽ��DVD...");
					return false;
				}
				// �޸ģ�״̬
				dvdInCollection.setState(0);

				// �������
				dvdInCollection.setDate(dvd.getDate());

				// �������
				dvdInCollection.setCount(dvdInCollection.getCount() + 1);

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
	public boolean returnDVD(List<DVD> dvds, DVD dvd) {
		// ˼·��

		// �ٱ������ϣ��ҵ�������DVD����
		DVD dvdInColl = getExactDVDInfo(dvds, dvd);

		// ���޸ļ�����dvd�������Ϣ
		if(!dvds.contains(dvdInColl)){
			System.out.println("��Ǹ,DVD�в�������Ҫ�黹��ӰƬ"+dvd.getName()+"���ܹ黹DVD...");
		    return false;
		}else if(dvdInColl.getState() == 1){
			System.out.println("��Ǹ,DVD����Ҫ�黹��ӰƬû�н��"+dvd.getName()+"���ܹ黹DVD...");
			return false;
		}
		// �޸�״̬
		dvdInColl.setState(1);
		// �޸Ľ������
		dvdInColl.setDate(0);

		return true;
	}
  
	/**
	 * �Ӽ����в�ѯ��Ҫ�����ĵ�Ƭ��Ϣ(***)
	 * 
	 * @param dvds DVD����
	 * @param dvd  DVD����
	 * @return ���ҵ���ǰDVD����ͷ���,���򷵻�null
	 */
	public DVD getExactDVDInfo(List<DVD> dvds, DVD dvd) {
		for (DVD dvdTmp : dvds) {
				if (dvd != null && dvd.equals(dvdTmp)) {
					return  dvdTmp;
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
}
