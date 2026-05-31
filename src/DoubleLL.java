public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
         Node newNode=new Node(data);
         size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public  void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public  int removefirst(){
        if(head==null){
            System.out.println("LInkedList is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public  void  reverse(){
        if(size==0){
            System.out.println("Linked list is empty");
            return;
        }
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public  static  void main(String args[]){

        DoubleLL ll=new DoubleLL();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);

        ll.print();
        System.out.println(ll.removefirst());
        System.out.println(size);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(tail.data);

    }
}
