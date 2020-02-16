package cn.suyuesheng.changyongleiku.date;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dd = new Date();
		System.out.println(dd);//Fri Feb 07 16:09:49 CST 2020
		System.out.println(dd.getTime());//1581063032540  返回long类型的System.currentTimeMillis()
		long theTime = System.currentTimeMillis();
		Date cc = new Date(theTime);
		//将System.currentTimeMillis转化为Date
		System.out.println(cc);//Fri Feb 07 16:12:19 CST 2020
		System.out.println(cc.getTime());
	}

}
