package cn.suyuesheng.new01;
/**
 * 
 * @author 苏月晟
 *
 */
class AA{
	private int age;
	private String name;	
	public AA() {
		super();
	}
	
	public AA(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "AA [age=" + age + ", name=" + name + "]";
	}
	
}
/**
 * 
 * @author 苏月晟
 *
 */
class CC extends AA{
	private int time;
	
	public CC() {
		super();
	}
	public CC(int age,String name,int time) {
		super(age,name);
		this.setTime(time);
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "CC [time=" + time + ", getAge()=" + getAge() + ", getName()=" + getName() + "]";
	}
	
	
}
public class BB {
	public static void main(String[] args) {
		AA a = new CC();
		CC c = (CC)a;//向下转型
		System.out.println(c.getAge());
		Object dd =new Integer(12);
		System.out.println(((Integer)dd).doubleValue());
		
	}
}
