package cn.suyuesheng.xintexing;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//�ڽ�����ʽ�ӿڣ���Ϊ�ڽ�����ʽ�ӿڵĴ��ڣ����Ǻ���ֱ�Ӷ��庯��ʽ�ӿ�
/*����ʽ�ӿڵ�����
 * ��̬  ��::��������
 * ��ͨ����  ʵ��������::��������
 * �ض��෽�� ��::��������
 * ���췽�� ��::new
 * */
/*�ڽ�ʽ�����ӿڵ����ࣺ 
 * Function apply �з���ֵ�Ͳ���
 * Consumer accept �в�����û�з���ֵ
 * Supplier get �з���ֵ��û�в���
 * Predicat test �в���������ֵ��Boolean
 * */
public class NeiJian {
	public static void main(String[] args) {
		Function<String, Boolean> ff = "ll"::equalsIgnoreCase;
		System.out.println(ff.apply("LL"));
		Consumer<String> cc = System.out::print;
		cc.accept("hello world");
		System.out.println("\n");
		Supplier<String> ss = "ll"::toUpperCase;
		System.out.println(ss.get());
		Predicate<String> pp = "lllhello"::contains;
		System.out.println(pp.test("a"));
	}
}
