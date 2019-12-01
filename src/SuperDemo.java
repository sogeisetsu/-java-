//详细剖析super的用法，比较super和this的差异
class Bl{
    private String comname;
    private int age;
    public Bl(String comname,int age){
        this.age=age;
        this.comname=comname;
    }
    public void setComname(String comname){
        this.comname=comname;
    }
    public String getComname(){
        return this.comname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public String getInfo(){
        return "公司名称："+this.comname+"\t年龄："+this.age;
    }
}
class Worker extends Bl{
    private String position;
    public Worker(){
        this("BAIDU",12,"北京");//this调用构造
    }
    public Worker(String conname,int age, String position){
        super(conname,age);
        this.position=position;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public String getPosition(){
        return this.position;
    }
    public String getInfo(){//方法覆写
        return super.getInfo()+"\t地点："+this.position;
    }
}
class Bb{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void fun(){
        System.out.println("hello this is fun of Bb");
    }
    public String getInfo(){
        return this.name+"\t"+this.age;
    }
    public Bb(){
        System.out.println("实例化了Bb");
    }
    public Bb(String name,int age){
        this.setAge(age);
        this.setName(name);
    }
}
class Aa extends Bb{
    private int id;
    public Aa(){}
    public Aa(String name,int age,int id){
        super(name,age);
        this.id=id;
    }
    public String getInfo(){
        return super.getInfo()+"\t"+this.id;
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Worker wk = new Worker("wangyi",19,"杭州");
        Worker wu = new Worker();
        System.out.println(wk.getInfo());
        System.out.println(wu.getInfo());
        /*公司名称：wangyi	年龄：19地点杭州
          公司名称：BAIDU	    年龄：12地点北京
          */
        System.out.println(">-----------------------------");
        Aa xin = new Aa();
        Aa hh = new Aa("hhh",12,13);
        hh.getInfo();
    }
}
