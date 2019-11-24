class Bookq{
    public Bookq(){
        this("hhh",13.4);
        System.out.println(this);
    }
    public Bookq(String tittle){
        this(tittle,12.3);
    }
    public Bookq(String tittle,double value){//this()必须放在首行且留出口即留一个没有this的，就像这样
        this.tittle=tittle;
        this.value=value;
    }
    private String tittle;
    private double value;
    public String getInfo(){
        return "tittle\t"+this.tittle+"\n"+
                "value\t"+this.value;//属性调用用this
    }
}
public class thisDemo {
    public static void main(String[] args) {
        //构造方法间互相调用
        //this表示调用他的对象
        Bookq b1 =new Bookq();
        System.out.println(b1);

        /*返回以下内容，地址一致
          Bookq@1b6d3586
          Bookq@1b6d3586
        * */
    }
}
