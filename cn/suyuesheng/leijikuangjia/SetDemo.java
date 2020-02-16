package cn.suyuesheng.leijikuangjia;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set接口的方法少，不能有重复元素，重复元素只会增加一次
		Set<String> hsall = new HashSet<String>();
		//我们一般说HashSet是无序的，它既不能保证存储和取出顺序一致，更不能保证自然顺序
		hsall.add("A");
		hsall.remove("A");
		hsall.add("A");
		hsall.add("B");
		hsall.add("C");
		hsall.add("D");
		hsall.add("D");
		hsall.add("F");
		hsall.add("E");
		hsall.add("V");
		hsall.add("I");
		System.out.println(hsall);//无序
		Set<Book> trall= new TreeSet<Book>();
		trall.add(new Book("jk",12));
		trall.add(new Book("jd",12));
		trall.add(new Book("js",13));
		trall.add(new Book("jd",16));
		trall.add(new Book("jd",17));
		trall.add(new Book("jd",17));
		System.out.println(trall);
		/*
		 * 排序靠Compareable接口实现，所以对重复元素的识别也是靠Compareable接口的CompareTo方法
		 * 但真正的防止重复还是靠Object类的方法,比如HsahSet
		 * */
		Set<Book> hsall2= new HashSet<Book>();
		trall.add(new Book("jk",12));
		trall.add(new Book("jd",12));
		trall.add(new Book("js",13));
		trall.add(new Book("jd",16));
		trall.add(new Book("jd",17));
		trall.add(new Book("jd",17));
		System.out.println(trall);
	}

}
