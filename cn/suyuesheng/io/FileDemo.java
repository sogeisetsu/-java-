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
		//创建文件
		String path = "f:"+File.separator+"a.txt";
		//为了可移植性，务必用File.separator
		File  a = new File(path);//给出文件路径
		a.createNewFile(); //创建文件
		
		Process p=Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(400);
		p.destroy();
		//删除一个文件
		//a.delete();//这样做有问题，应该先询问是否存在
		if(a.exists()) {
			a.delete();
		}
		//练习，如果存在‘e:\\hello.doc’就删除他，否则就创建‘f:\\c.txt’
		{
			String patha = "e:"+File.separator+"hello.doc";
			String pathb = "f:"+File.separator+"c.txt";
			if(new File(patha).exists()) {
				new File(patha).delete();
			}else {
				new File(pathb).createNewFile();
			}
		}//f盘下创建了c.txt
		{//创建文件夹
			String patha = "e:"+File.separator+"suyueshengjava"+File.separator+"kk";
			File ff = new File(patha);//得到文件路径
			if(ff.getParentFile().exists()) {//如果父路径存在
				ff.mkdir();//创建文件夹
				//创建多级文件夹用mkdirs
			}
			ff.delete();
			
		}
		{//list 列出文件夹中的文件名称 返回一个String[]
			String patha = "e:"+File.separator+"suyueshengjava"+File.separator+"a.txt";
			System.out.println(patha);
			new File(patha).createNewFile();
			//展示目录
			String pathb = "d:"+File.separator;
			System.out.println(Arrays.toString(new File(pathb).list()));
		}
		{//listFiles 列出每一个文件的完整路径 返回一个File[]
			String pathb = "d:"+File.separator;
			File[] ll = (new File(pathb)).listFiles();
			for(File x:ll) {
				System.out.println(x);
			}
		}
		{
			//判断是否是目录
			String pathb = "d:"+File.separator;
			System.out.println(new File(pathb).isDirectory());
		}
		{
			//文件大小
			String patha = "e:"+File.separator+"qq.xml";
			File ff = new File(patha);
			if(ff.isFile()) {
				System.out.println(ff.length());
			}
		}
		{//文件最后的修改日期  lastModified
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
	//File小递归
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
