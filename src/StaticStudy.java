class Boook {//随意定义一个类
    private int value;
    private String name;
    static String pub = "科大出版社";//static,在类里面定义公共的属性，它可以统一修改，并只占一个内存。从而达到方便修改和少占内存的目的
    public Boook(){

    }
    public Boook(int value, String name) {
        this.name = name;
        this.value = value;
    }
    public String getInfo(){
        return "|-"+"价格："+this.value+"\t书名："+this.name+"\t出版社："+this.pub;
    }
    //static方法，可以直接通过类名称来调用
    //static方法只能调用static调用的属性或方法
    public static void setPub(String p){
        Boook.pub=p;//不要用this
    }
}
public class StaticStudy {
    public static void main(String[] args) {
        System.out.println("static学习");
        //调用Boook
        Boook a1 = new Boook(12, "数学");
        Boook a2 = new Boook(19, "国语");
        Boook a3 = new Boook(14, "英文");
        System.out.println(a1.getInfo());
        System.out.println(a2.getInfo());
        System.out.println(a3.getInfo());
        /*
        * |-价格：12	书名：数学	出版社：科大出版社
          |-价格：19	书名：国语	出版社：科大出版社
          |-价格：14	书名：英文	出版社：科大出版社*/
        //改变一个的公共属性，全都改变。
        a1.pub="青岛出版社";
        System.out.println(a1.getInfo());
        System.out.println(a2.getInfo());
        System.out.println(a3.getInfo());
        /*
        * |-价格：12	书名：数学	出版社：青岛出版社
          |-价格：19	书名：国语	出版社：青岛出版社
          |-价格：14	书名：英文	出版社：青岛出版社
        * */
        //建议用Boook.pub来修改
        Boook.pub="济南出版社";
        System.out.println(a1.getInfo());
        System.out.println(a2.getInfo());
        System.out.println(a3.getInfo());
        /*
        * |-价格：12	书名：数学	出版社：济南出版社
          |-价格：19	书名：国语	出版社：济南出版社
          |-价格：14	书名：英文	出版社：济南出版社
        * */
        Boook.setPub("光明出版社");//static方法，可以直接通过类名称来调用
        System.out.println(a1.getInfo());
        System.out.println(a2.getInfo());
        System.out.println(a3.getInfo());
        /*
        * |-价格：12	书名：数学	出版社：光明出版社
          |-价格：19	书名：国语	出版社：光明出版社
          |-价格：14	书名：英文	出版社：光明出版社
        * */
        System.out.println(new Boook().pub);//新对象依然是光明出版社
        Boook bb =new Boook(12,"dd");
        System.out.println(Boook.pub);/*光明出版社*/
    }
}
//return 的问题
class res{
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,7,4,5,6,43,3,32,4},9));
        System.out.println(dd(14));
    }
    public static int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++) {
            System.out.println("aa");
            for (int b = i + 1; b < nums.length; b++) {
                System.out.println("bb");
                if (nums[i] + nums[b] == target) {
                    res[0] = i;
                    res[1] = b;
                    return res;
                }
            }
        }
        return res;
    }
    public static int dd(int d){
        for(int i=0;i<12;i++){
            if(i==d){
                return i+1;
            }
        }
        return 12;
    }
}
