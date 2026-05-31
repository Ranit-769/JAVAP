import java.util.*;

public class stackC {

    public  static void Insertbottom( Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.peek();
        s.pop();
        Insertbottom(s,data);
        s.push(top);
    }

    public static String ReverceString(String str,Stack<Character>s){
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb= new StringBuilder();
        while (!s.isEmpty()){
            sb.append(s.peek());
            s.pop();
        }
        return sb.toString();
    }
    public static void addbottom(Stack<Integer>s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.peek();
        s.pop();
        addbottom(s,data);
        s.push(top);

    }

    public static  void reverseStack(Stack<Integer>s){
          if(s.isEmpty()){
              return;
          }
        int top=s.peek();
        s.pop();
        reverseStack(s);
        addbottom(s,top);

    }
     void StackSpan(int arr[]){
        Stack<Integer>s=new Stack<>();
        int span[]= new int[arr.length];
        span[0]=1;
        s.push(0);

         for (int i = 1; i < arr.length; i++) {
             int curr=arr[i];
             while(!s.isEmpty() && curr>=arr[s.peek()]){
                 s.pop();
             }
             if(s.isEmpty()){
                 span[i]=i+1;
//                 System.out.println("hello");
             }else {
                 int previoustgrater=s.peek();
                 int spans=i-previoustgrater;
//                 System.out.println(spans);
                 span[i]=spans;
             }
             s.push(i);
         }
         printspan(span);
      }
      public  static  void  printspan(int arr[]){
          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i]+",");
          }
      }

      public static  void nextGrater(int arr[]){
         Stack<Integer> s2=new Stack<>();
         int Ng[]=new int[arr.length];

          for (int i = arr.length-1; i >=0 ; i--) {
              while(!s2.isEmpty() && arr[i]>=arr[s2.peek()]){
                  s2.pop();
              }
              if(s2.isEmpty()){
                  Ng[i]=-1;
              }else {
                  Ng[i]=arr[s2.peek()];
              }
              s2.push(i);
          }
          printspan(Ng);
      }
    public static void main(String args[]){
//        Stack<Character>s=new Stack<>();
//        String str="abc";
//        String an=ReverceString(str,s);
//        System.out.println(an);
//        Stack<Integer>s=new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        System.out.println(s);
//
//        reverseStack(s);
//        System.out.println(s);

//
//        System.out.println(s);
//        Insertbottom(s,4);
//        Insertbottom(s,10);
//        System.out.println(s);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//          }
//        int arr[]={100,80,60,120,60,80,100};
//        stackC s=new stackC();
//        s.StackSpan(arr);
        int arr[]={6,8,0,1,2,3};
        nextGrater(arr);
        }
    }

