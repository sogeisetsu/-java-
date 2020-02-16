package cn.suyuesheng.xiancheng.fangfa;

//ͬ��
//ͬ������������ʹ���ߣ�ֻҪsynchronized�����û�������꣬�Ͳ������������߳�����synchronized�е�����
class Sale implements Runnable{
	private int foodBox = 100;
	public void run() {
		for(int i=0;i<35;i++) {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			synchronized (this) {//ͬ������������ʹ���ߣ�ֻҪsynchronized�����û�������꣬�Ͳ������������߳�����synchronized�е�����
				if(foodBox>0) {
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"\t"+foodBox--);
				}
			}
		}
	}
}
//synchronized ����
class SaleOther implements Runnable{
	private int cup =20;
	public void run(){
		for(int i=0;i<20;i++) {
			try {
				Thread.sleep(10);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			this.buy();
		}
	}
	public synchronized void buy() {
		if(cup>0) {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("��ϲ"+Thread.currentThread().getName()+"�� "+"�������\t"+cup--+" ��");
		}
	}
}
public class TongBu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sale m = new Sale();
//		new Thread(m,"A").start();
//		new Thread(m,"B").start();
//		new Thread(m,"C").start();
		SaleOther bb = new SaleOther();
		Thread co = new Thread(bb,"D1");
		co.setPriority(Thread.MAX_PRIORITY);
		co.start();
		new Thread(bb,"A1").start();
		new Thread(bb,"B1").start();
		new Thread(bb,"C1").start();
		System.out.println(">____________");
		System.out.println(Thread.currentThread().getPriority());
		
	}

}
