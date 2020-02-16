package cn.suyuesheng.changyongleiku.stringbuffer;
//StringBuffer类可以解决String内容一旦声明就不可改变的限制
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//append
		StringBuffer ap = new StringBuffer();
		ap.append("hello").append("world").append('S').append(true).append(12.454);
		System.out.println(ap);//helloworldStrue12.454
		fun(ap);
		System.out.println(ap);
		//insert
		ap.insert(1, "hi");
		System.out.println(ap);
		//reverse 反转
		StringBuffer re = new StringBuffer();
		re.append("hello").reverse();
		System.out.println(re);//olleh
		//replace 替换
		re.append("hahahssddafsfsdfds").replace(0, 1, "gg");
		System.out.println(re);
		//字符串截取  返回String
		System.out.println("aaaasfr4vdsve5v".substring(0,12));//aaaasfr4vdsv
		String aa = re.substring(12);
		System.out.println(aa);
		re.delete(1, 5);//ghhahahssddafsfsdfds
		StringBuffer ss = re.delete(0, 1);
		System.out.println(ss);//hhahahssddafsfsdfds
		System.out.println(re);
		//indexOf
		System.out.println(re.indexOf("suyuesheng"));//-1表示没有
		//频繁修改用StringBuffer类
		//如下，
		for(int i=0;i<100;i++) {
			re.append(i+"\n");//这就属于频繁修改String
		}
		System.out.println(re);
	}
	public static void fun(StringBuffer s) {//验证StringBuffer可以修改
		s.append("aaaa");
	}

}
