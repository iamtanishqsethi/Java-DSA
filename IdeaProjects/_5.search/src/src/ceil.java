public class ceil {
    //to find ceil of a number using binary search
    public static int ceil(int[] arr,int target){
        int start = 0;
        int end=arr.length-1;
        while(start<=end){
            if(target>arr[arr.length-1]){
                return-1;
            }
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }else if(target==arr[mid]){
                return arr[mid];
            }
        }return arr[start];//case for ceil, i.e. to find the number equal to or the smallest greater number in array
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceil(arr,target));
    }
}
