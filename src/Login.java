class Check {
    public boolean check(String name, String password) {
        if (name.equals("苏月晟") && password.equals("15990904343")) {
            return true;
        } else {
            return false;
        }
    }
}
class CheckOut{
    private String info[];
    public CheckOut(){};
    public CheckOut(String info[]){
        this.info=info;
    }
    public String login(){
        Check check =new Check();
        this.isExit();
        String str="";
        if(check.check(this.info[0],this.info[1])){
            str="登入";
        }else{
            str="密码或用户错误";
        }
        return str;
    }
    public void isExit(){
        if(this.info.length!=2){
            System.out.println("格式错误");
            System.out.println("格式为（名称 密码）");
            System.exit(1);
        }
    }
}
public class Login{
    public static void main(String[] args) {
        CheckOut opr=new CheckOut(args);
        System.out.println(opr.login());
    }
}