package cn.suyuesheng.zhengze;

import java.util.Arrays;

public class DemoOne {

	public static void main(String[] args) {
		String str = "1123";
		System.out.println(str.matches("\\d{4}"));
		//正则表达式范例
		String str1 = "2010-04-08";
		System.out.println(str1.matches("\\d{4}-\\d{2}-\\d{2}"));
		System.out.println(str1.matches("20\\d{2}-\\d{2}-\\d{2}"));
		String st2 = "df2123deegee23erfg4qedwfgb4defrd123wdefret3ewre";
		System.out.println(Arrays.toString(st2.split("\\d+")));
		System.out.println(st2.replaceAll("\\d+", "  数字  "));
		//验证电话号码
		String tell ="15990904343";
		System.out.println(tell.matches("\\+86 \\d{11}|\\d{11}"));
		//验证Email地址
		String email = "hello.sss@sadf.com";
		//用户名字母开头,字母数字结尾，内容是字母数字下划线和点
		String negx ="[a-zA-Z][a-zA-Z0-9_\\.]{0,28}\\w@\\w+\\.(cn|com|cn.com)";
		System.out.println(email.matches(negx));
	}

}
