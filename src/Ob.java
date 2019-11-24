public class Ob {
    public static void main(String[] args) {
        System.out.println("面向对象，数组");
        /*
         * 数组
         *
         * */
        //第一种方法，声明并分配数组
        int lt[] = null;//声明整形数组lt
        lt = new int[3];//声明数组长度
        //第二种方法
        int[] ltt = null;//声明的另一种方式
        lt[0] = 1;
        lt[1] = 1;
        lt[2] = 1;
//        System.out.println(lt);
        for (int i = 0; i <= 2; i++) {
            lt[i] = i * 123 + 123;
            System.out.println(lt[i]);
        }
        System.out.println(lt.length);
        System.out.println(lt[lt.length-1]);
        //引用传递
        System.out.println("调用传递");
        int litt[]=new int[4];
        for(int i=0;i<litt.length;i++){
            litt[i]=i*3+123-4*67+200;
            System.out.println(litt[i]);
        }
        //定义一个新数组，和litt用同样的堆内存
        System.out.println("定义一个新数组，和litt用同样的堆内存");
        int newlitt[]=litt;
        for(int i=0;i<newlitt.length;i++){
            newlitt[i]=0;
            System.out.println("newlitt["+i+"]"+"="+newlitt[i]);
        }
        System.out.println("修改newlitt后");
        for(int i=0;i<litt.length;i++){
            System.out.println("litt["+i+"]"+"="+litt[i]);
        }
        //静态生成数组
        int jing[]=new int[]{1,2,3,4,5,6,78,};
        System.out.println(jing.length);
        jing[3]=12234456;
        System.out.println(jing[3]);
        //类 数组
        int lei[]=new int[]{1,2,24,45,45,321,3214,456,32,12,90,65,332,456};
        for(int i=0;i<lei.length;i++){
            System.out.print(lei[i]+"\t");
        }
        System.out.println("\n");
        System.out.println(">------------------------");
        System.out.println("\n");
        //使用类排序
        java.util.Arrays.sort(lei);
        for(int i=0;i<lei.length;i++){
            System.out.print(lei[i]+"\t");
        }
        int leiei[]=new int[]{1,2,3,4,4,3,3};
        System.arraycopy(lei,3,leiei,0,4);
        print(leiei);

    }
    public static void print(int temp[]){//定义一个方法去打印数组
        System.out.println("\n");
        for(int i=1;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
    }
}
class Ds{
    public static void main(String[] args) {
        //多维数组
        //动态
        int dd[][]=new int[4][3];
        //静态
        int dj[][]=new int[][]{{1,2,3},{1,2},{1,2,3},{3,4,5,3,4,53,3,5,54,54}};
        for (int i=0;i<dd.length;i++){
            for(int j=0;j<dd[i].length;j++){
                System.out.print("dd["+i+"]"+"["+j+"]"+"="+dd[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("静态数组");
        for (int i=0;i<dj.length;i++){
            for(int j=0;j<dj[i].length;j++){
                System.out.print("dj["+i+"]"+"["+j+"]"+"="+dj[i][j]+"\t");
            }
            System.out.println("\n");
        }

    }
}
//数组和方法
class SzAndFang{
    public static void main(String[] args) {
        System.out.println("数组和方法");
        //方法对数组的修改一定会影响到原始数据
        int dl[]=new int[]{1,2,3,4,4,5,};
        for(int i=0;i<dl.length;i++){
            System.out.print(dl[i]+"\t");
        }
        wayToob(dl);
        System.out.println("\n");
        for(int i=0;i<dl.length;i++){
            System.out.print(dl[i]+"\t");
        }
    }
    public static void wayToob(int temp[]){
        for(int i=0;i<temp.length;i++){
            temp[i]*=123;
        }
    }
}
