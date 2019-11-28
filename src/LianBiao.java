class Node{
    private String data;
    private Node next;
    public Node(String data){
        this.data=data;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public Node getNext(){
        return this.next;
    }
    public String getData(){
        return this.data;
    }
}
public class LianBiao {
    public static void main(String[] args) {
        Node na = new Node("top");
        Node nb = new Node("second");
        Node nc = new Node("third");
        na.setNext(nb);
        nb.setNext(nc);
        print(na);
    }
    public static void print(Node node){//用递归方式输出链表
        if(node==null){
            return;
        }
        System.out.println(node.getData());
        print(node.getNext());
    }
}
