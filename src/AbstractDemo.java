/*
* 抽象类的使用
* 抽象方法必须包含在抽象类里面
* 抽象类和抽象方法必须abstract
* 抽象方法必须被覆写
* 抽象类必须被继承
* 抽象方法只需声明不需实现
* */
//定义一个方法，实现整型数组的反转和排序
abstract class BBB{//这是一个抽象类
    final int AGE=19;//这是一个final属性，这是个常量是不能被修改的
    private int temp[];
    private int foot=0;//角标
    public int[] getTemp(){
        return this.temp;
    }
    public BBB(int len){//定义数组长度
        if(len>0){
            this.temp=new int[len];
        }else{
            this.temp=new int[1];//数组长度最低为1
        }
    }
    public boolean add(int i){
        if(this.foot<this.temp.length){
            this.temp[foot]=i;
            foot++;
            return true;
        }else{
            return false;
        }
    }
    public void printLove(){
        System.out.println("你好,i love you !");
    }
    abstract public int[] getInfo();
}
class AAA extends BBB{
    public AAA(int len){
        super(len);
    }
    public int[] getarrary(){
        int center = super.getTemp().length/2;
        int head = 0;
        int tail =super.getTemp().length-1;
        for(int i=0;i<center;i++){
            int temp =super.getTemp()[head];
            super.getTemp()[head]=super.getTemp()[tail];
            super.getTemp()[tail]=temp;
            head++;
            tail--;
        }
        return super.getTemp();
    }
    public void printLove(){//也可以覆写非抽象方法
        System.out.println("hello you are a bad man");
    }
    public int[] getInfo(){
        return super.getTemp();
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        AAA aa= new AAA(4);
        aa.add(12);
        aa.add(12);
        aa.add(2);
        aa.add(11);
        System.out.println(aa.add(11));
        print(aa.getarrary());
        System.out.println(">___________________________");
        aa.printLove();
    }
    public static void print(int temp[]){
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]+"\t");
        }
    }
}
