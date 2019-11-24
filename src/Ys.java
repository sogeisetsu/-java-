public class Ys {// 加减乘除
    public static void main(String[] args) {
        int bb = 11;
        System.out.println(bb);
        int num = 12;
        System.out.println(bb + num);
        System.out.println(bb - num);
        System.out.println(bb * num);
        System.out.println(bb / (float) num);// /是除法
        System.out.println(bb % num);// %是取模
        bb--;
        System.out.println(bb);// 自减
        bb += 3;// 加3；
        System.out.println(bb);
        System.out.println(bb > num);// 关系运算 true
    }
}

class San {// 三目运算
    public static void main(String[] args) {
        System.out.println("三目运算");
        int sanmu = 0;
        sanmu = sanmu > 0 ? 1 : 2;// 这就是三目运算
        sanmu = 12;
        System.out.println(sanmu);
    }
}

class Luo {// 逻辑运算
    public static void main(String[] args) {
        System.out.println("逻辑运算");
        int numa = 12;
        int numb = 13;
        int l = 0;
        System.out.println((numa < numb) && ((numa - numb) < 0));// 与运算
        System.out.println(l > 0);
        // !要和boolean合用
        boolean c = true;
        System.out.println(!c);
        /*
         * &&和&的区别 其实是短不短路的区别，比如
         * false&&true，程序在得知第一个是false后会确定false&&true是false。但&是要确定完两个
         * 后才会确定false&&true是false
         */
    }
}