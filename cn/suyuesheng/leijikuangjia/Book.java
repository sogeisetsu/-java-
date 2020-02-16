package cn.suyuesheng.leijikuangjia;

public class Book implements Comparable<Book> {
	private int value;
	private String name ;
	public Book(String name,int value) {
		this.name=name;
		this.value=value;
	}
	@Override
	public String toString() {
		return "书名："+this.name+",价格："+this.value;
	}
//	public boolean equals(Object o) {
//		if(this==o) {
//			return true;
//		}
//		if(o==null) {
//			return false;
//		}
//		Book b = (Book)o;
//		if(this.value==b.value&&this.name.equals(b.name)) {
//			return true;
//		}
//		return false;
//	}
	
	@Override
	public int compareTo(Book o) {
		if(this.value>o.value) {
			return 1;
		}else if(this.value<o.value){
			return -1;
		}else {
			return this.name.compareTo(o.name);
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + value;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
}
