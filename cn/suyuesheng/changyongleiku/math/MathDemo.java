package cn.suyuesheng.changyongleiku.math;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starttime = System.currentTimeMillis();
		System.out.println(Math.E);
		//Math����
		//ƽ����
		System.out.println(Math.sqrt(8));
		//���ֵ
		System.out.println(Math.max(12, 12.5));
		//��Сֵ
		System.out.println(Math.min(12, -78));
		//ƽ��
		System.out.println(Math.pow(2, 109.8));
		//��������
		System.out.println(Math.round(13.567));
		long endtime = System.currentTimeMillis();
		System.out.println((endtime-starttime)+"����");
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
