package cn.suyuesheng.fanxing;

public class FanXingDemoTwoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FanXingDemoTwo<Integer, String> cc = new FanXingDemoTwo<Integer, String>();
		cc.setAge(12);
		cc.setName("hah");
		System.out.println(cc.toString());
		System.out.println(">=================");
		FanXingDemoTwo<Integer, String> bb = new FanXingDemoTwo<Integer, String>(20, "JJK");
		System.out.println(bb.toString());
		System.out.println(new FanXingDemoTwo<Integer, String>(40, "lili"));
		System.out.println(cc);
		System.out.println(">================");
		fun(cc);
		fun(new FanXingDemoTwo<Number, String>(120, "kkl"));
	}

	// 泛型的上限和下限
	/* 泛型的上限和下限
	 * extends 定义上限
	 * super 定义下限
	 * ？表示全部类型（任意类型）
	 * */
	public static void fun(FanXingDemoTwo<? extends Number, ? super String> temp) {
		
		System.out.println(temp.getName());
		System.out.println(temp);
		
	}
	public static void hun(FanXingDemoTwo temp) {
		temp.setAge("qqq");//这是错误的
		//错误的原因是：实例化对象设定的age的数据类型是Int。hun方法里却改数据类型为String。
		
	}

}
