package cn.suyuesheng.test.two;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cn.suyuesheng.test.one.HelloTestDemo;
import junit.framework.TestCase;

class HelloTestDemoTest {

	@Test
	void testFun() {
		try {
			TestCase.assertEquals(new HelloTestDemo().fun(10, 2), 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testFunn() {
		try {
			TestCase.assertEquals(new HelloTestDemo().funn(12, 4), 3.0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testChu() {
		try {
			TestCase.assertEquals(new HelloTestDemo().chu(4, 3), "1.......1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
