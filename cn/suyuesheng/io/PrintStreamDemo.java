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
		if (dd.getParentFile().exists()) {// �����ļ�
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
		// ʹ�ô�ӡ��
		PrintStream printD = null;
		printD = new PrintStream(outPut);// ������췽������д�����ļ����ƣ��ǾͲ�����׷��д�����Ǹ���д
		printD.print(12.2343);
		// ��ʽ����� �˽�
		printD.printf("\r\n����:%d;������%s��", 14, "С��");
		printD.close();
		// Stirngĸ�ʽ��ݔ��
		System.out.println(String.format("hello %s", "У�L"));
	}

}
