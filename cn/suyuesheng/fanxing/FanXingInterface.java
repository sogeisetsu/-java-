package cn.suyuesheng.fanxing;
//泛型接口

interface Imessage<T>{
	void print(T t);
}
class Message<T> implements Imessage<T>{//这种定义方法把泛型类型也给继承了了
	public void print(T t) {
		System.out.println(t);
	}
}
class Lmessage implements Imessage<Integer>{//这种方式在继承的同时注明了接口泛型的类型
	public void print(Integer t) {//这里参数类型必须是Integer
		System.out.println(t);
	}
}
public class FanXingInterface {
	public static void main(String[] args) {
		Imessage<String> cc = new Message<String>();
		cc.print("hello");
		Imessage<Integer> bb = new Lmessage();
		bb.print(12);
	}
}
