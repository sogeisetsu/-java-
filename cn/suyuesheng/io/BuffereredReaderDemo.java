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
		//讀取文件更加方便
		//標準的讀取鍵盤内容範例
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
		//循環輸入
		System.out.println("請輸入整數,一位或者三位");
		boolean flag = true;
		while(flag) {
			try {
				str = buf.readLine();
				if(str.matches("\\d{1,3}")) {
					System.out.println(str);
					flag=false;
				}else {
					System.out.println("輸入的格式不符合標準");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		//讀取文件   這是讀取字符文件的標準做法
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
