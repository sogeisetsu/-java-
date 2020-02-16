package cn.suyuesheng.changyongleiku.math;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starttime = System.currentTimeMillis();
		System.out.println(Math.E);
		//Math基本
		//平方根
		System.out.println(Math.sqrt(8));
		//最大值
		System.out.println(Math.max(12, 12.5));
		//最小值
		System.out.println(Math.min(12, -78));
		//平方
		System.out.println(Math.pow(2, 109.8));
		//四舍五入
		System.out.println(Math.round(13.567));
		long endtime = System.currentTimeMillis();
		System.out.println((endtime-starttime)+"毫秒");
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
