
import java.util.*;

public class Arraylist {

    public static int  mostWater(ArrayList<Integer>list){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<list.size();i++){
            for (int j = i+1; j < list.size(); j++) {
                int hight=Math.min(list.get(i),list.get(j));
                int width=j-i;
                int water=hight*width;
                max=Math.max(water,max);
            }
        }
        return max;
    }
    public  static  int mostwater2(ArrayList<Integer>list){
        int lp=0;
        int rp=list.size()-1;
        int max=Integer.MIN_VALUE;
        int hight;
        int width;


        while(lp<rp){
            hight=Math.min(list.get(lp),list.get(rp));
            width=rp-lp;
            int waterarea=hight*width;
            max=Math.max(max,waterarea);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }
        return max;

    }

    public  static  boolean pair(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)+list.get(j)==target){
                    System.out.print("( "+i+","+j+" )");
                    return true;
                }
            }
        }
        return false;
    }

    public  static  boolean pair2(ArrayList<Integer>list,int target) {
        int lp = 0;

        int rp = list.size() - 1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.print("( " + lp + "," + rp + " )");
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }

        }
        return false;
    }
    public  static  boolean pair3(ArrayList<Integer>list,int target) {
       int bp=-1;

       for (int i=0;i<list.size();i++){
           if(list.get(i)>list.get(i+1)){
               bp=i;
               break;
           }
       }
       int lp=bp+1;
       int rp=bp;
       int n=list.size();
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.print("( " + lp + "," + rp + " )");
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp=(lp+1)%n;
            } else {
                rp=(n+rp-1)%n;
            }

        }
        return false;
    }

        public static void main (String args[]){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(8);
            list.add(6);
            list.add(2);
            list.add(5);
            list.add(4);
            list.add(8);
            list.add(3);
            list.add(7);

            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(11);
            list2.add(15);
            list2.add(6);
            list2.add(8);
            list2.add(9);
            list2.add(10);


            int ans = mostwater2(list);
            System.out.println(ans);
            System.out.println(pair(list, 16));
            System.out.println(pair3(list2, 19));

            Collections.sort(list);
            System.out.println(pair2(list, 16));


        }
    }
