package cn.suyuesheng.annotation;
//@Override 保证覆写的正确性
//@Override只能在方法上应用。在类和属性上是不能被用的。
//@Deprecated 声明不建议的或过期的类或方法
//Annotation
//@Override 保证覆写的正确性
//@SuppressWarnings 压制警告
class Book{
	@Override
	public String toString() {//这时，toString方法如果写成tostring的话，会在编译时就出错
		return "hello";
	}//@Override只能在方法上应用。在类和属性上是不能被用的。
	//@Deprecated 声明不建议的或过期的类或方法
	@Deprecated
	public void fun(String t) {
		System.out.println(t);
	}
	public void fun(int i,String t) {
		System.out.println(i+t);
	}
}
//@SuppressWarnings 压制警告
class Term<T>{
	private T age;
	public void setAge(T age) {
		this.age = age;
	}
	public T getAge() {
		return age;
	}
}
//@Deprecated可以声明类
@Deprecated
class Person{
	public void add() {
		System.out.println("过期");
	}
}
public class AnnotationDemoOne {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println(new Book());//hello
		Book b =new Book();
		b.fun("hello");//这就是不建议的
		@SuppressWarnings({ "unused", "rawtypes" })
		Term t = new Term();//这样就没有警告了
		t.setAge(12);
		System.out.println(t.getAge());
	}
}
