package cn.suyuesheng.changyongleiku.runtime;

import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runtime ��ȡ�ڴ���Ϣ
		Runtime run = Runtime.getRuntime();
		System.out.println("������"+run.maxMemory());
		System.out.println("��������"+run.freeMemory());
		System.out.println("�������У�����������");
		String nn = "jj";
		for(int i=0;i<10000;i++) {
			nn+=i;//�����ڴ�
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nn);
		System.out.println("�����������Ŀ�������"+run.freeMemory());
		run.gc();//��������
		System.out.println("�������պ�Ŀ�������"+run.freeMemory());
		Process pro=null;
		try {
			pro=run.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����������Ŀ�������"+run.freeMemory());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����������Ŀ�������"+run.freeMemory());
		pro.destroy();//��������
	}

}
