package cn.suyuesheng.xiancheng.callable;
//Callable 实现的子类里面call()方法可以有返回值

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
		return "票已经卖光";
	}
}
public class CallableDemo  {
	public static void main(String[] args) throws Exception{
		MThread mm = new MThread();
		FutureTask<String> mmm = new FutureTask<String>(mm);
		new Thread(mmm).start();//启动线程
		MThread bb = new MThread();
		FutureTask<String> bbb = new FutureTask<String>(mm);
		new Thread(bbb).start();//启动线程
		System.out.println(mmm.get());//获得线程返回的结果
		System.out.println(bbb.get());
	}
}
