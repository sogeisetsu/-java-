package cn.suyuesheng.io;

import java.io.IOException;
import java.io.InputStream;

public class SystemIODemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input =null;
		input = System.in;//獲取鍵盤輸入的内容
		byte c[]=new byte[1024];
		int temp=0;
		int len=0;
//		try {
//			while((temp=input.read())!=-1) {  //
//				if((char)temp=='\n') {//结束输入是换行
//					break;
//				}
//				c[len++]=(byte)temp;
//				System.out.println(temp);
//				System.out.println(new String(c,0,len));
//			}
//			System.out.println(c);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		try {
			len=input.read(c);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(len);
		System.out.println(c);
		System.out.println(new String(c,0,len));
		try {
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
