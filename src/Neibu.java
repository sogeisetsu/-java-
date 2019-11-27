class Wai {
    private static String msg = "hello world";

    public Wai() {
    }

    public Wai(String msg) {
        Wai.msg = msg;
    }

    static class Nei {
        public void print() {
            System.out.println(Wai.msg);//内部访问外部
        }
    }

    public void fun() {
        new Nei().print();//外部访问内部
    }

    private String mm = "nihao";

    class Mn {
        public void print() {
            System.out.println(Wai.this.mm);
        }
    }

    //在方法里定义内部类
    public void funn(final int num) {//java8新特性可以不用final
        double cc = 12.9;
        class Fnei {
            public void print() {
                System.out.println(Wai.this.mm);
                System.out.println(num);
                System.out.println(cc);
            }
        }
        new Fnei().print();
    }
}

class Neibu {
    public static void main(String[] args) {
        //内部类
        new Wai("hello").fun();
        //直接访问内部类
        Wai.Nei nei = new Wai.Nei();//这是static的内部类
        nei.print();
        //内部类可以private后就不可以直接访问了
        Wai.Mn mnm = new Wai().new Mn();//这是正常的内部类
        mnm.print();
        new Wai().funn(12);

    }
}
