package TwoPointer;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {
        //this code returns the integers that make up the sum not the indices  
        Arrays.sort(nums);
        int[] ans =new int[2];
        int start=0;
        int end = nums.length-1;
        while(start<end){
            if(target==nums[start]+nums[end]){
                ans[0]=nums[start];
                ans[1]=nums[end];
                return ans;
            } else if (target>nums[start]+nums[end]) {
                start++;
            } else if (target<nums[start]+nums[end]) {
                end--;
            }
        }
        return null;
    }
}
