package cn.suyuesheng.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "d:" + File.separator + "xx" + File.separator + "dd.txt";
		File dd = new File(path);
		if (dd.getParentFile().exists()) {// 创建文件
			try {
				dd.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			dd.getParentFile().mkdirs();
			try {
				dd.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			;
		}
		OutputStream outPut = null;
		try {
			outPut = new FileOutputStream(dd, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		;
		try {
			outPut.write(("\r\n"+path).getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 使用打印流
		PrintStream printD = null;
		printD = new PrintStream(outPut);// 如果构造方法里面写的是文件名称，那就不会是追加写，会是覆盖写
		printD.print(12.2343);
		// 格式化输出 了解
		printD.printf("\r\n年龄:%d;姓名：%s。", 14, "小張");
		printD.close();
		// Stirng類的格式化輸出
		System.out.println(String.format("hello %s", "校長"));
	}

}
