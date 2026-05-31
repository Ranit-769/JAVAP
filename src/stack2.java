import java.util.Stack;

public class stack2 {
    public  static  boolean checkValidity(String atr){
        Stack<Character>s=new Stack<>();
        for (int i = 0; i < atr.length(); i++) {
            char ch= atr.charAt(i);
            if(ch=='(' || ch =='{' || ch=='['){
                s.push(ch);
            }else {
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')')||(s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')){
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public  static  boolean duplicate(String str){
        Stack <Character> s1=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch==')'){
                int count =0;
                while(s1.peek()!='('){
                    s1.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else {
                    s1.pop();
                }
            }
            else {
                s1.push(ch);

            }
        }
        return false;
    }

    public  static  void nextSmallerR(int nsr[],int arr[]){
        Stack<Integer>s=new Stack<>();
        for (int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while (!s.isEmpty() && curr<=arr[s.peek()]){
               s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else {
                nsr[i]=s.peek();
            }
            s.push(i);
        }
    }
    public  static  void nextSmallerL(int nsr[],int arr[]){
        Stack<Integer>s=new Stack<>();
        for (int i=0;i<arr.length;i++){
            int curr=arr[i];
            while (!s.isEmpty() && curr<=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=-1;
            }else {
                nsr[i]=s.peek();
            }
            s.push(i);
        }
    }


    public static void MaxArea(int arr[]){
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];
        nextSmallerR(nsr,arr);
        nextSmallerL(nsl,arr);
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height*width;
            max=Math.max(max,area);
        }
        System.out.println("Maximum area is ="+ max);


    }
    public  static  void  printspan(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public  static void main(String args[]){
//        String str="(()({[]}))";
//        System.out.println( checkValidity(str));
//        String str1="((a+b))+(c+d))";
//        System.out.println( duplicate(str1));
        int arr[]={2,1,5,6,2,3};
        MaxArea(arr);
    }
}
