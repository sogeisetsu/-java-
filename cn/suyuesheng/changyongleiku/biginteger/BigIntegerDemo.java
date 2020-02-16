package cn.suyuesheng.changyongleiku.biginteger;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starttime = System.currentTimeMillis();
		System.out.println(Double.MAX_VALUE*Double.MAX_VALUE); //Infinity
		BigInteger bb = new BigInteger("123456789098987653412345678998765432100998765444567");
		BigInteger cc = new BigInteger("1234557869870345678736253467897567453234567898765");
		System.out.println("加法操作"+bb.add(cc));
		System.out.println("减法操作"+bb.subtract(cc));
		System.out.println("乘法操作"+bb.multiply(cc));
		System.out.println("除法操作"+bb.divide(cc));
		System.out.println("最大数"+bb.max(cc));
		long endtime = System.currentTimeMillis();
		System.out.println((endtime-starttime)+"毫秒");
		System.out.println((Runtime.getRuntime().maxMemory()-Runtime.getRuntime().freeMemory())+"内存消耗");

	}

}
