class Gouzao{
    //构造方法的重载，要按参数的数量进行升序或降序排列
    public Gouzao(){//构造方法，没有返回值，方法名和类名相同
        System.out.println("定义的构造方法启用");
    }
    //构造方法可以重载
    public Gouzao(String sa){
        name=sa;
    }
    public Gouzao(String sa,int sag){
        name=sa;
        age=sag;
    }
    private String name;//类的属性,封装掉他
    //封装
    public void setName(String p){//setter方法
        name=p;
    }
    public String getName(){//getter方法
        return name;
    }
    private int age;
    public void setAge(int a){
        if(a>=0){//防止输入的年龄为小于0的数
            age=a;
        }
    }
    public int getAge(){
        return age;
    }
    public void tell(){//类的方法
        System.out.println("name: "+name+"\tage:  "+age);
    }
}
public class GzaoHanShu {//构造方法
    public static void main(String[] args) {
        //即使没有定义构造方法，也会默认产生一个构造方法
        Gouzao bk=new Gouzao();
        bk.setName("hehe");
        bk.setAge(12);
        bk.tell();
        System.out.println("构造函数有一个参数");
        System.out.println(">------------------");
        Gouzao bk1=new Gouzao("hahahj");
        bk1.tell();
        System.out.println("构造函数有二个参数");
        System.out.println(">------------------");
        Gouzao bk2=new Gouzao("lalalal",16);
        bk2.tell();
        //匿名函数
        System.out.println("匿名函数");
        System.out.println(">------------------");
        new Gouzao("qust",12).tell();
    }
}
class FangCan{//方法中的参数类型是任意的
    public static void main(String[] args) {//方法中的参数类型是任意的
        int c=fun(12,"hello12");
        System.out.println(c);

    }
    public static int fun(int x,String c){
        if(c=="hello"){
            return x;
        }else {
            return x+1;
        }
    }
}
