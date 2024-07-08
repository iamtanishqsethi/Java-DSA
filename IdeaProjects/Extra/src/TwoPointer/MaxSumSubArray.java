package TwoPointer;
// to find the max sum from sub array of size k
public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] nums ={1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
    }
    public static int maximumSubarraySum(int[] nums, int k) {
        int sum =0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        int max =sum;
        int left =0;
        int right=left+k;
        while(right<nums.length){
            sum=sum-nums[left]+nums[right];
            max=Math.max(max,sum);
            left++;
            right++;
        }
        return max;
    }
}
