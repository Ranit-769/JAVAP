public class queus {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static  class queue2 {
        static Node front = null;
        static Node rear = null;

        static boolean isEmpty() {
            return front == null && rear == null;
        }

        static void add(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        static int dequeue() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            int value=front.data;
            if(rear==front){
                front=rear=null;

            }else {
                front = front.next;
            }
            return value;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            int value=front.data;
            return value;
        }
    }
    static  class queue1{

        static  int arr[];
       static int size;
       static  int rear;
       static  int front;

        queue1(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front=-1;
        }


        static boolean isEmpty() {

            return rear == -1 && front==-1;
        }
        static boolean isFull() {
            return (rear+1)%size==front;
        }

        static void add(int data){
          if(isFull()){
              System.out.println("full");
              return;
          }

          if(front==-1){
              front=0;
          }
          rear=(rear+1)%size;
          arr[rear]=data;
        }
        static int  dequeue(){
            if(isEmpty()){
                System.out.print("null");
                return -1;
            }
            int value=arr[front];
            if(front==rear){
                front=rear=-1;
            }else {
                front = (front + 1) % size;
            }
            return value;
        }

        static  int peek(){
            if(isEmpty()){
                System.out.print("null");
                return -1;
            }
            return arr[front];
        }
    }
    public  static  void  main(String args[]){
        queue2 q=new queue2();
        boolean n=q.isEmpty();
//        System.out.println(n);
        q.add(1);
        q.add(2);
        q.add(3);
//        System.out.println(q.dequeue());
        q.add(8);
        q.add(9);
       while(!q.isEmpty()){
           System.out.println(q.peek());
           q.dequeue();
       }

    }
}
