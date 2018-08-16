package com.qfedu.MiniDVD;
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
	public boolean addDVD(DVD[] dvds, DVD dvd) {
		  //1.DVD数组已经满了,不能再增加dvd了
		  if(dvds[dvds.length-1] != null){
			  System.out.println("抱歉,碟片已满,不能再新增新的DVD了......");
			  return false;
		  }
		  //2.DVD数组中存储的dvd对象和传入的dvd对象相同,dvd名字相同就同一个
		  //String是引用类型所以字符串的判断应该使用equals来完成,String类已经重写了equals
		  //遍历当前DVD数组寻找相同对象
		  if(isExistSameDVD(dvds, dvd)){
			  System.out.println("抱歉,DVD中已经存存储了相同的碟片,不能进行增加...");
			  return false;
		  }
		  
		  //遍历数组找到空的位置来存储当前dvd对象
		  for(int i = 0;i<dvds.length;i++){
			  if(dvds[i] == null){
				  dvds[i] = dvd;
				  break;
			  }
		  }
		  return true;
		  
	}
	/**
     * 查看DVD数组
     * @param dvds DVD数组
     */
	@Override
	public void selectDVD(DVD[] dvds) {
	  //定义一个计数器,序号
		int cut = 0;
		System.out.println("序号\t\t状态\t\t名称\t\t借出日期\t\t借出次数");
		for(int i = 0;i<dvds.length;i++){
			if(dvds[i] != null){
				//下标是从0开始,序号是从1开始
				System.out.println((++cut)+"\t\t"+dvds[i]);
			}
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
	public boolean deleteDVD(DVD[] dvds, DVD dvd) {
		  //1.不存在的dvd是不能删除
		if(!isExistSameDVD(dvds, dvd)){
			System.out.println("抱歉,DVD中不存在您要删除的影片"+dvd.getName()+"不能删除DVD...");
		    return false;
		}
		System.out.println(dvd);
		//2.已经借出的DVD不能删除
		for(DVD dvdTmpe : dvds){
			 //也就是当前dvd对象不是null
		     //dvds取出来的对象也不是null
		     //dvdTmpe和dvd是用一个对象
			if(dvd!=null && dvdTmpe != null &&dvd.equals(dvdTmpe)){
				
				if(dvdTmpe.getState() == 0){
				    System.out.println("抱歉,你要删除的影片已经是借出,"+dvd.getName()+"不能删除.....");
				    return false;
				}
			}
		}
		//删除当前数组中的DVD信息
		//对象数组 --> null 
		//遍历数组 取出的对象如果和要删除的对象名一致, null就行
		//{对象1,对象2,null,对象4,null,对象6} 不行
		for(int i = 0;i<dvds.length;i++){
			if(dvd != null && dvd.equals(dvds[i])){
				//将当前对象赋值为null
				dvds[i] = null;
				//将后面的元素向前移动
				for(int j = i; j<dvds.length-1;j++){
					dvds[j] = dvds[j+1];
				}
				//{对象1,对象2,对象4,null,对象6,null}
				//为了防止dvd中最后一位也有对象存储在,在移动的时候发生相同对象
				dvds[dvds.length-1] = null;
				break;
			}
		}
		return true;
		
	}
	 /**
     * 借出DVD
     * @param dvds DVD数组
     * @param dvd  借出dvd的对象
     * @return
     * return --> 借出成功   false --> 借出失败
     */
	@Override
	public boolean lendDVD(DVD[] dvds, DVD dvd) {
		 //1.不存在的影片不能借出
		if(!isExistSameDVD(dvds, dvd)){
			System.out.println("抱歉,DVD中不存您要借出的影片"+dvd.getName()+"不能借出...");
		    return false;
		}
		//2.DVD数组中获取的对象状态是 0 ,表示已经借出
		for(DVD dvdTmpe : dvds){
			if(dvd!=null && dvdTmpe != null &&dvd.equals(dvdTmpe)){
				if(dvdTmpe.getState() == 0){
			        System.out.println("抱歉,DVD中对应的碟片已经借出"+dvd.getName()+"不能借出 ...");
			    return false;
				}
			}
		}
		  for(int i = 0; i<dvds.length;i++){
			  if(dvd != null && dvd.equals(dvds[i])){
				  //修改当前存储在DVD数组中对象的状态
				  dvds[i].setState(0);
				  //借出的日期
				  dvds[i].setDate(dvd.getDate());
				  //借出次数
				  dvds[i].setCount(dvds[i].getCount()+1);
				  break;
			  }
		  }
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
	public boolean returnDVD(DVD[] dvds, DVD dvd) {
		//1.不存在的dvd不能归还
		if(!isExistSameDVD(dvds, dvd)){
			System.out.println("抱歉,DVD系统中没有您要归还的碟片"+dvd.getName()+"不能归还....");
		   return false;
		}
		//2.可借的碟片不能归还
		for(DVD dvdTmpe : dvds){
			if(dvd!=null && dvdTmpe != null &&dvd.equals(dvdTmpe)){
				if(dvdTmpe.getState() == 1){
				System.out.println("抱歉,DVD系统中碟片是可借状态"+dvd.getName()+"不能归还....");
				return false;
				}
			}
		}
	

		for(int i = 0; i<dvds.length;i++){
			if(dvd != null && dvd.equals(dvds[i])){
				//修改状态
				dvds[i].setState(1);
				//修改日期
				dvds[i].setDate(0);
				break;
			}
		}
		return true;
	}
     /**
      *判断数组中是否已经存在了相同对象 
      * @param dvds DVD数组
      * @param dvd  dvd对象
      * @return
      * return --> 相同   false --> 没有相同
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
