public class Fang {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hi");
        int c = 5;
        xx(c);
    }

    public static void xx(int a) {//return可以结束方法
        if (a == 1) {
            System.out.println("开始");
            return;
        } else {
            System.out.println("if");
        }
        System.out.println("qwe");
    }
}

class javaxintexing {
    public static void main(String[] args) {
        System.out.println("java新特性");
        //无限参数
//        int c=fun(1,2,3,4,5,5,6,7,6,7,5,5,4,4,3,5);
//        System.out.println(c);
        int c[] = new int[]{1, 2, 3, 4, 5};
        int b[] = fun(new int[]{1, 2, 3, 4, 5, 56, 6, 6});
        print(b);
    }

    public static int[] fun(int temp[]) {//arg以数组的形式保留下来
        temp[1] = 123;
        return temp;//用方法返回数组
    }

    public static void print(int temp[]) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "\t");
        }
    }
}
