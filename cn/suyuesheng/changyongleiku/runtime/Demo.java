package cn.suyuesheng.changyongleiku.runtime;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runtime 获取内存信息
		Runtime run = Runtime.getRuntime();
		System.out.println("总容量"+run.maxMemory());
		System.out.println("空闲容量"+run.freeMemory());
		System.out.println("程序运行，并产生垃圾");
		String nn = "jj";
		for(int i=0;i<10000;i++) {
			nn+=i;//消耗内存
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nn);
		System.out.println("程序运行完后的空闲容量"+run.freeMemory());
		run.gc();//垃圾回收
		System.out.println("垃圾回收后的空闲容量"+run.freeMemory());
		Process pro=null;
		try {
			pro=run.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("程序运行完后的空闲容量"+run.freeMemory());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("程序运行完后的空闲容量"+run.freeMemory());
		pro.destroy();//结束进程
	}

}
