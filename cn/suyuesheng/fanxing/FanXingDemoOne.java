package cn.suyuesheng.fanxing;
//泛型的目的是解决向下转型的安全隐患
class Point<T> {// T是自定义的泛型标识
	private T x;// 此变量的类型由外部确定
	private T y;

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}

public class FanXingDemoOne {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Point<Integer> x = new Point<Integer>();// T类型自动变为Integer
		x.setX(30);// 这时用到了自动封装
		x.setY(20);// 这时用到了自动封装
		System.out.println("(" + x.getX().intValue() + "," + x.getY().intValue() + ")");
		Point<String> pp = new Point<String>();
		pp.setX("东经10");
		pp.setY("北纬25");
		System.out.println(pp.toString());
//		ありがとう
		Point<Integer> cp = new Point<>();// JDK1.7之后可以这样设置
		Point cf = new Point();// 这样默认设置类型为Object
		cf.setX(14);
		cf.setX(49);
		System.out.println((Integer) cf.getX());
		System.out.println(">++++++++++++++");
		cp.setX(12);
		cp.setY(16);
		System.out.println(cp.toString());
	}

}
