package cn.suyuesheng.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteNeiCunCaoZuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//内存操作流
		//使用了javaIO 却没有产生文件操作，操作都在内存上完成
		String str = "hello,World/////";
		InputStream  input = null;
		OutputStream output = null;
		input = new ByteArrayInputStream(str.getBytes());
		output = new ByteArrayOutputStream();
		int temp=0;
		try {
			while((temp=input.read())!=-1) {
				try {
					output.write((char)temp);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			output.close();
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(output);
		System.out.println(">--------------------");
		//内存流的另一个使用
		//把两个文件下写入一个内存
		File A = new File("d:"+File.separator+"xx"+File.separator+"mm.txt");
		File B = new File("d:"+File.separator+"xx"+File.separator+"jk.txt");
		InputStream inputA=null;
		InputStream inputB =null;
		try {
			inputA= new FileInputStream(A);
			inputB = new FileInputStream(B);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int tem=0;
		OutputStream outputf = new ByteArrayOutputStream();
		try {
			while((tem=inputA.read())!=-1) {
				outputf.write(tem);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte c[] = new byte[(int) B.length()];
		try {
			inputB.read(c);
			c= new String(c,"utf-8").getBytes();
			outputf.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(outputf);
	}

}
