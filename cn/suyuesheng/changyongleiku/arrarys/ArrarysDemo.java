package cn.suyuesheng.changyongleiku.arrarys;

import java.util.Arrays;

public class ArrarysDemo {
	public static void main(String[] args) {
		//Arrarys类   基本用不到，面试会用
		int temp[] = new int[] {1,243,34,34,53,65,23434,123,45,88,344,0,8,76,6,5,4,9};
		//数组排序
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));//数组变为String
		//二分法检测数组位置
		System.out.println(Arrays.binarySearch(temp, 9));//必须排序后使用此方法
		//填充数组
		Arrays.fill(temp, 3);//全都填充成3
		//比较数组
		int A[] = new int[] {1,2,3};
		int B[] = new int[] {1,2,3};
		boolean c = Arrays.equals(A, B);
		System.out.println(c);//true
	}
}
