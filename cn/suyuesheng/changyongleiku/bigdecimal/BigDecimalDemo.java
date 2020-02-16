package cn.suyuesheng.changyongleiku.bigdecimal;

import java.math.BigDecimal;

//四舍五入
class MyMath{//重要
	public static void chu(double num,int scale) {
		BigDecimal B = new BigDecimal(num);
		BigDecimal C =new BigDecimal(1);
		System.out.println(B.divide(C,scale,BigDecimal.ROUND_HALF_UP));
	}
}
public class BigDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现四舍五入
		MyMath.chu(123.23456, 3);//123.235

	}

}
