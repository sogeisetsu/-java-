package cn.suyuesheng.leijikuangjia;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three",3);
		map.put("zero", null);
		map.put("ll", 0);//key不允许重复
		System.out.println(map.get(null));
		System.out.println(map);
		//删除某个
		map.remove("one");
		System.out.println("长度"+map.size());
		//输出全部的key
		Set<String> all = map.keySet();//set
		Iterator<String> iter = all.iterator();
		System.out.print("全部key：");
		while(iter.hasNext()) {
			System.out.print(iter.next()+",");
		}
		//获取value
		Collection<Integer> call = map.values();
		Iterator<Integer> icall = call.iterator();
		System.out.print("获取value：");
		while(icall.hasNext()) {
			System.out.print(icall.next()+",");
		}
		System.out.println("\n>------------");
		//Hashtable 和Hashmap几乎一样，但是Hashtable不能有null在key或value里面
		//Map集合的标准输出
		//01 获取Map集合
		Map<String,String> bmap = new HashMap<String, String>();
		bmap.put("one", "一");
		bmap.put("two", "二");
		bmap.put("three", "三");
		bmap.put("four", "四");
		//02 通过entrySet方法返回Set集合,并Iterator实例化
		Set<Map.Entry<String, String>> bst = bmap.entrySet();
		Iterator<Map.Entry<String, String>> bite = bst.iterator();
		//Iterator迭代输出
		while(bite.hasNext()) {
			Map.Entry<String, String> me = bite.next();
			me.setValue("111");
			System.out.println(me.getKey()+"；"+me.getValue());
		}
		//key首选是String
		
		
		
	}

}
