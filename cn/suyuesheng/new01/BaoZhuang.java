package cn.suyuesheng.new01;

public class BaoZhuang {
    public static void main(String[] args) {
        Integer a = new Integer(12);//װ��
        int c = a.intValue();//����
        Boolean b =new Boolean(true);
        System.out.println(b.booleanValue());//����
        float f = a.floatValue();
        System.out.println(c+"\n"+f);
        //�����������ת��
        int cd = 1290;
        System.out.println(new Integer(cd).doubleValue());
        //������������ת�ַ���
        System.out.println(a.toString() instanceof String);
        //����������
        System.out.println(">++++++"+"/n"+(String.valueOf(12) instanceof String)+"/n"+">=======");
        //�ַ���ת��Ϊ������������
        System.out.println(Integer.parseInt("11234"));
        System.out.println(new Integer(Integer.parseInt("123456")) instanceof Integer);
        System.out.println(Double.parseDouble("12.34546"));
        //�Զ�װ��
        Integer ii =12;
        System.out.println(ii instanceof Integer);
        int yy = ii;//�Զ�����
        //�������͵ı仯
        int oa=12;
        int ob= (int)12.3;
        double oc = (double)oa;//����û��Ҫ
        System.out.println((int)oc);
        System.out.println((double)oa);
        Integer asd =12;
        int bfg = asd;
        
        System.out.println();
        System.out.println(oa+ob+oc);
        System.out.println((int)12.8);
    }
}
