public class mountainArray {
    public static int peakinmountainarray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //we are dsc part of mountain array
                end=mid;
            }else{
                //we are in asc part of mountain array
                start=mid+1;
            }
        }//will keep running until start and end point at the same value ie the peak value
        return start;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,3,2};
        System.out.println(peakinmountainarray(arr));
    }
}
