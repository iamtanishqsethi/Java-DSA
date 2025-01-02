package KadaneAlgorithm;

public class Optimized {
    //https://leetcode.com/problems/maximum-subarray
    //(with sum modifications)
    public static  int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int tempStart=0;
        int ansStart=-1;
        int ansEnd=-1;
        for(int i=0;i< nums.length;i++){
            if(sum==0){
                tempStart=i;//starting a new sub array from  index if sum becomes zero
            }
            sum+=nums[i];
            if(maxSum<sum){
                maxSum=sum;
                ansStart=tempStart;
                ansEnd=i;
            }

            if(sum<0){
                sum=0;
            }

        }
        System.out.println("start="+ansStart+" "+"end="+ansEnd);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArray(nums));
    }
}
