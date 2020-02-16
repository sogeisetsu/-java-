package cn.suyuesheng.changyongleiku.comparable;

import java.util.Arrays;

//���еĶ�������Ҫ��������Ļ�����ô�����ڵ�����Ҫʵ��Comparable�ӿڣ�����дcompareTo����
class Book implements Comparable<Book>{
	public Book(double value, String name) {
		super();
		this.value = value;
		this.name = name;
	}
	private double value ;
	private String name;
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Book book) {//����ȽϹ���Arrays.sort()�����
		if(this.value>book.value) {
			return -1;
		}else if(this.value < book.value) {
			return 1;
		}else {
			return 0;
		}
	}
	public String toString() {
		return this.name+"\t"+this.value+"\n";
	}
}
public class ComparableDemo {
	public static void main(String[] args) {
		Book books[] = {new Book(12.3,"hah"),
				new Book(14.3,"kk"),
				new Book(12.6,"ll")};
		Arrays.sort(books);
		System.out.println(Arrays.toString(books));
	}
}
