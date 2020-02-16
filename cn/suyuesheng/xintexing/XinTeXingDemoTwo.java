package cn.suyuesheng.xintexing;

//jdk 1.8 ��������
/**
 * 
 * @author ������
 *
 * @param <P> ��������
 * @return <R> ����ֵ����
 */
@FunctionalInterface // ��ע��˵���Ǻ���ʽ�ӿڣ�ֻ�ܶ���һ������
interface IMessage<P, R> {
	public R fun(P p);// ��̬��������
}
/**
 * 
 * @author ������
 *
 * @return <R>
 */
@FunctionalInterface // ��ע��˵���Ǻ���ʽ�ӿڣ�ֻ�ܶ���һ������
interface IGod<R> {
	public R up();// ��ͨ��������
}
/**
 * �ض��෽������
 * @author ������
 *
 * @param <P>
 * @return <R>
 */
@FunctionalInterface
interface It<P,R>{
	public R eq(P p1,P p2);//�ض��෽������
}
/**
 * ���췽������
 * @author ������
 *
 * @return <R>
 */
@FunctionalInterface //ȷ������ʽ�ӿڣ�ֻ�ܶ���һ������
interface IG<R>{
	public R IG(int g2,String g1);//���췽������
}
class G{
	private int age;
	private String name;
	
	public G(int age, String name) {
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
	@Override
	public String toString() {
		return "G [age=" + age + ", name=" + name + "]";
	}
	
	
}
public class XinTeXingDemoTwo {
	public static void main(String[] args) {
		// ���þ�̬����
		// ������ :: ��̬��������
		// ��String.valueOf()�ķ�����Ϊ��IMessage�ӿ������fun������Ҳ����˵msg�����fun��������д
		// ��д������String.valueOf()������
		// ע�⣬Integer��String.valueOf()�Ĳ�������
		// String��String.valueOf()�ķ���ֵ����
		// String.valueOf()�Ǿ�̬����
		IMessage<Integer, String> msg = String::valueOf;
		System.out.println(msg.fun(12));// 12
		System.out.println(msg.fun(12) instanceof String);// true
		System.out.println(Integer.parseInt(msg.fun(10000).replaceAll("0", "9")));
		int cc = Integer.parseInt(msg.fun(10000).replaceAll("0", "9"));
		System.out.println(new Integer(cc) instanceof Integer);// true
		int df = 7;
		// ��ͨ��������
		// ʵ�������� :: ��ͨ��������
		IGod<String> igo = "hello"::toUpperCase;// �൱��igo��up������hello��toUpperCase����
		System.out.println(igo.up());// HELLO
		System.out.println(igo.up() instanceof String);// true
		It<String,Boolean> it = String :: equalsIgnoreCase;
		System.out.println(it.eq("hello","kkk"));//���õķ���ʹ�������ǣ�"hello".equalsIgnoreCase("kkk")
		//���췽������
		IG<G> gg = G::new;
		System.out.println(gg.IG(12, "hello").toString());//G [age=12, name=hello]
	}
}
