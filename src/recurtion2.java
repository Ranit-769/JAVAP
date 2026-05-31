import javax.swing.text.StyledEditorKit;

public class recurtion2 {
    public static  int findway(int n){
        if(n==1 || n==0){
            return  1;
        }
        int fn1=findway(n-1);
        int fn2=findway(n-2);
        int totalway=fn1+fn2;
        return  totalway;
    }
//------------------------------------------------------------------------------------------------------
    public static  void duplicate(String str, int i, StringBuilder newstr, boolean arr[]){
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        char character=str.charAt(i);
//        System.out.println(character-'a');
        if(arr[character-'a']==true){
            duplicate(str,i+1, newstr,arr);
        }else{
            arr[character-'a']=true;
            duplicate(str,i+1,newstr.append(character),arr);
        }
    }
//---------------------------------------------------------------------------------------------------
    static StringBuilder newst=new StringBuilder("");
    static boolean arr[]=new boolean[26];
    public static  void duplicate2(String str, int i){
        if(i==str.length()){
            System.out.println(newst);
            return;
        }
        char character=str.charAt(i);
//        System.out.println(character-'a');
        if(arr[character-'a']!=true){
             newst.append(character);
             arr[character-'a']=true;
        }
        duplicate2(str,i+1);
    }

//    -----------------------------------------------------------------------------------------
    public  static  int standingway(int n){
        if(n==1 || n==2){
            return  n;
        }

        int chosesingle=standingway(n-1);
        int chosepair=(n-1)*standingway(n-2);

        return chosesingle+chosepair;
    }
//    -------------------------------------------------------------------------------------------------
    public static void binaryString(int n, String str,int lastposition ){
        if(n==0){
            System.out.println(str);
            return;
        }

        //last position 0 or 1
         binaryString(n-1,str+"0",0);
        //last position 0
         if(lastposition==0){
             binaryString(n-1,str+"1",1);
         }
    }
    public static  void main(String args[]){
//        int way=findway(4);
//        System.out.println(way);
//        duplicate2("aaabbbpdssp",0);
//        System.out.println(standingway(3));
        binaryString(3,"",0); 
    }


}
