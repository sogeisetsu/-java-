/*//接口
//接口定义全局变量和抽象方法
//子类可以继承抽象类并实现接口
一个抽象类可以实现多个接口
接口不能继承抽象类，但是接口可以继承多个接口
一个子类只能继承一个抽象类
* */
interface Z{
    public final String MSG="hello,world";//全局变量
    public abstract void fun();//抽象方法

}
interface W{
    public abstract void say();
    void print();//public abstract可以省略
}
abstract class CA{//子类可以继承抽象类并实现接口
    public abstract Boolean nin();
}
//一个抽象类可以实现多个接口
abstract class XX implements Z,W{
    public abstract void printXX();
}//这时XX里面有四个抽象方法，分别是fun(),say(),printXX(),print.
class XXnoSun extends XX implements JJK{//必须要覆写五个方法
    public void fun(){
        System.out.println("fun>>Z>>from>>XX>>from>>XXnoSun");
    }
    public void say(){
        System.out.println("say()>>W>>from>>XX>>from>>XXnoSun");
    }
    public void printXX(){
        System.out.println("printXX>>XX>>from>>XXnoSun");
    }
    public void print(){
        System.out.println("print>>W>>from>>XX>>from>>XXnosun");
    }
    public void printJJK(){
        System.out.println("printJJk>>JJk");
    }
}
//接口不能继承抽象类，但是接口可以继承多个接口
interface JJK extends Z,W{//JJk里面现在有四个
    void printJJK();
}
class X extends CA implements Z,W{
    public void fun(){
        System.out.println("fun()>>Z");
    }
    public void say(){
        System.out.println("say()>>W");
    }
    public void print(){
        System.out.println("print()>>W");
    }
    public Boolean nin(){
        return false;
    }
}
public class JieKouDemo {
    public static void main(String[] args) {
        X x= new X();
        Z z= x;//向上转型
        W w= x;
        z.fun();
        w.print();
        w.say();
        /*fun()>>Z
        print()>>W
        say()>>W
        * */
        XXnoSun xx = new XXnoSun();
        Z zz =xx;
        zz.fun();//fun>>Z>>from>>XX>>from>>XXnoSun
        XX xxxhaha = xx;
        xxxhaha.printXX();//printXX>>XX>>from>>XXnoSun
        JJK jjk =xx;
        jjk.printJJK();//printJJk>>JJk
    }
}
