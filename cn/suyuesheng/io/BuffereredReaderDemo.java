package cn.suyuesheng.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BuffereredReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�xȡ�ļ����ӷ���
		//�˜ʵ��xȡ�I�P���ݹ���
		BufferedReader buf =null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		try {
			str=buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		System.out.println(str);
		//ѭ�hݔ��
		System.out.println("Ոݔ������,һλ������λ");
		boolean flag = true;
		while(flag) {
			try {
				str = buf.readLine();
				if(str.matches("\\d{1,3}")) {
					System.out.println(str);
					flag=false;
				}else {
					System.out.println("ݔ��ĸ�ʽ�����Ϙ˜�");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		//�xȡ�ļ�   �@���xȡ�ַ��ļ��Ę˜�����
		File dd = new File("d:"+File.separator+"xx"+File.separator+"dd.txt");
		BufferedReader pp =null;
		try {
			 pp= new BufferedReader(new FileReader(dd));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(pp.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		str=null;
		try {
			while((str=pp.readLine())!=null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
