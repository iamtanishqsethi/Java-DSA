public class sortColors {
    //https://leetcode.com/problems/sort-colors/
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        //better solution than 100%  when using above code lol
        sort(nums,0,nums.length-1);

    }
    //used quick sort
    private void sort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

        }
        sort(arr,low,end);
        sort(arr,start,high);
    }
}
