package cn.suyuesheng.changyongleiku.arrarys;

import java.util.Arrays;

public class ArrarysDemo {
	public static void main(String[] args) {
		//Arrarys��   �����ò��������Ի���
		int temp[] = new int[] {1,243,34,34,53,65,23434,123,45,88,344,0,8,76,6,5,4,9};
		//��������
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));//�����ΪString
		//���ַ��������λ��
		System.out.println(Arrays.binarySearch(temp, 9));//���������ʹ�ô˷���
		//�������
		Arrays.fill(temp, 3);//ȫ������3
		//�Ƚ�����
		int A[] = new int[] {1,2,3};
		int B[] = new int[] {1,2,3};
		boolean c = Arrays.equals(A, B);
		System.out.println(c);//true
	}
}
