package cn.suyuesheng.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


//平时用字节流
public class CopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		if(args.length!=2) {
			System.out.println("文件个数不对");
			System.exit(1);
		}
		File A = new File(args[0]);
		File B = new File(args[1]);
		if(!A.exists()) {
			System.out.println("源文件不存在");
			System.exit(1);
		}
		if(!B.getParentFile().exists()) {
			B.getParentFile().mkdirs();
		}
		OutputStream out = new FileOutputStream(B);
		InputStream input = new FileInputStream(A);
		int temp=0;
		byte[] bb = new byte[2048];
		while((temp=input.read(bb))!=-1) {
			out.write(bb,0,temp);
		}
		out.close();
		input.close();
		long end =System.currentTimeMillis();
		System.out.println("花费"+(end-start)+"毫秒");
	}

}
