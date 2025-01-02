package KadaneAlgorithm;

public class Better {
    //O(n^2)
    public static  int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        //'i' tells the starting of sub array

        for(int i=0;i< nums.length;i++){
            int sum=0;
            // at every step we are adding a new element to  the previous sub array's sum
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                maxSum=Math.max(maxSum,sum);
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArray(nums));
    }
}
