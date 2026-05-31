public class BackTracking {
    public  static  void subString( String str, String newstr, int i){
        if(i==str.length()){
            if(newstr.length()==0){
                System.out.println("null");
            }else {
                System.out.println(newstr);
            }
            return;
        }
        subString(str,newstr+str.charAt(i),i+1);
        subString(str,newstr,i+1);

    }

    public static  void parmutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            parmutation(newstr,ans+curr);
        }
    }
    public static boolean isSafe(String bord[][],int row,int col){
            for(int i=row-1;i>=0;i--){
                if(bord[i][col]=="Q"){
                    return false;
                }
            }

            for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                if(bord[i][j]=="Q"){
                    return false;
                }
            }
        for (int i=row-1,j=col+1;i>=0 && j<bord[0].length;i--,j++){
            if(bord[i][j]=="Q"){
                return false;
            }
        }

        return true;
    }


     public  static  int count=0;
    public static  boolean queenSetting(String bord[][],int row){
        if(row==bord.length){
//            print(bord);
            count++;
            return true;
        }
        for (int j=0;j<bord[0].length;j++){

            if(isSafe(bord,row,j)){
                bord[row][j]="Q";
                if(queenSetting(bord,row+1)){
                    return true;
                };

                bord[row][j]="x";
            }

        }
        return false;
    }

    public static void print(String  arr[][]){
        System.out.println("-----------------bord------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]=="Q"){
                    System.out.print(arr[i][j]+" ");
                }
                else {
                    System.out.print("x ");
                }
            }
            System.out.println();

        }
    }
    public static  int Gridway(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            return  1;
        } else if (i==m || j==n) {
            return  0 ;
        }

        int w1=Gridway(i+1,j,n,m);
        int w2=Gridway(i,j+1,n,m);
        int totalway =w1+w2;
        System.out.println(totalway);
        return totalway;

    }


    public static boolean sudokuSolver(int sudoku[][],int row ,int col){

        if(row==9 && col==0){
            return  true;
        }
        int nextrow=row;
        int nextcol=col+1;
        if(col+1==9){
            nextcol=0;
            nextrow=row+1;
        }

        if(sudoku[row][col]!=0){
            return  sudokuSolver(sudoku,nextrow,nextcol);
        }
        for (int digit = 1; digit <=9 ; digit++) {
            if(issafe(sudoku,digit,row,col)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku,nextrow,nextcol)){
                        return true;
                }
                sudoku[row][col]=0; ////dont understand this line
            }

        }
        return  false;

    }


     public  static  boolean issafe(int sudoku[][],int digit,int row,int col){
        //check row
         for (int i = 0; i < 9; i++) {
             if(sudoku[i][col]==digit){
                 return false;
             }
         }
         //check column
         for (int j = 0; j < 9; j++) {
             if(sudoku[row][j]==digit){
                 return false;
             }
         }
         //check grid\
         int sr=(row/3)*3;
         int sc=(col/3)*3;

         for (int i=sr;i<sr+3;i++){
             for (int j=sc;j<sc+3;j++){
                 if(sudoku[i][j]==digit){
                     return  false;
                 }
             }
         }
         return true;
     }

    public static void print1(int  arr[][]){
        System.out.println("-----------------bord------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
    public static  void main(String args[]){
//         subString("abc","",0);
//        parmutation("abc","");
        int n=5;
        int m=5;
       if(queenSetting(new String[n][m],0)){
           System.out.println("solution possible");
       }else{
           System.out.println("solution  not possible");

       }
        System.out.println("total no of way to solve n queen:="+count);

        System.out.println("total gridway::="+Gridway(0,0,3,3));

        int sudoku[][]={
                {0,0,8,0,0,0,0,0,0},
                {0,9,0,0,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}
        };
        if(sudokuSolver(sudoku,0,0)){
            System.out.println("solution possible");
            print1(sudoku);
        }else {
            System.out.println("solution not possible.");
        }
    }


}
