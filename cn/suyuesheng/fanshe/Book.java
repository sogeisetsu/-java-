package cn.suyuesheng.fanshe;
//�����вι���ʵ��������
public class Book {
	
	public Book(double value, String nmae) {
		//ֻ���вι��죬û���޲ι���
		this.value = value;
		this.nmae = nmae;
	}
	private double value;
	private String nmae;
	public void setNmae(String nmae) {
		this.nmae = nmae;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getNmae() {
		return nmae;
	}
	public double getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Book [value=" + value + ", nmae=" + nmae + "]";
	}
	
}
