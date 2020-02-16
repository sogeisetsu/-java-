package cn.suyuesheng.xiancheng.fangfa;

class Mth implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + "\t" + i);//Thread.currentThread()  获得当前线程对象，有点像this
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class SleepDemo {
	public static void main(String[] args) {
		Mth mm = new Mth();
		Thread bo = new Thread(mm,"hello");
		bo.setPriority(Thread.MAX_PRIORITY);//设定优先级
		bo.start();
		new Thread(mm, "A").start();
		new Thread(mm, "B").start();
		new Thread(mm, "C").start();
		//Thread.currentThread()  获得当前线程对象，有点像this
		System.out.println(Thread.currentThread().getPriority());//获得main对像的优先级
		
	}
}
