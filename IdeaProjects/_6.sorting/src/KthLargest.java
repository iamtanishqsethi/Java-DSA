public class KthLargest {
    //https://leetcode.com/problems/kth-largest-element-in-an-array/
    public int findKthLargest(int[] nums, int k) {
        //sort
        sort(nums,0,nums.length-1);
        //search
        return nums[nums.length-k];
    }
    private void sort(int[] nums,int low,int high){
        if(low>=high) return;
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];
        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        sort(nums,low,end);
        sort(nums,start,high);
    }
}
