package cn.suyuesheng.changyongleiku.bigdecimal;

import java.math.BigDecimal;

//��������
class MyMath{//��Ҫ
	public static void chu(double num,int scale) {
		BigDecimal B = new BigDecimal(num);
		BigDecimal C =new BigDecimal(1);
		System.out.println(B.divide(C,scale,BigDecimal.ROUND_HALF_UP));
	}
}
public class BigDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʵ����������
		MyMath.chu(123.23456, 3);//123.235

	}

}
