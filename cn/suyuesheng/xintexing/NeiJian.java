package cn.suyuesheng.xintexing;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//内建函数式接口，因为内建函数式接口的存在，我们很少直接定义函数式接口
/*函数式接口的种类
 * 静态  类::方法名称
 * 普通方法  实例化对象::方法名称
 * 特定类方法 类::方法名称
 * 构造方法 类::new
 * */
/*内建式函数接口的种类： 
 * Function apply 有返回值和参数
 * Consumer accept 有参数，没有返回值
 * Supplier get 有返回值，没有参数
 * Predicat test 有参数，返回值是Boolean
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
