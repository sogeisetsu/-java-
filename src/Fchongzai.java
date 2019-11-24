public class Fchongzai {
    public static void main(String[] args) {
        System.out.println("方法重载");
        System.out.println("两个int\t" + add(1, 2));
        System.out.println("三个int\t" + add(1, 2, 6));
        System.out.println("两个float\t" + add(1, 2.4, 123.3343));
        /*重载时会根据参数的类型和个数来自动区分

        其中，这是错的
        public static int add(float x,float y){
            return x*y;
        }
        * */
    }

    public static int add(int x, int y) {
        return x * y;
    }

    public static int add(int x, int y, int z) {
        return x * y * z;
    }

    public static double add(double x, double y, double z) {
        return x * y * z;

    }
}
