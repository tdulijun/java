package com.qfedu.MiniDVD;

import java.io.*;
import java.util.List;

//固化数据使用
public class Util {
       //1.静态常量File对象
	 public static final File dvdFile;
	 static{
		 dvdFile = new File("File/dvdFile.txt");
	 }
	 /**
	  * 将存储DVD信息的集合数据写入磁盘文件
	  * @param dvds 存储DVD信息的集合
	  */
	 public static void writerDVDInofosTOFile(List<DVD> dvds){
		   //1.缓冲字符流对象
		 BufferedWriter br = null;
		 try {
			br = new BufferedWriter(new FileWriter(dvdFile));
			//将当前DVD对象中的数据写入到流中,固化到文件中
			//风声鹤唳,0,0,25 拼接数据  --> 回车隔开
			StringBuffer bs = new StringBuffer();
			for(DVD dvd : dvds){
				bs.append(dvd.getName()).append(",").
				append(dvd.getState()).append(",").
				append(dvd.getDate()).append(",").
				append(dvd.getCount()).append("\n");
			}
			br.write(bs.toString());
			br.flush();
			System.out.println("恭喜!DVD信息写入文件成功!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			/*
			 *输入流在为关闭的情况下,输入流会一直操当前路径下是的文件,会造成文件的冲突 
			 */
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 
	 }
	 /**
	  * 从文件中读取数据存到DVD集合中
	  * @param dvds 当前存储信息的DVD集合对象
	  */
	 public static void  readDVDInfosFromFile(List<DVD> dvds){
		  //缓冲字符输入流
		    BufferedReader br = null;
		    try {
				br = new BufferedReader(new FileReader(dvdFile));
				String content = null;
				while((content = br.readLine()) != null){
					String[] dvdInofs = content.split(",");
					dvds.add(new DVD(dvdInofs[0],
							Integer.parseInt(dvdInofs[1]),
							Integer.parseInt(dvdInofs[2]),
							Integer.parseInt(dvdInofs[3])));
				}
				System.out.println("数据加载成功......");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(br != null){
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		    		
	 }
	
	
	
}
