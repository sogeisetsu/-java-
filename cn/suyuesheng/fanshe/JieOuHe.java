package cn.suyuesheng.fanshe;
//������Խ����
//�������ģʽ
interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	public void eat() {
		System.out.println("��ˮ��");
	}
}
class Festory{
	public static Fruit getinstance(String classname) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Fruit f =null;
		return f=(Fruit)Class.forName(classname).newInstance();
	}
}
public class JieOuHe {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Fruit f = Festory.getinstance("cn.suyuesheng.fanshe.Apple");
		f.eat();
	}

}
