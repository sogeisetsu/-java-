class Presonn{
    private String name;
    private int age;
    //属性覆盖
    int id=1;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    //方法覆写，如果父类和子类有相同的方法的话就需要用到方法覆写
    //需要注意，方法覆写的返回值要保持一致，这和方法的重载是一样的
    public void fun(){
        System.out.println("father>>>>>fun()");
    }
    public Presonn(){
        System.out.println("调用了父类的无参构造");
    }
}
class Stud extends Presonn{
    int id=2;
    private String schoolname;
    public void setSchoolname(String schoolname){
        this.schoolname=schoolname;
    }
    public String getSchoolname(){
        return this.schoolname;
    }
    //子类也叫派生类
    //字类不能直接调用父类的私有成员
    //一个子类只能有一个父类
    /*
    public void print(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
       Error:(29, 32) java: age 在 presonn 中是 private 访问控制
     */
    public void fun(){//但字类可以通过其他方法来合理地调用父类的私有属性或方法
        super.fun();//调用父类的方法
        System.out.println("child>>>>fun()");
        System.out.println(this.getAge());
        System.out.println(this.getName());
        System.out.println(super.id);//调用父类的属性
    }
    //实例化子类就默认调用了父类的无参构造
    /*给父类的构造方法写一个输出语句，也给子类写一个就知道了
    * */
    public Stud(){
        //子类构造里暗含super()函数
        super();//这句话加不加都一样
        System.out.println("调用了子类的无参构造");
    }
    /*输出结果
    调用了父类的无参构造
    调用了子类的无参构造
    春风小学
    12
    li
    * */
}
public class JjCheng {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.setAge(12);
        s1.setName("li");
        s1.setSchoolname("春风小学");
        System.out.println(s1.getSchoolname());
        s1.fun();//调用子类的方法,因为属性的覆盖，这里的id为1
        System.out.println(s1.id);//这里的id为2
    }
}
