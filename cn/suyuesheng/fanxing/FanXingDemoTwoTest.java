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

	// ���͵����޺�����
	/* ���͵����޺�����
	 * extends ��������
	 * super ��������
	 * ����ʾȫ�����ͣ��������ͣ�
	 * */
	public static void fun(FanXingDemoTwo<? extends Number, ? super String> temp) {
		
		System.out.println(temp.getName());
		System.out.println(temp);
		
	}
	public static void hun(FanXingDemoTwo temp) {
		temp.setAge("qqq");//���Ǵ����
		//�����ԭ���ǣ�ʵ���������趨��age������������Int��hun������ȴ����������ΪString��
		
	}

}
