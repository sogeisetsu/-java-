package cn.suyuesheng.new01;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

//国际化
//需要先设计properties文件
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle zh = ResourceBundle.getBundle("Message");
		System.out.println(zh.getString("info"));
		String str1 = zh.getString("info");
		String str2 = zh.getString("wsl.msg");
		System.out.println(str1);
		System.out.println(MessageFormat.format(str2, new Date()));
		Locale zhloc = new Locale("zh", "CN");//选择国家和地区
		Locale enloc = new Locale("en", "US");//选择国家和地区
		
		ResourceBundle zhrb = ResourceBundle.getBundle("Messages",zhloc );
		System.out.println(MessageFormat.format(zhrb.getString("wsl.msg"), "苏月晟",new Date()));
		System.out.println(Locale.getDefault());//zh_CN 默认是按当前语言环境来的
	}

}
