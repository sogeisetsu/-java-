class presonn{
    private String name;
    private int age;
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
}
class stud extends presonn{
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
        System.out.println(this.getAge());
        System.out.println(this.getName());
    }
}
public class JjCheng {
    public static void main(String[] args) {
        stud s1 = new stud();
        s1.setAge(12);
        s1.setName("li");
        s1.setSchoolname("春风小学");
        System.out.println(s1.getSchoolname());
        s1.fun();
    }
}
