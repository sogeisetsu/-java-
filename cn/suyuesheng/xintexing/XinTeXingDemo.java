package cn.suyuesheng.xintexing;
//jdk 1.8 新特性
//接口可以定义普通方法，通过default和static
interface IUsb{
	void message();
	default void fun() {
		System.out.println("default定义接口普通方法");
	}
	static void print() {
		System.out.println("static 定义静态方法");
	}
}
class Flash implements IUsb{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("覆写");
		
	}
	
}
//jdk 1.8新特性之Lambda,意义是简化匿名内部类的代码
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
		 * default定义接口普通方法
		   static 定义静态方法
		      覆写*/
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
