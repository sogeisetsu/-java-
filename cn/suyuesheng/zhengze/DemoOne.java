package cn.suyuesheng.zhengze;

import java.util.Arrays;

public class DemoOne {

	public static void main(String[] args) {
		String str = "1123";
		System.out.println(str.matches("\\d{4}"));
		//������ʽ����
		String str1 = "2010-04-08";
		System.out.println(str1.matches("\\d{4}-\\d{2}-\\d{2}"));
		System.out.println(str1.matches("20\\d{2}-\\d{2}-\\d{2}"));
		String st2 = "df2123deegee23erfg4qedwfgb4defrd123wdefret3ewre";
		System.out.println(Arrays.toString(st2.split("\\d+")));
		System.out.println(st2.replaceAll("\\d+", "  ����  "));
		//��֤�绰����
		String tell ="15990904343";
		System.out.println(tell.matches("\\+86 \\d{11}|\\d{11}"));
		//��֤Email��ַ
		String email = "hello.sss@sadf.com";
		//�û�����ĸ��ͷ,��ĸ���ֽ�β����������ĸ�����»��ߺ͵�
		String negx ="[a-zA-Z][a-zA-Z0-9_\\.]{0,28}\\w@\\w+\\.(cn|com|cn.com)";
		System.out.println(email.matches(negx));
	}

}
