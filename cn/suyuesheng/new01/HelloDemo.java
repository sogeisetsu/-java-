package cn.suyuesheng.new01;

//java1.5 新特性
public class HelloDemo {
	public static void main(String[] args) {
		System.out.println(add(new int[] {1,2,3,354,54524,3}));
		System.out.println(">================");
		System.out.println(addone(1,2,3,4345,45,232453,2435,42534));//这样就能直接输入整形数据
		System.out.println(addForEach(1,2,3,4,5,6,7,8,9,10));
	}

	/**
	 * 实现多个数据类型的累加操作
	 * 
	 * @param data 使用数组完成接收
	 * @return 多个整形数据累加的结果
	 */
	public static int add(int data[]) {
		int sum = 0;
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		return sum;
	}
	/**
	 * 实现多个数据类型的累加操作,利用java1.5新特性
	 * @param arg
	 * @return
	 */
	public static int addone(int... arg) {
		int sum=0;
		for(int i=0;i<arg.length;i++) {
			//参数定义的形式变了，但是参数的访问没有改变
			sum+=arg[i];
		}
		return sum;
	}
	/**
	 * java1.5新特性 ， foreach使数组的输出更为方便
	 * @param arg
	 * @return
	 */
	public static int addForEach(int...arg) {
		int sum=0;
		for(int x : arg) {
			sum+=x;
		}
		return sum;
	}
}
