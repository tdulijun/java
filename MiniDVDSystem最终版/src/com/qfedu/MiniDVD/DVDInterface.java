package com.qfedu.MiniDVD;

import java.util.List;

public interface DVDInterface {
       /**
        * 增加DVD影片
        * @param dvds DVD数组
        * @param dvd 创建出的dvd对象
        * @return  
        * true --> 新增成功   false --> 新增失败
        */
       boolean addDVD(List<DVD> dvds,DVD dvd);
       /**
        * 查看DVD数组
        * @param dvds DVD数组
        */
       void selectDVD(List<DVD> dvds);
       /**
        *删除DVD信息 
        * @param dvds DVD数组
        * @param dvd  要删除的dvd对象
        * @return
        * true --> 删除成功   false --> 删除失败
        */
       boolean deleteDVD(List<DVD> dvds,DVD dvd);
       /**
        * 借出DVD
        * @param dvds DVD数组
        * @param dvd  借出dvd的对象
        * @return
        * return --> 借出成功   false --> 借出失败
        */
       boolean lendDVD(List<DVD> dvds,DVD dvd);
       /**
        * 归还DVD
        * @param dvds DVD数组
        * @param dvd  归还的dvd
        * @return
        * ture --> 归还成功    false --> 归还失败
        */
       boolean returnDVD(List<DVD> dvds, DVD dvd);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
}
