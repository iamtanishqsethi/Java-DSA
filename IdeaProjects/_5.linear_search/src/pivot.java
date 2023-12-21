public class pivot {//to find the pivot of rotated array
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));

    }public static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //four cases
            if(mid<end && arr[mid]>arr[mid+1]){//if dsc part of array  lie  after mid(pivot at mid)
                return mid;
            }if (mid>start && arr[mid-1]>arr[mid]){//if dsc part of array lie before mid(pivot before mid)
                return mid-1;
            }if(arr[mid]<=arr[start]){//ignoring the chunk of array from mid to original end
                end=mid-1;
            }else{//arr[mid]>arr[start] , ignoring the chunk of array till mid
                start=mid+1;
            }
        }return -1;
    }
}
