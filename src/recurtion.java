public class recurtion {
//    public static int cout=0;
//
//    public static void printdec(int n){
//        if(n==1){
//            System.out.println(n);
//            return;
//        }
//        System.out.print(n+" ");
//        printdec(n-1);
//        cout++;
//        System.out.println(cout);
//    }

//    public static  void printinc(int n){
//        if(n==1){
//            System.out.print(n+" ");
//            return;
//        }
//        printinc(n-1);
//        System.out.print(n+" ");
//    }

    public  static  int  factorial(int n){
        if(n==0 || n==1){
            return n;
        }
        int fac=n*factorial(n-1);
        return  fac;
    }

    public static int func(int n){
        if(n==1){
            return  1;
        }
        if (n==0){
            return 0;
        }
        int sum=n+func(n-1);
//        System.out.println(sum);
        return sum;
    }
    public static  int fibon(int n){
        if(n==0){
            return  0;
        }
        if(n==1){
            return 1;
        }
        int fibNm1=fibon(n-1);
        int fibNm2=fibon(n-2);
        int fibn = fibNm1+fibNm2;
        return fibn;
    }
    public static  void print(int n){
        if(n<0){
            return;
        }
        print(n-1);
        System.out.print(fibon(n)+" ");
    }

    public static  boolean function(int arr[],int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return function(arr, i + 1);

    }

    public static  void firstOc(int arr[],int key,int i){
         if(arr[i]==key){
             System.out.println(i+1);
             return ;
         }
         firstOc(arr,key,i+1);
        }
    public static  void  lastoc(int arr[],int i,int kay){
        if(arr[i]==kay){
            System.out.println(i+1);
            return;
        }
        lastoc(arr,i-1,kay);
    }
    public static int lastoc2(int arr[],int i,int kay){
        if(i== arr.length){
            return -1;
        }
        int islast=lastoc2(arr,i+1,kay);
        if(islast==-1 &&  arr[i]==kay){
            return i;
        }
        return islast+1;
    }

    public static  int XpowerN(int x, int n){
        if(n==0){
            return 1;
        }
        int powervalue=x*XpowerN(x,n-1);
        return powervalue;

    }

    public static  int XpowerN2(int x, int n){
        if(n==0){
            return 1;
        }
        int powervalue=XpowerN(x,n/2)*XpowerN(x,n/2);
        if(n%2!=0){
            powervalue=x*powervalue;
        }
        return powervalue;

    }
    public static void main(String args[]){
//           printinc(10);
//        System.out.println(func(4));
//        System.out.println(factorial(6));
//        System.out.println(fibon(4));

//        print(5);
//        int arr[]={1,2,3,4,5,1};
//        System.out.println(function(arr,0));
        int arr2[]={5,4,85,69,5,7,2,1,5,2};
        firstOc(arr2,2,0);
        lastoc(arr2, arr2.length-1,5);
        System.out.println(lastoc2(arr2,0,5));
//        System.out.println(arr2.length);
        System.out.println(XpowerN(2,5));
        System.out.println(XpowerN2(2,5));
    }

}
