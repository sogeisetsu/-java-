package cn.suyuesheng.changyongleiku.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
//SimpleDateFormat用于String和Date类的转换
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");//设置格式
		Date date = new Date();
		String stime = sdf.format(date);//Date类转换为String类
		System.out.println(stime);
		String dtime = "2000-04-08 01:01:01.111";
		try {
			Date dDate = sdf.parse(dtime);//String类转换为date类
			System.out.println(dDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(">-----------------------");
		//long 到 Date
		long xlTime = System.currentTimeMillis();
		Date xdTime = new Date(xlTime);
		System.out.println(xdTime);
		//date 转换为long
		System.out.println(xdTime.getTime());
		//Date 转换为String
		SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");//需要先设置格式
		String dtoS = sdff.format(xdTime);
		System.out.println(dtoS);
		//String 转换为Date类
		Date stod = sdff.parse(dtoS);
		System.out.println(stod);
	}

}
