package cn.suyuesheng.leijikuangjia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	//�ۼƿ�ܵı����������ʵ��
	public static void main(String[] args) {
		//Collection�Ǻܶ�ӿڵĸ��࣬��ֱ��ʹ����
		//List�ӿ�ʱCollection������
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
		//�����͵��Զ����ʶ���Զ������ʱ
		//Ϊ�����Զ������remove���ã���Ҫ����equals����
		List<Book> book = new ArrayList<Book>();
		book.add(new Book("kk",12));
		book.add(new Book("kd",12));
		book.add(new Book("kd",12));
		book.add(new Book("kc",12));//Ϊ�����Զ������remove���ã���Ҫ����equals����
		book.remove(new Book("kc",12));
		System.out.println(book);
		//�������
		System.out.println(Arrays.toString(book.toArray()));
		//�����Ƿ����
		System.out.println(book.contains(new Book("kd",12)));
		//indexof
		System.out.println(book.indexOf(new Book("kc",12)));
		//��ȡ
		List<Book> bbb = book.subList(1,2);
		System.out.println(bbb);
		//set
		book.set(1, new Book("jkjkjk",15));
		System.out.println(book);
		
	}
}
