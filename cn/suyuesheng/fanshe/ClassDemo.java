package cn.suyuesheng.fanshe;

import java.util.Date;
class A{
	public A() {
		System.out.println("ddd");
	}
}
class X extends A{
	public X() {
		System.out.println("hhhh");
	}
	public X(int i) {
		System.out.println(i);
	}
}
public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X cc = new X();
		System.out.println(cc.getClass());//cn.suyuesheng.fanshe.X
		//Class类实例化的方法
		Date date = new Date();
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		c1=date.getClass();//返回Class对象
		c2=Date.class;
		try {
			c3=Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c1.getName());
		System.out.println(c3.getName());
		Object oo = null;
		try {
			oo = c3.newInstance();//实例化Date对象，接收的是Object
		
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dd = (Date)oo;//dd是一个实例化的Date对象
		System.out.println(dd.getTime());
	}

}
