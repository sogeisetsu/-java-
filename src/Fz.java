class person{//为了可以修改增加setter和getter
    private String name;
    public void setName(String a){//setter
        name=a;
    }
    public String getName(){//获取getter
        return name;
    }
    private int age=19;
    public void setAge(int ag){
        if(ag>=0){//这样就可以达到了内部筛选的效果
            age=ag;
        }else{
            age=18;
        }
    }
    public void getinfo(){
        System.out.println("名字: "+name+"\t"+"年龄："+age);
    }
}
public class Fz {//对象的封装性
    public static void main(String[] args) {
        System.out.println("封装性");
        /*假设一个修改年龄的问题，为了不使年龄为负数，需要封装他*/
        person p1=null;
        p1=new person();
        p1.setName("老郑");
        p1.setAge(13);
        p1.getinfo();
        String a=p1.getName();//获得名字
        System.out.println(a);
    }
}

