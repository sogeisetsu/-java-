class Link{
    class Node{
        private String data;
        private Node next;
        public Node(String data){
            this.data=data;
        }
        public void add(Node newNode){
            if(this.next==null){
                this.next=newNode;
            }else{
                this.next.add(newNode);
            }
        }
        public void print(){
            if(this==null){
                return;
            }
            System.out.println(this.data);
            this.next.print();
        }
        public boolean search(String data){
            if(data.equals(this.data)){
                return true;
            }else{
                if(this.next!=null){
                    return this.next.search(data);
                }else{
                    return false;
                }
            }
        }
        public void delete(Node previous,String data){
            if(data.equals(this.data)){
                previous.next=this.next;
            }else{
                if(this.next!=null){
                    this.next.delete(this,data);
                }
            }
        }//不理解
    }
    private Node root;
    public void addNode(String data){
        Node newNode=new Node(data);
        if(this.root==null){
            this.root=newNode;
        }else{
            this.root.next.add(newNode);
        }
    }
    public void printNode(){
        if(this.root!=null){
            this.root.print();
        }
    }
    public boolean contains(String Name){
        return this.root.search(Name);
    }
    public void deleteNode(String data){
        if(this.contains(data)){
            if(this.root.data==data){
                this.root=this.root.next;
            }else{
                this.root.next.delete(root,data);
            }
        }
    }
}
public class LianBiaoTwo {
}
