package cn.suyuesheng.xiancheng.callable;
//Callable ʵ�ֵ���������call()���������з���ֵ

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MThread implements Callable<String>{
	public int ticket=10;
	public String call() throws Exception{
		for(int x:new int[100]) {
			if(ticket>0) {
				System.out.println(ticket--);
			}
		}
		return "Ʊ�Ѿ�����";
	}
}
public class CallableDemo  {
	public static void main(String[] args) throws Exception{
		MThread mm = new MThread();
		FutureTask<String> mmm = new FutureTask<String>(mm);
		new Thread(mmm).start();//�����߳�
		MThread bb = new MThread();
		FutureTask<String> bbb = new FutureTask<String>(mm);
		new Thread(bbb).start();//�����߳�
		System.out.println(mmm.get());//����̷߳��صĽ��
		System.out.println(bbb.get());
	}
}
