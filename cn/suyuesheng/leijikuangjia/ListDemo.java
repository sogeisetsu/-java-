package cn.suyuesheng.leijikuangjia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	//累计框架的本质是链表的实现
	public static void main(String[] args) {
		//Collection是很多接口的父类，不直接使用它
		//List接口时Collection的子类
		List<String> list= new ArrayList<String>();
		System.out.println(list.isEmpty()+""+list.size());
		list.add("hello");
		list.add("hello");
		list.add("world");
		System.out.println(list.size()+""+list.isEmpty());
		for(int x=0;x<list.size();x++) {
			System.out.println(list.get(x));
		}
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		//当泛型的自定义标识是自定义的类时
		//为了让自定义类的remove有用，需要定义equals方法
		List<Book> book = new ArrayList<Book>();
		book.add(new Book("kk",12));
		book.add(new Book("kd",12));
		book.add(new Book("kd",12));
		book.add(new Book("kc",12));//为了让自定义类的remove有用，需要定义equals方法
		book.remove(new Book("kc",12));
		System.out.println(book);
		//变成数组
		System.out.println(Arrays.toString(book.toArray()));
		//查找是否存在
		System.out.println(book.contains(new Book("kd",12)));
		//indexof
		System.out.println(book.indexOf(new Book("kc",12)));
		//截取
		List<Book> bbb = book.subList(1,2);
		System.out.println(bbb);
		//set
		book.set(1, new Book("jkjkjk",15));
		System.out.println(book);
		
	}
}
