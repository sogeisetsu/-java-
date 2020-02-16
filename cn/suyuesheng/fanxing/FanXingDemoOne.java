package cn.suyuesheng.fanxing;
//���͵�Ŀ���ǽ������ת�͵İ�ȫ����
class Point<T> {// T���Զ���ķ��ͱ�ʶ
	private T x;// �˱������������ⲿȷ��
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
		Point<Integer> x = new Point<Integer>();// T�����Զ���ΪInteger
		x.setX(30);// ��ʱ�õ����Զ���װ
		x.setY(20);// ��ʱ�õ����Զ���װ
		System.out.println("(" + x.getX().intValue() + "," + x.getY().intValue() + ")");
		Point<String> pp = new Point<String>();
		pp.setX("����10");
		pp.setY("��γ25");
		System.out.println(pp.toString());
//		���꤬�Ȥ�
		Point<Integer> cp = new Point<>();// JDK1.7֮�������������
		Point cf = new Point();// ����Ĭ����������ΪObject
		cf.setX(14);
		cf.setX(49);
		System.out.println((Integer) cf.getX());
		System.out.println(">++++++++++++++");
		cp.setX(12);
		cp.setY(16);
		System.out.println(cp.toString());
	}

}
