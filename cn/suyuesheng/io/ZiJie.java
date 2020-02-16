package cn.suyuesheng.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ZiJie {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String a = "d:"+File.separator+"xx"+File.separator+"bb.txt";
		System.out.println(a);
		File bb = new File(a);
		if(!bb.getParentFile().exists()) {
			bb.getParentFile().mkdirs();
			bb.createNewFile();
		}else {
			bb.createNewFile();
		}
		{
			OutputStream out = new FileOutputStream(bb);
			String aa= "hello world";
			byte b[] = aa.getBytes();
			out.write(b);
			out.close();
			System.out.println(bb.length());
		}
		{//另一种方法
			OutputStream oo = new FileOutputStream(bb);
			byte b[] = "jjkkjkjkjk".getBytes();
			for(byte bin:b) {
				oo.write(bin);
			}
			oo.close();
			
		}
		{//追加
			OutputStream out = new FileOutputStream(bb,true);//追加
			byte n[] = "你好".getBytes();
			out.write(n);
			//换行追加
			byte nn[]= "\r\n hello world。现代操作系统的内存管理都具有分页机制，而内存页的大1874 年 6 月穆索尔斯基写下钢琴组曲《图画展览会》，灵感来自于一次画作展览会，画展上的作品是穆索尔斯基一位已逝世的朋友、俄罗斯著名艺术家、建筑师维克托 · 阿里山大罗维奇 · 哈特曼所画。穆索尔斯基借此作品，抒发了他对友人怀念的真切情感。在和声手法、曲式结构和钢琴织体方面也有着新的探索。".getBytes();
			out.write(nn);
		}
		{//读写
			InputStream input = new FileInputStream(bb);
			byte[] c = new byte[(int)bb.length()];
			System.out.println(new String(c));
			input.read(c);
			System.out.println(new String(c));
			input.close();
			
		}
		{//知道文件大小，循环写入
			InputStream input = new FileInputStream(bb);
			System.out.println(bb.length());
			System.out.println((int)bb.length());
			byte c[] = new byte[(int)bb.length()];
			byte cc[]=null;
			for(int i=0;i<c.length;i++) {
				c[i]=(byte)input.read();
			}
			input.close();
			System.out.println(new String(c));
		}
		{
			//不知道文件大小
			InputStream input = new FileInputStream(bb);
			byte c[] = new byte[1024];
			int len =0;//角标
			int temp=0;
			while((temp=input.read())!=-1) {
				c[len]=(byte)temp;
				len++;
			}
			input.close();
			System.out.println(new String(c,0,len));
		}
		String jkPath = "d:"+File.separator+"xx"+File.separator+"jk.txt";
		File jk = new File(jkPath);
		if(!jk.exists()) {
			System.out.println("erroe");
		}
		{
			InputStream input = new FileInputStream(jk);
			System.out.println(jk.length());
			byte[] c = new byte[(int)jk.length()];
			input.read(c);
			System.out.println("["+new String(c,"utf-8")+"]");//设置编码格式
		}
		{
			
		}
	}

}
