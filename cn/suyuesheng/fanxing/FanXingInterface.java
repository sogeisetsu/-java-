package cn.suyuesheng.fanxing;
//���ͽӿ�

interface Imessage<T>{
	void print(T t);
}
class Message<T> implements Imessage<T>{//���ֶ��巽���ѷ�������Ҳ���̳�����
	public void print(T t) {
		System.out.println(t);
	}
}
class Lmessage implements Imessage<Integer>{//���ַ�ʽ�ڼ̳е�ͬʱע���˽ӿڷ��͵�����
	public void print(Integer t) {//����������ͱ�����Integer
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
