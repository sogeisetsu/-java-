package cn.suyuesheng.xiancheng;
//多线程
//生产者和消费者
class Info{
	private String name = "JU";
	private String place="JiNan";
	boolean flag = false;
	public synchronized void set(String name,String place) {//防止数据错乱
		if(!flag) {
			try {
				super.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name=name;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.place=place;
		flag=false;
		super.notify();
	}
	public synchronized void get() {
		if(flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.name+"\t"+"----"+this.place);
		flag=true;
		super.notify();
	}
}
class Productor implements Runnable{
	private Info info;
	public Productor(Info info) {
		this.info=info;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				this.info.set("QUST", "QingDao");
			}else {
				this.info.set("JU", "JiNan");
			}
		}
	}
}
class Consumer implements Runnable{
	private Info info;
	public Consumer(Info info) {
		this.info=info;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			this.info.get();
		}
	}
}
public class BigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Info ii = new Info();
			new Thread(new Productor(ii)).start();
			new Thread(new Consumer(ii)).start();

	}

}
