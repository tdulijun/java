package com.qfedu.MiniDVD;

public interface DVDInterface {
       /**
        * ����DVDӰƬ
        * @param dvds DVD����
        * @param dvd ��������dvd����
        * @return  
        * true --> �����ɹ�   false --> ����ʧ��
        */
       boolean addDVD(DVD[] dvds,DVD dvd);
       /**
        * �鿴DVD����
        * @param dvds DVD����
        */
       void selectDVD(DVD[] dvds);
       /**
        *ɾ��DVD��Ϣ 
        * @param dvds DVD����
        * @param dvd  Ҫɾ����dvd����
        * @return
        * true --> ɾ���ɹ�   false --> ɾ��ʧ��
        */
       boolean deleteDVD(DVD[] dvds,DVD dvd);
       /**
        * ���DVD
        * @param dvds DVD����
        * @param dvd  ���dvd�Ķ���
        * @return
        * return --> ����ɹ�   false --> ���ʧ��
        */
       boolean lendDVD(DVD[] dvds,DVD dvd);
       /**
        * �黹DVD
        * @param dvds DVD����
        * @param dvd  �黹��dvd
        * @return
        * ture --> �黹�ɹ�    false --> �黹ʧ��
        */
       boolean returnDVD(DVD[] dvds, DVD dvd);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
}
