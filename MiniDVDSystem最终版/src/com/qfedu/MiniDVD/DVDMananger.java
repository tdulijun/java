package com.qfedu.MiniDVD;

import java.util.Iterator;
import java.util.List;



//主要逻辑 ,用来处理DVD管理事物
public class DVDMananger implements DVDInterface{
	/**
     * 增加DVD影片
     * @param dvds DVD数组
     * @param dvd 创建出的dvd对象
     * @return  
     * true --> 新增成功   false --> 新增失败
     */
	@Override
	public boolean addDVD(List<DVD> dvds, DVD dvd) {
		// 拦截非法的操作
				// ①碟片已满，不能新增
				if (dvds.size() == 6) {
					System.out.println("抱歉，碟片已满，不能新增DVD!....");
					return false;
				}

				// ②店面中已经存在相同的碟片了，不能新增
				if (dvds.contains(dvd)) {
					System.out.println("抱歉，店面中已经存在相同的碟片了，不能新增DVD!....");
					return false;
				}

				// --->正常的新增逻辑
				// 思路：
				// 在集合中新增一个元素
				// ①找到集合中为null的元素对应的索引
				// ②将其替换为指定的对象

				return dvds.add(dvd);
		  
	}
	/**
     * 查看DVD数组
     * @param dvds DVD数组
     */
	@Override
	public void selectDVD(List<DVD>  dvds) {
		         // 思路：
				// 遍历集合时，只将不为null的元素打印出来

				int cnt = 0;// 计数器（记录集合中不为null的元素的个数）
				System.out.println("序号\t\t状态\t\t名称\t\t借出日期\t\t借出次数");

				Iterator<DVD> itr = dvds.iterator();
				while (itr.hasNext()) {
					System.out.println((++cnt) + "\t\t" + itr.next());
				}
		
	}
	/**
     *删除DVD信息 
     * @param dvds DVD数组
     * @param dvd  要删除的dvd对象
     * @return
     * true --> 删除成功   false --> 删除失败
     */
	@Override
	public boolean deleteDVD(List<DVD> dvds, DVD dvd) {
		  //1.不存在的dvd是不能删除
		if(!dvds.contains(dvd)){
			System.out.println("抱歉,DVD中不存在您要删除的影片"+dvd.getName()+"不能删除DVD...");
		    return false;
		}
		 // ②已借出的碟片不能下架
				DVD dvdTmp = getExactDVDInfo(dvds, dvd);
				if (dvdTmp.getState() == 0) {
					System.out.println("抱歉，您要下架的碟片《" + dvd.getName()
							+ "》的状态为【已借出】，不能下架DVD!....");
					return false;
				}

		// 思路：
		// 直接从集合中删除指定的dvd对象即可

		return dvds.remove(dvd);
		
	}
	 /**
     * 借出DVD
     * @param dvds DVD数组
     * @param dvd  借出dvd的对象
     * @return
     * return --> 借出成功   false --> 借出失败
     */
	@Override
	public boolean lendDVD(List<DVD> dvds, DVD dvd) {
		       // 思路：
				// ①遍历集合，找到集合中对应的dvd对象
				// ②修改集合中的dvd对象的属性值
				DVD dvdInCollection = getExactDVDInfo(dvds, dvd);
				
				if(!dvds.contains(dvdInCollection)){
					System.out.println("抱歉,DVD中不存在您要借出的影片"+dvd.getName()+"不能借出DVD...");
				    return false;
				}else if(dvdInCollection.getState() == 0){
					System.out.println("抱歉,DVD中您要借出的影片已经借出"+dvd.getName()+"不能借出DVD...");
					return false;
				}
				// 修改：状态
				dvdInCollection.setState(0);

				// 借出日期
				dvdInCollection.setDate(dvd.getDate());

				// 借出次数
				dvdInCollection.setCount(dvdInCollection.getCount() + 1);

				return true;
	}
	 /**
     * 归还DVD
     * @param dvds DVD数组
     * @param dvd  归还的dvd
     * @return
     * ture --> 归还成功    false --> 归还失败
     */
	@Override
	public boolean returnDVD(List<DVD> dvds, DVD dvd) {
		// 思路：

		// ①遍历集合，找到集合中DVD对象
		DVD dvdInColl = getExactDVDInfo(dvds, dvd);

		// ②修改集合中dvd对象的信息
		if(!dvds.contains(dvdInColl)){
			System.out.println("抱歉,DVD中不存在您要归还的影片"+dvd.getName()+"不能归还DVD...");
		    return false;
		}else if(dvdInColl.getState() == 1){
			System.out.println("抱歉,DVD中您要归还的影片没有借出"+dvd.getName()+"不能归还DVD...");
			return false;
		}
		// 修改状态
		dvdInColl.setState(1);
		// 修改借出日期
		dvdInColl.setDate(0);

		return true;
	}
  
	/**
	 * 从集合中查询出要操作的碟片信息(***)
	 * 
	 * @param dvds DVD集合
	 * @param dvd  DVD对象
	 * @return 若找到当前DVD对象就返回,否则返回null
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
