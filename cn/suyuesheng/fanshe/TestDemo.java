package cn.suyuesheng.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		Class<?> cc = Class.forName("cn.suyuesheng.fanshe.Book");
		//Object oo = cc.newInstance();//报错cn.suyuesheng.fanshe.Book.<init>()
		Constructor<?> con = cc.getConstructor(double.class,String.class);
		Object oo = con.newInstance(12.3,"qwe");
		System.out.println(oo.toString());
		//Book [value=12.3, nmae=qwe]
		//简单java类一定要写无参构造
		String filedName="value";
		//class 获得普通方法
		Method setMet = cc.getMethod("set"+oneToUpper(filedName), double.class);
		Method getMet = cc.getMethod("get"+oneToUpper(filedName));
		setMet.invoke(oo, 12.344);//oo是cc的实例化对象
		System.out.println(getMet.invoke(oo));
		//获取属性
		Field name = cc.getDeclaredField("nmae");//获得Field对象
		name.setAccessible(true);//使允许外部访问
		name.set(oo, "lll");//oo是cc的实例化对象
		System.out.println(name.get(oo));
		System.out.println(((Book)oo).getNmae());
	}
	public static String oneToUpper(String str) {
		return str.substring(0, 1).toUpperCase()+str.substring(1);
	}

}
