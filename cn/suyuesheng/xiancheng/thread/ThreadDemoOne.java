package cn.suyuesheng.xiancheng.thread;
//���߳�
class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name=name;
	}
	public void run() {//run()���̵߳�����
		for(int i=0;i<100;i++) {
			System.out.println(this.name+"\t"+i);
		}
	}
}
public class ThreadDemoOne {

	public static void main(String[] args) {
		MyThread a1 = new MyThread("001");
		MyThread a2 = new MyThread("002");
		MyThread a3 = new MyThread("003");
		a1.start();//�������߳�
		a2.start();//�������У���ռcpu
		a3.start();
		
	}

}
