package cn.suyuesheng.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		Class<?> cc = Class.forName("cn.suyuesheng.fanshe.Book");
		//Object oo = cc.newInstance();//����cn.suyuesheng.fanshe.Book.<init>()
		Constructor<?> con = cc.getConstructor(double.class,String.class);
		Object oo = con.newInstance(12.3,"qwe");
		System.out.println(oo.toString());
		//Book [value=12.3, nmae=qwe]
		//��java��һ��Ҫд�޲ι���
		String filedName="value";
		//class �����ͨ����
		Method setMet = cc.getMethod("set"+oneToUpper(filedName), double.class);
		Method getMet = cc.getMethod("get"+oneToUpper(filedName));
		setMet.invoke(oo, 12.344);//oo��cc��ʵ��������
		System.out.println(getMet.invoke(oo));
		//��ȡ����
		Field name = cc.getDeclaredField("nmae");//���Field����
		name.setAccessible(true);//ʹ�����ⲿ����
		name.set(oo, "lll");//oo��cc��ʵ��������
		System.out.println(name.get(oo));
		System.out.println(((Book)oo).getNmae());
	}
	public static String oneToUpper(String str) {
		return str.substring(0, 1).toUpperCase()+str.substring(1);
	}

}
