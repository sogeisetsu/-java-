package cn.suyuesheng.new01;

class BOB extends Object{//Object��������ĸ���

}
interface Cok{
    void kopy();
}
class Cop implements Cok{
    public void kopy(){
        System.out.println("haha");
    }
}
public class ObjectLearnDemo {
    public static void main(String[] args) {
        BOB aa = new BOB();
        String cc= "1234";
        System.out.println(aa);
        System.out.println(cc);
        System.out.println("cc��toString>===="+cc.toString());
        System.out.println("aa��toString>===="+aa.toString());
        System.out.println(">=========================");
        int[] pp = {1,2,3243,424432,23423431};
        System.out.println(pp);//[I@4554617c �а����ű�ʾ�Ƕ�������
        System.out.println(pp.length);
        //Object���Խ���������������
        Object ccc = new int[]{1,2134,3425243,24353};
        System.out.println(ccc);
        int x[] = (int[])ccc;
        System.out.println(x.length);
        System.out.println(((int[])ccc).length);
        Object jk = new Cop();
        Cok cf = (Cok)jk;
        cf.kopy();
        int cdf = 12;
        String cccc = cdf+"";
        System.out.println((cdf+"") instanceof String);//true

    }
}
