package cn.suyuesheng.changyongleiku.random;

import java.util.Random;

//Random ���
public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i=0;i<100;i++) {
			System.out.println(r.nextInt(80)+20);//20��һ��
		}
	}

}
