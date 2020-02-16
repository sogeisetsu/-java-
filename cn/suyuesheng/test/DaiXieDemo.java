package cn.suyuesheng.test;

import cn.suyuesheng.test.one.HelloTestDemo;

class Book {
	private int value;
	private String name;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public Book() {

	}

	public String toString() {
		return "Book [value=" + value + ", name=" + name + "]";
	}

}

class SH {
	public static void main(String[] args) {

	}
}

public class DaiXieDemo {
	public static void main(String args[]) {
		int b = 1;
		System.out.println(b);
		Book hali = new Book();
		hali.setName("海勃特");
		hali.setValue(12);
		System.out.println(hali.getName());
		System.out.println(new Book(12, "hah").toString());
//		eclipse的参数设置比较复杂
		// 参数设置
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("sysout");
		System.out.println();
		System.out.println(">-------------------------------");
		try {
			System.out.println(new HelloTestDemo().fun(1, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("计算完毕");
		try {
			System.out.println(new HelloTestDemo().funn(12, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("计算完毕");
		}
		System.out.println(">--------------------");
		try {
			System.out.println(new HelloTestDemo().chu(14, 8));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("计算完毕");
		}
	}
}
