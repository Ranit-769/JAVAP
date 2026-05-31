import java.util.*;

//public class strings {
//    public static void main(String args[]){
//        String str="12301321";
//        int n= str.length();
//        boolean ispalindrom=true;
//        for(int i=0;i<n;i++){
//            if(str.charAt(i)!=str.charAt(n-i-1)){
//                 ispalindrom=false;
//            }
//        }
//
//        if(ispalindrom){
//            System.out.print("yes");
//        }else{
//            System.out.print("no");
//        }
//    }
//
//}


//----------------------------------------------------------
// public class strings {
//    public static void main(String args[]) {
//        int x=0;
//        int y=0;
//
//         String str="WNEENESENNN";
//
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)== 'W'){
//                  x--;
//             }
//             else if(str.charAt(i)== 'N'){
//                 y++;
//             }
//             else if(str.charAt(i)== 'S'){
//                 y--;
//             }
//             else if(str.charAt(i)== 'E'){
//                 x++;
//             }
//             else{
//                 continue;
//             }
//         }
//         int x1=x*x;
//         int y1=y*y;
//
//         float sortpath= (float) Math.sqrt(x1+y1);
//         System.out.print(sortpath);
//
//    }
//}
//------------------------------------------------------

//public class strings {
//    public static void main(String arhs[]) {
//
//        String s1 = "ranit";
//        String s2 = "ranit";
//
//        String s3 = new String("ranit");
//
//        if (s1 == s2) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }
//
//        if (s1 == s3) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }
//
//        if (s1.equals(s3)) {
//            System.out.print("equal");
//        } else {
//            System.out.print("not equal");
//        }
//    }
//
//}

//---------------------------------------------------------------------

//public class strings{
//    public static  void main (String args[]){
//        String str1="ranitdas";
//        String subStr="";
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter then first index");
//        int si=sc.nextInt();
//        System.out.println("enter then last index");
//
//        int ei= sc.nextByte();
//        for (int i = si; i <ei; i++) {
//           subStr += str1.charAt(i);
//
//        }
//        System.out.println(subStr);
//    }
//}

//---------------------------------------------------------------------

//public class strings{
//    public static  void main(String args[]){
//        String arr[]={"apple","mango","banan"};
//        String largest=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(largest.compareTo(arr[i])<0){
//                largest=arr[i];
//            }
//        }
//        System.out.print(largest);
//    }
//}

//-------------------------------------------------------------------------------

//public class strings {
//    public static void main(String args[]){
//        StringBuilder sb= new StringBuilder("");
//        String str="hi i am ranit";
//        sb.append(Character.toUpperCase(str.charAt(0)));
////        System.out.print(sb);
////        System.out.println(str.length());
//        for(int i=1;i<str.length();i++){
//            if(str.charAt(i) ==' ' && i<str.length()){
//                   sb.append(str.charAt(i));
//                   sb.append(Character.toUpperCase(str.charAt(i+1)));
//                   i++;
//            }else{
//                sb.append(str.charAt(i));
//            }
//        }
//        System.out.println(sb);
//    }
//}

//------------------------------------------------------------------------------------

public class strings{
    public static  void main(String args[]){
         String str="aaabbcdddee";
         StringBuilder newStr=  new StringBuilder("");
         for(int i=0;i<str.length();i++){
             newStr.append(str.charAt(i));
             Integer count=1;
             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                 count++;
                 i++;
             }
             if(count>1){
                 newStr.append(count.toString());
             }

//             System.out.println(newStr);
         }
             System.out.println(newStr);


    }
}