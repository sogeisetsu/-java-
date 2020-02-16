package cn.suyuesheng.changyongleiku.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
//SimpleDateFormat����String��Date���ת��
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");//���ø�ʽ
		Date date = new Date();
		String stime = sdf.format(date);//Date��ת��ΪString��
		System.out.println(stime);
		String dtime = "2000-04-08 01:01:01.111";
		try {
			Date dDate = sdf.parse(dtime);//String��ת��Ϊdate��
			System.out.println(dDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(">-----------------------");
		//long �� Date
		long xlTime = System.currentTimeMillis();
		Date xdTime = new Date(xlTime);
		System.out.println(xdTime);
		//date ת��Ϊlong
		System.out.println(xdTime.getTime());
		//Date ת��ΪString
		SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");//��Ҫ�����ø�ʽ
		String dtoS = sdff.format(xdTime);
		System.out.println(dtoS);
		//String ת��ΪDate��
		Date stod = sdff.parse(dtoS);
		System.out.println(stod);
	}

}
