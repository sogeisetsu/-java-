package cn.suyuesheng.fanxing;

public class FanXingDemoTwo<T, V> {// ָ�������������
	private T age;
	private V name;

	// ��������Ĺ��췽��
	public FanXingDemoTwo() {
		this.setAge((T) new Integer(12));
		this.setName((V) "Amy");
	}

	public FanXingDemoTwo(T age, V name) {
		super();
		this.age = age;
		this.name = name;
	}

	public T getAge() {
		return age;
	}

	public void setAge(T age) {
		this.age = age;
	}

	public V getName() {
		return name;
	}

	public void setName(V name) {
		this.name = name;
	}

	public String toString() {
		return "FanXingDemoTwo [age=" + age + ", name=" + name + "]";
	}
	
}
