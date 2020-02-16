package cn.suyuesheng.leijikuangjia;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> all = new ArrayList<String>();
		all.add("hello");
		all.add("hello");
		all.add("world");
		Iterator<String>  iter = all.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//ListIterator�к���ǰ֮ǰ��������ǰ���
		ListIterator<String> listiter = all.listIterator();
		while (listiter.hasNext()) {
			System.out.println(listiter.next());
		}
		while(listiter.hasPrevious()) {
			System.out.println(listiter.previous());
		}
		System.out.println(">--------------------------");
		//foreach
		for(String str:all) {
			System.out.println(str);
		}
		//Enumeration  �������ã����ü�ס
		Vector<String> vall = new Vector<String>();//Enumeration����Vector
		vall.add("kkl");
		vall.add("krfghf");
		vall.add("klfgfhg");
		Enumeration<String> en = vall.elements();//elements
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
	}

}
