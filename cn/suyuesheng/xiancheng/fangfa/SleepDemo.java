package cn.suyuesheng.xiancheng.fangfa;

class Mth implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + "\t" + i);//Thread.currentThread()  ��õ�ǰ�̶߳����е���this
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
		bo.setPriority(Thread.MAX_PRIORITY);//�趨���ȼ�
		bo.start();
		new Thread(mm, "A").start();
		new Thread(mm, "B").start();
		new Thread(mm, "C").start();
		//Thread.currentThread()  ��õ�ǰ�̶߳����е���this
		System.out.println(Thread.currentThread().getPriority());//���main��������ȼ�
		
	}
}
