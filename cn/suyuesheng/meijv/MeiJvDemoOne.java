package cn.suyuesheng.meijv;

//枚举
//枚举实现接口
interface IColor{
	public abstract void jj();
}
enum Color implements IColor{
	RED("red"){
		public void fun() {
			System.out.println("红色");//每一个枚举对象都要覆写抽象方法
		}
		public void jj() {//每一个枚举对象都要覆写实现的接口的抽象方法
			System.out.println("枚举能不用就不用");
		}
	},GREEN("green"){
		public void fun() {
			System.out.println("绿色");
		}
		public void jj() {
			System.out.println("每一个枚举对象都要覆写实现的接口的抽象方法");
		}
	},BLUE("blue"){
		public void fun() {
			System.out.println("蓝色");
		}
		public void jj() {
			System.out.println("每一个枚举对象都要覆写实现的接口的抽象方法");
		}
	};
	//枚举中为对象的属性赋值
	private Color(String name){//构造方法必须private
		System.out.println("001");//会被执行三遍
		this.setName(name);
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//枚举中的抽象方法
	public abstract void fun();
}

public class MeiJvDemoOne {
	public static void main(String[] args) {
		Color c = Color.BLUE;
		System.out.println(c);
		System.out.println(">==================");
		for (Color c1 : Color.values()) {
			System.out.println(c1);
			System.out.println(c1.ordinal());// 返回编号
			System.out.println(c1.name());// 返回数据
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
