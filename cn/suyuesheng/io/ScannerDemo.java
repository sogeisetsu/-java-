package cn.suyuesheng.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File bb = new File("d:" + File.separator + "xx" + File.separator + "xx.txt");
		Scanner scan = null;

		try {
			scan = new Scanner(new FileInputStream(bb), "utf-8");
			scan.useDelimiter("\n");// 设置分隔符，默认的里面有空格
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (scan.hasNext()) {

			try {
				System.out.println(new String(scan.next().getBytes(), "gbk"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// 获取键盘输入
		System.out.print("情书入");
		Scanner cc = new Scanner(System.in);
		cc.useDelimiter("\n");
		System.out.println(cc.next());
		cc = new Scanner(System.in);
		String str = null;
		Date date = null;
		if (cc.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
			str = cc.next("\\d{4}-\\d{2}-\\d{2}");
			date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
			System.out.println(date);
		} else {
			System.out.println("cuo");
			System.out.println(cc.next());
		}
		boolean cf = true;
		while(cf) {
			System.out.print("循環輸入");
			System.out.println(cc.next());
		}
	}

}
