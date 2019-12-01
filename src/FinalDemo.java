//final类不能有子类
//final定义的方法不能被覆写
//final定义的属性为常量，命名全部大写,常量是不能被修改的
final class fdemo {//这个类不能有子类
    private String name;
    private int age;
    final int ID =12;//常量,不能被修改
    public static final int IDD=12;//全局变量
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        fdemo ff = new fdemo();
        ff.setAge(12);
        ff.setName("hehehe");
        System.out.println(fdemo.IDD);
        System.out.println(ff.ID);
        System.out.println(ff.getAge());
    }
}
