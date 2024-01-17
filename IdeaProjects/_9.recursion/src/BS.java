public class BS {
    //binary search using recursion
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        System.out.println(search(arr,7,0,arr.length-1));
    }
    public static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }if(target<arr[mid]){
            end=mid-1;
            return search(arr,target,start,end);
        }if(target>arr[mid]){
            start=mid+1;
            return search(arr,target,start,end);
        }
        return-1;
    }
}
