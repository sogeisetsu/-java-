class Member {
    private int mid;
    private String name;
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return this.car;
    }

    private Member child;

    public void setChild(Member child) {
        this.child = child;
    }

    public Member getChild() {
        return this.child;
    }

    private Member childs[];

    public void setChilds(Member childs[]) {
        this.childs = childs;
    }

    public Member[] getChilds() {
        return this.childs;
    }

    private Member father;

    public void setFather(Member father) {
        this.father = father;
    }

    public Member getFather() {
        return this.father;
    }

    public Member(int mid, String name) {
        this.mid = mid;
        this.name = name;
    }

    public String getInfo() {
        return "id是" + this.mid + "\t" + "人名是" + this.name;
    }

}

class Car {
    private String carname;
    private Member member;

    public void setMember(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return this.member;
    }

    public Car(String carname) {
        this.carname = carname;
    }

    public String getInfo() {
        return "车的名字" + this.carname;
    }

}

class Province {
    private int pid;
    private String pname;
    private City city;
    private City citys[];

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return this.city;
    }

    public void setCitys(City citys[]) {
        this.citys = citys;
    }

    public City[] getCitys() {
        return this.citys;
    }

    public Province(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public String getInfo() {
        return "省份id：" + this.pid + "\t" + "省份名称：" + this.pname;
    }
}

class City {
    private int cid;
    private String cname;
    private Province province;

    public void setProvince(Province province) {
        this.province = province;
    }

    public Province getProvince() {
        return this.province;
    }

    public City(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public String getInfo() {
        return "城市id：" + this.cid + "\t" + "城市名称：" + this.cname;
    }
}

class Father {
    public Father(int fid, String fathername) {
        this.fid = fid;
        this.fathername = fathername;
    }

    private int fid;
    private String fathername;
    private Kids kid;
    private Kids kids[];

    public void setKid(Kids kid) {
        this.kid = kid;
    }

    public Kids getKid() {
        return this.kid;
    }

    public void setKids(Kids kids[]) {
        this.kids = kids;
    }

    public Kids[] getKids() {
        return this.kids;
    }

    public String getInfo() {
        return "父亲id：" + this.fid + "\t" + "父亲名字：" + this.fathername + "\n";
    }
}

class Kids {
    public Kids(int childid, String kname) {
        this.kname = kname;
        this.childid = childid;
    }

    private int childid;
    private String kname;
    private Father father;

    public void setFather(Father father) {
        this.father = father;
    }

    public Father getFather() {
        return this.father;
    }

    public String getInfo() {
        return "孩子id：" + this.childid + "\t" + "孩子名称" + this.kname + "\n";
    }
}

class YinYong {
    public static void main(String[] args) {
        Member m = new Member(1, "老张");
        Car c = new Car("宝马");
        m.setCar(c);
        c.setMember(m);
        System.out.println(m.getCar().getInfo());//人找车
        System.out.println(c.getMember().getInfo());//车找人
        Member chd = new Member(2, "老王");
        Car cc = new Car("三蹦子");
        m.setChild(chd);
        chd.setFather(m);//设置父亲
        chd.setCar(cc);
        cc.setMember(chd);
        System.out.println("通过老张找到他的儿子老王的车辆信息");
        System.out.println(m.getChild().getCar().getInfo());
        System.out.println("通过儿子找父亲的车");
        System.out.println(chd.getFather().getCar().getInfo());
        System.out.println("通过车找到儿子的父亲");
        System.out.println(cc.getMember().getFather().getInfo());
        Member sun = new Member(2, "孙");
        Member su = new Member(3, "苏");
        m.setChilds(new Member[]{sun, chd, su});
        sun.setFather(m);
        su.setFather(m);
        for (int i = 0; i < m.getChilds().length; i++) {//通过父亲找孩子
            System.out.println("|- " + m.getChilds()[i].getInfo());
            System.out.println("|- " + m.getChilds()[i].getFather().getInfo());
        }
    }
}

class PandC {
    public static void main(String[] args) {
        Province shandong = new Province(1, "山东省");//设置一个省
        City jinan = new City(1, "济南市");
        City qingt = new City(2, "青岛市");
        jinan.setProvince(shandong);
        qingt.setProvince(shandong);
        shandong.setCitys(new City[]{jinan, qingt});
        System.out.println(jinan.getProvince().getInfo());
        for (int i = 0; i < shandong.getCitys().length; i++) {
            System.out.println("|-" + shandong.getCitys()[i].getInfo());
        }
    }
}

class Ceshi {
    public static void main(String[] args) {
        printl("1221", "234", "niah", "dfejgo");
        System.out.println(">-------------------------");
        Kids zhang = new Kids(1, "小张");
        Kids liu = new Kids(2, "小刘");
        Father wang =new Father(1,"老王");
        wang.setKids(new Kids[]{zhang,liu});
        liu.setFather(wang);
        zhang.setFather(wang);
        System.out.println(liu.getFather().getInfo());
        for(int i=0;i<wang.getKids().length;i++){
            System.out.println(wang.getKids()[i].getInfo());
        }
    }

    public static void printl(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + "\t");
        }
        System.out.println("\n");
    }
}