public class divide_concer {
    public static  void mergeSort(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge( arr, si,mid,ei);

    }
    public static  void  merge(int arr[],int si , int mid, int ei ){

        int i=si;
        System.out.println(i);
        int j=mid+1;
        System.out.println(ei);
        int k=0;
        int temp[]=new int[ei-si+1];

        while (i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=ei){
            temp[k++]=arr[j++];
        }

        for (k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
        print(arr);

    }

    // ---------------------------------------------------------------------------------------------------------------------
    public static  void quickSort(int arr[],int si, int ei){
        if (si >= ei) {
            return;
        }
        int idx=partition(arr,si,ei);
        quickSort(arr,si,idx-1);
        quickSort(arr,idx+1,ei);

    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }
//----------------------------------------------------------------------------------------------------------------------
    public static  int findtaget(int arr[],int tar, int si ,int ei){
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }

        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return findtaget(arr,tar,si,mid-1);
            }
            else {
                return findtaget(arr,tar,mid+1,ei);
            }
        }
        else {
            if(arr[mid]<=tar && tar<=arr[ei]){
                return findtaget(arr,tar,mid+1,ei);
            }else{
                return findtaget(arr,tar,si,mid-1);
            }
        }
    }

    public static  int  findtaget2(int arr[],int tar, int si ,int ei) {

       while (ei>=si){
            int mid = si + (ei - si) / 2;
           System.out.println(mid);

            if (arr[mid] == tar) {
                return mid;
            }
            if (arr[si] <= arr[mid]) {
                if (arr[si] <= tar && tar <= arr[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            } else {
                if (arr[mid] <= tar && tar <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }


    //for dupicate array
    public static int findTarget(int arr[], int tar, int si, int ei) {

        while (si <= ei) {

            int mid = si + (ei - si) / 2;

            if (arr[mid] == tar) {
                return mid;
            }

            // Edge case: duplicates
            if (arr[si] == arr[mid] && arr[mid] == arr[ei]) {
                si++;
                ei--;
            }

            // Left half sorted
            else if (arr[si] <= arr[mid]) {

                if (arr[si] <= tar && tar <= arr[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            }

            // Right half sorted
            else {

                if (arr[mid] <= tar && tar <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }

        return -1;
    }
//----------------------------------------------------------------------------------------------------------------------

    public static  void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void main(String args[]){
          int arr[]={6,3,4,5,2,8,7};
//          mergeSort(arr,0,arr.length-1);
//        quickSort(arr,0,arr.length-1);
//          print(arr);
        int arr2[]={4,5,6,7,0,1,2};
        int idx1=findtaget2(arr2,8,0,arr.length-1);
        int arr3[]={2,2,2,3,4,2};
        int idx= findTarget(arr3,3,0,arr3.length-1);
        System.out.println(idx);

    }
}
