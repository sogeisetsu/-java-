package cn.suyuesheng.xiancheng.runnable;
//thread ��runnable�����࣬ʹ��runnable�ӿڿ��Ա��ⵥ�̳о��ޣ����ܷ����ʵ�����ݹ���

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
