public class Luoji {// 逻辑运算，if
    public static void main(String[] args) {
        int age = 38;
        if (age > 60) {
            System.out.println("可以退休");
        } else {
            System.out.println("不可以退休");
        }
    }}

class switchh{//逻辑运算 switch

    public static void main(String[] args) {
        int age=23;
        switch (age) {
            case 18:{
                System.out.println("你18le");
                break;//必须要有break
            }
        
            default:{
                System.out.println("haha");//必须要有default
                break;
            }
        }

    }
}

class whilee{//while运算
    /* 有两种
    第一种是while(条件){语句}
    第二种是do{语句}while(条件)
    */ 
    public static void main(String[] args) {
        int i=0;
        while(i<10){//这是while(条件){语句}
            i+=2;
            if(i==9){
                i-=1;
            }
            System.out.println("i= "+i);
        }
        System.out.println("i= "+i);//i仍然是10
        do{
            i+=1;
            System.out.println("i= "+i);
        }while(i==2);//这里要有;
        System.out.println(i);
    }
}
class forr{//用for
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"= "+i*j+"\t");
            }
            // System.out.println(j);
            System.out.print("\n");
        }
    }
}