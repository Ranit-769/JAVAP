import java.util.ArrayList;


public class StackB {
  static  class ArrayLStack {
      static ArrayList<Integer> list = new ArrayList<>();

      public boolean isEmpty() {
          return list.size() == 0;
      }

      public void push(int data) {
          list.add(data);
      }

      public int pop() {
          if (isEmpty()) {
              System.out.println("Stack is empty!!!!!!!!!");
              return -1;
          }
          int top = list.get(list.size() - 1);
          list.remove(list.size() - 1);
          return top;
      }

      public int peek() {
          if (isEmpty()) {
              System.out.println("Stack is empty!!!!!!!!!");
              return -1;
          }
          int top = list.get(list.size() - 1);
          return top;
      }
  }
     static  class Node {
          int data;
          Node next;
          public Node(int data){
              this.data=data;
              this.next=null;
          }
      }
      static class LinkedLstack{
             static  Node Head;

          public boolean isEmpty(){
              return Head==null;
          }
          public  void push(int data){
              Node newNode =new Node(data);
              if(isEmpty()){
                  Head=newNode;
                  return;
              }
              newNode.next=Head;
              Head=newNode;
          }
          public int  pop(){
              if(isEmpty()){
                  return -1;
              }
              int top=Head.data;
              Head=Head.next;
              return top;
          }

          public int peek(){
              if(isEmpty()){
                  return -1;
              }
              int top=Head.data;
              return top;
          }

      }



    public static void main(String arhs[]){
        ArrayLStack s= new ArrayLStack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        LinkedLstack s1=new LinkedLstack();
        System.out.println(s1.isEmpty());
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}
