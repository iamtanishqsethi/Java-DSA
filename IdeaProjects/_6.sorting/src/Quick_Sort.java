import java.util.Arrays;
/*
 in quick sort we will take a pivot (here middle element of the  array),
 and will sort around it ; smaller elements than pivot on left , greater elements on right
 we will only sort the elements that are not already sorted.
 after first call we will sort the left and right half around the pivot using recursion */
public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums,int low, int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivot = nums[mid];
        while(start<=end){
            //If already sorted , will not perform sorting unlike merge sort
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
        //Pivot at correct index, perform sorting for left and right half's
        sort(nums,low,end);
        sort(nums,start,high);
    }
}
