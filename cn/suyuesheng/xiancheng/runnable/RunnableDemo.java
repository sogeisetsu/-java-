package cn.suyuesheng.xiancheng.runnable;
//thread 是runnable的子类，使用runnable接口可以避免单继承局限，还能方便的实现数据共享

class Mthread implements Runnable{
	private int ticket =5;
	public void run() {
		for(int x:new int[100]) {
			if(ticket>0) {
				System.out.println(ticket--);
			}
		}
	}
}
public class RunnableDemo {
	public static void main(String[] args) {
		Mthread mm = new Mthread();
		new Thread(mm).start();
	}
}
