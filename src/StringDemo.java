public class StringDemo {
    public static void main(String[] args) {
        //String类
        String sta = new String("heloo");
        String stb = new String("heloo");
        System.out.println(sta == stb);//false,分析内存可得知原因
        //其他的呢？
        int ina = 1;
        int inb = 1;
        System.out.println(ina == inb);//true
        /* 1、“==”比较两个变量本身的值，即两个对象在内存中的首地址。
           (java中，对象的首地址是它在内存中存放的起始地址，它后面的地址是用来存放它所包含的各个属性的地址，
           所以内存中会用多个内存块来存放对象的各个参数，而通过这个首地址就可以找到该对象，进而可以找到该对
           象的各个属性)
           2、“equals()”比较字符串中所包含的内容是否相同。
        * */
        System.out.println(sta.equals(stb));//true,完全比较内容为true
        //为防止空指向，要把匿名对象放在前面
        System.out.println("heloo".equals(sta));//true
        /*String的两种实例化方法
        1.匿名
        String a="hhhhh"; //会开辟堆内存和栈内存
        * */
        String a = "fhhhh";
        String b = "fhhhh";
        String c = "world";
        System.out.println(a == b);//true,一个对内存
        System.out.println(b == c);//false，？
        System.out.println(a == c);//false，？
        //因为共享设计模,在一个对象池里面,若是通过构造方法的话会造成特别多的垃圾
        //字符串的内容最好不要修改，会造成较多垃圾

    }
}
class StringDe{
    public static void main(String[] args) {
        System.out.println("String的方法");
        String tochar="sadjsajskjajkjs";
        //定义方法，如果返回值是boolean，命名用is
        //toCharArray
        char c[]=tochar.toCharArray();//toCharArray
        print(c);
        System.out.println(isNum(c));
        char a[]="123243434".toCharArray();
        System.out.println(isNum(a));
        //charAt
        char cc=tochar.charAt(1);
        System.out.println(cc);
        //equalsIgnoreCase
        String eq="wert";
        String eqq="WERT";
        System.out.println(eq==eqq);//false
        System.out.println(eqq.equalsIgnoreCase(eqq));//true
        //conpareTo.比较大小
        System.out.println(eq.compareTo(eqq));//32
        //查找
        System.out.println("helloword".indexOf("l"));//2
        System.out.println("helloword".indexOf("l",3));//3
//        lastIndexOf
        System.out.println("helloword".lastIndexOf("l"));//3,从后往前查，但返回是从前往后数的
        //contains
        System.out.println("helloword".contains("l"));//boolean  true
        //判断开头结尾
        System.out.println(">-------------------------------");
        System.out.println("***@@@hello^^^".startsWith("**"));//true
        System.out.println("***@@@hello^^^".endsWith("^^^"));//true
        System.out.println("***@@@hello^^^".startsWith("@@",3));//true
        int arraryone[]=new int[]{1,2,3,4,5,5,4,3,32,34,432,12,4,5346,4,5445,};
        java.util.Arrays.sort(arraryone);
        print(arraryone);
        System.out.println("\n"+">--------------------------");
        String stringone="qweerrtryhdhrllo,hello,hello";
        System.out.println(stringone.replaceAll("hello","啥"));//qweerrtryhdhrllo,啥,啥
        System.out.println(stringone.replaceFirst("hello","啥"));//qweerrtryhdhrllo,啥,hello
        System.out.println(stringone.replace("hello","啥"));//qweerrtryhdhrllo,啥,啥
        System.out.println(">------------------------------");
        //substring 类似于切片,s小写
        System.out.println(stringone.substring(1,6));//左开右闭，不可以负数
        System.out.println(stringone.substring(4));
        System.out.println(">--------------------------------------");
        //spliit
        String stringarraryone[]=stringone.split(",");//qweerrtryhdhrllo	hello	hello
        print(stringarraryone);
        String stringarrarytwo[]=stringone.split(",",2);//qweerrtryhdhrllo	hello,hello
        print(stringarrarytwo);
        //trim
        //取消两边空格
        System.out.println("   asdlkjvirfi  dlevnrojewvo  ".trim());
        //toUpperCase,toLowerCase
        System.out.println("djnfuerghwghwihgi4oi".toUpperCase());
        System.out.println("uIFEAFHOI4HIJKDNFKJnjdnfweh".toLowerCase());
        System.out.println(">--------------------------------------");
        System.out.println(initcap("   dlaenfidvfrvrvDWF   "));
    }
    public static void print(char temp[]){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
    }
    public static void print(int temp[]){
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
    }
    public static void print(String temp[]){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
        System.out.println("\n");
        System.out.println("length:\t"+temp.length);
    }
    public static boolean isNum(char temp[]){//判断数字
        for(int i=0;i<temp.length;i++){
            if(temp[i]>'9'||temp[i]<'0'){
                return false;
            }
        }
        return true;
    }
    //定义一个方法首字母大写
    public static String initcap(String temp){
        temp=temp.trim();
        temp=temp.substring(0,1).toUpperCase()+temp.substring(1);
        return temp;
    }

}
class CeShi{
    public static void main(String[] args) {
        //toCharArray
        char chararraryone[]="qwwdwqfva".toCharArray();//变成数组
        print(chararraryone);
        System.out.println("\n");
        //charAt
        //返回所在位置
        char a="swfesgegfag".charAt(2);//f
        System.out.println(a);
        //equalsIgnoreCase
        //比较,忽略大小写
        System.out.println("qdeqwfqf".equalsIgnoreCase("QDEQWFQF"));//true
        //compareTo
//        比较
        System.out.println("qe".compareTo("QE"));//32
        //        lastIndexOf
        //查找存在的位置
        System.out.println("qqewfsacefa".indexOf("e"));//2
        //不存在会返回负一
        //contains
        //查看是否存在
        boolean isb="wjdksalvehello".contains("hello");//true
        System.out.println(isb);
        //startsWith
        boolean isc ="%%%%%lkjicfiesjfv******".startsWith("%%%%%");//true
        System.out.println(isc);
        //endswith
        //同上
        //substring
        //切片
        System.out.println("qwewqrewtewt".substring(1,4));//左开右闭//wew
        System.out.println("dsnfgrwuhgiorwgio".substring(1));//从1到最后//snfgrwuhgiorwgio
        //split
//        分割
        String stingarraryone[]="hello my wwe dcvr".split(" ");
        print(stingarraryone);
        //trim
        //去除两边空格
        System.out.println("  wqewq wqfeq wqrewt    ".trim());//wqewq wqfeq wqrewt
        //toUpperCase,toLowerCase
        //全部大小写
        System.out.println("dsadwdec".toUpperCase());//DSADWDEC
        //replaceAll
        //替换
        System.out.println("aaasdwasfdewfhello".replace("hello","啥"));//aaasdwasfdewf啥
        int [] ari=new int []{1,2,3,4,5,555,432,234,12};
        java.util.Arrays.sort(ari);
        print(ari);
        int str[]=new int[3];
        System.out.println("");
        System.arraycopy(ari,2,str,0,2);
        print(str);
    }
    public static void print(char temp[]){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
    }
    public static void print(int temp[]){
        for (int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
    }
    public static void print(String temp[]){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
        System.out.println("\n");
        System.out.println("length:\t"+temp.length);
    }
    public static boolean isNum(char temp[]){//判断数字
        for(int i=0;i<temp.length;i++){
            if(temp[i]>'9'||temp[i]<'0'){
                return false;
            }
        }
        return true;
    }
    //定义一个方法首字母大写
    public static String initcap(String temp){
        temp=temp.trim();
        temp=temp.substring(0,1).toUpperCase()+temp.substring(1);
        return temp;
    }
}
