package cn.suyuesheng.new01;

//java1.5 ������
public class HelloDemo {
	public static void main(String[] args) {
		System.out.println(add(new int[] {1,2,3,354,54524,3}));
		System.out.println(">================");
		System.out.println(addone(1,2,3,4345,45,232453,2435,42534));//��������ֱ��������������
		System.out.println(addForEach(1,2,3,4,5,6,7,8,9,10));
	}

	/**
	 * ʵ�ֶ���������͵��ۼӲ���
	 * 
	 * @param data ʹ��������ɽ���
	 * @return ������������ۼӵĽ��
	 */
	public static int add(int data[]) {
		int sum = 0;
		for(int i=0;i<data.length;i++) {
			sum+=data[i];
		}
		return sum;
	}
	/**
	 * ʵ�ֶ���������͵��ۼӲ���,����java1.5������
	 * @param arg
	 * @return
	 */
	public static int addone(int... arg) {
		int sum=0;
		for(int i=0;i<arg.length;i++) {
			//�����������ʽ���ˣ����ǲ����ķ���û�иı�
			sum+=arg[i];
		}
		return sum;
	}
	/**
	 * java1.5������ �� foreachʹ����������Ϊ����
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
