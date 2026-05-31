import java.util.*;

public class Linkedlist {
    public static  class Node{
        int data;
        Node next;
        public  Node(int data ){
            this.data=data;
            this.next=null;

        }
    }

    public static  Node Head; ///share among all linked list
    public static Node tail; ///share among all linked list
    public static  int size;
    ///
    ///
    /// make it indivisual we should remove the static keyWord
//    public  Node Head;
//    public  Node tail;

    public int  removlast(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=Head.data;
            Head=tail=null;
            size=0;
            return val;
        }
        Node prev=Head;
        int i=0;
        while(i<size-2){
            prev=prev.next;
            i++;
        }
        int val=prev.next.data;
        prev.next=null;
        size--;
        tail=prev;
        return val;
    }
//-------------------------------------------------------------------------------------------------------------------------
    public int   removefirst(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=Head.data;
            Head=tail=null;
            size=0;
            return val;
        }
        int val=Head.data;
        Head=Head.next;
        size--;
        return val;
    }
    //-------------------------------------------------------------------------------------------------------------------------


    public   void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(Head==null){
            Head=tail=newNode;
            return;
        }
        newNode.next=Head;
        Head=newNode;
    }
//-------------------------------------------------------------------------------------------------------------------------

    public  void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(Head==null){
            Head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
//-------------------------------------------------------------------------------------------------------------------------

    public  void addmiddle(int giveninx,int data){
        if(giveninx==0){
            addfirst(data);
            return;
        }
        if(giveninx>=size){
            System.out.println("given index out of linked list ");
            return;
        }
        Node newNode=new Node(data);
        size++;
        int i=0;
        Node temp=Head;
        while(i<giveninx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
//-------------------------------------------------------------------------------------------------------------------------

    public   void print() {
        Node temp = Head;
        if(Head==null){
            System.out.println("Linked List is empty ");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
//-------------------------------------------------------------------------------------------------------------------------

    public  int search(int key){
        int i=0;
        Node temp=Head;
        while (temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
//-------------------------------------------------------------------------------------------------------------------------

    public int helper(int key,Node head){
         if(head==null){
             return -1;
         }

        if(head.data==key){
            return 0;
        }
        int idx=helper(key,head.next);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int reSearch(int key){
        return  helper(key,Head);
    }
//-------------------------------------------------------------------------------------------------------------------------

    public void  reverse(){
        Node prev=null;
        Node curr=tail=Head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head=prev;
    }
//-------------------------------------------------------------------------------------------------------------------------

    public void DeleteFromEnd(int n){
        if(n==size){
            Head=Head.next;
            return;
        }
        int i=1;
        Node prev=Head;
        while(i<size-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
//-------------------------------------------------------------------------------------------------------------------------

    public Node  findMid(){
        Node slow = Head;
        Node first=Head;

        while(first!=null && first.next!=null){
            slow=slow.next;
            first=first.next.next;
        }

        return slow;
    }
    //-------------------------------------------------------------------------------------------------------------------------

    public  boolean  palindrom(){
        Node mid=findMid();

        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
       Node temp=prev;
        while(temp!=null)
        {
            temp=temp.next;
        }

        Node right=prev;
        Node left=Head;

        while (right!=null){
            if(left.data!=right.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;

    }
//-------------------------------------------------------------------------------------------------------------------------

    public boolean isCycle(){
        Node first=Head;
        Node slow=Head;

        while (first!=null && first.next!=null){
            slow=slow.next;
            first=first.next.next;
            if(slow==first){
                return true;
            }
        }
        return false;
    }
//-------------------------------------------------------------------------------------------------------------------------

    public void removeCycle(){
        ////check cycle
        Node first=Head;
         Node slow=Head;
         boolean cycle=false;

         while (first!=null && first.next!=null){
             slow=slow.next;
             first=first.next.next;
             if(slow==first){
                 cycle=true;
                 break;
             }
         }
         /// /find previous
        if(cycle==false){
            return;
        }
        if (slow == first) {
            // move fast till last node of cycle
            while (first.next != slow) {
                first = first.next;
            }
            first.next = null;
            return;
        }

        Node prev = null;
            slow = Head;
            while (slow != first) {
                prev=first;
                slow = slow.next;
                first = first.next;
            }
            prev.next=null;


    }
    //-------------------------------------------------------------------------------------------------------------------------
    public void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public Node middle(Node head){
        Node slow=head;
        Node fast=head.next;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public  Node merge(Node h1,Node h2){
        Node mergell=new Node(-1);
        Node temp=mergell;

        while (h1 !=null && h2!=null){
            if(h1.data <= h2.data){
                temp.next=h1;
                h1=h1.next;
                temp=temp.next;
            }else {
                temp.next=h2;
                h2=h2.next;
                temp=temp.next;
            }
        }
        while (h1 != null){
            temp.next=h1;
            h1=h1.next;
            temp=temp.next;
        }
        while (h2 != null){
            temp.next=h2;
            h2=h2.next;
            temp=temp.next;
        }
        return mergell.next;
    }

    public  Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        System.out.print("Splitting: ");
        printList(head);

         Node mid=middle(head);
//        System.out.println(mid.data);
         Node righthead=mid.next;
         mid.next=null;
        Node newleft= mergesort(head);
        Node newright= mergesort(righthead);
        Node newhead=merge(newleft,newright);
        return newhead;
    }
/// ---------------------------------------------------------------------------------------------------------------
    public void  zigzag(){
        Node mid=middle(Head);

        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node righthead=prev;
        Node lefthead=Head;
        Node nextLeft,nextRight;

        while (righthead != null && lefthead!=null){
            nextLeft=lefthead.next;
            lefthead.next=righthead;
            nextRight=righthead.next;
            righthead.next=nextLeft;

            lefthead=nextLeft;
            righthead=nextRight;
        }
        print();
    }

    public static void  main(String args[]){
       Linkedlist ll=new Linkedlist();
       ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addfirst(6);


        ll.print();
        Head=ll.mergesort(Head);
        ll.print();
        ll.zigzag();
//       LinkedList<Integer>ll=new LinkedList<>();
//       ll.addFirst(1);
//        ll.addFirst(0);
//        ll.addLast(2);
//        ll.addLast(3);
//        System.out.println(ll);
//
//        ll.addAll(2, Collections.singleton(4));
//        ll.removeFirst();
//        ll.removeLast();
//        System.out.println(ll);


    }
}
