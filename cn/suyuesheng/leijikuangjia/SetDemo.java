package cn.suyuesheng.leijikuangjia;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set�ӿڵķ����٣��������ظ�Ԫ�أ��ظ�Ԫ��ֻ������һ��
		Set<String> hsall = new HashSet<String>();
		//����һ��˵HashSet������ģ����Ȳ��ܱ�֤�洢��ȡ��˳��һ�£������ܱ�֤��Ȼ˳��
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
		System.out.println(hsall);//����
		Set<Book> trall= new TreeSet<Book>();
		trall.add(new Book("jk",12));
		trall.add(new Book("jd",12));
		trall.add(new Book("js",13));
		trall.add(new Book("jd",16));
		trall.add(new Book("jd",17));
		trall.add(new Book("jd",17));
		System.out.println(trall);
		/*
		 * ����Compareable�ӿ�ʵ�֣����Զ��ظ�Ԫ�ص�ʶ��Ҳ�ǿ�Compareable�ӿڵ�CompareTo����
		 * �������ķ�ֹ�ظ����ǿ�Object��ķ���,����HsahSet
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
