package cn.suyuesheng.changyongleiku.system;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//系统运行时间
		long starttime = System.currentTimeMillis();
		int i =1;
		for(int x=0;x<1000000;x++) {
			i+=x;
		}
		System.out.println(i);
		String cc="11";
		for(int x=0;x<10000;x++) {
			cc+=x;
		}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(cc);
		long endtime = System.currentTimeMillis();
		System.out.println("运行时间"+(endtime-starttime)+"毫秒");
		System.getProperties().list(System.out);
		//System.gc()   对象垃圾收集
		
	}

}
