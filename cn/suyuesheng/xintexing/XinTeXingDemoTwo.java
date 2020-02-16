package cn.suyuesheng.xintexing;

//jdk 1.8 方法引用
/**
 * 
 * @author 苏月晟
 *
 * @param <P> 参数类型
 * @return <R> 返回值类型
 */
@FunctionalInterface // 此注解说明是函数式接口，只能定义一个方法
interface IMessage<P, R> {
	public R fun(P p);// 静态方法引用
}
/**
 * 
 * @author 苏月晟
 *
 * @return <R>
 */
@FunctionalInterface // 此注解说明是函数式接口，只能定义一个方法
interface IGod<R> {
	public R up();// 普通方法引用
}
/**
 * 特定类方法引用
 * @author 苏月晟
 *
 * @param <P>
 * @return <R>
 */
@FunctionalInterface
interface It<P,R>{
	public R eq(P p1,P p2);//特定类方法引用
}
/**
 * 构造方法引用
 * @author 苏月晟
 *
 * @return <R>
 */
@FunctionalInterface //确保函数式接口，只能定义一个方法
interface IG<R>{
	public R IG(int g2,String g1);//构造方法引用
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
		// 引用静态方法
		// 类名称 :: 静态方法名称
		// 将String.valueOf()的方法变为了IMessage接口里面的fun方法，也就是说msg里面的fun方法被覆写
		// 覆写内容是String.valueOf()的内容
		// 注意，Integer是String.valueOf()的参数类型
		// String是String.valueOf()的返回值类型
		// String.valueOf()是静态方法
		IMessage<Integer, String> msg = String::valueOf;
		System.out.println(msg.fun(12));// 12
		System.out.println(msg.fun(12) instanceof String);// true
		System.out.println(Integer.parseInt(msg.fun(10000).replaceAll("0", "9")));
		int cc = Integer.parseInt(msg.fun(10000).replaceAll("0", "9"));
		System.out.println(new Integer(cc) instanceof Integer);// true
		int df = 7;
		// 普通方法引用
		// 实例化对象 :: 普通方法名称
		IGod<String> igo = "hello"::toUpperCase;// 相当于igo的up方法是hello的toUpperCase方法
		System.out.println(igo.up());// HELLO
		System.out.println(igo.up() instanceof String);// true
		It<String,Boolean> it = String :: equalsIgnoreCase;
		System.out.println(it.eq("hello","kkk"));//引用的方法使用起来是，"hello".equalsIgnoreCase("kkk")
		//构造方法引用
		IG<G> gg = G::new;
		System.out.println(gg.IG(12, "hello").toString());//G [age=12, name=hello]
	}
}
