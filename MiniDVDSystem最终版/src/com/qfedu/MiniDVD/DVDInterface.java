package com.qfedu.MiniDVD;

import java.util.List;

public interface DVDInterface {
       /**
        * ����DVDӰƬ
        * @param dvds DVD����
        * @param dvd ��������dvd����
        * @return  
        * true --> �����ɹ�   false --> ����ʧ��
        */
       boolean addDVD(List<DVD> dvds,DVD dvd);
       /**
        * �鿴DVD����
        * @param dvds DVD����
        */
       void selectDVD(List<DVD> dvds);
       /**
        *ɾ��DVD��Ϣ 
        * @param dvds DVD����
        * @param dvd  Ҫɾ����dvd����
        * @return
        * true --> ɾ���ɹ�   false --> ɾ��ʧ��
        */
       boolean deleteDVD(List<DVD> dvds,DVD dvd);
       /**
        * ���DVD
        * @param dvds DVD����
        * @param dvd  ���dvd�Ķ���
        * @return
        * return --> ����ɹ�   false --> ���ʧ��
        */
       boolean lendDVD(List<DVD> dvds,DVD dvd);
       /**
        * �黹DVD
        * @param dvds DVD����
        * @param dvd  �黹��dvd
        * @return
        * ture --> �黹�ɹ�    false --> �黹ʧ��
        */
       boolean returnDVD(List<DVD> dvds, DVD dvd);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
}
