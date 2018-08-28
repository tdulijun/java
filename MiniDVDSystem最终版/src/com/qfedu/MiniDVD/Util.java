package com.qfedu.MiniDVD;

import java.io.*;
import java.util.List;

//�̻�����ʹ��
public class Util {
       //1.��̬����File����
	 public static final File dvdFile;
	 static{
		 dvdFile = new File("File/dvdFile.txt");
	 }
	 /**
	  * ���洢DVD��Ϣ�ļ�������д������ļ�
	  * @param dvds �洢DVD��Ϣ�ļ���
	  */
	 public static void writerDVDInofosTOFile(List<DVD> dvds){
		   //1.�����ַ�������
		 BufferedWriter br = null;
		 try {
			br = new BufferedWriter(new FileWriter(dvdFile));
			//����ǰDVD�����е�����д�뵽����,�̻����ļ���
			//�������,0,0,25 ƴ������  --> �س�����
			StringBuffer bs = new StringBuffer();
			for(DVD dvd : dvds){
				bs.append(dvd.getName()).append(",").
				append(dvd.getState()).append(",").
				append(dvd.getDate()).append(",").
				append(dvd.getCount()).append("\n");
			}
			br.write(bs.toString());
			br.flush();
			System.out.println("��ϲ!DVD��Ϣд���ļ��ɹ�!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			/*
			 *��������Ϊ�رյ������,��������һֱ�ٵ�ǰ·�����ǵ��ļ�,������ļ��ĳ�ͻ 
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
	  * ���ļ��ж�ȡ���ݴ浽DVD������
	  * @param dvds ��ǰ�洢��Ϣ��DVD���϶���
	  */
	 public static void  readDVDInfosFromFile(List<DVD> dvds){
		  //�����ַ�������
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
				System.out.println("���ݼ��سɹ�......");
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
