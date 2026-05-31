//public class bitMan {
//    public static void check(int n){
//        int bitmask=1;
//        if( (n & bitmask)==0){
//            System.out.println("even");
//        }else {
//            System.out.println("odd");
//        }
//    }
//    public static void main (String args[]){
//        check(11);
//        check(50);
//        check(3);
//        check(60);
//
//    }
//}

//---------------------------------------------------------------------------

//public class bitMan{
//    public static  void get(int n, int i){
//        int bitmask=1;
//        if((n & (bitmask<<i))==0){
//            System.out.println("0");
//        }else {
//            System.out.println("1");
//        }
//    }
//
//    public static int  set(int n, int i){
//        int bitmask=1;
//        return  (n | (bitmask<<i));
//    }
//
//    public static  int clear(int n, int i){
//        int bitmask=1;
//        return n & ~(bitmask<<i);
//    }
//    public static  int  update(int n,int i,int newbit){
////        int res = 0;
////        if(newbit==0){
////              res=  clear(n,i);
////        }
////        else if(newbit==1){
////             res=set(n,i);
////        }
////        return res;
//        n=clear(n,i);
//        System.out.println(n);
//        int res=n | (newbit<<i);
//        return res;
//    }
//
//    public static  int clearlast(int n,int i){
//         int bitmask=(-1);
//         return  n & (bitmask<<i);
//    }
//
//    public static  int clearlastRange(int n,int i,int j ){
//        int a= (-1 << (j+1));
//
//        int b= (1<<i)-1;
//        int m=a|b;
//        return  n & m;
//    }

//public static boolean  checktwopower(int n){
//    return (n & (n-1))==0;
//}

//    public static  void main(String rags[]){
////        get(5,0);
////        System.out.println(set(10,0));
////        System.out.println(clear(7,0));
////           System.out.println(update(10,1,1));
////        System.out.println(clearlastRange(10,2,4));
//        System.out.println(checktwopower(4));
//    }
//
//
//}

//---------------------------------------------------------------------------------

public class bitMan{
    public static  int countSetBit(int n){
         int count=0;
         while(n>0){
             if((n & 1)!=0){
                 count++;
             }
             n=n>>1;
         }
         return  count;
    }
    public  static  void  firstExponance(int n ,int pow){
          int ans=1;
          int a=n;
          while (pow>0){
              if((pow & 1 )!=0){
                  ans=ans*a;
//                  System.out.println(ans);
              }
              a=a*a;
              pow=pow>>1;
          }
        System.out.println(ans);
    }
    public  static  void main(String args[]){
//        System.out.println(countSetBit(15));
//          firstExponance(2,4);
        System.out.println((-5) & 1);
    }

}