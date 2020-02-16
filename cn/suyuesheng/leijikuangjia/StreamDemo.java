package cn.suyuesheng.leijikuangjia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("world");
		list.add("good");
		list.add("Akk");
		list.add("aooao");
		Stream<String> stream = list.stream();
//		System.out.println(stream.count());
//		System.out.println(stream.distinct().count());//去除重复
//		List<String> newAll = stream.distinct().collect(Collectors.toList());//不包含重复内容的集合
		//数据的过滤操作
//		List<String> all = stream.distinct().map((x)->x.toLowerCase()).filter((x)->x.contains("a")).collect(Collectors.toList());
//		all.forEach(System.out::println);
//		Iterator<String> iall = all.iterator();
//		while(iall.hasNext()) {
//			System.out.println(iall.next());
//		}
		//分页的处理操作
//		List<String> all =stream.distinct().skip(2).limit(2).collect(Collectors.toList());
//		for(String x:all) {
//			System.out.println(x);
//		}
		//数据匹配
		Predicate<String> p1 = (x)->x.contains("l");
		Predicate<String> p2 = (x)->x.contains("w");
		if(stream.anyMatch(p1.or(p2))){
			System.out.println("yes");
		}
	}
}
