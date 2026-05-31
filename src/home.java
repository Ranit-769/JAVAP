 public class home{
    public static void spiral(int arr[][]){
        int sr=0,sc=0,er=arr.length-1,ec=arr[0].length-1;
        while(sc<=ec && sr<=er) {

            //top
            for (int i = sc; i <= ec; i++) {
                System.out.print(arr[sr][i]+" ");
            }
            //right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(arr[i][ec]+" ");
            }
            //bottom
            for (int i = ec - 1; i >= sc; i--) {
                System.out.print(arr[er][i]+" ");
            }
            //left
            for (int i = er - 1; i >= sr + 1; i--) {
                System.out.print(arr[i][sc] +" ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }


    public static int diagonal(int arr[][]){
         int sum =0;
//        for (int i = 0; i <=arr.length-1; i++) {
//            for(int j=0;j<=arr[0].length-1;j++){
//                if (i==j){
//                    sum+=arr[i][j];
//                }else if(i+j==arr.length-1){
//                    sum+=arr[i][j];
//                }
//            }
//
//        }
        for (int  i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i != arr.length-1-i){
            sum+=arr[i][arr.length-1-i];
        }
        }
        return sum;

    }

    public static  Boolean search(int max[][],int key){
         int row=0;
         int column=max[0].length-1;
         while(column>=0 && row < max.length){
//             System.out.println(column+row);
             if(key==max[row][column]){
                 System.out.print( "found key at:("+row+","+column+")");
                 return  true;
             }else if(key < max[row][column]){
                column--;
             }else {
                 row++;
             }
         }
        System.out.println("key was not found ");
         return false;
    }
    public static void main(String args[]){
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int arr2[][]={
                {1,2,3},
                {5,6,7},
                {9,10,11},
                };
        int arr3[][]={
                {1,2,3,4},
                {5,6,7,8},
        };
//        spiral(arr3);

        int max[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        search(max,47);

//        System.out.println(diagonal(arr));
    }
 }