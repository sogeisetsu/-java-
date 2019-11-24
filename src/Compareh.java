//对象比较
class Bijiao{
    private String msg="hello";
    private int age=12;
    public boolean compare(Bijiao bijiao){//注意，在类的内部，可以直接调用封装属性。
        if(this==bijiao){//直接定义和自己比较返回的值，避免过度计算
            return true;
        }
        if(bijiao==null){//定义和空比较返回的值，防止报错
            return false;
        }
        if(this.msg.equals(bijiao.msg)&&this.age==bijiao.age){//常规比较
            return true;
        }else{
            return false;
        }
    }
    public Bijiao(String msg,int age){
        this.age=age;
        this.msg=msg;
    }
    public String getInfo(){
        return this.msg;
    }
}
public class Compareh {
    public static void main(String[] args) {
        if(new Bijiao("lalal",12).compare(null)){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        System.out.println(">=====================");
        Bijiao bb=new Bijiao("1213",123);
        Bijiao cc=new Bijiao("lsald",134);
        if(bb.compare(bb)){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        System.out.println(">=======================");
        if(bb.compare(cc)){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        System.out.println(">=======================");
    }
}
