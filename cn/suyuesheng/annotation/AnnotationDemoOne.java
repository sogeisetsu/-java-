package cn.suyuesheng.annotation;
//@Override ��֤��д����ȷ��
//@Overrideֻ���ڷ�����Ӧ�á�������������ǲ��ܱ��õġ�
//@Deprecated ����������Ļ���ڵ���򷽷�
//Annotation
//@Override ��֤��д����ȷ��
//@SuppressWarnings ѹ�ƾ���
class Book{
	@Override
	public String toString() {//��ʱ��toString�������д��tostring�Ļ������ڱ���ʱ�ͳ���
		return "hello";
	}//@Overrideֻ���ڷ�����Ӧ�á�������������ǲ��ܱ��õġ�
	//@Deprecated ����������Ļ���ڵ���򷽷�
	@Deprecated
	public void fun(String t) {
		System.out.println(t);
	}
	public void fun(int i,String t) {
		System.out.println(i+t);
	}
}
//@SuppressWarnings ѹ�ƾ���
class Term<T>{
	private T age;
	public void setAge(T age) {
		this.age = age;
	}
	public T getAge() {
		return age;
	}
}
//@Deprecated����������
@Deprecated
class Person{
	public void add() {
		System.out.println("����");
	}
}
public class AnnotationDemoOne {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println(new Book());//hello
		Book b =new Book();
		b.fun("hello");//����ǲ������
		@SuppressWarnings({ "unused", "rawtypes" })
		Term t = new Term();//������û�о�����
		t.setAge(12);
		System.out.println(t.getAge());
	}
}
