package cn.suyuesheng.test.one;

public class HelloTestDemo {
	public int fun(int i, int j) throws Exception {
		int temp;
		try {
			temp = i / j;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		return temp;
	}

	public double funn(int i, int j) throws Exception {
		double b = 0.0;
		try {
			b = i / j;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		return b;
	}

	public String chu(int i, int j) throws Exception {
		int temp;
		int emp;
		try {
			temp = i / j;
			emp = i % j;
		} catch (Exception e) {
			throw e;
		}
		return temp + "......." + emp;
	}
}
