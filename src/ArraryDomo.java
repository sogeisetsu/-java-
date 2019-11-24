class Book{
    public Book(String ba,double bv){//构造方法
        name=ba;
        value=bv;
    }
    private String name;
    private double value;
    public String getInfo(){
        return "\n"+"name"+"\t"+name+
                "\n"+"value"+"\t"+value;
    }
}

public class ArraryDomo {//对象数组
    public static void main(String[] args) {
        //先整一个普通的对象
        System.out.println("先整一个普通的对象");
        Book bka=new Book("suyu",12.9);
        System.out.println(bka.getInfo());
        //在整一个数组对象
        Book kks[]=new Book[3];
        kks[0]=new Book("suyuerdd",12.90);
        kks[1]=new Book("suyuerdd",12.90);
        kks[2]=new Book("suyuerdd",12.90);
        for(int i=0;i<kks.length;i++){
            System.out.println(kks[i].getInfo());
        }

    }
    public static void print(Book temp[]){
        System.out.println("\n");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]);
        }
    }
}
