//对象的多态性
//向上转型
//向下转型
//向下转型之前，对象必须已经实现了向上转型
class AAa{
    public void fun1(){//父类方法
        System.out.println("你好，AAa");
    }
    public void fun2(){
        fun1();//fun2调用fun1
    }
}
class BBb extends AAa{
    public void fun1(){//覆写父类fun1
        System.out.println("你好,BBb");
    }
    public void funC(){//BBb自己定义的方法
        System.out.println("BBb>>>>public void funC()");
    }
}
public class DuoTai {
    public static void main(String[] args) {
        //向上转型
        AAa aaa = new BBb();
        /*此时aaa里面只有AAa类定义的方法，且类如果被覆写的话，那就按覆写的来
        * */
        aaa.fun1();
        aaa.fun2();
        /*你好,BBb
          你好,BBb
        * */
        //必须先向上转型，才能向下转型
        BBb bbb = (BBb)aaa;
        bbb.fun1();
        bbb.fun2();
        bbb.funC();
        /*这样就可以调用子类中自己定义的方法
        你好,BBb
        你好,BBb
        BBb>>>>public void funC()
        * */
    }
}
