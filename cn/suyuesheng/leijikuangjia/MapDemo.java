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
		map.put("ll", 0);//key�������ظ�
		System.out.println(map.get(null));
		System.out.println(map);
		//ɾ��ĳ��
		map.remove("one");
		System.out.println("����"+map.size());
		//���ȫ����key
		Set<String> all = map.keySet();//set
		Iterator<String> iter = all.iterator();
		System.out.print("ȫ��key��");
		while(iter.hasNext()) {
			System.out.print(iter.next()+",");
		}
		//��ȡvalue
		Collection<Integer> call = map.values();
		Iterator<Integer> icall = call.iterator();
		System.out.print("��ȡvalue��");
		while(icall.hasNext()) {
			System.out.print(icall.next()+",");
		}
		System.out.println("\n>------------");
		//Hashtable ��Hashmap����һ��������Hashtable������null��key��value����
		//Map���ϵı�׼���
		//01 ��ȡMap����
		Map<String,String> bmap = new HashMap<String, String>();
		bmap.put("one", "һ");
		bmap.put("two", "��");
		bmap.put("three", "��");
		bmap.put("four", "��");
		//02 ͨ��entrySet��������Set����,��Iteratorʵ����
		Set<Map.Entry<String, String>> bst = bmap.entrySet();
		Iterator<Map.Entry<String, String>> bite = bst.iterator();
		//Iterator�������
		while(bite.hasNext()) {
			Map.Entry<String, String> me = bite.next();
			me.setValue("111");
			System.out.println(me.getKey()+"��"+me.getValue());
		}
		//key��ѡ��String
		
		
		
	}

}
