package cn.suyuesheng.xiancheng.fangfa;
class Mythread implements Runnable{
	private int ticket=100;
	public void run() {//�̷߳���
		for(int i=0;i<100;i++) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+"\t"+ticket--);
				
			}
		}
	}
}
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread mm = new Mythread();
		new Thread(mm).start();
		new Thread(mm,"�Զ�������A").start();
		new Thread(mm,"�Զ�������B").start();
		new Thread(mm).start();
		new Thread(mm).start();
		mm.run();
	}

}
