package cn.suyuesheng.meijv;

//ö��
//ö��ʵ�ֽӿ�
interface IColor{
	public abstract void jj();
}
enum Color implements IColor{
	RED("red"){
		public void fun() {
			System.out.println("��ɫ");//ÿһ��ö�ٶ���Ҫ��д���󷽷�
		}
		public void jj() {//ÿһ��ö�ٶ���Ҫ��дʵ�ֵĽӿڵĳ��󷽷�
			System.out.println("ö���ܲ��þͲ���");
		}
	},GREEN("green"){
		public void fun() {
			System.out.println("��ɫ");
		}
		public void jj() {
			System.out.println("ÿһ��ö�ٶ���Ҫ��дʵ�ֵĽӿڵĳ��󷽷�");
		}
	},BLUE("blue"){
		public void fun() {
			System.out.println("��ɫ");
		}
		public void jj() {
			System.out.println("ÿһ��ö�ٶ���Ҫ��дʵ�ֵĽӿڵĳ��󷽷�");
		}
	};
	//ö����Ϊ��������Ը�ֵ
	private Color(String name){//���췽������private
		System.out.println("001");//�ᱻִ������
		this.setName(name);
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//ö���еĳ��󷽷�
	public abstract void fun();
}

public class MeiJvDemoOne {
	public static void main(String[] args) {
		Color c = Color.BLUE;
		System.out.println(c);
		System.out.println(">==================");
		for (Color c1 : Color.values()) {
			System.out.println(c1);
			System.out.println(c1.ordinal());// ���ر��
			System.out.println(c1.name());// ��������
			System.out.println(c1.getName());
		}
		c.setName("hh");
		System.out.println(c.getName());
		Color.RED.fun();
		System.out.println(">++++++++++++++");
		for(Color b:Color.values()) {
			b.fun();
			b.jj();
			System.out.println(b.getName());
			System.out.println(b.name());
		}

	}
}
