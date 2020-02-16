package cn.suyuesheng.new01;

public class BaoZhuang {
    public static void main(String[] args) {
        Integer a = new Integer(12);//装箱
        int c = a.intValue();//拆箱
        Boolean b =new Boolean(true);
        System.out.println(b.booleanValue());//拆箱
        float f = a.floatValue();
        System.out.println(c+"\n"+f);
        //浮点和整数的转换
        int cd = 1290;
        System.out.println(new Integer(cd).doubleValue());
        //基本数据类型转字符串
        System.out.println(a.toString() instanceof String);
        //还可以这样
        System.out.println(">++++++"+"/n"+(String.valueOf(12) instanceof String)+"/n"+">=======");
        //字符串转化为基本数据类型
        System.out.println(Integer.parseInt("11234"));
        System.out.println(new Integer(Integer.parseInt("123456")) instanceof Integer);
        System.out.println(Double.parseDouble("12.34546"));
        //自动装箱
        Integer ii =12;
        System.out.println(ii instanceof Integer);
        int yy = ii;//自动拆箱
        //数据类型的变化
        int oa=12;
        int ob= (int)12.3;
        double oc = (double)oa;//这样没必要
        System.out.println((int)oc);
        System.out.println((double)oa);
        Integer asd =12;
        int bfg = asd;
        
        System.out.println();
        System.out.println(oa+ob+oc);
        System.out.println((int)12.8);
    }
}
