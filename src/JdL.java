class Lei{//构造一个类
	public Lei(){};//必须要有一个没有参数的构造方法
	public Lei(String p,int pa,double ps,double pv){
		name=p;
		age=pa;
		sal=ps;
		value=pv;
	}
	private String name;
	public void setName(String p){//必须要有setter
		name=p;
	}
	public String getName(){//必须要有getter
		return name;
	}
	private int age;
	private double sal;
	private double value;
	public String getInfo(){//最终返回值必须是String，且方法里不可以有输出
		return "\n"+
			   "name"+"\t"+name+"\n"+
			   "age"+"\t"+age+"\n"+
			   "sal"+"\t"+sal+"\n"+
			   "value"+"\t"+value+"\n";
	}
}
public class JdL{
	public static void main(String[] args){
		//简单类
		System.out.println("hrllo world");
		int temp[]=new int[]{1,2,3,4,3,4};
		print(temp);
		Lei bk=new Lei();
		bk.setName("heloo");
		String a = bk.getInfo();
		System.out.println(a);
		Lei bk2=new Lei("苏月晟",19,8000.0,1.0);
	    String a2=bk2.getInfo();
		System.out.println(a2);
	}
	public static void print(int temp[]){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+"\t");
		}
	}
}