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
		{//��һ�ַ���
			OutputStream oo = new FileOutputStream(bb);
			byte b[] = "jjkkjkjkjk".getBytes();
			for(byte bin:b) {
				oo.write(bin);
			}
			oo.close();
			
		}
		{//׷��
			OutputStream out = new FileOutputStream(bb,true);//׷��
			byte n[] = "���".getBytes();
			out.write(n);
			//����׷��
			byte nn[]= "\r\n hello world���ִ�����ϵͳ���ڴ�������з�ҳ���ƣ����ڴ�ҳ�Ĵ�1874 �� 6 ��������˹��д�¸���������ͼ��չ���ᡷ�����������һ�λ���չ���ᣬ��չ�ϵ���Ʒ��������˹��һλ�����������ѡ�����˹���������ҡ�����ʦά���� �� ����ɽ����ά�� �� ������������������˹�������Ʒ���㷢���������˻����������С��ں����ַ�����ʽ�ṹ�͸���֯�巽��Ҳ�����µ�̽����".getBytes();
			out.write(nn);
		}
		{//��д
			InputStream input = new FileInputStream(bb);
			byte[] c = new byte[(int)bb.length()];
			System.out.println(new String(c));
			input.read(c);
			System.out.println(new String(c));
			input.close();
			
		}
		{//֪���ļ���С��ѭ��д��
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
			//��֪���ļ���С
			InputStream input = new FileInputStream(bb);
			byte c[] = new byte[1024];
			int len =0;//�Ǳ�
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
			System.out.println("["+new String(c,"utf-8")+"]");//���ñ����ʽ
		}
		{
			
		}
	}

}
