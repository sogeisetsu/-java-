class book{//声明一个类
    String name;//类的属性
    double value;
    public void getbk(){//类的方法不要加static
        System.out.println("书名"+name+"\t价格"+value);
    }
}
public class ClassAndOb {
    public static void main(String[] args) {
        System.out.println("类与对象");

        /*
        * 能用的一定是对象，对象是根据类来定义的
        * 堆内存：保存每一个对象的属性内容，new来触发
        * */
        //声明一个对象
        book bk =null;//这时候开辟了栈内存
        //实例化这个对象
        bk=new book();//这时候开辟了堆内存
        bk.value=12.4;
        bk.name="JavaScript：函数的艺术";
        bk.getbk();
        //输出   书名JavaScript：函数的艺术	价格12.4
        //只要堆内存开辟了，堆内存中一定会有类的所有属性内容
        System.out.println(">----------------");
        book bka=new book();//声明并实例化，占一个新的堆内存
        bka.name="hello world";
        bka.value=123.456;
        bka.getbk();//返回默认值：书名null	价格0.0
        System.out.println(">-----------------");
        book bkw=bka;//和bka共用一个堆内存，bkw新开辟了一个栈内存
        bkw.getbk();
        //若是
        bk=bka;
        bk.getbk();//bk也和bka共用一个堆内存
        /*之前的比如bk之前的堆内存变成了垃圾内存，会被GC不定期处理
        * */

    }
}
