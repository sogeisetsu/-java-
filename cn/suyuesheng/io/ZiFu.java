package cn.suyuesheng.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ZiFu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String mmpath="d:"+File.separator+"xx"+File.separator+"mm.txt";
		File mm = new File(mmpath);
		if(mm.getParentFile().exists()) {
			mm.createNewFile();
		}else {
			mm.getParentFile().mkdirs();
		}
		Writer wmm = new FileWriter(mm,true);
		{
			String a="���";
			wmm.write(a);//���ַ�����ʽ����
		}
		{
			char a[] = "\r\nhello world".toCharArray();//�ַ�������ʽ
			wmm.write(a);
		}
		{
			wmm.write(1);
		}
		{
			byte[] c = "gggdsfs".getBytes();
			for(int i=0;i<c.length;i++) {
				wmm.write(c[i]);//�������ʹ���
			}
		}
		{
			//reader
			Reader rmm = new FileReader(mm);
			char[] x= new char[1024];
			int cc = rmm.read(x);
			System.out.println(new String(x,0,cc));//�������������
		}
		System.out.println(">_______________");
		{//reader ѭ����ʽ
			Reader rmm = new FileReader(mm);
			int len =0;
			int temp;
			char cc[] = new char[1024];
			while((temp=rmm.read())!=-1) {
				cc[len++]=(char)temp;
			}
			System.out.println(new String(cc,0,len));
		}
		wmm.close();
	}

}
