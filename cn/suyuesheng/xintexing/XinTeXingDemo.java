package cn.suyuesheng.xintexing;
//jdk 1.8 ������
//�ӿڿ��Զ�����ͨ������ͨ��default��static
interface IUsb{
	void message();
	default void fun() {
		System.out.println("default����ӿ���ͨ����");
	}
	static void print() {
		System.out.println("static ���徲̬����");
	}
}
class Flash implements IUsb{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("��д");
		
	}
	
}
//jdk 1.8������֮Lambda,�����Ǽ������ڲ���Ĵ���
interface Ik{
	void ko();
//	void add(int i,int j);
}
interface Ib{
	void add(int i,int j);
}
public class XinTeXingDemo {
	public static void main(String[] args) {
		IUsb a = new Flash();
		a.fun();
		IUsb.print();
		a.message();
		/*
		 * default����ӿ���ͨ����
		   static ���徲̬����
		      ��д*/
		funn(()->System.out.println("hello world"));
		ll((cv,b)->System.out.println(cv+b));
	}
	public static void funn(Ik ik) {
		ik.ko();
	}
	public static void ll(Ib ib) {
		ib.add(10, 20);
	}

}
