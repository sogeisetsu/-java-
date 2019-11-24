public class Hello{
    //public class 类名必须跟文件名保持一致，且首字母要大写，一个*.java里面只允许有一个public class
    public static void main(String args[]){//这是一切程序的起点
        System.out.println("hello world");//println用来换行
        System.out.print("hello world");//print不换行
        System.out.println("hello world");
    } 
}
// 有几个calss就生成几个*.class文件。
/*比如在这个程序里就生成了 三个*.class文件，分别是
A.class
B.class
hello.class */
class A{}//可以有多个class 
class B{}