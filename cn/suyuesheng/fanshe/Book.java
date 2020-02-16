package cn.suyuesheng.fanshe;
//调用有参构造实例化对象
public class Book {
	
	public Book(double value, String nmae) {
		//只有有参构造，没有无参构造
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
