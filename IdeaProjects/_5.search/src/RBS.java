public class RBS {
    //binary search in rotated sorted array(distinct values)
    public static void main(String[] args) {
        int [] nums= {4,5,6,7,0,1,2};
        int target=  0;
        System.out.println(search(nums,target));
    }
    public static int binarysearch(int[] arr , int start, int end, int target) {
        boolean isasc;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int search(int[] nums,int target){
        int pivot = findPivot(nums);
        //if pivot=-1, then array is not rotated, then do normal binary search
        if (pivot==-1){
            //normal binary search
            return binarysearch(nums,0,nums.length-1,target);
        }//if pivot found then we have found two asc sorted arrays
        if(target==nums[pivot]){
            return pivot;
        }if(target>=nums[0]){
            return binarysearch(nums,0,pivot-1,target);
        }return binarysearch(nums,pivot+1,nums.length-1,target);

    }
    //the pivot function will work on in case of distinct values, not duplicate
    public static int findPivot(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //four cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
