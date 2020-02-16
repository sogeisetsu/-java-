package cn.suyuesheng.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		long startTime = System.currentTimeMillis();
		// TODO Auto-generated method stub
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//�����ļ�
		String path = "f:"+File.separator+"a.txt";
		//Ϊ�˿���ֲ�ԣ������File.separator
		File  a = new File(path);//�����ļ�·��
		a.createNewFile(); //�����ļ�
		
		Process p=Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(400);
		p.destroy();
		//ɾ��һ���ļ�
		//a.delete();//�����������⣬Ӧ����ѯ���Ƿ����
		if(a.exists()) {
			a.delete();
		}
		//��ϰ��������ڡ�e:\\hello.doc����ɾ����������ʹ�����f:\\c.txt��
		{
			String patha = "e:"+File.separator+"hello.doc";
			String pathb = "f:"+File.separator+"c.txt";
			if(new File(patha).exists()) {
				new File(patha).delete();
			}else {
				new File(pathb).createNewFile();
			}
		}//f���´�����c.txt
		{//�����ļ���
			String patha = "e:"+File.separator+"suyueshengjava"+File.separator+"kk";
			File ff = new File(patha);//�õ��ļ�·��
			if(ff.getParentFile().exists()) {//�����·������
				ff.mkdir();//�����ļ���
				//�����༶�ļ�����mkdirs
			}
			ff.delete();
			
		}
		{//list �г��ļ����е��ļ����� ����һ��String[]
			String patha = "e:"+File.separator+"suyueshengjava"+File.separator+"a.txt";
			System.out.println(patha);
			new File(patha).createNewFile();
			//չʾĿ¼
			String pathb = "d:"+File.separator;
			System.out.println(Arrays.toString(new File(pathb).list()));
		}
		{//listFiles �г�ÿһ���ļ�������·�� ����һ��File[]
			String pathb = "d:"+File.separator;
			File[] ll = (new File(pathb)).listFiles();
			for(File x:ll) {
				System.out.println(x);
			}
		}
		{
			//�ж��Ƿ���Ŀ¼
			String pathb = "d:"+File.separator;
			System.out.println(new File(pathb).isDirectory());
		}
		{
			//�ļ���С
			String patha = "e:"+File.separator+"qq.xml";
			File ff = new File(patha);
			if(ff.isFile()) {
				System.out.println(ff.length());
			}
		}
		{//�ļ������޸�����  lastModified
			String patha = "e:"+File.separator+"qq.xml";
			File ff = new File(patha);
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").format(new Date(ff.lastModified())));
			
		}
		System.out.println(System.currentTimeMillis()-startTime);
		String thePath = "d:"+File.separator;
		File thePathFile = new File(thePath);
		print(thePathFile);
		System.out.println(System.currentTimeMillis()-startTime);
	}
	//FileС�ݹ�
	public static void print(File file) {
		if(file.isDirectory()) {
			File[] tf = file.listFiles();
			if(tf!=null) {
				for(File x : tf) {
					print(x);
				}
			}
		}
		System.out.println(file.getPath());
	}
}
