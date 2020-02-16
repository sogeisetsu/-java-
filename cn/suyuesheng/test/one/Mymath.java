package cn.suyuesheng.test.one;

public class Mymath {
	/**
	 * 
	 * @param data
	 * @return
	 */
	public int add(int data[]) {
		int sum=0;
		for(int x: data) {
			sum+=x;
		}
		return sum;
	}
}
