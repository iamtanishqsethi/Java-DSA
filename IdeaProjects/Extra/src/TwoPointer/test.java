package TwoPointer;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {24,9,29,14,19,27};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums,int low, int high){
        if(low>=high){
            return;
        }
        int start = low +1 ;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = nums[low];
        System.out.println("start=" +start);
        System.out.println("end="+end);
        System.out.println("pivot="+pivot);
        while(start<=end){
            //If already sorted , will not perform sorting unlike merge sort
            while(start<=high && nums[start]<pivot){
                start++;
            }
            while(end>=low && nums[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;

            }
        }
        int temp=nums[low];
        nums[low]=nums[end];
        nums[end]=temp;

        System.out.println(Arrays.toString(nums));
        //Pivot at correct index, perform sorting for left and right half's

        sort(nums,low,end-1);
        sort(nums,start,high);
    }
}
